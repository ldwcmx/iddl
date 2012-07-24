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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.group.AbstractGroupDataSource;

/**
 * 
 * @author sihai
 *
 */
public class GroupStatement implements Statement {

	private static final Log logger = LogFactory.getLog(GroupStatement.class);

	protected GroupConnection groupConnection;
	protected AbstractGroupDataSource groupDataSource;
	protected int retryTimes;
	
	protected boolean closed; //当前statment 是否是关闭的
	
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

	public GroupStatement(AbstractGroupDataSource groupDataSource, GroupConnection groupConnection) {
		this.groupDataSource = groupDataSource;
		this.groupConnection = groupConnection;

		this.retryTimes = groupDataSource.getRetryTimes();
	}

	/* ========================================================================
	 * 下层(有可能不是真正的)Statement的持有，getter/setter包权限
	 * ======================================================================*/
	private Statement baseStatement;
	
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
	
	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int executeUpdate(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* ========================================================================
	 * 关闭逻辑
	 * ======================================================================*/
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
	
	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaxFieldSize(int max) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getMaxRows() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaxRows(int max) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEscapeProcessing(boolean enable) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getQueryTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setQueryTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancel() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCursorName(String name) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean execute(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUpdateCount() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFetchDirection(int direction) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getFetchDirection() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFetchSize(int rows) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getFetchSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addBatch(String sql) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearBatch() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int[] executeBatch() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getMoreResults(int current) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int executeUpdate(String sql, int autoGeneratedKeys)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int executeUpdate(String sql, int[] columnIndexes)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int executeUpdate(String sql, String[] columnNames)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean execute(String sql, int autoGeneratedKeys)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean execute(String sql, int[] columnIndexes) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean execute(String sql, String[] columnNames)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPoolable(boolean poolable) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPoolable() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void closeOnCompletion() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	///////////////////////////////////////////////////////////////////
	//		For jdk1.6
	///////////////////////////////////////////////////////////////////
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
