/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-config
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
	
	int DEFAULT_TIMEOUT = 5000;
	
	String CONFIG_SERVER_TYPE = "configServerType";
	String CONFIG_SERVER_SERVER_HOST = "configServerHost";
	String CONFIG_SERVER_SERVER_PORT = "configServerPort";
	String CONFIG_MANAGER_CACHE_DIRECTORY = "configManagerCacheDirectory";
	
	String DEFAULT_CONFIG_SERVER_ZOOKEEPER_HOST = "192.168.10.100";
	int DEFAULT_CONFIG_SERVER_ZOOKEEPER_PORT = 2181;
	
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
	 * @throws ConfigException
	 */
	String getConfigValue(String configId) throws ConfigException;
	
	/**
	 * 查询配置项的值, 并设置监听器
	 * @param configId
	 * @param listener
	 * @return
	 * @throws ConfigException
	 */
	String getConfigValue(String configId, ConfigListener listener)  throws ConfigException;
	
	/**
	 * 注册配置项监听器
	 * @param listener
	 * @throws ConfigException
	 */
	void register(ConfigListener listener)  throws ConfigException;
	
	/**
	 * 注销配置项监听器
	 * @param listener
	 * @throws ConfigException
	 */
	void unregister(ConfigListener listener) throws ConfigException;
	
	/**
	 * 注销配置项监听器
	 * @param configId
	 * @throws ConfigException
	 */
	void unregister(String configId)  throws ConfigException;
	
	/**
	 * 构建配置项id
	 * @param appName
	 * @param dbKey
	 * @return
	 */
	String makeAtomConfigId(String appName, String dbKey);
	
	/**
	 * 
	 * @param appName
	 * @param groupKey
	 * @return
	 */
	String makeGroupConfigId(String appName, String groupKey);
}
