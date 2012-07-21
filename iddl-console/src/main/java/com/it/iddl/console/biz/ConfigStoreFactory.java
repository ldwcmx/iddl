/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.biz;

import java.util.Properties;

import com.iacrqq.util.StringUtil;
import com.it.iddl.console.biz.store.ConfigStore;
import com.it.iddl.console.biz.store.impl.ZookeeperConfigStore;

/**
 * 
 * @author sihai
 *
 */
public class ConfigStoreFactory {

	/**
	 * 创建ConfigStore实例
	 * @param properties
	 * @return
	 */
	public static ConfigStore newConfigStoreInstance(Properties properties) {
		String storeType = properties.getProperty(ConfigStore.STORE_TYPE);
		if(StringUtil.equals(storeType, ConfigStore.STORE_TYPE_ZOOKEEPER)) {
			ZookeeperConfigStore configStore = new ZookeeperConfigStore();
			configStore.init(properties);
			return configStore;
		} else if(StringUtil.equals(storeType, ConfigStore.STORE_TYPE_DB)) {
			throw new IllegalArgumentException(String.format("At now we only support zookeeper for store engine, not support:%s", storeType));
		} else if(StringUtil.equals(storeType, ConfigStore.STORE_TYPE_FS)) {
			throw new IllegalArgumentException(String.format("At now we only support zookeeper for store engine, not support:%s", storeType));
		} else {
			throw new IllegalArgumentException(String.format("At now we only support zookeeper for store engine, not support:%s", storeType));
		}
	}
}
