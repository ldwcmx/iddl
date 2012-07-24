/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.config.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iacrqq.util.StringUtil;
import com.it.iddl.common.weight.Weight;
import com.it.iddl.config.ConfigManager;
import com.it.iddl.config.exception.ConfigException;
import com.it.iddl.config.factory.ConfigManagerFactory;
import com.it.iddl.config.listener.AbstractConfigListener;
import com.it.iddl.group.config.GroupDataSourceConfig;
import com.it.iddl.group.config.GroupDataSourceConfigManager;
import com.it.iddl.group.exception.GroupException;
import com.it.iddl.group.listener.GroupDataSourceConfigListener;

/**
 * 
 * @author sihai
 *
 */
public class DefaultGroupDataSourceConfigManager implements GroupDataSourceConfigManager {

	private static final Log logger = LogFactory.getLog(DefaultGroupDataSourceConfigManager.class);
	
	private ConfigManager configManager;
	private volatile GroupDataSourceConfigListener listener;
	
	@Override
	public void init(String gateway) throws GroupException {
		try {
			configManager = ConfigManagerFactory.newConfigManagerInstance(gateway);
		} catch (ConfigException e) {
			throw new GroupException(e);
		}
	}

	@Override
	public void stop() throws GroupException {
		if(null != configManager) {
			try {
				configManager.stop();
			} catch (ConfigException e) {
				throw new GroupException(e);
			}
		}
	}
	
	@Override
	public GroupDataSourceConfig getConfig(String appName, String groupKey, GroupDataSourceConfigListener listener) throws GroupException {
		
		try {
			String configId = configManager.makeGroupConfigId(appName, groupKey);
			// ×¢²áµ×²ãµÄListener
			register(appName, groupKey, listener);
			String value = configManager.getConfigValue(configId);
			return parse(value);
		} catch (ConfigException e) {
			throw new GroupException(e);
		}
	}

	@Override
	public void register(String appName, String groupKey, GroupDataSourceConfigListener listener) throws GroupException {
		this.listener = listener;
		final String id = configManager.makeGroupConfigId(appName, groupKey);
		try {
			configManager.register(new AbstractConfigListener() {
				
				@Override
				public String getConfigId() {
					return id;
				}
				@Override
				public void changed(String newValue) {
					logger.warn(String.format("Config changed for configId:%s, newValue:%s", configId, newValue));
					if(null != DefaultGroupDataSourceConfigManager.this.listener) {
						DefaultGroupDataSourceConfigManager.this.listener.changed(parse(newValue));
					}
				}
			});
		} catch (ConfigException e) {
			throw new GroupException(e);
		}
	}

	@Override
	public void unregister() throws GroupException {
		this.listener = null;
	}

	@Override
	public GroupDataSourceConfig getConfig(String appName, String groupKey) throws GroupException {
		try {
			return parse(configManager.getConfigValue(configManager.makeGroupConfigId(appName, groupKey)));
		} catch (ConfigException e) {
			throw new GroupException(e);
		}
	}
	
	/**
	 * 解析
	 * @param value
	 * @return
	 */
	private GroupDataSourceConfig parse(String value) {
		if(StringUtil.isBlank(value)) {
			throw new IllegalArgumentException("GroupDataSource groupConf must not be blank.");
		}
		Map<String, Weight> weightMap = new HashMap<String, Weight>();
		String[] configArray = value.split(",");
		String atomDsKey = null;
		String weightStr = null;
		String[] tmp = null;
		for(String config : configArray) {
			tmp = config.split(":");
			atomDsKey = StringUtil.trim(tmp[0]);
			weightStr = tmp.length == 2 ? tmp[1] : null;
			weightMap.put(atomDsKey, new Weight(weightStr));
		}
		return new GroupDataSourceConfig(value, weightMap);
	}
}
