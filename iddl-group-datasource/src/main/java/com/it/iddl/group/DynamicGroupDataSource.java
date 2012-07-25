/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group;

import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iacrqq.util.StringUtil;
import com.it.iddl.atom.AbstractAtomDataSource;
import com.it.iddl.atom.DynamicAtomDataSource;
import com.it.iddl.atom.exception.AtomException;
import com.it.iddl.common.DBType;
import com.it.iddl.common.DataSourceFetcher;
import com.it.iddl.common.weight.Weight;
import com.it.iddl.group.config.GroupDataSourceConfig;
import com.it.iddl.group.config.GroupDataSourceConfigManager;
import com.it.iddl.group.config.impl.DefaultGroupDataSourceConfigManager;
import com.it.iddl.group.dbselector.AbstractDBSelector;
import com.it.iddl.group.dbselector.DBSelector;
import com.it.iddl.group.dbselector.EquityDbManager;
import com.it.iddl.group.dbselector.OneDBSelector;
import com.it.iddl.group.dbselector.PriorityDbGroupSelector;
import com.it.iddl.group.dbselector.RuntimeWritableAtomDBSelector;
import com.it.iddl.group.exception.AtomDataSourceException;
import com.it.iddl.group.exception.GroupException;
import com.it.iddl.group.jdbc.GroupDataSourceWrapper;
import com.it.iddl.group.listener.GroupDataSourceConfigListener;

/**
 * <p>
 * 支持动态配置的数据源组, 对应多个对等数据库的数据源,
 * 支持配置中心动态推送配置信息, 配置信息变更后, 数据源自动无缝重新配置
 * </p>
 * 
 * @author sihai
 *
 */
public class DynamicGroupDataSource extends AbstractGroupDataSource {

	private Log logger = LogFactory.getLog(DynamicGroupDataSource.class);
	
	private String gateway;
	private GroupDataSourceConfigManager configManager;		// 
	private boolean createTAtomDataSource = true;			// 
	private DataSourceFetcher dataSourceFetcher;			// 
	private Map<String/* Atom dbIndex */, GroupDataSourceWrapper/* Wrapper过的Atom DS */> dataSourceWrapperMap = new HashMap<String, GroupDataSourceWrapper>();
	private ReentrantLock _gds_lock_;						// 数据源操作锁
	
	//当运行期间主备发生切换时是否需要查找第一个可写的库
	private boolean autoSelectWriteDataSource = false;
		
	/**
	 * 不能在DynamicGroupDataSource或GroupConnection或其他地方把DBSelector做为一个字段保存下来，
	 * 否则db权重配置变了之后无法使用最新的权重配置
	 */
	private volatile DBSelector readDBSelectorWrapper;
	private volatile DBSelector writeDBSelectorWrapper;
	private volatile DBSelector runtimeWritableAtomDBSelectorWrapper;
	
	@Override
	public void internalInit() throws GroupException {
		
		checkProperty();
		
		// 默认使用zookeeper
		configManager = new DefaultGroupDataSourceConfigManager();
		configManager.init(gateway);
		
		dataSourceFetcher = new MyDataSourceFetcher();
		GroupDataSourceConfig config = configManager.getConfig(appName, groupKey);
		_gds_lock_ = new ReentrantLock();
		// 
		reflush(config);

		configManager.register(appName, groupKey, new GroupDataSourceConfigListener() {
			@Override
			public void changed(GroupDataSourceConfig newConfig) {
				// 刷新数据源
				reflush(newConfig);
			}
		});
	}
	
