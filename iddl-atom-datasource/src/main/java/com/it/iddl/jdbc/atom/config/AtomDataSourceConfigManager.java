/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom.config;

import java.util.Properties;

import com.it.iddl.jdbc.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.jdbc.atom.exception.AtomException;

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
	 * @param config
	 * @throws AtomException
	 */
	void init(Properties config) throws AtomException;
	
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
	 */
	DataSourceConfig getConfig(String appName, String dbKey);
	
	/**
	 * 获取数据源配置项值并注册数据源配置项监听器
	 * @param appName
	 * @param dbKey
	 * @param listener
	 * @return
	 */
	DataSourceConfig getConfig(String appName, String dbKey, DataSourceConfigListener listener);
	
	/**
	 * 注册数据源配置项监听器
	 * @param listener
	 */
	void register(DataSourceConfigListener listener);
	
	/**
	 * 注销数据源配置项监听器
	 */
	void unregister();
}
