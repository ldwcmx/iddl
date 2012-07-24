/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-config
 */
package com.it.iddl.config;

/**
 * 
 * zookeeper://192.168.10.100:2181;192.168.10.101:2181
 * database://jdbc:mysql://127.0.0.1:3306/icommunity?useUnicode=true&amp;characterEncoding=utf-8
 * 
 * @author sihai
 *
 */
public class ConfigServer {
	
	private ConfigServerType configServerType = ConfigServerType.CONFIG_SERVER_ZOOKEEPER;
	private String configServerConnectionURL;
	
	public ConfigServerType getConfigServerType() {
		return configServerType;
	}
	public void setConfigServerType(ConfigServerType configServerType) {
		this.configServerType = configServerType;
	}
	public String getConfigServerConnectionURL() {
		return configServerConnectionURL;
	}
	public void setConfigServerConnectionURL(String configServerConnectionURL) {
		this.configServerConnectionURL = configServerConnectionURL;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ConfigServer:{");
		sb.append("configServerType:");
		sb.append(configServerType.value());
		sb.append(",configServerConnectionURL:");
		sb.append(configServerConnectionURL);
		sb.append("}");
		return sb.toString();
	}
}
