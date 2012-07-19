/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.listener;

/**
 * ��������ü�����
 * @author sihai
 *
 */
public abstract class AbstractConfigListener implements ConfigListener {

	protected String configId;	// ������id
	
	@Override
	public String getConfigId() {
		return configId;
	}

	@Override
	public void setConfigId(String configId) {
		this.configId = configId;
	}
}
