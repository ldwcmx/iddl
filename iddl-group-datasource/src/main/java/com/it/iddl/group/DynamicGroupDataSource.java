/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group;

import com.it.iddl.group.config.GroupDataSourceConfig;
import com.it.iddl.group.config.GroupDataSourceConfigManager;
import com.it.iddl.group.config.impl.DefaultGroupDataSourceConfigManager;
import com.it.iddl.group.dbselector.DBSelector;
import com.it.iddl.group.exception.GroupException;
import com.it.iddl.group.listener.GroupDataSourceConfigListener;

/**
 * 
 * @author sihai
 *
 */
public class DynamicGroupDataSource extends AbstractGroupDataSource {

	private String gateway;
	private GroupDataSourceConfigManager configManager;		// 
	
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
		
		GroupDataSourceConfig config = configManager.getConfig(appName, groupKey);
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
	
	private void reflush(GroupDataSourceConfig newConfi) {
		
	}
}
