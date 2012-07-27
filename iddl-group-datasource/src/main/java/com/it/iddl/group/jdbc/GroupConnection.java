/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.jdbc;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Executor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.group.AbstractGroupDataSource;
import com.it.iddl.group.dbselector.DBSelector;
import com.it.iddl.group.dbselector.ThreadLocalDataSourceIndex;
import com.it.iddl.group.dbselector.DBSelector.AbstractDataSourceTryer;
import com.it.iddl.group.dbselector.DBSelector.DataSourceTryer;
import com.it.iddl.group.util.ExceptionUtil;
import com.it.iddl.util.GroupHintParser;

/**
 * 相关的JDBC规范：
 * 
 * 1. Connection关闭，在其上打开的statement自动关闭。这就要求Connection持有其上打开的所有statement的引用
 * 2. 
 * 
 * 重试的场景1：在第一个statement上执行查询，路由到db1成功。再创建一个statement查询在db1上失败：
 * stmt1 = GroupConnection.createStatement
 * rs1 = stmt1.executeQuery --create connection on db1 and execute success
 * stmt2 = conn..createStatement
 * rs2 = stmt2..executeQuery --db1 failed then...
 * 这时如果重试到db2库，db1的connection要不要关？
 * a：如果关，其上的实际stmt和rs就都会关掉。这样db2成功后
 *    用户会看不到exception，对用户来说，stms1和rs1都是正常的。但实际上已经是坏掉的了。
 * b: 如果不关，也就是GroupConnection持有多个baseConnection，。。。
 * 
 * 由以上场景的考虑，提炼出一个原则：
 * 
 *重试的原则：
 * 一个GroupConnection中，只在第一次与真正与数据库交互时，也就是不得不返回db结果给用户时，才在DBGroup上进行重试。
 * 一旦在某个库上重试成功，后续在这个GroupConnection上执行的所有操作，都只到这个库上，不再重试，出错直接抛出异常。
 * 第一次建立真正连接的重试过程中，baseConnection有可能会发生变化被替换。一旦重试成功，baseConnection则保持不再改变。
 * 这样可以简化很多事情，但同时不会对功能造成本质影响。同时避免了对状态处理不当，可能会给用户造成的诡异现象。
 * 
 * @author sihai
 *
 */
public class GroupConnection implements Connection {
	
	private static final Log logger = LogFactory.getLog(GroupConnection.class);

	private AbstractGroupDataSource groupDataSource;

	// 虽然DataSource.getConnection(String username, String password)不常用，
	// 但为了尽量遵循jdbc规范，还是保留的好。
	private String username;
	private String password;
	
	/* ========================================================================
	 * JDBC事务相关的autoCommit设置、commit/rollback、TransactionIsolation等
	 * ======================================================================*/
	private boolean isAutoCommit = true; // jdbc规范，新连接为true

	public GroupConnection(AbstractGroupDataSource AbstractGroupDataSource) {
		this(AbstractGroupDataSource, null, null);
	}

	public GroupConnection(AbstractGroupDataSource groupDataSource, String username, String password) {
		this.groupDataSource = groupDataSource;
		this.username = username;
		this.password = password;
	}

	/* ========================================================================
	 * 下层connection的持有，getter/setter包权限
	 * ======================================================================*/
	private Connection rBaseConnection;
	private Connection wBaseConnection;
	private GroupDataSourceWrapper rBaseDsWrapper;
	private GroupDataSourceWrapper wBaseDsWrapper;
	
	private Set<GroupStatement> openedStatements = new HashSet<GroupStatement>(2);

