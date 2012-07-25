package com.it.iddl.group.dbselector;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import com.it.iddl.group.jdbc.GroupDataSourceWrapper;

public class RuntimeWritableAtomDBSelector extends AbstractDBSelector {
	
	private Map<String, GroupDataSourceWrapper> dataSourceWrapperMap = new HashMap<String, GroupDataSourceWrapper>();
	private EquityDbManager equityDbManager;

	public RuntimeWritableAtomDBSelector(Map<String, GroupDataSourceWrapper> dataSourceWrapperMap) {
		Map<String, Integer> dummyWeightMap = new HashMap<String, Integer>(dataSourceWrapperMap.size());
		for (String dsKey : dataSourceWrapperMap.keySet())
			dummyWeightMap.put(dsKey, 10);

		this.equityDbManager = new EquityDbManager(dataSourceWrapperMap, dummyWeightMap);
		this.readable = false;
		this.dataSourceWrapperMap = dataSourceWrapperMap;
	}

	public DataSource select() {
		for (Map.Entry<String, GroupDataSourceWrapper> e : dataSourceWrapperMap.entrySet())
				return e.getValue();
		return null;
	}

	public Map getDataSources() {
		return dataSourceWrapperMap;
	}

	@Override
	protected <T> T tryExecuteInternal(Map<DataSource, SQLException> failedDataSources, DataSourceTryer<T> tryer, int times, Object... args)
			throws SQLException {
		return equityDbManager.tryExecuteInternal(failedDataSources, tryer,
				times, args);
	}

	public GroupDataSourceWrapper get(String dsKey) {
		return dataSourceWrapperMap.get(dsKey);
	}

	protected DataSourceHolder findDataSourceWrapperByIndex(int dataSourceIndex) {
		return equityDbManager.findDataSourceWrapperByIndex(dataSourceIndex);
	}
}
