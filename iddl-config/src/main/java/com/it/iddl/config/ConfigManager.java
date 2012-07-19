/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config;

import com.it.iddl.config.exception.ConfigException;
import com.it.iddl.config.listener.ConfigListener;

/**
 * <p>
 * ���ù�����
 * </p>
 * @author sihai
 *
 */
public interface ConfigManager {
	
	/**
	 * ��ʼ��
	 * @param config
	 * @throws ConfigException
	 */
	void init(Object config) throws ConfigException;
	
	/**
	 * ֹͣ
	 * @throws ConfigException
	 */
	void stop() throws ConfigException;
	
	/**
	 * ��ѯ�������ֵ
	 * @param configId
	 * @return
	 */
	String getConfigValue(String configId);
	
	/**
	 * ��ѯ�������ֵ, �����ü�����
	 * @param configId
	 * @param listener
	 * @return
	 */
	String getConfigValue(String configId, ConfigListener listener);
	
	/**
	 * ע�������������
	 * @param listener
	 */
	void register(ConfigListener listener);
	
	/**
	 * ע�������������
	 * @param listene
	 */
	void unregister(ConfigListener listener);
	
	/**
	 * ע�������������
	 * @param configId
	 */
	void unregister(String configId);
	
	/**
	 * ����������id
	 * @param appName
	 * @param dbKey
	 * @return
	 */
	String makeConfigId(String appName, String dbKey);
}
