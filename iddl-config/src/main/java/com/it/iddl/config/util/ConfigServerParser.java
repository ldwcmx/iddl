/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-config
 */
package com.it.iddl.config.util;

import com.iacrqq.util.StringUtil;
import com.it.iddl.config.ConfigServer;
import com.it.iddl.config.ConfigServerType;

/**
 * 解析配置中心连接串
 * @author sihai
 *
 */
public class ConfigServerParser {
	
	public static final String CONFIG_SERVER_PROTOCOL_ZOOKEEPER = ConfigServerType.CONFIG_SERVER_ZOOKEEPER.value() + "://";
	public static final String CONFIG_SERVER_PROTOCOL_DATABASE = ConfigServerType.CONFIG_SERVER_DATABASE.value() + "://";
	
	/**
	 * 解析配置中心连接串
	 * @param connectionURL
	 * @return
	 */
	public static ConfigServer parse(String connectionURL) {
		
		if(StringUtil.isBlank(connectionURL)) {
			throw new IllegalArgumentException("Parameter connectionURL must not be blank.");
		}
		
		ConfigServer configServer = new ConfigServer();
		String tmp = StringUtil.trim(connectionURL);
		if(tmp.startsWith(CONFIG_SERVER_PROTOCOL_ZOOKEEPER)) {
			configServer.setConfigServerType(ConfigServerType.CONFIG_SERVER_ZOOKEEPER);
			configServer.setConfigServerConnectionURL(tmp.substring(CONFIG_SERVER_PROTOCOL_ZOOKEEPER.length()));
		} else if(tmp.startsWith(CONFIG_SERVER_PROTOCOL_DATABASE)) {
			configServer.setConfigServerType(ConfigServerType.CONFIG_SERVER_DATABASE);
			configServer.setConfigServerConnectionURL(tmp.substring(CONFIG_SERVER_PROTOCOL_DATABASE.length()));
		} else {
			throw new IllegalArgumentException(String.format("Unsupported protocol:%s", tmp));
		}
		
		return configServer;
	}
	
	public static void main(String[] args) {
		String configServerURL = "zookeeper://192.168.10.100:2181;192.168.10.101:2181";
		System.out.println(parse(configServerURL));
		configServerURL = "database://jdbc:mysql://127.0.0.1:3306/icommunity?useUnicode=true&characterEncoding=utf-8";
		System.out.println(parse(configServerURL));
	}
}