	@Override
	public DBSelector getDBSelector(boolean isRead) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * @param newConfig
	 */
	private void reflush(GroupDataSourceConfig newConfig) {
		try {
			_gds_lock_.lock();
			Map<String, GroupDataSourceWrapper> gdssMap = new HashMap<String, GroupDataSourceWrapper>(newConfig.getGroupSize());
			int index = 0;
			for(Map.Entry<String, Weight> entry : newConfig.getWeightMap().entrySet()) {
				GroupDataSourceWrapper gdsw = new GroupDataSourceWrapper(entry.getKey(), entry.getValue(), dataSourceFetcher.getDataSource(entry.getKey()), dataSourceFetcher.getDataSourceDBType(entry.getKey()), index++);
				gdssMap.put(entry.getKey(), gdsw);
			}
			
			Map<String, GroupDataSourceWrapper> old = this.dataSourceWrapperMap;
			this.dataSourceWrapperMap = gdssMap;
			// 销毁无用的数据源
			for(Map.Entry<String, GroupDataSourceWrapper> entry : old.entrySet()) {
				if(!gdssMap.containsKey(entry.getKey())) {
					//entry.getValue().destroy();
				}
			}
			// 
			old.clear();
			old = null;
			
			//
			DBSelector r_DBSelector = null;
			DBSelector w_DBSelector = null;

			// 如果只有一个db，则用OneDBSelector
			if (gdssMap.size() == 1) {
				GroupDataSourceWrapper dsw2 = gdssMap.values().toArray(new GroupDataSourceWrapper[]{})[0];
				r_DBSelector = new OneDBSelector(dsw2);
				r_DBSelector.setDbType(dsw2.getDBType());
				w_DBSelector = r_DBSelector;
			} else {
				// 读写优先级Map
				Map<Integer/* 优先级 */, List<GroupDataSourceWrapper>/* 优先级为key的DS 列表 */> rPriority2DswList = new HashMap<Integer, List<GroupDataSourceWrapper>>();
				Map<Integer, List<GroupDataSourceWrapper>> wPriority2DswList = new HashMap<Integer, List<GroupDataSourceWrapper>>();
				for (GroupDataSourceWrapper dsw1 : gdssMap.values()) {
					add2LinkedListMap(rPriority2DswList, dsw1.getWeight().p, dsw1);
					add2LinkedListMap(wPriority2DswList, dsw1.getWeight().q, dsw1);
				}
				r_DBSelector = createDBSelector(rPriority2DswList, true);
				w_DBSelector = createDBSelector(wPriority2DswList, false);
			}

			r_DBSelector.setReadable(true);
			w_DBSelector.setReadable(false);

			this.readDBSelectorWrapper = r_DBSelector;
			this.writeDBSelectorWrapper = w_DBSelector;

			if (autoSelectWriteDataSource)
				runtimeWritableAtomDBSelectorWrapper = new RuntimeWritableAtomDBSelector(dataSourceWrapperMap);

		} catch (Exception e) {
			
		} finally {
			_gds_lock_.unlock();
		}
	}
	
	/**
	 * 
	 * @param priority2DswList
	 * @param isRead
	 * @return
	 */
	private DBSelector createDBSelector(Map<Integer/* 优先级 */, List<GroupDataSourceWrapper>> priority2DswList, boolean isRead) {
		if (priority2DswList.size() == 1) { // 只有一个优先级直接使用EquityDbManager
			return createDBSelector2(priority2DswList.entrySet().iterator().next().getValue(), isRead);
		} else {
			List<Integer> priorityKeys = new LinkedList<Integer>();
			priorityKeys.addAll(priority2DswList.keySet());
			Collections.sort(priorityKeys); // 优先级从小到大排序
			EquityDbManager[] priorityGroups = new EquityDbManager[priorityKeys.size()];
			for (int i = 0; i < priorityGroups.length; i++) { // 最大的优先级放到最前面
				List<GroupDataSourceWrapper> dswList = priority2DswList.get(priorityGroups.length - 1 - i); // 倒序
				// PriorityDbGroupSelector依赖EquityDbManager抛出的NoMoreDataSourceException来实现，
				// 所以这里即使只有一个ds也只能仍然用EquityDbManager
				priorityGroups[i] = createEquityDbManager(dswList, isRead);
			}
			return new PriorityDbGroupSelector(priorityGroups);
		}
	}
	
	/**
	 * 
	 * @param dswList
	 * @param isRead
	 * @return
	 */
	private AbstractDBSelector createDBSelector2(List<GroupDataSourceWrapper> dswList, boolean isRead) {
		AbstractDBSelector dbSelector;
		if (dswList.size() == 1) {
			GroupDataSourceWrapper dsw = dswList.get(0);
			dbSelector = new OneDBSelector(dsw);
			dbSelector.setDbType(dsw.getDBType());
		} else {
			dbSelector = createEquityDbManager(dswList, isRead);
		}
		return dbSelector;
	}

