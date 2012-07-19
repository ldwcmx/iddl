/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.listener;

/**
 * ³éÏóµÄÅäÖÃ¼àÌıÆ÷
 * @author sihai
 *
 */
public abstract class AbstractConfigListener implements ConfigListener {

	protected String configId;	// ÅäÖÃÏîid
	
	@Override
	public String getConfigId() {
		return configId;
	}

	@Override
	public void setConfigId(String configId) {
		this.configId = configId;
	}
}
