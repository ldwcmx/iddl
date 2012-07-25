/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
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
	 * @param dsKey
	 * @return
	 */
	DataSource getDataSource(String dsKey);
	
	/**
	 * 取datasource的dbtype
	 * @param dsKey
	 * @return
	 */
	DBType getDataSourceDBType(String dsKey);
}
