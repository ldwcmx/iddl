/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.listener;

import com.it.iddl.group.config.GroupDataSourceConfig;

/**
 * 
 * @author sihai
 *
 */
public interface GroupDataSourceConfigListener {

	/**
	 * 通知数据源配置信息变更
	 * @param newConfig
	 */
	void changed(GroupDataSourceConfig newConfig);
}
