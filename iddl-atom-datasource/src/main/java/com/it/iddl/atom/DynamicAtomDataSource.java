/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom;

import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.locks.ReentrantLock;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iacrqq.util.StringUtil;
import com.it.iddl.atom.common.AtomCononectionURLTool;
import com.it.iddl.atom.common.AtomConstants;
import com.it.iddl.atom.config.AtomDataSourceConfigManager;
import com.it.iddl.atom.config.AtomDatabaseStatusEnum;
import com.it.iddl.atom.config.AtomDatabaseTypeEnum;
import com.it.iddl.atom.config.DataSourceConfig;
import com.it.iddl.atom.config.impl.DefaultAtomDataSourceConfigManager;
import com.it.iddl.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.atom.exception.AtomException;
import com.it.iddl.atom.jdbc.AtomDataSourceWrapper;
import com.it.iddl.config.ConfigManager;
import com.it.iddl.config.ConfigServerType;
import com.it.iddl.idatasource.IDataSourceFactory;
import com.it.iddl.idatasource.LocalTxDataSourceConfig;
import com.it.iddl.idatasource.resource.adapter.jdbc.local.LocalTxDataSource;

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
	
	private ConfigServerType configServerType = ConfigServerType.CONFIG_SERVER_ZOOKEEPER;
	private String configServerHost;
	private int    configServerPort;
	
	private volatile DataSourceConfig config;	// 运行时配置
	private DataSourceConfig localConfig;		// 优先的本地配置

	private AtomDataSourceConfigManager configManager;		// 
	
	private volatile LocalTxDataSource localTxDataSource;	// 底层数据源
	private ReentrantLock _ds_lock_;						// 数据源操作锁
	
	private volatile AtomDataSourceWrapper wrapDataSource = null;
	
	public void init() throws AtomException {

		// 默认使用zookeeper
		configManager = new DefaultAtomDataSourceConfigManager();
		configManager.init(toProperties());
		
		_ds_lock_ = new  ReentrantLock();
		DataSourceConfig config = configManager.getConfig(appName, dbKey);
		// 
		reflush(config);

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
		if(null != localTxDataSource) {
			try {
				localTxDataSource.destroy();
			} catch (Exception e) {
				throw new AtomException(e);
			}
		}
		if(null != configManager) {
			configManager.stop();
		}
	}

	@Override
	public void flush() throws AtomException {
		try {
			localTxDataSource.flush();
		} catch (Exception e) {
			throw new AtomException(e);
		}
	}

	@Override
	protected DataSource getDataSource() throws SQLException {
		if(null == wrapDataSource) {
			try {
				String errorMsg = null;
				_ds_lock_.lock();
				if(null != wrapDataSource) {
					return wrapDataSource;
				}
				
				if (null == localTxDataSource) {
					errorMsg = "DynamicAtomDataSource maybe not inited";
					logger.error(errorMsg);
					throw new SQLException(errorMsg);
				}
				
				DataSource ds = localTxDataSource.getDatasource();
				if(null == ds) {
					errorMsg = "DynamicAtomDataSource maybe not inited";
					logger.error(errorMsg);
					throw new SQLException(errorMsg);
				}
				
				AtomDatabaseStatusEnum status = config.getDbStautsEnum();
				if(null == status || status == AtomDatabaseStatusEnum.NA_STATUS) {
					errorMsg = "DynamicAtomDataSource database status unknown";
					logger.error(errorMsg);
					throw new SQLException(errorMsg);
				}
				
				AtomDataSourceWrapper newds = new AtomDataSourceWrapper(localTxDataSource.getDatasource(), config);
				wrapDataSource = newds;
				return wrapDataSource;
			} finally {
				_ds_lock_.unlock();
			}
		} else {
			return wrapDataSource;
		}
	}

	/**
	 * 刷新数据源
	 * @param newConfig
	 */
	private void reflush(DataSourceConfig newConfig) {
		// 本地配置优先
		overByLocal(newConfig);
		
		try {
			_ds_lock_.lock();
			if(config.getDbStautsEnum() == AtomDatabaseStatusEnum.NA_STATUS && newConfig.getDbStautsEnum() != AtomDatabaseStatusEnum.NA_STATUS) {
				// 创建数据源
				localTxDataSource = IDataSourceFactory.createLocalTxDataSource(dataSourceConfig2LocalTxDataSourceConfig(newConfig));
				logger.warn("Init datasource");
			} else if(config.getDbStautsEnum() != AtomDatabaseStatusEnum.NA_STATUS && newConfig.getDbStautsEnum() == AtomDatabaseStatusEnum.NA_STATUS) {
				// 销毁数据源
				destroy();
				logger.warn("Destroy datasource");
			} else {
				// 刷新
				if(isNeedFlush(config, newConfig)) {
					LocalTxDataSourceConfig c = dataSourceConfig2LocalTxDataSourceConfig(newConfig);
					localTxDataSource.setConnectionURL(c.getConnectionURL());
					localTxDataSource.setDriverClass(c.getDriverClassName());
					localTxDataSource.setExceptionSorterClassName(c.getExceptionSorterClassName());
					flush();
				}
			}
			
			config = newConfig;
		} catch (Exception e) {
			logger.error(e);
		} finally {
			_ds_lock_.unlock();
		}
		
	}
	
	/**
	 * 优先使用本地配置
	 * @param config
	 */
	private void overByLocal(DataSourceConfig config) {
		if(null == config || null == localConfig) {
			return;
		}
		if(StringUtil.isNotBlank(localConfig.getDriverClassName())) {
			config.setDriverClassName(localConfig.getDriverClassName());
		}
		if(StringUtil.isNotBlank(localConfig.getSorterClassName())) {
			config.setSorterClassName(localConfig.getSorterClassName());
		}
		if(StringUtil.isNotBlank(localConfig.getPassword())) {
			config.setPassword(localConfig.getPassword());
		}
		if(null != localConfig.getConnectionProperties()
				&& !localConfig.getConnectionProperties().isEmpty()) {
			config.setConnectionProperties(localConfig.getConnectionProperties());
		}
	}
	
	/**
	 * 
	 * @param dsConfig
	 * @return
	 */
	private LocalTxDataSourceConfig dataSourceConfig2LocalTxDataSourceConfig(DataSourceConfig dsConfig) {
		LocalTxDataSourceConfig config = new LocalTxDataSourceConfig();
		config.setUserName(dsConfig.getUserName());
		config.setPassword(dsConfig.getPassword());
		config.setDriverClassName(dsConfig.getDriverClassName());
		config.setExceptionSorterClassName(dsConfig.getSorterClassName());
		if(dsConfig.getDbTypeEnum() == AtomDatabaseTypeEnum.MYSQL) {
			String connectionURL = AtomCononectionURLTool.getMySqlConURL(dsConfig.getIp(), dsConfig.getPort(), dsConfig.getDbName(), dsConfig.getConnectionProperties());
			config.setConnectionURL(connectionURL);
			// 如果可以找到mysql driver中的Valid就使用，否则不设置valid
			try {
				Class validClass = Class.forName(AtomConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
				if (null != validClass) {
					config.setValidConnectionCheckerClassName(AtomConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
				} else {
					logger.warn("MYSQL Driver is Not Suport " + AtomConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
				}
			} catch (ClassNotFoundException e) {
				logger.warn("MYSQL Driver is Not Suport " + AtomConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
			} catch (NoClassDefFoundError e) {
				logger.warn("MYSQL Driver is Not Suport " + AtomConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
			}
			
			//如果可以找到mysqlDriver中的integrationSorter就使用否则使用默认的
			try {
				Class integrationSorterCalss = Class.forName(AtomConstants.MYSQL_INTEGRATION_SORTER_CLASS);
				if (null != integrationSorterCalss) {
					config.setExceptionSorterClassName(AtomConstants.MYSQL_INTEGRATION_SORTER_CLASS);
				} else {
					config.setExceptionSorterClassName(AtomConstants.DEFAULT_MYSQL_SORTER_CLASS);
					logger.warn("MYSQL Driver is Not Suport " + AtomConstants.MYSQL_INTEGRATION_SORTER_CLASS
							+ " use default sorter " + AtomConstants.DEFAULT_MYSQL_SORTER_CLASS);
				}
			} catch (ClassNotFoundException e) {
				logger.warn("MYSQL Driver is Not Suport " + AtomConstants.MYSQL_INTEGRATION_SORTER_CLASS
						+ " use default sorter " + AtomConstants.DEFAULT_MYSQL_SORTER_CLASS);
			} catch (NoClassDefFoundError e){
				logger.warn("MYSQL Driver is Not Suport " + AtomConstants.MYSQL_INTEGRATION_SORTER_CLASS
						+ " use default sorter " + AtomConstants.DEFAULT_MYSQL_SORTER_CLASS);
			}
		} else if(dsConfig.getDbTypeEnum() == AtomDatabaseTypeEnum.ORACLE) {
			String connectionURL = AtomCononectionURLTool.getOracleConnectionURL(dsConfig.getIp(), dsConfig.getPort(), dsConfig.getDbName(), dsConfig.getOracleConType());
			config.setConnectionURL(connectionURL);
			//如果是oracle没有设置ConnectionProperties则给以个默认的
			if (!dsConfig.getConnectionProperties().isEmpty()) {
				config.setConnectionProperties(dsConfig.getConnectionProperties());
			} else {
				config.setConnectionProperties(AtomConstants.DEFAULT_ORACLE_CONNECTION_PROPERTIES);
			}
		}
		
		config.setMinPoolSize(dsConfig.getMinPoolSize());
		config.setMaxPoolSize(dsConfig.getMaxPoolSize());
		config.setPreparedStatementCacheSize(dsConfig.getPreparedStatementCacheSize());
		if (dsConfig.getIdleTimeout() > 0) {
			config.setIdleTimeoutMinutes(dsConfig.getIdleTimeout());
		}
		if (dsConfig.getBlockingTimeout() > 0) {
			config.setBlockingTimeoutMillis(dsConfig.getBlockingTimeout());
		}
		return config;
	}
	
	private boolean isNeedFlush(DataSourceConfig oldConfig, DataSourceConfig newConfig)  {
		return false;
	}
	
	private Properties toProperties() {
		Properties properties = new Properties();
		properties.put(ConfigManager.CONFIG_SERVER_TYPE, configServerType.value());
		if(StringUtil.isNotBlank(configServerHost)) {
			properties.put(ConfigManager.CONFIG_SERVER_SERVER_HOST, configServerHost);
		}
		if(configServerPort != 0) {
			properties.put(ConfigManager.CONFIG_SERVER_SERVER_PORT, configServerPort);
		}
		return properties;
	}
	
	public void setConfigServerType(String type) {
		this.configServerType = ConfigServerType.toEnum(type);
	}

	public void setConfigServerHost(String configServerHost) {
		this.configServerHost = configServerHost;
	}

	public void setConfigServerPort(int configServerPort) {
		this.configServerPort = configServerPort;
	}
}