	/**
	 * 
	 * @param sql
	 * @param isRead
	 * @return
	 * @throws SQLException
	 */
	Connection getBaseConnection(String sql, boolean isRead) throws SQLException {
		
		int dataSourceIndex = DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX;
		if(sql == null){
			//如果当前的数据源索引与上一次的数据源索引不一样，说明上一次缓存的Connection已经无用了，需要关闭后重建。
		    dataSourceIndex = ThreadLocalDataSourceIndex.getIndex();
		}else{
			dataSourceIndex = GroupHintParser.convertHint2Index(sql, DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX);
			if(dataSourceIndex == DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX){
				dataSourceIndex = ThreadLocalDataSourceIndex.getIndex();
			}
		}
		
		// 要切换数据源
		if (dataSourceIndex != DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX) {
			if (logger.isDebugEnabled()) {
				logger.debug(String.format("dataSourceIndex:%s", dataSourceIndex));
			}
			//在事务状态下，设置不同的数据源索引会导致异常。
			if (!isAutoCommit) {
			    if (wBaseDsWrapper != null && !wBaseDsWrapper.isMatchDataSourceIndex(dataSourceIndex))
			        throw new SQLException("Transaction in another dataSourceIndex: " + dataSourceIndex);
			}
			
			if (isRead) {
				if (rBaseDsWrapper != null && !rBaseDsWrapper.isMatchDataSourceIndex(dataSourceIndex))
					closeReadConnection();
			} else {
				if (wBaseDsWrapper != null && !wBaseDsWrapper.isMatchDataSourceIndex(dataSourceIndex))
					closeWriteConnection();
			}
		}

        //为了保证事务正确关闭，在事务状态下只会取回写连接
		if (isRead && isAutoCommit) {
			//只要有写连接，并且对应的库可读，则复用。否则返回读连接
			return wBaseConnection != null && wBaseDsWrapper.hasReadWeight() ? wBaseConnection : rBaseConnection;
			//先写后读，重用写连接读后，rBaseConnection仍然是null
		} else {
			if (wBaseConnection != null){
				this.groupDataSource.setWriteTarget(wBaseDsWrapper);
				return wBaseConnection;
			} else if (rBaseConnection != null && rBaseDsWrapper.hasWriteWeight()) {
				//在写连接null的情况下，如果读连接已经建立，且对应的库可写，则复用
				wBaseConnection = rBaseConnection; //wBaseConnection赋值，以确保事务能够正确提交回滚
				//在写连接上设置事务
				if (wBaseConnection.getAutoCommit() != isAutoCommit)
				    wBaseConnection.setAutoCommit(isAutoCommit);
				//wBaseDsKey = rBaseDsKey;
				wBaseDsWrapper = rBaseDsWrapper;
				this.groupDataSource.setWriteTarget(wBaseDsWrapper);
				return wBaseConnection;
			} else {
				return null;
			}
		}
	}

	/**
	 * 从实际的DataSource获得一个下层（有可能不是真实的）Connection
	 * 包权限：此方法只在GroupStatement、GroupPreparedStatement中使用
	 * @param gdsw
	 * @param isRead
	 * @return
	 * @throws SQLException
	 */
	Connection createNewConnection(GroupDataSourceWrapper gdsw, boolean isRead) throws SQLException {
		//这个方法只发生在第一次建立读/写连接的时候，以后都是复用了
		Connection connection;
		if (username != null)
			connection = gdsw.getConnection(username, password);
		else
			connection = gdsw.getConnection();

		//为了保证事务正确关闭，在事务状态下只设置写连接
		setBaseConnection(connection, gdsw, isRead && isAutoCommit);

		//只在写连接上调用  setAutoCommit, 与  GroupConnection#setAutoCommit 的代码保持一致
		if (!isRead || !isAutoCommit)
		        connection.setAutoCommit(isAutoCommit); // 新建连接的AutoCommit要与当前isAutoCommit的状态同步

		return connection;
	}
	
	/**
	 * 设置底层的connection
	 * @param baseConnection
	 * @param dsw
	 * @param isRead
	 */
	private void setBaseConnection(Connection baseConnection, GroupDataSourceWrapper dsw, boolean isRead) {
		if (baseConnection == null) {
			logger.warn("setBaseConnection to null !!");
		}

		if (isRead)
			closeReadConnection();
		else
			closeWriteConnection();

		if (isRead) {
			rBaseConnection = baseConnection;
			//this.rBaseDsKey = dsw.getDataSourceKey();
			//this.rBaseDataSourceIndex = dsw.getDataSourceIndex();
			this.rBaseDsWrapper = dsw;
		} else {
			wBaseConnection = baseConnection;
			//this.wBaseDsKey = dsw.getDataSourceKey();
			//this.wBaseDataSourceIndex = dsw.getDataSourceIndex();
			this.wBaseDsWrapper = dsw;
			this.groupDataSource.setWriteTarget(dsw);
		}
	}

	// 如果rBaseConnection = wBaseConnection 会不会这个链接就关不了  ???   close方法会关闭的
	/**
	 * 关闭底层的read connection
	 */
	private void closeReadConnection() {
		//r|wBaseConnection可能指向同一个对象，如果另一个引用在用，就不去关闭
		if (rBaseConnection != null && rBaseConnection != wBaseConnection) {
			try {
				rBaseConnection.close(); // 旧的baseConnection要关闭
			} catch (SQLException e) {
				logger.error("close rBaseConnection failed.", e);
			}
			rBaseDsWrapper = null;
			rBaseConnection = null;
		}
	}
	
