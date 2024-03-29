/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.common.parameter.ParameterContext;
import com.it.iddl.common.parameter.ParameterMethod;
import com.it.iddl.common.parameter.Parameters;
import com.it.iddl.common.sql.SQLParser;
import com.it.iddl.common.sql.SQLType;
import com.it.iddl.group.AbstractGroupDataSource;
import com.it.iddl.group.dbselector.DBSelector;
import com.it.iddl.group.dbselector.ThreadLocalDataSourceIndex;
import com.it.iddl.group.dbselector.DBSelector.AbstractDataSourceTryer;
import com.it.iddl.group.dbselector.DBSelector.DataSourceTryer;
import com.it.iddl.util.GroupHintParser;

/**
 * GroupPreparedStatement
 * @author sihai
 *
 */
public class GroupPreparedStatement extends GroupStatement implements PreparedStatement {

	private static final Log logger = LogFactory.getLog(GroupPreparedStatement.class);

	private String sql;
	private int autoGeneratedKeys = -1;
	private int[] columnIndexes;
	private String[] columnNames;
	//参数列表到参数上下文的映射  如 1:name  2：'2011-11-11'
	protected Map<Integer, ParameterContext> parameterSettings = new HashMap<Integer, ParameterContext>();
	
	/**
	 * 
	 */
	private DataSourceTryer<Integer> executeUpdateTryer = new AbstractDataSourceTryer<Integer>() {
		public Integer tryOnDataSource(GroupDataSourceWrapper gdsw, Object... args) throws SQLException {
			Connection connection = GroupPreparedStatement.this.groupConnection.createNewConnection(gdsw, false);
			return executeUpdateOnConnection(connection);
		}
	};
	
	/**
	 * 
	 */
	private DataSourceTryer<int[]> executeBatchTryer = new AbstractDataSourceTryer<int[]>() {
		public int[] tryOnDataSource(GroupDataSourceWrapper gdsw, Object... args) throws SQLException {
			Connection connection = groupConnection.createNewConnection(gdsw, false);
			return executeBatchOnConnection(connection);
		}
	};
	
	public GroupPreparedStatement(AbstractGroupDataSource groupDataSource, GroupConnection groupConnection, String sql) {
		super(groupDataSource, groupConnection);
		this.sql = sql;
	}
	
	private PreparedStatement createPreparedStatementInternal(Connection conn, String sql) throws SQLException {
		PreparedStatement ps;
		if (autoGeneratedKeys != -1) {
			ps = conn.prepareStatement(sql, autoGeneratedKeys);
		} else if (columnIndexes != null) {
			ps = conn.prepareStatement(sql, columnIndexes);
		} else if (columnNames != null) {
			ps = conn.prepareStatement(sql, columnNames);
		} else {
			int resultSetHoldability = this.resultSetHoldability;
			if (resultSetHoldability == -1) //未调用过setResultSetHoldability
				resultSetHoldability = conn.getHoldability();

			ps = conn.prepareStatement(sql, this.resultSetType, this.resultSetConcurrency, resultSetHoldability);
		}
		setBaseStatement(ps);
		ps.setQueryTimeout(queryTimeout); //这句可能抛出异常，所以要放到setBaseStatement之后
	    ps.setFetchSize(fetchSize);
	    ps.setMaxRows(maxRows);

		return ps;
	}
	
	public boolean execute() throws SQLException {
		if (logger.isDebugEnabled()) {
			logger.debug("invoke execute, sql = " + sql);
		}

		SQLType sqlType = SQLParser.getSQLType(sql);
		if (sqlType == SQLType.SELECT || sqlType == SQLType.SELECT_FOR_UPDATE || sqlType == SQLType.SHOW) {
			executeQuery();
			return true;
		} else if (sqlType == SQLType.INSERT || sqlType == SQLType.UPDATE || sqlType == SQLType.DELETE || sqlType == SQLType.REPLACE
				||sqlType==SQLType.TRUNCATE|| sqlType == SQLType.CREATE|| sqlType== SQLType.DROP|| sqlType == SQLType.LOAD || sqlType== SQLType.MERGE || sqlType == SQLType.ALTER) {
            super.updateCount=executeUpdate();
			return false;
		} else {
			throw new SQLException("only select, insert, update, delete,truncate,create,drop,load,merge sql is supported");
		}
	}
	
