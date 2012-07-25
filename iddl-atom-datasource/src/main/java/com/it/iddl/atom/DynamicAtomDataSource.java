/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-atom-datasource
 */
package com.it.iddl.atom;

import java.sql.SQLException;
import java.util.concurrent.locks.ReentrantLock;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iacrqq.util.StringUtil;
import com.it.iddl.atom.config.AtomDataSourceConfigManager;
import com.it.iddl.atom.config.DataSourceConfig;
import com.it.iddl.atom.config.impl.DefaultAtomDataSourceConfigManager;
import com.it.iddl.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.atom.exception.AtomException;
import com.it.iddl.atom.jdbc.AtomDataSourceWrapper;
import com.it.iddl.common.DBCononectionURLTool;
import com.it.iddl.common.DBConstants;
import com.it.iddl.common.DBStatus;
import com.it.iddl.common.DBType;
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
	
	private static Log logger = LogFactory.getLog(DynamicAtomDataSource.class);
	
	private String gateway;						// 配置中心gateway

	private volatile DataSourceConfig config;	// 运行时配置
	private DataSourceConfig localConfig;		// 优先的本地配置

	private AtomDataSourceConfigManager configManager;		// 
	
	private volatile LocalTxDataSource localTxDataSource;	// 底层数据源
	private ReentrantLock _ds_lock_;						// 数据源操作锁
	
	private volatile AtomDataSourceWrapper wrapDataSource = null;
	
	public void init() throws AtomException {

		// 默认使用zookeeper
		configManager = new DefaultAtomDataSourceConfigManager();
		configManager.init(gateway);
		
		_ds_lock_ = new  ReentrantLock();
		DataSourceConfig config = configManager.getConfig(appName, dbKey);
		// 
		reflush(config);

		configManager.register(appName, dbKey, new DataSourceConfigListener() {
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
				
				DBStatus status = config.getDbStatus();
				if(null == status || status == DBStatus.NA_STATUS) {
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
			if(null == config || (config.getDbStatus() == DBStatus.NA_STATUS && newConfig.getDbStatus() != DBStatus.NA_STATUS)) {
				// 创建数据源
				localTxDataSource = IDataSourceFactory.createLocalTxDataSource(dataSourceConfig2LocalTxDataSourceConfig(newConfig));
				logger.warn("Init datasource");
			} else if(config.getDbStatus() != DBStatus.NA_STATUS && newConfig.getDbStatus() == DBStatus.NA_STATUS) {
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
			dbType = config.getDbType();
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
		config.setJndiName(dsConfig.getDbName());
		config.setUserName(dsConfig.getUserName());
		config.setPassword(dsConfig.getPassword());
		config.setDriverClassName(dsConfig.getDriverClassName());
		config.setExceptionSorterClassName(dsConfig.getSorterClassName());
		if(dsConfig.getDbType() == DBType.MYSQL) {
			String connectionURL = DBCononectionURLTool.getMySqlConnectionURL(dsConfig.getIp(), dsConfig.getPort(), dsConfig.getDbName(), dsConfig.getConnectionProperties());
			config.setConnectionURL(connectionURL);
			// 如果可以找到mysql driver中的Valid就使用，否则不设置valid
			try {
				Class validClass = Class.forName(DBConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
				if (null != validClass) {
					config.setValidConnectionCheckerClassName(DBConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
				} else {
					logger.warn("MYSQL Driver is Not Suport " + DBConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
				}
			} catch (ClassNotFoundException e) {
				logger.warn("MYSQL Driver is Not Suport " + DBConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
			} catch (NoClassDefFoundError e) {
				logger.warn("MYSQL Driver is Not Suport " + DBConstants.DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS);
			}
			
			//如果可以找到mysqlDriver中的integrationSorter就使用否则使用默认的
			try {
				Class integrationSorterCalss = Class.forName(DBConstants.MYSQL_INTEGRATION_SORTER_CLASS);
				if (null != integrationSorterCalss) {
					config.setExceptionSorterClassName(DBConstants.MYSQL_INTEGRATION_SORTER_CLASS);
				} else {
					config.setExceptionSorterClassName(DBConstants.DEFAULT_MYSQL_SORTER_CLASS);
					logger.warn("MYSQL Driver is Not Suport " + DBConstants.MYSQL_INTEGRATION_SORTER_CLASS
							+ " use default sorter " + DBConstants.DEFAULT_MYSQL_SORTER_CLASS);
				}
			} catch (ClassNotFoundException e) {
				logger.warn("MYSQL Driver is Not Suport " + DBConstants.MYSQL_INTEGRATION_SORTER_CLASS
						+ " use default sorter " + DBConstants.DEFAULT_MYSQL_SORTER_CLASS);
			} catch (NoClassDefFoundError e){
				logger.warn("MYSQL Driver is Not Suport " + DBConstants.MYSQL_INTEGRATION_SORTER_CLASS
						+ " use default sorter " + DBConstants.DEFAULT_MYSQL_SORTER_CLASS);
			}
		} else if(dsConfig.getDbType() == DBType.ORACLE) {
			String connectionURL = DBCononectionURLTool.getOracleConnectionURL(dsConfig.getIp(), dsConfig.getPort(), dsConfig.getDbName(), dsConfig.getOracleConnectionType());
			config.setConnectionURL(connectionURL);
			//如果是oracle没有设置ConnectionProperties则给以个默认的
			if (!dsConfig.getConnectionProperties().isEmpty()) {
				config.setConnectionProperties(dsConfig.getConnectionProperties());
			} else {
				config.setConnectionProperties(DBConstants.DEFAULT_ORACLE_CONNECTION_PROPERTIES);
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
		return true;
	}
	
	public String getGateway() {
		return gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
}