package com.it.iddl.jdbc.atom.config.listener;

import com.it.iddl.jdbc.atom.config.DataSourceConfig;

public interface DataSourceConfigListener {

	/**
	 * ֪ͨ����Դ������Ϣ���
	 * @param newConfig
	 */
	void changed(DataSourceConfig newConfig);
}