	/* ========================================================================
	 * executeQuery逻辑
	 * ======================================================================*/
	public ResultSet executeQuery() throws SQLException {
		checkClosed();
		ensureResultSetIsClosed();

		boolean gotoRead = SQLType.SELECT.equals(SQLParser.getSQLType(sql)) && groupConnection.getAutoCommit();
		Connection conn = groupConnection.getBaseConnection(sql,gotoRead);

		if (conn != null){
			sql=GroupHintParser.removeIDDLGroupHint(sql);
			return executeQueryOnConnection(conn, sql);
		}else{
			// hint优先
			Integer dataSourceIndex = GroupHintParser.convertHint2Index(sql, DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX);
			sql=GroupHintParser.removeIDDLGroupHint(sql);
			if (dataSourceIndex < 0) {
				dataSourceIndex = ThreadLocalDataSourceIndex.getIndex();
			}
			return groupDataSource.getDBSelector(gotoRead).tryExecute(executeQueryTryer, retryTimes, sql,dataSourceIndex);
		}
	}

	@Override
	protected ResultSet executeQueryOnConnection(Connection connection, String sql) throws SQLException {
		PreparedStatement ps = createPreparedStatementInternal(connection, sql);
		Parameters.setParameters(ps, parameterSettings);
		this.currentResultSet = ps.executeQuery();
		return this.currentResultSet;
	}

	/* ========================================================================
	 * executeUpdate逻辑
	 * ======================================================================*/
	public int executeUpdate() throws SQLException {
		checkClosed();
		ensureResultSetIsClosed();

		Connection connection = groupConnection.getBaseConnection(sql, false);

		if (connection != null){
			sql = GroupHintParser.removeIDDLGroupHint(sql);
			int updateCount = executeUpdateOnConnection(connection);
			super.updateCount = updateCount;
			return updateCount;
		} else {
			// hint优先
			Integer dataSourceIndex = GroupHintParser.convertHint2Index(sql, DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX);
			sql = GroupHintParser.removeIDDLGroupHint(sql);
			if (dataSourceIndex < 0) {
				dataSourceIndex = ThreadLocalDataSourceIndex.getIndex();
			}
			//#bug 2011-10-28,modify by junyu,updateCount not set,fixed
			int updateCount = groupDataSource.getDBSelector(false).tryExecute(null, executeUpdateTryer, retryTimes, sql, dataSourceIndex);
			super.updateCount=updateCount;
			return updateCount;
		}
	}

	private int executeUpdateOnConnection(Connection connection) throws SQLException {
		PreparedStatement ps = createPreparedStatementInternal(connection, sql);
		Parameters.setParameters(ps, parameterSettings);
		return ps.executeUpdate();
	}
	
	/* ========================================================================
	 * executeBatch
	 * ======================================================================*/
	private List<Map<Integer, ParameterContext>> pstArgs;

	public void addBatch() throws SQLException {
		if (pstArgs == null) {
			pstArgs = new LinkedList<Map<Integer, ParameterContext>>();
		}
		Map<Integer, ParameterContext> newArg = new HashMap<Integer, ParameterContext>(parameterSettings.size());
		newArg.putAll(parameterSettings);

		parameterSettings.clear();

		pstArgs.add(newArg);
	}

