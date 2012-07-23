/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.common;

import javax.sql.DataSource;

/**
 * 
 * @author sihai
 *
 */
public interface DataSourceFetcher {
	
	/**
	 * 取datasource
	 * @param key
	 * @return
	 */
	DataSource getDataSource(String key);
}
