/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.listener;

/**
 * 抽象的配置项监听器
 * @author sihai
 *
 */
public abstract class AbstractConfigListener implements ConfigListener {

	protected String configId;	// 配置项id
	
	@Override
	public String getConfigId() {
		return configId;
	}

	@Override
	public void setConfigId(String configId) {
		this.configId = configId;
	}
}
