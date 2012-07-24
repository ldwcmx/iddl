/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.factory;

import com.it.iddl.config.ConfigManager;
import com.it.iddl.config.ConfigServer;
import com.it.iddl.config.ConfigServerType;
import com.it.iddl.config.ZookeeperConfigManager;
import com.it.iddl.config.ZookeeperConfigManager.ZookeeperConfig;
import com.it.iddl.config.exception.ConfigException;
import com.it.iddl.config.util.ConfigServerConnectionURLProvider;
import com.it.iddl.config.util.ConfigServerParser;

/**
 * 配置管理器工厂
 * @author sihai
 *
 */
public abstract class ConfigManagerFactory {

	/**
	 * 创建基于Zookeeper配置管理器
	 * @param config
	 * @return
	 * @throws ConfigException
	 */
	public static ConfigManager newZookeeperConfigManagerInstance(ZookeeperConfig config) throws ConfigException {
		ZookeeperConfigManager cm = new ZookeeperConfigManager();
		cm.init(config);
		return cm;
	}
	
	/**
	 * 
	 * @param gateway
	 * @return
	 * @throws ConfigException
	 */
	public static ConfigManager newConfigManagerInstance(String gateway) throws ConfigException {
		String connectionURL = ConfigServerConnectionURLProvider.getConnectionURL(gateway);
		ConfigServer configServer = ConfigServerParser.parse(connectionURL);
		if(configServer.getConfigServerType() == ConfigServerType.CONFIG_SERVER_ZOOKEEPER) {
			return null;
		} else if(configServer.getConfigServerType() == ConfigServerType.CONFIG_SERVER_DATABASE) {
			return null;
		} else {
			throw new ConfigException();
		}
	}
}
