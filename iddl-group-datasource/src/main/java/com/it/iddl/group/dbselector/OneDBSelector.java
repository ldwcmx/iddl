/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.dbselector;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.it.iddl.group.jdbc.GroupDataSourceWrapper;

/**
 * 只有一个数据源的DBSelector
 * @author sihai
 *
 */
public class OneDBSelector extends AbstractDBSelector {

	private final DataSourceHolder dsHolder;		//
	private final Map<String, DataSource> dsMap;	//
	
	public OneDBSelector(GroupDataSourceWrapper dsw) {
		this.dsHolder = new DataSourceHolder(dsw);
		dsMap = new LinkedHashMap<String, DataSource>(1);
		dsMap.put(dsw.getDbKey(), dsw.getWrappedDataSource());
	}
	
	@Override
	protected DataSourceHolder findDataSourceWrapperByIndex(int dataSourceIndex) {
		return dsHolder.gdsw.isMatchDataSourceIndex(dataSourceIndex) ? dsHolder : null;
	}

	@Override
	protected <T> T tryExecuteInternal(
			Map<DataSource, SQLException> failedDataSources,
			DataSourceTryer<T> tryer, int times, Object... args)
			throws SQLException {
		
		List<SQLException> exceptions;

		if (failedDataSources != null && failedDataSources.containsKey(dsHolder.gdsw)) {
			exceptions = new ArrayList<SQLException>(failedDataSources.size());
			exceptions.addAll(failedDataSources.values());

			return tryer.onSQLException(exceptions, this.exceptionSorter, args);
		}

		try {
			return tryOnDataSourceHolder(dsHolder, failedDataSources, tryer, times, args);
		} catch (SQLException e) {
			exceptions = new ArrayList<SQLException>(1);
			exceptions.add(e);
		}
		return tryer.onSQLException(exceptions, this.exceptionSorter, args);
	}

	@Override
	public DataSource get(String dsKey) {
		return dsMap.get(dsKey);
	}

	@Override
	public Map<String, DataSource> getDataSources() {
		return dsMap;
	}

	@Override
	public DataSource select() {
		return dsHolder.gdsw;
	}
}
