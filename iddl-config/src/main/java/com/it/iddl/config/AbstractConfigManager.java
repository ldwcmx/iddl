/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config;

import java.util.HashMap;
import java.util.Map;

import com.iacrqq.util.StringUtil;
import com.it.iddl.config.listener.ConfigListener;

/**
 * ��������ù�����
 * @author sihai
 *
 */
public abstract class AbstractConfigManager implements ConfigManager {

	private Map<String, ConfigListener> listenerMap = new HashMap<String, ConfigListener>();
	private Object _listenerMap_lock_ = new Object();
	
	/**
	 * ��ѯ�������ĵ��������ֵ 
	 * @param configId
	 * @return
	 */
	protected abstract String getValue(String configId);
	
	/**
	 * ֪ͨ�ײ����������
	 * @param configId
	 */
	protected abstract void monitor(String configId);
	
	/**
	 * ֪ͨ�ײ�������������
	 * @param configId
	 */
	protected abstract void unmonitor(String configId);
	
	@Override
	public String getConfigValue(String configId, ConfigListener listener) {
		if(StringUtil.isBlank(configId) || null == listener) {
			throw new IllegalArgumentException("Parameter configId must not be blank and listener must not be null.");
		}
		listener.setConfigId(configId);
		register(listener);
		return getConfigValue(configId);
	}

	@Override
	public String getConfigValue(String configId) {
		return getValue(configId);
	}
	
	@Override
	public void register(ConfigListener listener) {
		if(null == listener || StringUtil.isBlank(listener.getConfigId())) {
			throw new IllegalArgumentException("Parameter listener must not be null and listener.getConfigId() must not be blank.");
		}
		synchronized(_listenerMap_lock_) {
			listenerMap.put(listener.getConfigId(), listener);
		}
		monitor(listener.getConfigId());
	}
	
	@Override
	public void unregister(ConfigListener listener) {
		if(null == listener || StringUtil.isBlank(listener.getConfigId())) {
			throw new IllegalArgumentException("Parameter listener must not be null and listener.getConfigId() must not be blank.");
		}
		synchronized(_listenerMap_lock_) {
			listenerMap.remove(listener.getConfigId());
		}
		unmonitor(listener.getConfigId());
	}

	@Override
	public void unregister(String configId) {
		if(StringUtil.isBlank(configId)) {
			throw new IllegalArgumentException("Parameter configId must not be blank.");
		}
		synchronized(_listenerMap_lock_) {
			listenerMap.remove(configId);
		}
		unmonitor(configId);
	}
	
	/**
	 * ���������������ǵ��ñ�����
	 * @param configId
	 * @param newValue
	 */
	protected void changed(String configId, String newValue) {
		synchronized(_listenerMap_lock_) {
			ConfigListener listener = listenerMap.get(configId);
			if(null != listener) {
				listener.changed(newValue);
			}
		}
	}
}
