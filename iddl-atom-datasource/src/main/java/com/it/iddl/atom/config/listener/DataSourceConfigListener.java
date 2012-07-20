package com.it.iddl.atom.config.listener;

import com.it.iddl.atom.config.DataSourceConfig;

public interface DataSourceConfigListener {

	/**
	 * 通知数据源配置信息变更
	 * @param newConfig
	 */
	void changed(DataSourceConfig newConfig);
}
