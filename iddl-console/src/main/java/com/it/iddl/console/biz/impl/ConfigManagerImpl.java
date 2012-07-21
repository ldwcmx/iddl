/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.biz.impl;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import com.iacrqq.util.StringUtil;
import com.it.iddl.console.biz.ConfigManager;
import com.it.iddl.console.biz.ConfigStoreFactory;
import com.it.iddl.console.biz.store.ConfigStore;

/**
 * 配置管理器
 * @author sihai
 *
 */
public class ConfigManagerImpl implements ConfigManager {

	private String administrator;
	private String password;
	
	private ConfigStore configStore;

	public void init() {
		
		try {
			Properties properties = new Properties();
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(CONFIG_FILE));
			administrator = properties.getProperty(CONSOLE_ADMINISTRATOR);
			password = properties.getProperty(CONSOLE_PASSWORD);
			if(StringUtil.isBlank(administrator)) {
				throw new IllegalArgumentException(String.format("Please assign %s", CONSOLE_ADMINISTRATOR));
			}
			if(StringUtil.isBlank(password)) {
				throw new IllegalArgumentException(String.format("Please assign %s", CONSOLE_PASSWORD));
			}
			configStore = ConfigStoreFactory.newConfigStoreInstance(properties);
		} catch (IOException e) {
			throw new RuntimeException(String.format("Read config file %s failed", CONFIG_FILE), e);
		}
	}
	
	@Override
	public void store(String key, String value) {
		configStore.store(key, value);
	}

	@Override
	public void remove(String key) {
		configStore.remove(key);
	}

	@Override
	public String get(String key) {
		return configStore.get(key);
	}

	@Override
	public Map<String, String> list() {
		return configStore.list();
	}

	@Override
	public String getAdministrator() {
		return administrator;
	}

	@Override
	public String getPassword() {
		return password;
	}
}
