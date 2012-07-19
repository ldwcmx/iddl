/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.it.iddl.jdbc.atom.exception.AtomException;

/**
 * 抽象的原子数据源, 对应一个数据库的数据源
 * @author sihai
 *
 */
public abstract class AbstractAtomDataSource implements DataSource {
	
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
		return AbstractAtomDataSource.class.isAssignableFrom(iface);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		if(isWrapperFor(iface)){
			return (T) this;
		}else{
			throw new SQLException("not a wrapper for "+ iface);
		}
	}
}
