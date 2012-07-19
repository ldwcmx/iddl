/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.factory;

import java.util.Properties;

/**
 * Zookeeper配置
 * @author sihai
 *
 */
public class ZookeeperConfig {
	
	/**
	 * 从properties加载
	 * @param properties
	 * @return
	 */
	public static ZookeeperConfig fromProperties(Properties properties) {
		ZookeeperConfig config = new ZookeeperConfig();
		return config;
	}
}
