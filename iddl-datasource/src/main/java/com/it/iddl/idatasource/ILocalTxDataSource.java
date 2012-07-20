/**
 * idatasource
 * 
 * all rights reserved by ihome.inc
 */
package com.it.iddl.idatasource;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.it.iddl.idatasource.resource.adapter.jdbc.local.LocalTxDataSource;

/**
 * 
 * @author sihai
 *
 */
public class ILocalTxDataSource extends AbstractIDataSource {

	private static final Logger logger = Logger.getLogger(ILocalTxDataSource.class);
	private static final DataSourceConfigFinder dataSourceConfigFinder = new DataSourceConfigFinder();
	
	private String name;
	private LocalTxDataSource localTxDataSource;
	
	@Override
	protected DataSource getDatasource() throws SQLException {
		return localTxDataSource.getDatasource();
	}
	
	public void init() throws Exception {
		
		LocalTxDataSourceConfig config = dataSourceConfigFinder.get(name);

		if (config == null) {
			throw new IllegalArgumentException("Cannot find datasource config: " + name);
		}
		if (logger.isDebugEnabled()) {
			logger.debug(config);
		}
		localTxDataSource = IDataSourceFactory.createLocalTxDataSource(config);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void destroy() throws Exception {
		if(null != localTxDataSource) {
			localTxDataSource.destroy();
		}
	}
}
