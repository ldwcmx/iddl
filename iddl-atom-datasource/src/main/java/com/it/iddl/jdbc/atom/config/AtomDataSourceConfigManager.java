/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom.config;

import java.util.Properties;

import com.it.iddl.jdbc.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.jdbc.atom.exception.AtomException;

/**
 * <p>
 * 
 * </p>
 * @author sihai
 *
 */
public interface AtomDataSourceConfigManager {
	
	/**
	 * ��ʼ��
	 * @param config
	 * @throws AtomException
	 */
	void init(Properties config) throws AtomException;
	
	/**
	 * ֹͣ
	 * @throws AtomException
	 */
	void stop() throws AtomException;
	
	/**
	 * ��ȡ����Դ������ֵ
	 * @param appName
	 * @param dbKey
	 * @return
	 */
	DataSourceConfig getConfig(String appName, String dbKey);
	
	/**
	 * ��ȡ����Դ������ֵ��ע������Դ�����������
	 * @param appName
	 * @param dbKey
	 * @param listener
	 * @return
	 */
	DataSourceConfig getConfig(String appName, String dbKey, DataSourceConfigListener listener);
	
	/**
	 * ע������Դ�����������
	 * @param listener
	 */
	void register(DataSourceConfigListener listener);
	
	/**
	 * ע������Դ�����������
	 */
	void unregister();
}
