/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.factory;

import com.it.iddl.config.ConfigManager;
import com.it.iddl.config.ZookeeperConfigManager;
import com.it.iddl.config.exception.ConfigException;

/**
 * ���ù���������
 * @author sihai
 *
 */
public abstract class ConfigManagerFactory {

	/**
	 * ��������Zookeeper���ù�����
	 * @param config
	 * @return
	 * @throws ConfigException
	 */
	public static ConfigManager newZookeeperConfigManagerInstance(ZookeeperConfig config) throws ConfigException {
		ZookeeperConfigManager cm = new ZookeeperConfigManager();
		cm.init(config);
		return cm;
	}
}
