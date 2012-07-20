/**
 * idatasource
 * 
 * all rights reserved by ihome.inc
 */
package com.it.iddl.idatasource;

import org.apache.commons.lang.StringUtils;

import com.it.iddl.idatasource.resource.adapter.jdbc.local.LocalTxDataSource;
import com.it.iddl.idatasource.resource.pool.connection.CachedConnectionManager;
import com.it.iddl.idatasource.resource.security.SecureIdentityLoginModule;
import com.it.iddl.idatasource.tx.TxManager;

/**
 * 
 * @author sihai
 *
 */
public class IDataSourceFactory {
	
	private static final LoginConfigFinder loginConfigFinder = new LoginConfigFinder();
	private static final TxManager defaultTransactionManager = TxManager.getInstance();
	private static final CachedConnectionManager defaultCachedConnectionManager = new CachedConnectionManager();
	
	public static LocalTxDataSource createLocalTxDataSource(LocalTxDataSourceConfig config) throws Exception{
		return createLocalTxDataSource(config, null, null);
	}
	
	public static LocalTxDataSource createLocalTxDataSource(LocalTxDataSourceConfig config, TxManager transactionManager, CachedConnectionManager cachedConnectionManager) throws Exception{
		if(null == config){
			throw new IllegalArgumentException("dataSource config is Empty!");
		}
		LocalTxDataSource localTxDataSource = new LocalTxDataSource();
		//设置连接缓存管理器，如果给定了使用给定的，如果没指定则默认给一个
		if(null != cachedConnectionManager){
			localTxDataSource.setCachedConnectionManager(cachedConnectionManager);
		}else{
			localTxDataSource.setCachedConnectionManager(defaultCachedConnectionManager);
		}
		//设置事物管理器，如果给定的使用给定的，如果没有则默认给一个
		if(null != transactionManager){
			localTxDataSource.setTransactionManager(transactionManager);
		}else{
			localTxDataSource.setTransactionManager(defaultTransactionManager);
		}
		localTxDataSource.setBeanName(config.getJndiName());
		localTxDataSource.setUseJmx(config.isUseJmx());
		localTxDataSource.setBackgroundValidation(config.isBackgroundValidation());
		localTxDataSource.setBackGroundValidationMinutes(config.getBackgroundValidationMinutes());
		localTxDataSource.setBlockingTimeoutMillis(config.getBlockingTimeoutMillis());
		localTxDataSource.setCheckValidConnectionSQL(config.getCheckValidConnectionSQL());
		localTxDataSource.setConnectionProperties(config.getConnectionProperties());
		localTxDataSource.setConnectionURL(config.getConnectionURL());
		localTxDataSource.setDriverClass(config.getDriverClass());
		localTxDataSource.setExceptionSorterClassName(config.getExceptionSorterClassName());
		localTxDataSource.setIdleTimeoutMinutes(config.getIdleTimeoutMinutes());
		localTxDataSource.setMaxSize(config.getMaxPoolSize());
		localTxDataSource.setMinSize(config.getMinPoolSize());
		localTxDataSource.setNewConnectionSQL(config.getNewConnectionSQL());
		localTxDataSource.setNoTxSeparatePools(config.isNoTxSeparatePools());
		localTxDataSource.setPassword(config.getPassword());
		localTxDataSource.setPrefill(config.isPrefill());
		localTxDataSource.setPreparedStatementCacheSize(config.getPreparedStatementCacheSize());
		localTxDataSource.setQueryTimeout(config.getQueryTimeout());
		localTxDataSource.setSharePreparedStatements(config.isSharePreparedStatements());
		localTxDataSource.setTrackStatements(config.getTrackStatements());
		localTxDataSource.setTransactionIsolation(config.getTransactionIsolation());
		localTxDataSource.setTxQueryTimeout(config.isTxQueryTimeout());
		localTxDataSource.setUseFastFail(config.isUseFastFail());
		localTxDataSource.setUserName(config.getUserName());
		localTxDataSource.setValidateOnMatch(config.isValidateOnMatch());
		localTxDataSource.setValidConnectionCheckerClassName(config.getValidConnectionCheckerClassName());
		//设置安全域
		String securityDomainName = config.getSecurityDomain();
		if (StringUtils.isNotBlank(securityDomainName)) {
			SecureIdentityLoginModule securityDomain = loginConfigFinder.get(securityDomainName);
			if (securityDomain != null) {
				localTxDataSource.setSecurityDomain(securityDomain);
			}
		}
		localTxDataSource.setCriteria(config.getCriteria());
		//初始化数据源
		localTxDataSource.init();
		return localTxDataSource;
	}
}