	public int[] executeBatch() throws SQLException {
		try {
			checkClosed();
			ensureResultSetIsClosed();

			if (pstArgs == null || pstArgs.isEmpty()) {
				return new int[0];
			}

			Connection conn = groupConnection.getBaseConnection(sql,false);

			if (conn != null) {
				sql=GroupHintParser.removeIDDLGroupHint(sql);
				// 如果当前已经有连接,则不做任何重试。对于更新来说，不管有没有事务，
				// 用户总期望getConnection获得连接之后，后续的一系列操作都在这同一个库，同一个连接上执行
				return executeBatchOnConnection(conn);
			} else {
				Integer dataSourceIndex = GroupHintParser.convertHint2Index(sql, DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX);
				sql=GroupHintParser.removeIDDLGroupHint(sql);
				if (dataSourceIndex < 0) {
					dataSourceIndex = ThreadLocalDataSourceIndex.getIndex();
				}
				return groupDataSource.getDBSelector(false).tryExecute(null, executeBatchTryer, retryTimes,dataSourceIndex);
			}
		} finally {
			if (pstArgs != null)
				pstArgs.clear();
		}
	}

	//TODO 重试中Statement的关闭
	private int[] executeBatchOnConnection(Connection conn) throws SQLException {
		PreparedStatement ps = createPreparedStatementInternal(conn, sql);

		for (Map<Integer, ParameterContext> parameterSettings : pstArgs) {
			setBatchParameters(ps, parameterSettings.values());
			ps.addBatch();
		}

		return ps.executeBatch();
	}

	
	public void clearParameters() throws SQLException {
		parameterSettings.clear();
	}
	
	private static void setBatchParameters(PreparedStatement ps, Collection<ParameterContext> batchedParameters) throws SQLException {
		for (ParameterContext context : batchedParameters) {
			Parameters.parameterHandlers.get(context.getParameterMethod()).setParameter(ps, context.getArgs());
		}
	}
	
	/* ========================================================================
	 * setxxx SQL参数设置
	 * ======================================================================*/
	public void setArray(int i, Array x) throws SQLException {
		parameterSettings.put(i, new ParameterContext(ParameterMethod.setArray, new Object[] { i, x }));
	}