	/**
	 * 关闭底层的write connection
	 */
	private void closeWriteConnection() {
		//r|wBaseConnection可能指向同一个对象，如果另一个引用在用，就不去关闭
		if (wBaseConnection != null && rBaseConnection != wBaseConnection) {
			try {
				wBaseConnection.close(); // 旧的baseConnection要关闭
			} catch (SQLException e) {
				logger.error("close wBaseConnection failed.", e);
			}
			wBaseDsWrapper = null;
			wBaseConnection = null;
		}
	}
	
	/**
	 * 移除指定的statement
	 * @param statement
	 */
	void removeOpenedStatements(Statement statement) {
		if (!openedStatements.remove(statement)) {
			logger.warn("current statmenet ：" + statement + " doesn't exist!");
		}
	}

	/* ========================================================================
	 * 关闭逻辑
	 * ======================================================================*/
	private boolean closed;

	private void checkClosed() throws SQLException {
		if (closed) {
			throw new SQLException("No operations allowed after connection closed.");
		}
	}

	public boolean isClosed() throws SQLException {
		return closed;
	}

	@SuppressWarnings("unchecked")
	public void close() throws SQLException {
		if (closed) {
			return;
		}
		closed = true;

		List<SQLException> exceptions = new LinkedList<SQLException>();
		try {
			// 关闭statement
			for (GroupStatement stmt : openedStatements) {
				try {
					stmt.close(false);
				} catch (SQLException e) {
					exceptions.add(e);
				}
			}

			try {
				if (rBaseConnection != null && !rBaseConnection.isClosed()) {
					rBaseConnection.close();
				}
			} catch (SQLException e) {
				exceptions.add(e);
			}
			try {
				if (wBaseConnection != null && !wBaseConnection.isClosed()) {
					wBaseConnection.close();
				}
			} catch (SQLException e) {
				exceptions.add(e);
			}
		} finally {
			openedStatements.clear();
			// openedStatements = null; //逻辑完整性
			rBaseConnection = null;
			wBaseConnection = null;

			ThreadLocalDataSourceIndex.clearIndex();
		}
		
		// exceptions 非空时才抛异常
		ExceptionUtil.throwSQLException(exceptions, "close groupConnection", Collections.EMPTY_LIST);
	}

	/* ========================================================================
	 * 创建Statement逻辑
	 * ======================================================================*/
	public GroupStatement createStatement() throws SQLException {
		checkClosed();
		GroupStatement stmt = new GroupStatement(groupDataSource, this);
		openedStatements.add(stmt);
		return stmt;
	}

