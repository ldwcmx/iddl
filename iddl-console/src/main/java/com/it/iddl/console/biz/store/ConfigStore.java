/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.biz.store;

import java.util.Map;
import java.util.Properties;

/**
 * 
 * @author sihai
 *
 */
public interface ConfigStore {

	int    DEFAULT_TIMEOUT = 5000;
	
	String DEFAULT_ZOOKEEPER_ROOT = "/iddl";
	String STORE_TYPE = "configStore.type";
	String CONNECTION_URL = "configStore.connectionURL";
	String ZOOKEEPER_ROOT = "configStore.zookeeper.root";
	
	String STORE_TYPE_ZOOKEEPER = "zookeeper";
	String STORE_TYPE_DB = "db";
	String STORE_TYPE_FS = "fs";
	
	/**
	 * 初始化
	 * @param properties
	 */
	void init(Properties properties);
	
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
}