	/**
	 * 
	 * @param list
	 * @param isRead
	 * @return
	 */
	private static EquityDbManager createEquityDbManager(List<GroupDataSourceWrapper> list, boolean isRead) {
		Map<String, GroupDataSourceWrapper> dataSourceMap = new HashMap<String, GroupDataSourceWrapper>(list.size());
		Map<String, Integer> weightMap = new HashMap<String, Integer>(list.size());

		DBType dbType = null;
		for (GroupDataSourceWrapper dsw : list) {
			String dsKey = dsw.getDbKey();
			dataSourceMap.put(dsKey, dsw);
			weightMap.put(dsKey, isRead ? dsw.getWeight().r : dsw.getWeight().w);

			if (dbType == null) {
				dbType = dsw.getDBType();
			}
		}
		EquityDbManager equityDbManager = new EquityDbManager(dataSourceMap, weightMap);
		equityDbManager.setDbType(dbType);
		return equityDbManager;
	}
	
	/**
	 * 
	 * @param dsKey
	 * @return
	 */
	private AbstractAtomDataSource createAtomDataSource(String dsKey) {
		try {
			DynamicAtomDataSource ads = new DynamicAtomDataSource();
			ads.setAppName(appName);
			ads.setDbKey(dsKey);
			ads.setGateway(gateway);
			ads.init();
			ads.setLogWriter(getLogWriter());
			ads.setLoginTimeout(getLoginTimeout());
			return ads;
		} catch (AtomException e) {
			String errorMsg = String.format("Create atom datasource failed, dsKey:%s, errorMsg:%s", dsKey, e.getMessage());
			logger.error(errorMsg, e);
			throw new AtomDataSourceException(errorMsg, e);
		} catch (SQLException e) {
			String errorMsg = String.format("Create atom datasource failed, dsKey:%s, errorMsg:%s", dsKey, e.getMessage());
			logger.error(errorMsg, e);
			throw new AtomDataSourceException(errorMsg, e);
		}
	}
	
	/**
	 * 将给定的k 优先级 加入这个优先级对应的V list 里面。 ----因为可能有多个DS具有相同的优先级 
	 */
	private static <K, V> void add2LinkedListMap(Map<K, List<V>> m, K key,
			V value) {
		// 从Map中先取出这个优先级的List
		List<V> c = (List<V>) m.get(key);
		// 如果为空，则new一个
		if (c == null) {
			c = new LinkedList<V>();
			m.put(key, c);
		}
		// 不为空，在后面add()
		c.add(value);
	}
	
	private void checkProperty() {
		if(StringUtil.isBlank(appName)) {
			throw new IllegalArgumentException("Property appName must not be blank.");
		}
		if(StringUtil.isBlank(groupKey)) {
			throw new IllegalArgumentException("Property groupKey must not be blank.");
		}
		if(StringUtil.isBlank(gateway)) {
			throw new IllegalArgumentException("Property gateway must not be blank.");
		}
	}
	
	public String getGateway() {
		return gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	private class MyDataSourceFetcher implements DataSourceFetcher {
		private DBType dbType = DBType.MYSQL;

		@Override
		public DataSource getDataSource(String dsKey) {
			GroupDataSourceWrapper gdsw = dataSourceWrapperMap.get(dsKey);
			if (gdsw != null) {
				// 这里是OK的，权重会相应的改变的
				dbType = gdsw.getDBType();
				return gdsw.getWrappedDataSource();
			} else {
				if (createTAtomDataSource) {
					AbstractAtomDataSource atom = createAtomDataSource(dsKey);
					dbType = DBType.valueOf(atom.getDbType().name());
					return atom;
				} else {
					throw new IllegalArgumentException(String.format("Can not fetch datasource for dsKey:%s", dsKey));
				}
			}
		}

		@Override
		public DBType getDataSourceDBType(String dsKey) {
			return dbType;
		}
	}
}
