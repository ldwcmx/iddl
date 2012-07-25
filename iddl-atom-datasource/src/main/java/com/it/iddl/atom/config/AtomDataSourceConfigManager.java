/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.config;

import java.util.Properties;

import com.it.iddl.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.atom.exception.AtomException;

/**
 * <p>
 * 
 * </p>
 * @author sihai
 *
 */
public interface AtomDataSourceConfigManager {
	
	/**
	 * 初始化
	 * @param gateway
	 * @throws AtomException
	 */
	void init(String gateway) throws AtomException;
	
	/**
	 * 停止
	 * @throws AtomException
	 */
	void stop() throws AtomException;
	
	/**
	 * 获取数据源配置项值
	 * @param appName
	 * @param dbKey
	 * @return
	 * @throws AtomException TODO
	 */
	DataSourceConfig getConfig(String appName, String dbKey) throws AtomException;
	
	/**
	 * 获取数据源配置项值并注册数据源配置项监听器
	 * @param appName
	 * @param dbKey
	 * @param listener
	 * @return
	 * @throws AtomException TODO
	 */
	DataSourceConfig getConfig(String appName, String dbKey, DataSourceConfigListener listener) throws AtomException;
	
	/**
	 * 注册数据源配置项监听器
	 * @param appName
	 * @param dbKey
	 * @param listener
	 * @throws AtomException
	 */
	void register(String appName, String dbKey, DataSourceConfigListener listener) throws AtomException;
	
	/**
	 * 注销数据源配置项监听器
	 * @throws AtomException TODO
	 */
	void unregister() throws AtomException;
}
