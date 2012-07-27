/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.common.sql.SQLParser;
import com.it.iddl.common.sql.SQLType;
import com.it.iddl.group.AbstractGroupDataSource;
import com.it.iddl.group.dbselector.DBSelector;
import com.it.iddl.group.dbselector.DBSelector.AbstractDataSourceTryer;
import com.it.iddl.group.dbselector.DBSelector.DataSourceTryer;
import com.it.iddl.group.dbselector.ThreadLocalDataSourceIndex;
import com.it.iddl.util.GroupHintParser;

/**
 * Group Statement
 * @author sihai
 *
 */
public class GroupStatement implements Statement {

	private static final Log logger = LogFactory.getLog(GroupStatement.class);

	protected GroupConnection groupConnection;
	protected AbstractGroupDataSource groupDataSource;
	protected int retryTimes;
	
	protected boolean closed; // 当前statment 是否是关闭的
	
	/**
	 * 经过计算后的结果集，允许使用 getResult函数调用.
	 *
	 * 一个statement只允许有一个结果集
	 */
	protected ResultSet currentResultSet;
	
	/**
	 * query time out . 超时时间，如果超时时间不为0。那么超时应该被set到真正的query中。
	 */
	protected int queryTimeout = 0;

	protected int fetchSize;

	protected int maxRows;
	
	/**
	 * 更新计数，如果执行了多次，那么这个值只会返回最后一次执行的结果。 如果是一个query，那么返回的数据应该是-1
	 */
	protected int updateCount;

	protected int resultSetType = ResultSet.TYPE_FORWARD_ONLY;;
	protected int resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;

	//jdbc规范中未指明resultSetHoldability的默认值，要设成ResultSet.CLOSE_CURSORS_AT_COMMIT吗?
	//TODO 统一设成-1吗?
	protected int resultSetHoldability = -1;
	
	/**
	 * 貌似是只有存储过程中会出现多结果集 因此不支持
	 */
	protected boolean moreResults;
	
	/* ========================================================================
	 * executeBatch
	 * ======================================================================*/
	protected List<String> batchedArgs;
	
	/* ========================================================================
	 * 下层(有可能不是真正的)Statement的持有，getter/setter包权限
	 * ======================================================================*/
	private Statement baseStatement;
	
	/**
	 * 查询tryer,在GroupDataSourceWrapper上重试
	 */
	protected DataSourceTryer<ResultSet> executeQueryTryer = new AbstractDataSourceTryer<ResultSet>() {
		public ResultSet tryOnDataSource(GroupDataSourceWrapper gdsw, Object... args) throws SQLException {
			String sql = (String) args[0];
			// 从数据源拿connection
			Connection connection = GroupStatement.this.groupConnection.createNewConnection(gdsw, true);
			return executeQueryOnConnection(connection, sql);
		}
	};
	
	/**
	 * 更新tryer,在GroupDataSourceWrapper上重试
	 */
	private DataSourceTryer<Integer> executeUpdateTryer = new AbstractDataSourceTryer<Integer>() {
		public Integer tryOnDataSource(GroupDataSourceWrapper gdsw, Object... args) throws SQLException {
			Connection connection = GroupStatement.this.groupConnection.createNewConnection(gdsw, false);
			return executeUpdateOnConnection(connection, (String) args[0], (Integer) args[1], (int[]) args[2],
					(String[]) args[3]);
		}
	};
	
	/**
	 * 批处理tryer,在GroupDataSourceWrapper上重试
	 */
	private DataSourceTryer<int[]> executeBatchTryer = new AbstractDataSourceTryer<int[]>() {
		public int[] tryOnDataSource(GroupDataSourceWrapper gdsw, Object... args) throws SQLException {
			Connection connection = GroupStatement.this.groupConnection.createNewConnection(gdsw, false);
			return executeBatchOnConnection(connection, GroupStatement.this.batchedArgs);
		}
	};
	
	/**
	 * 
	 * @param groupDataSource
	 * @param groupConnection
	 */
	public GroupStatement(AbstractGroupDataSource groupDataSource, GroupConnection groupConnection) {
		this.groupDataSource = groupDataSource;
		this.groupConnection = groupConnection;

		this.retryTimes = groupDataSource.getRetryTimes();
	}
	
	/* ========================================================================
	 * executeQuery 查询逻辑
	 * ======================================================================*/
	
	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		
		checkClosed();
		ensureResultSetIsClosed();
		
		// 如果connection处于事务, 拿write connetion
		boolean gotoRead = SQLType.SELECT.equals(SQLParser.getSQLType(sql)) && groupConnection.getAutoCommit();
		Connection connection = groupConnection.getBaseConnection(sql, gotoRead);

