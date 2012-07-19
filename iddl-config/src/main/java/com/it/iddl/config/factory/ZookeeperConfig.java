/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.factory;

import java.util.Properties;

/**
 * Zookeeper≈‰÷√
 * @author sihai
 *
 */
public class ZookeeperConfig {
	
	/**
	 * ¥”propertiesº”‘ÿ
	 * @param properties
	 * @return
	 */
	public static ZookeeperConfig fromProperties(Properties properties) {
		ZookeeperConfig config = new ZookeeperConfig();
		return config;
	}
}
