/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.atom.AbstractAtomDataSource;
import com.it.iddl.atom.DynamicAtomDataSource;
import com.it.iddl.atom.exception.AtomException;
import com.it.iddl.common.DBType;
import com.it.iddl.common.DataSourceFetcher;
import com.it.iddl.common.weight.Weight;
import com.it.iddl.group.config.GroupDataSourceConfig;
import com.it.iddl.group.config.GroupDataSourceConfigManager;
import com.it.iddl.group.config.impl.DefaultGroupDataSourceConfigManager;
import com.it.iddl.group.dbselector.DBSelector;
import com.it.iddl.group.dbselector.OneDBSelector;
import com.it.iddl.group.exception.AtomDataSourceException;
import com.it.iddl.group.exception.GroupException;
import com.it.iddl.group.jdbc.GroupDataSourceWrapper;
import com.it.iddl.group.listener.GroupDataSourceConfigListener;
import com.taobao.tddl.jdbc.group.DataSourceWrapper;

/**
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
	
	/**
	 * 构造函数
	 * @param appName
	 * @param groupKey
	 */
	public DynamicGroupDataSource(String appName, String groupKey) {
		super(appName, groupKey);
	}
	
	@Override
	public void internalInit() throws GroupException {
		
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
			DataSource ds = null;
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
				runtimeWritableAtomDBSelectorWrapper = new RuntimeWritableAtomDBSelector(dataSourceWrapperMap, groupExtraConfig);

		} catch () {
			
		} finally {
			_gds_lock_.unlock();
		}
	}
	
	private DBSelector createDBSelector(Map<Integer/* 优先级 */, List<GroupDataSourceWrapper>> priority2DswList, boolean isRead) {
		return null;
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
	 * 将给定的k 优先级 加入这个优先级对应的V list 里面。 ----因为可能有多个DS具有相同的优先级 ---add by
	 * mazhidan.pt
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
	};
}