	public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setAsciiStream, new Object[] {
				parameterIndex, x, length }));
	}

	public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setBigDecimal, new Object[] {
				parameterIndex, x }));
	}

	public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setBinaryStream, new Object[] {
				parameterIndex, x, length }));
	}

	public void setBlob(int i, Blob x) throws SQLException {
		parameterSettings.put(i, new ParameterContext(ParameterMethod.setBlob, new Object[] { i, x }));
	}

	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setBoolean, new Object[] {
				parameterIndex, x }));
	}

	public void setByte(int parameterIndex, byte x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setByte, new Object[] {
				parameterIndex, x }));
	}

	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setBytes, new Object[] {
				parameterIndex, x }));
	}

	public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setCharacterStream, new Object[] {
				parameterIndex, reader, length }));
	}

	public void setClob(int i, Clob x) throws SQLException {
		parameterSettings.put(i, new ParameterContext(ParameterMethod.setClob, new Object[] { i, x }));
	}

	public void setDate(int parameterIndex, Date x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setDate1, new Object[] {
				parameterIndex, x }));
	}

	public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setDate2, new Object[] {
				parameterIndex, x, cal }));
	}

	public void setDouble(int parameterIndex, double x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setDouble, new Object[] {
				parameterIndex, x }));
	}

	public void setFloat(int parameterIndex, float x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setFloat, new Object[] {
				parameterIndex, x }));
	}

	public void setInt(int parameterIndex, int x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setInt, new Object[] {
				parameterIndex, x }));
	}

	public void setLong(int parameterIndex, long x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setLong, new Object[] {
				parameterIndex, x }));
	}

	public void setNull(int parameterIndex, int sqlType) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setNull1, new Object[] {
				parameterIndex, sqlType }));
	}

	public void setNull(int paramIndex, int sqlType, String typeName) throws SQLException {
		parameterSettings.put(paramIndex, new ParameterContext(ParameterMethod.setNull2, new Object[] { paramIndex,
				sqlType, typeName }));
	}

	public void setObject(int parameterIndex, Object x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setObject1, new Object[] {
				parameterIndex, x }));
	}

	public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setObject2, new Object[] {
				parameterIndex, x, targetSqlType }));
	}

	public void setObject(int parameterIndex, Object x, int targetSqlType, int scale) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setObject3, new Object[] {
				parameterIndex, x, targetSqlType, scale }));
	}

	public void setRef(int i, Ref x) throws SQLException {
		parameterSettings.put(i, new ParameterContext(ParameterMethod.setRef, new Object[] { i, x }));
	}

	public void setShort(int parameterIndex, short x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setShort, new Object[] {
				parameterIndex, x }));
	}

	public void setString(int parameterIndex, String x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setString, new Object[] {
				parameterIndex, x }));
	}

	public void setTime(int parameterIndex, Time x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setTime1, new Object[] {
				parameterIndex, x }));
	}

	public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setTime2, new Object[] {
				parameterIndex, x, cal }));
	}

	public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setTimestamp1, new Object[] {
				parameterIndex, x }));
	}

	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setTimestamp2, new Object[] {
				parameterIndex, x, cal }));
	}

	public void setURL(int parameterIndex, URL x) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setURL, new Object[] {
				parameterIndex, x }));
	}

	@Deprecated
	public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
		parameterSettings.put(parameterIndex, new ParameterContext(ParameterMethod.setUnicodeStream, new Object[] {
				parameterIndex, x, length }));
	}
	
	/* ========================================================================
	 * 无逻辑的getter/setter
	 * ======================================================================*/
	public int getAutoGeneratedKeys() {
		return autoGeneratedKeys;
	}

	public void setAutoGeneratedKeys(int autoGeneratedKeys) {
		this.autoGeneratedKeys = autoGeneratedKeys;
	}

	public int[] getColumnIndexes() {
		return columnIndexes;
	}

	public void setColumnIndexes(int[] columnIndexes) {
		this.columnIndexes = columnIndexes;
	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(String[] columnNames) {
		this.columnNames = columnNames;
	}

	public boolean isClosed() throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setPoolable(boolean poolable) throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public boolean isPoolable() throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public <T> T unwrap(Class<T> iface) throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setRowId(int parameterIndex, RowId x) throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setNString(int parameterIndex, String value)
			throws SQLException
	{
		throw new SQLException("not support exception");

	}

	public void setNCharacterStream(int parameterIndex, Reader value,
			long length) throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setNClob(int parameterIndex, NClob value) throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setClob(int parameterIndex, Reader reader, long length)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setBlob(int parameterIndex, InputStream inputStream, long length)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setNClob(int parameterIndex, Reader reader, long length)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setSQLXML(int parameterIndex, SQLXML xmlObject)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setAsciiStream(int parameterIndex, InputStream x, long length)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setBinaryStream(int parameterIndex, InputStream x, long length)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setCharacterStream(int parameterIndex, Reader reader,
			long length) throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setAsciiStream(int parameterIndex, InputStream x)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setBinaryStream(int parameterIndex, InputStream x)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setCharacterStream(int parameterIndex, Reader reader)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setNCharacterStream(int parameterIndex, Reader value)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setClob(int parameterIndex, Reader reader) throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setBlob(int parameterIndex, InputStream inputStream)
			throws SQLException
	{
		throw new SQLException("not support exception");
	}

	public void setNClob(int parameterIndex, Reader reader) throws SQLException
	{
		throw new SQLException("not support exception");
	}
	
	@Override
	public ParameterMetaData getParameterMetaData() throws SQLException {
		throw new UnsupportedOperationException("unsupported");
	}

	public ResultSetMetaData getMetaData() throws SQLException {
		throw new UnsupportedOperationException("getMetaData");
	}
}
