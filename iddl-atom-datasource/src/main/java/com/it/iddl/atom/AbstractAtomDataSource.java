/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.it.iddl.atom.exception.AtomException;
import com.it.iddl.common.DBType;

/**
 * 抽象的原子数据源, 对应一个数据库的数据源
 * @author sihai
 *
 */
public abstract class AbstractAtomDataSource implements DataSource {
	
	protected String appName;					// 系统分配的应用名称
	protected String dbKey;						// 系统分配的数据库key
	protected DBType dbType;					// 数据库类型
	
	/**
	 * 获取子类的底层DataSource
	 * @return
	 * @throws SQLException
	 */
	protected abstract DataSource getDataSource() throws SQLException;

	/**
	 * 初始化
	 * @throws Exception
	 */
	public abstract void init() throws AtomException;

	/**
	 * 刷新数据源
	 * @throws AtomException
	 */
	public abstract void flush() throws AtomException;

	/**
	 * 销毁数据源
	 * @throws Exception
	 */
	public abstract void destroy() throws AtomException;
	
	@Override
	public Connection getConnection() throws SQLException {
		return getDataSource().getConnection();
	}

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		return getDataSource().getConnection(username, password);
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return getDataSource().getLogWriter();
	}
	
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return getDataSource().getLoginTimeout();
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		getDataSource().setLogWriter(out);
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		getDataSource().setLoginTimeout(seconds);
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return this.getClass().isAssignableFrom(iface);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		if(isWrapperFor(iface)){
			return (T) this;
		}else{
			throw new SQLException("not a wrapper for "+ iface);
		}
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDbKey() {
		return dbKey;
	}

	public void setDbKey(String dbKey) {
		this.dbKey = dbKey;
	} 
	
	public DBType getDbType() {
		return dbType;
	}
}
