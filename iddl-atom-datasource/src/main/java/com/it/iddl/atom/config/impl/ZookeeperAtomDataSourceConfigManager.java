/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.config.impl;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.atom.config.AtomDataSourceConfigManager;
import com.it.iddl.atom.config.DataSourceConfig;
import com.it.iddl.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.atom.exception.AtomException;
import com.it.iddl.config.ConfigManager;
import com.it.iddl.config.ZookeeperConfigManager.ZookeeperConfig;
import com.it.iddl.config.exception.ConfigException;
import com.it.iddl.config.factory.ConfigManagerFactory;
import com.it.iddl.config.listener.AbstractConfigListener;

/**
 * 
 * @author sihai
 *
 */
public class ZookeeperAtomDataSourceConfigManager implements AtomDataSourceConfigManager {

	private static final Log logger = LogFactory.getLog(ZookeeperAtomDataSourceConfigManager.class);
	
	private ConfigManager configManager;
	private volatile DataSourceConfigListener listener;
	
	@Override
	public void init(Properties config) throws AtomException {
		try {
			configManager = ConfigManagerFactory.newZookeeperConfigManagerInstance(ZookeeperConfig.fromProperties(config));
		} catch (ConfigException e) {
			throw new AtomException(e);
		}
	}

	@Override
	public void stop() throws AtomException {
		try {
			configManager.stop();
		} catch (ConfigException e) {
			throw new AtomException(e);
		}
	}
	
	@Override
	public DataSourceConfig getConfig(String appName, String dbKey, DataSourceConfigListener listener) throws AtomException {
		
		try {
			String configId = configManager.makeConfigId(appName, dbKey);
			// ×¢²áµ×²ãµÄListener
			register(listener);
			String value = configManager.getConfigValue(configId, new AbstractConfigListener() {
				@Override
				public void changed(String newValue) {
					logger.warn(String.format("Config changed for configId:%s, newValue:%s", configId, newValue));
					if(null != ZookeeperAtomDataSourceConfigManager.this.listener) {
						ZookeeperAtomDataSourceConfigManager.this.listener.changed(parse(newValue));
					}
				}
			});
			return parse(value);
		} catch (ConfigException e) {
			throw new AtomException(e);
		}
	}

	@Override
	public void register(DataSourceConfigListener listener) throws AtomException {
		this.listener = listener;
	}

	@Override
	public void unregister() throws AtomException {
		this.listener = null;
	}

	@Override
	public DataSourceConfig getConfig(String appName, String dbKey) throws AtomException {
		try {
			return parse(configManager.getConfigValue(configManager.makeConfigId(appName, dbKey)));
		} catch (ConfigException e) {
			throw new AtomException(e);
		}
	}
	
	/**
	 * 解析
	 * @param value
	 * @return
	 */
	private DataSourceConfig parse(String value) {
		DataSourceConfig config = new DataSourceConfig();
		return config;
	}
}
