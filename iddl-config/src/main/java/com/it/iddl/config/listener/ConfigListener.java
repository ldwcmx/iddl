/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config.listener;

/**
 * <p>
 * ���ü�����
 * </p>
 * @author sihai
 *
 */
public interface ConfigListener {
	
	/**
	 * ��ȡ������������id
	 * @return
	 */
	String getConfigId();
	
	/**
	 * ����������id
	 * @param configId
	 */
	void setConfigId(String configId);
	
	/**
	 * ���ݱ��֪ͨ
	 * @param newValue	�µ�ֵ
	 */
	void changed(String newValue);
}
