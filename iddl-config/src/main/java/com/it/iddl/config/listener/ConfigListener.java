/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.listener;

/**
 * <p>
 * 配置监听器
 * </p>
 * @author sihai
 *
 */
public interface ConfigListener {
	
	/**
	 * 获取监听的配置项id
	 * @return
	 */
	String getConfigId();
	
	/**
	 * 设置配置项id
	 * @param configId
	 */
	void setConfigId(String configId);
	
	/**
	 * 数据变更通知
	 * @param newValue	新的值
	 */
	void changed(String newValue);
}
