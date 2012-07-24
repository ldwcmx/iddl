package com.it.iddl.group.dbselector;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import com.taobao.tddl.jdbc.group.DataSourceWrapper;
import com.taobao.tddl.jdbc.group.config.ConfigManager;
import com.taobao.tddl.jdbc.group.config.GroupExtraConfig;

/**
 * ���������ڼ������л��ĳ�����DBAͨ�������������л���Ż�ȥ�޸�ÿ��TAtomDataSource�����á�
 * ������d0,d1,d2����⣬���һ���л�ʱ��Ӧÿ��TAtomDataSource��״̬��������: ===================== d0 d1
 * d2 (1) rw r r (2) na r r (3) na rw r (4) r rw r =====================
 *
 * (1)���л�ǰ���״̬���գ�(4)���л���ɺ��״̬���գ�(2)��(3)���м��̵�״̬���ա�
 *
 * ���ҵ��ϵͳ��״̬(1)��(3)��(4)��Ҫ����и��²���������²��������?��Ϊ�������״̬�ж����ҵ�һ������"w"��db��
 * ���ҵ��ϵͳ��״̬(2)��Ҫ����и��²���������²������ܾ��׳��쳣����Ϊ�����״̬���Ҳ�������"w"��db��
 *
 * @author yangzhu
 */
public class RuntimeWritableAtomDBSelector extends AbstractDBSelector {
	
	private Map<String, DataSourceWrapper> dataSourceWrapperMap = new HashMap<String, DataSourceWrapper>();
	private EquityDbManager equityDbManager;

	public RuntimeWritableAtomDBSelector(Map<String, DataSourceWrapper> dataSourceWrapperMap, GroupExtraConfig groupExtraConfig) {
		Map<String, Integer> dummyWeightMap = new HashMap<String, Integer>(dataSourceWrapperMap.size());
		for (String dsKey : dataSourceWrapperMap.keySet())
			dummyWeightMap.put(dsKey, 10);

		this.equityDbManager = new EquityDbManager(dataSourceWrapperMap, dummyWeightMap, groupExtraConfig);
		this.readable = false; // ֻ����д
		this.dataSourceWrapperMap = dataSourceWrapperMap;
	}

	public DataSource select() {
		for (Map.Entry<String, DataSourceWrapper> e : dataSourceWrapperMap.entrySet())
			if (ConfigManager.isDataSourceAvailable(e.getValue(), false))
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

	public DataSourceWrapper get(String dsKey) {
		return dataSourceWrapperMap.get(dsKey);
	}

	protected DataSourceHolder findDataSourceWrapperByIndex(int dataSourceIndex) {
		return equityDbManager.findDataSourceWrapperByIndex(dataSourceIndex);
	}
}
