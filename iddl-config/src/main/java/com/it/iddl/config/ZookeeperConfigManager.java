/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config;

import java.text.MessageFormat;

import com.it.iddl.config.exception.ConfigException;
import com.it.iddl.config.factory.ZookeeperConfig;

/**
 * 基于zookeeper的配置管理器
 * @author sihai
 *
 */
public class ZookeeperConfigManager extends AbstractConfigManager {

	private static final MessageFormat ZOOKEEPER_DATA_SOURCE_NODE_FORMAT = new MessageFormat("/iddl/ds/{0}/{1}");
	
	@Override
	protected String getValue(String configId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void monitor(String configId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void unmonitor(String configId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(Object config) throws ConfigException {
		ZookeeperConfig zc = (ZookeeperConfig)config;
		
	}

	@Override
	public void stop() throws ConfigException {
		// TODO Auto-generated method stub
	}
	
	@Override
	public String makeConfigId(String appName, String dbKey) {
		return ZOOKEEPER_DATA_SOURCE_NODE_FORMAT.format(appName, dbKey);
	}
}
