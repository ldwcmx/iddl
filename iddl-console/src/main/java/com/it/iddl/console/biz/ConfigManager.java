/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.biz;

import java.util.Map;


/**
 * 
 * @author sihai
 *
 */
public interface ConfigManager {

	String CONSOLE_ADMINISTRATOR = "console.administrator";
	String CONSOLE_PASSWORD = "console.password";
	
	String CONFIG_FILE = "config.properties";
	
	/**
	 * 持久化配置项
	 * @param key
	 * @param value
	 */
	void store(String key, String value);
	
	/**
	 * 删除配置项
	 * @param key
	 */
	void remove(String key);
	
	/**
	 * 获取配置项值
	 * @param key
	 * @return
	 */
	String get(String key);
	
	/**
	 * 查询所有配置项
	 * @return
	 */
	Map<String, String> list();
	
	/**
	 * 
	 * @return
	 */
	String getAdministrator();
	
	/**
	 * 
	 * @return
	 */
	String getPassword();
}
