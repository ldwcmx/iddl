/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config;

import com.it.iddl.config.exception.ConfigException;
import com.it.iddl.config.listener.ConfigListener;

/**
 * <p>
 * 配置管理器
 * </p>
 * @author sihai
 *
 */
public interface ConfigManager {
	
	/**
	 * 初始化
	 * @param config
	 * @throws ConfigException
	 */
	void init(Object config) throws ConfigException;
	
	/**
	 * 停止
	 * @throws ConfigException
	 */
	void stop() throws ConfigException;
	
	/**
	 * 查询配置项的值
	 * @param configId
	 * @return
	 */
	String getConfigValue(String configId);
	
	/**
	 * 查询配置项的值, 并设置监听器
	 * @param configId
	 * @param listener
	 * @return
	 */
	String getConfigValue(String configId, ConfigListener listener);
	
	/**
	 * 注册配置项监听器
	 * @param listener
	 */
	void register(ConfigListener listener);
	
	/**
	 * 注销配置项监听器
	 * @param listene
	 */
	void unregister(ConfigListener listener);
	
	/**
	 * 注销配置项监听器
	 * @param configId
	 */
	void unregister(String configId);
	
	/**
	 * 构建配置项id
	 * @param appName
	 * @param dbKey
	 * @return
	 */
	String makeConfigId(String appName, String dbKey);
}
