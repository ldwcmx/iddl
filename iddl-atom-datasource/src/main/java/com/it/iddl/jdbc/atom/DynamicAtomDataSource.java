/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.jdbc.atom.config.AtomDataSourceConfigManager;
import com.it.iddl.jdbc.atom.config.DataSourceConfig;
import com.it.iddl.jdbc.atom.config.impl.ZookeeperAtomDataSourceConfigManager;
import com.it.iddl.jdbc.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.jdbc.atom.exception.AtomException;

/**
 * <p>
 * 支持动态配置的原子数据源, 对应一个数据库的数据源,
 * 支持配置中心动态推送配置信息, 配置信息变更后, 数据源自动无缝重新配置
 * </p>
 * @author sihai
 *
 */
public class DynamicAtomDataSource extends AbstractAtomDataSource {

private static Log logger = LogFactory.getLog(DynamicConfigSupporter.class);

	private String appName;						// 系统分配的应用名称
	private String dbKey;						// 系统分配的数据库key

	private volatile DataSourceConfig config;	// 运行时配置
	private DataSourceConfig localConfig;		// 优先的本地配置

	private AtomDataSourceConfigManager configManager;

	public void init() throws AtomException {

		// 默认使用zookeeper
		configManager = new ZookeeperAtomDataSourceConfigManager();
		configManager.init(null);

		DataSourceConfig config = configManager.getConfig(appName, dbKey);
		// 
		build(config);

		configManager.register(new DataSourceConfigListener() {
			@Override
			public void changed(DataSourceConfig newConfig) {
				// 刷新数据源
				reflush(newConfig);
			}
		});
	}


	@Override
	public void destroy() throws AtomException {
		// TODO Auto-generated method stub
	}

	@Override
	public void flush()  {
		// TODO Auto-generated method stub

	}

	@Override
	protected DataSource getDataSource() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 建立数据源
	 * @param config
	 */
	private void build(DataSourceConfig config) {

	}

	/**
	 * 刷新数据源
	 * @param newConfig
	 */
	private void reflush(DataSourceConfig newConfig) {

	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDbKey() {
		return dbKey;
	}

	public void setDbKey(String dbKey) {
		this.dbKey = dbKey;
	} 
}