		if (connection != null) {
			// 如果groupConnection已经拿到链接了, 会一直利用这个链接, 这是GroupConnection的重试的原则
			sql = GroupHintParser.removeIDDLGroupHint(sql);
			return executeQueryOnConnection(connection, sql);
		} else {
			// hint优先
			Integer dataSourceIndex = GroupHintParser.convertHint2Index(sql, DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX);
			sql = GroupHintParser.removeIDDLGroupHint(sql);
			if (dataSourceIndex < 0) {
				dataSourceIndex = ThreadLocalDataSourceIndex.getIndex();
			}
			return this.groupDataSource.getDBSelector(gotoRead).tryExecute(executeQueryTryer, retryTimes, sql, dataSourceIndex);
		}
	}

	@Override
	public boolean execute(String sql) throws SQLException {
		return executeInternal(sql, -1, null, null);
	}
	
	@Override
	public boolean execute(String sql, int autoGeneratedKeys)
			throws SQLException {
		return executeInternal(sql, autoGeneratedKeys, null, null);
	}

	@Override
	public boolean execute(String sql, int[] columnIndexes) throws SQLException {
		return executeInternal(sql, -1, columnIndexes, null);
	}

	@Override
	public boolean execute(String sql, String[] columnNames)
			throws SQLException {
		return executeInternal(sql, -1, null, columnNames);
	}
	
	/* ========================================================================
	 * executeUpdate逻辑
	 * ======================================================================*/
	@Override
	public int executeUpdate(String sql) throws SQLException {
		return executeUpdateInternal(sql, -1, null, null);
	}
	
	@Override
	public int executeUpdate(String sql, int autoGeneratedKeys)
			throws SQLException {
		return executeUpdateInternal(sql, autoGeneratedKeys, null, null);
	}

	@Override
	public int executeUpdate(String sql, int[] columnIndexes)
			throws SQLException {
		return executeUpdateInternal(sql, -1, columnIndexes, null);
	}

	@Override
	public int executeUpdate(String sql, String[] columnNames)
			throws SQLException {
		return executeUpdateInternal(sql, -1, null, columnNames);
	}
	
	@Override
	public ResultSet getResultSet() throws SQLException {
		return currentResultSet;
	}

	@Override
	public int getUpdateCount() throws SQLException {
		return updateCount;
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		return moreResults;
	}
	
	/* ========================================================================
	 * batch逻辑
	 * ======================================================================*/
	@Override
	public int[] executeBatch() throws SQLException {
		
		try {
			checkClosed();
			ensureResultSetIsClosed();

			if (batchedArgs == null || batchedArgs.isEmpty()) {
				return new int[0];
			}

			Connection connection = groupConnection.getBaseConnection(null, false);

			if (connection != null) {
				// 如果当前已经有连接,则不做任何重试。对于更新来说，不管有没有事务，
				// 用户总期望getConnection获得连接之后，后续的一系列操作都在这同一个库，同一个连接上执行
				return executeBatchOnConnection(connection, this.batchedArgs);
			} else {
				return groupDataSource.getDBSelector(false).tryExecute(null, executeBatchTryer, retryTimes);
			}
		} finally {
			if (null != batchedArgs)
				batchedArgs.clear();
		}
	}
	
	@Override
	public void addBatch(String sql) throws SQLException {
		checkClosed();
		if (batchedArgs == null) {
			batchedArgs = new LinkedList<String>();
		}
		if (sql != null) {
			batchedArgs.add(sql);
		}
	}

	@Override
	public void clearBatch() throws SQLException {
		checkClosed();
		if (null != batchedArgs) {
			batchedArgs.clear();
		}
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		return groupConnection;
	}
	
	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		if (this.baseStatement != null)
			return this.baseStatement.getGeneratedKeys();
		else
			throw new SQLException("在调用getGeneratedKeys前未执行过任何更新操作");
	}

	/* ========================================================================
	 * 关闭逻辑
	 * ======================================================================*/
	@Override
	public void close() throws SQLException {
		close(true);
	}
	
	/**
	 * 如果新建了查询，那么上一次查询的结果集应该被显示的关闭掉。这才是符合jdbc规范的
	 *
	 * @throws SQLException
	 */
	protected void ensureResultSetIsClosed() throws SQLException {

		if (currentResultSet != null) {
			//log.debug("result set is not null,close current result set");
			try {
				currentResultSet.close();
			} catch (SQLException e) {
				logger.error("exception on close last result set . can do nothing..", e);
			} finally {
				// 最终要显示的关闭它
				currentResultSet = null;
			}
		}

	}
	
	protected void checkClosed() throws SQLException {
		if (closed) {
			throw new SQLException("No operations allowed after statement closed.");
		}
	}
	
	public void close(boolean removeThis) throws SQLException {
		if (closed) {
			return;
		}
		closed = true;

		try {
			if (currentResultSet != null)
				currentResultSet.close();
		} catch (SQLException e) {
			logger.warn("Close currentResultSet failed.", e);
		} finally {
			currentResultSet = null;
		}

		try {
			if (this.baseStatement != null)
				this.baseStatement.close();
		} finally {
			this.baseStatement = null;
			if (removeThis)
				groupConnection.removeOpenedStatements(this);
		}
	}
	
	/**
	 * 会调用setBaseStatement以关闭已有的Statement
	 */
	private Statement createStatementInternal(Connection connection, boolean isBatch) throws SQLException {
		Statement stmt;
		if (isBatch)
			stmt = connection.createStatement();
		else {
			int resultSetHoldability = this.resultSetHoldability;
			if (resultSetHoldability == -1) //未调用过setResultSetHoldability
				resultSetHoldability = connection.getHoldability();
			
			stmt = connection.createStatement(this.resultSetType, this.resultSetConcurrency, resultSetHoldability);
		}

		setBaseStatement(stmt); // 会关闭已有的Statement
		stmt.setQueryTimeout(queryTimeout); //这句也有可能抛出异常，放在最后
		stmt.setFetchSize(fetchSize);
		stmt.setMaxRows(maxRows);

		return stmt;
	}
	
	/**
	 * jdbc规范: 返回true表示executeQuery，false表示executeUpdate
	 * @param sql
	 * @param autoGeneratedKeys
	 * @param columnIndexes
	 * @param columnNames
	 * @return
	 * @throws SQLException
	 */
	private boolean executeInternal(String sql, int autoGeneratedKeys, int[] columnIndexes, String[] columnNames)
			throws SQLException {

		SQLType sqlType = SQLParser.getSQLType(sql);
		if (sqlType == SQLType.SELECT || sqlType == SQLType.SELECT_FOR_UPDATE || sqlType == SQLType.SHOW) {
			executeQuery(sql);
			return true;
		} else if (sqlType == SQLType.INSERT || sqlType == SQLType.UPDATE || sqlType == SQLType.DELETE || sqlType == SQLType.REPLACE || sqlType == SQLType.TRUNCATE
				|| sqlType == SQLType.CREATE || sqlType== SQLType.DROP || sqlType == SQLType.LOAD || sqlType== SQLType.MERGE ||sqlType==SQLType.ALTER) {
			if (autoGeneratedKeys == -1 && columnIndexes == null && columnNames == null) {
				executeUpdate(sql);
			} else if (autoGeneratedKeys != -1) {
				executeUpdate(sql, autoGeneratedKeys);
			} else if (columnIndexes != null) {
				executeUpdate(sql, columnIndexes);
			} else if (columnNames != null) {
				executeUpdate(sql, columnNames);
			} else {
				executeUpdate(sql);
			}

			return false;
		} else {
			throw new SQLException("only select, insert, update, delete,replace,truncate,create,drop,load,merge sql is supported");
		}
	}
	
	private int executeUpdateInternal(String sql, int autoGeneratedKeys, int[] columnIndexes, String[] columnNames)
			throws SQLException {
		
		checkClosed();
		ensureResultSetIsClosed();

		Connection connection = groupConnection.getBaseConnection(sql, false);

		if (connection != null) {
			sql = GroupHintParser.removeIDDLGroupHint(sql);
			this.updateCount = executeUpdateOnConnection(connection, sql, autoGeneratedKeys, columnIndexes, columnNames);
		    return this.updateCount;
		} else {
			// 拿不到connection, executeUpdateTryer会导致设置新拿到的connection
			Integer dataSourceIndex = GroupHintParser.convertHint2Index(sql, DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX);
			sql = GroupHintParser.removeIDDLGroupHint(sql);
			if (dataSourceIndex < 0) {
				dataSourceIndex = ThreadLocalDataSourceIndex.getIndex();
			}
			this.updateCount = groupDataSource.getDBSelector(false).tryExecute(executeUpdateTryer, retryTimes, sql,
					autoGeneratedKeys, columnIndexes, columnNames, dataSourceIndex);
			return this.updateCount;
		}
	}

	/**
	 * 
	 * @param connection
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	protected ResultSet executeQueryOnConnection(Connection connection, String sql) throws SQLException {
		Statement stmt = createStatementInternal(connection, false);
		this.currentResultSet = stmt.executeQuery(sql);
		return this.currentResultSet;
	}
	
	/**
	 * 
	 * @param connection
	 * @param sql
	 * @param autoGeneratedKeys
	 * @param columnIndexes
	 * @param columnNames
	 * @return
	 * @throws SQLException
	 */
	private int executeUpdateOnConnection(Connection connection, String sql, int autoGeneratedKeys, int[] columnIndexes,
			String[] columnNames) throws SQLException {
		
		Statement stmt = createStatementInternal(connection, false);

		if (autoGeneratedKeys == -1 && columnIndexes == null && columnNames == null) {
			return stmt.executeUpdate(sql);
		} else if (autoGeneratedKeys != -1) {
			return stmt.executeUpdate(sql, autoGeneratedKeys);
		} else if (columnIndexes != null) {
			return stmt.executeUpdate(sql, columnIndexes);
		} else if (columnNames != null) {
			return stmt.executeUpdate(sql, columnNames);
		} else {
			return stmt.executeUpdate(sql);
		}
	}
	
	/**
	 * 
	 * @param connection
	 * @param batchedSqls
	 * @return
	 * @throws SQLException
	 */
	private int[] executeBatchOnConnection(Connection connection, List<String> batchedSqls) throws SQLException {
		Statement stmt = createStatementInternal(connection, true);
		for (String sql : batchedSqls) {
			stmt.addBatch(sql);
		}
		return stmt.executeBatch();
	}
	
	/**
	 * 设置在底层执行的具体的Statement
	 * 如果前面的baseStatement未关，则先关闭
	 * @param baseStatement
	 */
	void setBaseStatement(Statement baseStatement) {
		if (this.baseStatement != null) {
			try {
				this.baseStatement.close();
			} catch (SQLException e) {
				logger.error("close baseStatement failed.", e);
			}
		}
		this.baseStatement = baseStatement;
	}
	
	public int getResultSetType() throws SQLException {
		return resultSetType;
	}

	public void setResultSetType(int resultSetType) {
		this.resultSetType = resultSetType;
	}
	
	public void setResultSetConcurrency(int resultSetConcurrency) {
		this.resultSetConcurrency = resultSetConcurrency;
	}

	public void setResultSetHoldability(int resultSetHoldability) {
		this.resultSetHoldability = resultSetHoldability;
	}
	
	@Override
	public int getMaxFieldSize() throws SQLException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setMaxFieldSize(int max) throws SQLException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public int getMaxRows() throws SQLException {
		return maxRows;
	}

	@Override
	public void setMaxRows(int max) throws SQLException {
		maxRows = max;
	}

	@Override
	public void setEscapeProcessing(boolean enable) throws SQLException {
		throw new SQLException("Unsupported");
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		return queryTimeout;
	}

	@Override
	public void setQueryTimeout(int seconds) throws SQLException {
		queryTimeout = seconds;
	}

	@Override
	public void cancel() throws SQLException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		checkClosed();
		if (baseStatement != null)
			return baseStatement.getWarnings();
		return null;
	}

	@Override
	public void clearWarnings() throws SQLException {
		checkClosed();
		if (baseStatement != null)
			baseStatement.clearWarnings();
	}

	@Override
	public void setCursorName(String name) throws SQLException {
		throw new UnsupportedOperationException("Unsupported");
	}

	@Override
	public void setFetchDirection(int direction) throws SQLException {
		throw new SQLException("Unsupported");
	}

	@Override
	public int getFetchDirection() throws SQLException {
		throw new SQLException("Unsupported");
	}

	@Override
	public void setFetchSize(int rows) throws SQLException {
		this.fetchSize = rows;
	}

	@Override
	public int getFetchSize() throws SQLException {
		return fetchSize;
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		return this.resultSetConcurrency;
	}

	@Override
	public boolean getMoreResults(int current) throws SQLException {
		return moreResults;
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		return resultSetHoldability;
	}

	@Override
	public boolean isClosed() throws SQLException {
		throw new SQLException("Unsupported");
	}

	@Override
	public void setPoolable(boolean poolable) throws SQLException {
		throw new SQLException("Unsupported");
	}

	@Override
	public boolean isPoolable() throws SQLException {
		throw new SQLException("Unsupported");
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
	public void closeOnCompletion() throws SQLException {
		throw new SQLException("Unsupported");

	}

	public boolean isCloseOnCompletion() throws SQLException {
		throw new SQLException("Unsupported");
	}
}
