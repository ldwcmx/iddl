/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.config.impl;

import java.util.Properties;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iacrqq.util.StringUtil;
import com.it.iddl.atom.config.AtomDataSourceConfigManager;
import com.it.iddl.atom.config.DataSourceConfig;
import com.it.iddl.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.atom.exception.AtomException;
import com.it.iddl.common.DBStatus;
import com.it.iddl.common.DBType;
import com.it.iddl.config.ConfigManager;
import com.it.iddl.config.ConfigServerType;
import com.it.iddl.config.ZookeeperConfigManager.ZookeeperConfig;
import com.it.iddl.config.exception.ConfigException;
import com.it.iddl.config.factory.ConfigManagerFactory;
import com.it.iddl.config.listener.AbstractConfigListener;
import com.it.iddl.util.PropertyUtil;

/**
 * 
 * @author sihai
 *
 */
public class DefaultAtomDataSourceConfigManager implements AtomDataSourceConfigManager {

	private static final Log logger = LogFactory.getLog(DefaultAtomDataSourceConfigManager.class);
	
	private ConfigManager configManager;
	private volatile DataSourceConfigListener listener;
	
	@Override
	public void init(Properties config) throws AtomException {
		try {
			String type = config.getProperty(ConfigManager.CONFIG_SERVER_TYPE);
			if(StringUtil.isBlank(type)) {
				throw new AtomException("Please assign configServer type");
			}
			ConfigServerType configServerType = ConfigServerType.toEnum(type);
			if(null == configServerType) {
				throw new AtomException(String.format("Unknows configServer type:%s", type));
			}
			if(configServerType == ConfigServerType.CONFIG_SERVER_ZOOKEEPER) {
				configManager = ConfigManagerFactory.newZookeeperConfigManagerInstance(ZookeeperConfig.fromProperties(config));
			} else {
				throw new AtomException(String.format("Unsupport configServer type:%s", configServerType.value()));
			}
		} catch (ConfigException e) {
			throw new AtomException(e);
		}
	}

	@Override
	public void stop() throws AtomException {
		if(null != configManager) {
			try {
				configManager.stop();
			} catch (ConfigException e) {
				throw new AtomException(e);
			}
		}
	}
	
	@Override
	public DataSourceConfig getConfig(String appName, String dbKey, DataSourceConfigListener listener) throws AtomException {
		
		try {
			String configId = configManager.makeAtomConfigId(appName, dbKey);
			// ×¢²áµ×²ãµÄListener
			register(appName, dbKey, listener);
			String value = configManager.getConfigValue(configId);
			return parse(value);
		} catch (ConfigException e) {
			throw new AtomException(e);
		}
	}

	@Override
	public void register(String appName, String dbKey, DataSourceConfigListener listener) throws AtomException {
		this.listener = listener;
		final String id = configManager.makeAtomConfigId(appName, dbKey);
		try {
			configManager.register(new AbstractConfigListener() {
				
				@Override
				public String getConfigId() {
					return id;
				}
				@Override
				public void changed(String newValue) {
					logger.warn(String.format("Config changed for configId:%s, newValue:%s", configId, newValue));
					if(null != DefaultAtomDataSourceConfigManager.this.listener) {
						DefaultAtomDataSourceConfigManager.this.listener.changed(parse(newValue));
					}
				}
			});
		} catch (ConfigException e) {
			throw new AtomException(e);
		}
	}

	@Override
	public void unregister() throws AtomException {
		this.listener = null;
	}

	@Override
	public DataSourceConfig getConfig(String appName, String dbKey) throws AtomException {
		try {
			return parse(configManager.getConfigValue(configManager.makeAtomConfigId(appName, dbKey)));
		} catch (ConfigException e) {
			throw new AtomException(e);
		}
	}
	
	/**
	 * 解析
	 * @param value
	 * @return
	 */
	private DataSourceConfig parse(String value) {
		DataSourceConfig config = new DataSourceConfig();
		
		JSONObject json = JSONObject.fromObject(value);
		config.setIp(json.getString(DataSourceConfig.IP));
		config.setPort(json.getInt(DataSourceConfig.PORT));
		config.setDbName(json.getString(DataSourceConfig.DB_NAME));
		config.setUserName(json.getString(DataSourceConfig.USER_NAME));
		config.setPassword(json.getString(DataSourceConfig.PASSWORD));
		config.setDriverClassName(json.getString(DataSourceConfig.DRIVER_CLASS_NAME));
		config.setSorterClassName(json.getString(DataSourceConfig.SORTER_CLASS_NAME));
		config.setPreparedStatementCacheSize(json.getInt(DataSourceConfig.PREPARED_STATEMENT_CACHE_SIZE));
		config.setMinPoolSize(json.getInt(DataSourceConfig.MIN_POOL_SIZE));
		config.setMaxPoolSize(json.getInt(DataSourceConfig.MAX_POOL_SIZE));
		config.setBlockingTimeout(json.getInt(DataSourceConfig.BLOCKING_TIMEOUT));
		config.setIdleTimeout(json.getInt(DataSourceConfig.IDLE_TIMEOUT));
		
		config.setDbType(DBType.valueOf(json.getString(DataSourceConfig.DB_TYPE)));
		if(DBType.ORACLE == config.getDbType()) {
			config.setOracleConnectionType(json.getString(DataSourceConfig.ORACLE_CONNECTION_TYPE));
		}
		config.setDbStatus(DBStatus.valueOf(json.getString(DataSourceConfig.DB_STATUS)));
		config.setConnectionProperties(PropertyUtil.parse2Map(json.getString(DataSourceConfig.CONNECTION_PROPERTIES)));
		config.setWriteRestrictTimes(json.getInt(DataSourceConfig.WRITE_RESTRICT_TIMES));
		config.setReadRestrictTimes(json.getInt(DataSourceConfig.READ_RESTRICT_TIMES));
		config.setTimeSliceInMillis(json.getInt(DataSourceConfig.TIME_SLICE_MILLIS));
		config.setThreadCountRestrict(json.getInt(DataSourceConfig.THREAD_COUNT_RESTRICT));
		config.setMaxConcurrentReadRestrict(json.getInt(DataSourceConfig.MAX_CONCURRENT_READ_RESTRICT));
		config.setMaxConcurrentWriteRestrict(json.getInt(DataSourceConfig.MAX_CONCURRENT_WRITE_RESTRICT));
		config.setIsSingleInGroup(json.getBoolean(DataSourceConfig.IS_SINGLE_IN_GROUP));
		return config;
	}
}
