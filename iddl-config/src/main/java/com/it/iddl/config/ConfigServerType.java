/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config;

import com.iacrqq.util.StringUtil;

/**
 * 
 * @author sihai
 *
 */
public enum ConfigServerType {
	
	CONFIG_SERVER_ZOOKEEPER("zookeeper"),
	CONFIG_SERVER_DATABASE("database");
	
	private String value;
	
	private ConfigServerType(String value) {
		this.value = value;
	}
	
	public static ConfigServerType toEnum(String value) {
		for(ConfigServerType type : ConfigServerType.values()) {
			if(StringUtil.equals(type.value, value)) {
				return type;
			}
		}
		return null;
	}
	
	public String value() {
		return value;
	}
}