	public GroupStatement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		GroupStatement stmt = createStatement();
		stmt.setResultSetType(resultSetType);
		stmt.setResultSetConcurrency(resultSetConcurrency);
		return stmt;
	}

	public GroupStatement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		GroupStatement stmt = createStatement(resultSetType, resultSetConcurrency);
		stmt.setResultSetHoldability(resultSetHoldability);
		return stmt;
	}

	/* ========================================================================
	 * 创建PreparedStatement逻辑
	 * ======================================================================*/
	public GroupPreparedStatement prepareStatement(String sql) throws SQLException {
		checkClosed();
		GroupPreparedStatement stmt = new GroupPreparedStatement(groupDataSource, this, sql);
		openedStatements.add(stmt);
		return stmt;
	}

	public GroupPreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
			throws SQLException {
		GroupPreparedStatement stmt = prepareStatement(sql);
		stmt.setResultSetType(resultSetType);
		stmt.setResultSetConcurrency(resultSetConcurrency);
		return stmt;
	}

	public GroupPreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		GroupPreparedStatement stmt = prepareStatement(sql, resultSetType, resultSetConcurrency);
		stmt.setResultSetHoldability(resultSetHoldability);
		return stmt;
	}

	public GroupPreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		GroupPreparedStatement stmt = prepareStatement(sql);
		stmt.setAutoGeneratedKeys(autoGeneratedKeys);
		return stmt;
	}

	public GroupPreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		GroupPreparedStatement stmt = prepareStatement(sql);
		stmt.setColumnIndexes(columnIndexes);
		return stmt;
	}

	public GroupPreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		GroupPreparedStatement stmt = prepareStatement(sql);
		stmt.setColumnNames(columnNames);
		return stmt;
	}

	/* ========================================================================
	 * 创建CallableStatement逻辑。存储过程CallableStatement支持
	 * ======================================================================*/
	private DataSourceTryer<CallableStatement> getCallableStatementTryer = new AbstractDataSourceTryer<CallableStatement>() {
		public CallableStatement tryOnDataSource(GroupDataSourceWrapper dsw, Object... args) throws SQLException {
			String sql = (String) args[0];
			int resultSetType = (Integer) args[1];
			int resultSetConcurrency = (Integer) args[2];
			int resultSetHoldability = (Integer) args[3];
			Connection connection = GroupConnection.this.createNewConnection(dsw, false);
			return getCallableStatement(connection, sql, resultSetType, resultSetConcurrency, resultSetHoldability);
		}
	};

	private CallableStatement getCallableStatement(Connection connection, String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		if (resultSetType == Integer.MIN_VALUE) {
			return connection.prepareCall(sql);
		} else if (resultSetHoldability == Integer.MIN_VALUE) {
			return connection.prepareCall(sql, resultSetType, resultSetConcurrency);
		} else {
			return connection.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
		}
	}

	public GroupCallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		checkClosed();
		CallableStatement target;

		Connection connection = this.getBaseConnection(sql,false); //存储过程默认走写库
		if (connection != null) {
			sql = GroupHintParser.removeIDDLGroupHint(sql);
			target = getCallableStatement(connection, sql, resultSetType, resultSetConcurrency, resultSetHoldability);
		} else {
			// hint优先
			Integer dataSourceIndex = GroupHintParser.convertHint2Index(sql, DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX);
			sql = GroupHintParser.removeIDDLGroupHint(sql);
			if (dataSourceIndex < 0) {
				dataSourceIndex = ThreadLocalDataSourceIndex.getIndex();
			}
			target = groupDataSource.getDBSelector(false).tryExecute(null, getCallableStatementTryer,
					this.groupDataSource.getRetryTimes(), sql, resultSetType, resultSetConcurrency,
					resultSetHoldability,dataSourceIndex);
		}
		GroupCallableStatement stmt = new GroupCallableStatement(groupDataSource, this, target, sql);
		if (resultSetType != Integer.MIN_VALUE) {
			stmt.setResultSetType(resultSetType);
			stmt.setResultSetConcurrency(resultSetConcurrency);
		}
		if (resultSetHoldability != Integer.MIN_VALUE) {
			stmt.setResultSetHoldability(resultSetHoldability);
		}
		openedStatements.add(stmt);
		return stmt;
	}

	public GroupCallableStatement prepareCall(String sql) throws SQLException {
		return prepareCall(sql, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
	}

	public GroupCallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency)
			throws SQLException {
		return prepareCall(sql, resultSetType, resultSetConcurrency, Integer.MIN_VALUE);
	}

	public void setAutoCommit(boolean autoCommit0) throws SQLException {
		checkClosed();
		if (this.isAutoCommit == autoCommit0) {
			// 先排除两种最常见的状态,true==true 和false == false: 什么也不做
			return;
		}
		this.isAutoCommit = autoCommit0;
		/*/////////////////////////////////////只读情况忽略事务
		if (this.rBaseConnection != null) {
			this.rBaseConnection.setAutoCommit(autoCommit0);
		}
		*/
		if (this.wBaseConnection != null) {
			this.wBaseConnection.setAutoCommit(autoCommit0);
		}
	}

	public boolean getAutoCommit() throws SQLException {
		checkClosed();
		return isAutoCommit;
	}

	public void commit() throws SQLException {
		checkClosed();
		if (isAutoCommit) {
			return;
		}

		/*/////////////////////////////////////只读情况忽略事务
		if (rBaseConnection != null) {
			try {
				rBaseConnection.commit();
			} catch (SQLException e) {
				log.error("Commit failed on " + this.rBaseDsKey + ":" + e.getMessage());
				throw e;
			}
		}
		*/
		if (wBaseConnection != null) {
			try {
				wBaseConnection.commit();
			} catch (SQLException e) {
				logger.error("Commit failed on " + this.wBaseDsWrapper.getDbKey() + ":" + e.getMessage());
				throw e;
			}
		}
	}

	public void rollback() throws SQLException {
		checkClosed();
		if (isAutoCommit) {
			return;
		}

		/*/////////////////////////////////////只读情况忽略事务
		if (rBaseConnection != null) {
			try {
				rBaseConnection.rollback();
			} catch (SQLException e) {
				log.error("Rollback failed on " + this.rBaseDsKey + ":" + e.getMessage());
				throw e;
			}
		}
		*/

		if (wBaseConnection != null) {
			try {
				wBaseConnection.rollback();
			} catch (SQLException e) {
				logger.error("Rollback failed on " + this.wBaseDsWrapper.getDbKey() + ":" + e.getMessage());
				throw e;
			}
		}
	}

	// TODO: 以后让这个值真正的起作用
	private int transactionIsolation = -1;

	public int getTransactionIsolation() throws SQLException {
		checkClosed();
		return transactionIsolation;
	}

	public void setTransactionIsolation(int transactionIsolation) throws SQLException {
		checkClosed();
		this.transactionIsolation = transactionIsolation;
	}

	/* ========================================================================
	 * SQLWarning 和 DatabaseMetaData
	 * ======================================================================*/
	public SQLWarning getWarnings() throws SQLException {
		checkClosed();
		if (rBaseConnection != null)
			return rBaseConnection.getWarnings();
		else if (wBaseConnection != null)
			return wBaseConnection.getWarnings();
		else
			return null;
	}

	public void clearWarnings() throws SQLException {
		checkClosed();
		if (rBaseConnection != null)
			rBaseConnection.clearWarnings();
		if (wBaseConnection != null)
			wBaseConnection.clearWarnings();
	}

	public DatabaseMetaData getMetaData() throws SQLException {
		checkClosed();
		if (rBaseConnection != null)
			return rBaseConnection.getMetaData();
		else if (wBaseConnection != null)
			return wBaseConnection.getMetaData();
		else
			return new GroupDatabaseMetaData();
	}

	/* ========================================================================
	 * 后面是未实现的方法
	 * ======================================================================*/
	public void rollback(Savepoint savepoint) throws SQLException {
		throw new UnsupportedOperationException("rollback");
	}

	public Savepoint setSavepoint() throws SQLException {
		throw new UnsupportedOperationException("setSavepoint");
	}

	public Savepoint setSavepoint(String name) throws SQLException {
		throw new UnsupportedOperationException("setSavepoint");
	}

	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		throw new UnsupportedOperationException("releaseSavepoint");
	}

	public String getCatalog() throws SQLException {
		throw new UnsupportedOperationException("getCatalog");
	}

	public void setCatalog(String catalog) throws SQLException {
		throw new UnsupportedOperationException("setCatalog");
	}

	public int getHoldability() throws SQLException {
		return ResultSet.CLOSE_CURSORS_AT_COMMIT;
	}

	public void setHoldability(int holdability) throws SQLException {
		/*
		 * 如果你看到这里，那么恭喜，哈哈 mysql默认在5.x的jdbc driver里面也没有实现holdability 。
		 * 所以默认都是.CLOSE_CURSORS_AT_COMMIT 为了简化起见，我们也就只实现close这种
		 */

		// mysql 5.x的jdbc driver只支持ResultSet.HOLD_CURSORS_OVER_COMMIT
		throw new UnsupportedOperationException("setHoldability");
	}

	public Map<String, Class<?>> getTypeMap() throws SQLException {
		throw new UnsupportedOperationException("getTypeMap");
	}

	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		throw new UnsupportedOperationException("setTypeMap");
	}

	public String nativeSQL(String sql) throws SQLException {
		throw new UnsupportedOperationException("nativeSQL");
	}

	/**
	 * 保持可读可写
	 * @author junyu
	 */
	public boolean isReadOnly() throws SQLException {
		return false;
	}

	/**
	 * 不做任何事情
	 */
	public void setReadOnly(boolean readOnly) throws SQLException {

	}

	public Clob createClob() throws SQLException {
		throw new SQLException("not support exception");
	}

	public Blob createBlob() throws SQLException {
		throw new SQLException("not support exception");
	}

	public NClob createNClob() throws SQLException {
		throw new SQLException("not support exception");
	}

	public SQLXML createSQLXML() throws SQLException {
		throw new SQLException("not support exception");
	}

	public boolean isValid(int timeout) throws SQLException {
		throw new SQLException("not support exception");
	}

	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		throw new RuntimeException("not support exception");
	}

	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		throw new RuntimeException("not support exception");
	}

	public String getClientInfo(String name) throws SQLException {
		throw new SQLException("not support exception");
	}

	public Properties getClientInfo() throws SQLException {
		throw new SQLException("not support exception");
	}

	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		throw new SQLException("not support exception");
	}

	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		throw new SQLException("not support exception");
	}
	
	///////////////////////////////////////////////////////////////////
	//		For jdk1.6
	///////////////////////////////////////////////////////////////////
	public <T> T unwrap(Class<T> iface) throws SQLException {
		if(isWrapperFor(iface)){
			return (T) this;
		}else{
			throw new SQLException("not a wrapper for "+ iface);
		}
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return this.getClass().isAssignableFrom(iface);
	}
	
	///////////////////////////////////////////////////////////////////
	//		For jdk1.7
	///////////////////////////////////////////////////////////////////
	public void setSchema(String schema) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void abort(Executor executor) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void setNetworkTimeout(Executor executor, int milliseconds)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
