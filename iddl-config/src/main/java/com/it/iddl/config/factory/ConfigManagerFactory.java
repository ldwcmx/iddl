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
	 * 首先从网关取得配置中心的链接信息, 然后创建相应的客户端链接上去
	 * @param gateway
	 * @return
	 * @throws ConfigException
	 */
	public static ConfigManager newConfigManagerInstance(String gateway) throws ConfigException {
		String connectionURL = ConfigServerConnectionURLProvider.getConnectionURL(gateway);
		ConfigServer configServer = ConfigServerParser.parse(connectionURL);
		if(configServer.getConfigServerType() == ConfigServerType.CONFIG_SERVER_ZOOKEEPER) {
			ZookeeperConfigManager zm = new ZookeeperConfigManager();
			zm.init(ZookeeperConfigManager.ZookeeperConfig.fromConfigServer(configServer));
			return zm;
		} else if(configServer.getConfigServerType() == ConfigServerType.CONFIG_SERVER_DATABASE) {
			return null;
		} else {
			throw new ConfigException();
		}
	}
}
