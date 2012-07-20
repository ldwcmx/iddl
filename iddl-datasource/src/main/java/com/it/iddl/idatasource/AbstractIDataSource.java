/**
 * idatasource
 * 
 * all rights reserved by ihome.inc
 */
package com.it.iddl.idatasource;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

/**
 * 
 * @author sihai
 *
 */
public abstract class AbstractIDataSource implements DataSource {

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	protected abstract DataSource getDatasource() throws SQLException;
	
	@Override
	public Connection getConnection() throws SQLException {
		return getDatasource().getConnection();
	}

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		return getDatasource().getConnection(username, password);
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return getDatasource().getLogWriter();
	}
	
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return getDatasource().getLoginTimeout();
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		getDatasource().setLogWriter(out);
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		getDatasource().setLoginTimeout(seconds);
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return AbstractIDataSource.class.isAssignableFrom(iface);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		if (isWrapperFor(iface)) {
			return (T) this;
		} else {
			throw new SQLException("not a wrapper for " + iface);
		}
	}
}
