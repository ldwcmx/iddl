/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasources
 */
package com.it.iddl.group.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.it.iddl.common.DBType;
import com.it.iddl.common.weight.Weight;

/**
 *
 * 一个线程安全的<code>DataSource</code>包装类
 * <p> 
 * <code>DataSource</code>包装类，因为一个<code>GroupDataSource</code>由多个<code>AtomDataSource</code>组成，且每个<code>AtomDataSource</code>都有对应的读写权重等信息，所以将每一个<code>AtomDataSource</code>封装起来。
 * </p>
 * 
 * @author sihai
 *
 */
public class GroupDataSourceWrapper implements DataSource {

	private final String dbKey;  			// 这个DataSource对应的dbKey
	private final String conf;				// 权重信息字符串
	private final Weight weight;  			// 权重信息
	private final DataSource wrappedDataSource; // 被封装的目标DataSource
	private final DBType dbType;			// 数据库类型
	private final int dataSourceIndex;		// dataSourceIndex是指这个DataSource在Group中的位置
	
	public GroupDataSourceWrapper(String dbKey, String conf, DataSource wrappedDataSource, DBType dbType) {
		this(dbKey, conf, wrappedDataSource, dbType, -1);
	}
	
	public GroupDataSourceWrapper(String dbKey, String conf, DataSource wrappedDataSource, DBType dbType, int dataSourceIndex) {
		this.dbKey = dbKey;
		this.conf = conf;
		this.weight = new Weight(conf);
		this.wrappedDataSource = wrappedDataSource;
		this.dbType = dbType;

		this.dataSourceIndex = dataSourceIndex;
	}
	
	/**
	 * 验证此DataSource的路由index信息中，是否包含指定的index
	 * @param specifiedIndex
	 * @return
	 */
	public boolean isMatchDataSourceIndex(int specifiedIndex) {
		if (weight.indexes != null && !weight.indexes.isEmpty()) {
			return weight.indexes.contains(specifiedIndex);
		} else {
			return this.dataSourceIndex == specifiedIndex;
		}
	}
	
	/**
	 * 是否有读权重。r0则返回false
	 * @return
	 */
	public boolean hasReadWeight() {
		return weight.r != 0;
	}

	/**
	 * 是否有写权重。w0则返回false
	 * @return
	 */
	public boolean hasWriteWeight() {
		return weight.w != 0;
	}
	
	public String getDbKey() {
		return dbKey;
	}

	public String getConf() {
		return conf;
	}
	
	public Weight getWeight() {
		return weight;
	}

	public DBType getDBType() {
		return dbType;
	}

	public DataSource getWrappedDataSource() {
		return wrappedDataSource;
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	//					以下是javax.sql.DataSource的API实现
	///////////////////////////////////////////////////////////////////////////////////
	public PrintWriter getLogWriter() throws SQLException {
		return wrappedDataSource.getLogWriter();
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		wrappedDataSource.setLogWriter(out);
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		wrappedDataSource.setLoginTimeout(seconds);
	}

	public int getLoginTimeout() throws SQLException {
		return wrappedDataSource.getLoginTimeout();
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
		//return wrappedDataSource.getParentLogger();
	}

	public Connection getConnection() throws SQLException {
		return wrappedDataSource.getConnection();
	}

	public Connection getConnection(String username, String password)
			throws SQLException {
		return wrappedDataSource.getConnection(username, password);
	}
	
	public String toString() {
		return new StringBuilder("DataSourceWrapper{dataSourceKey=").append(dbKey).append(", dataSourceIndex=")
				.append(dataSourceIndex).append(",weight=").append(weight).append("}").toString();
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
}
