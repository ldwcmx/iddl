/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.config;

import com.it.iddl.group.exception.GroupException;
import com.it.iddl.group.listener.GroupDataSourceConfigListener;

/**
 * 
 * @author sihai
 *
 */
public interface GroupDataSourceConfigManager {

	/**
	 * 初始化
	 * @param gateway
	 * @throws GroupException
	 */
	void init(String gateway) throws GroupException;
	
	/**
	 * 停止
	 * @throws GroupException
	 */
	void stop() throws GroupException;
	
	/**
	 * 获取数据源配置项值
	 * @param appName
	 * @param groupKey
	 * @return
	 * @throws GroupException TODO
	 */
	GroupDataSourceConfig getConfig(String appName, String groupKey) throws GroupException;
	
	/**
	 * 获取数据源配置项值并注册数据源配置项监听器
	 * @param appName
	 * @param dbKey
	 * @param listener
	 * @return
	 * @throws GroupException TODO
	 */
	GroupDataSourceConfig getConfig(String appName, String groupKey, GroupDataSourceConfigListener listener) throws GroupException;
	
	/**
	 * 注册数据源配置项监听器
	 * @param appName
	 * @param dbKey
	 * @param listener
	 * @throws GroupException
	 */
	void register(String appName, String groupKey, GroupDataSourceConfigListener listener) throws GroupException;
	
	/**
	 * 注销数据源配置项监听器
	 * @throws GroupException TODO
	 */
	void unregister() throws GroupException;
}
