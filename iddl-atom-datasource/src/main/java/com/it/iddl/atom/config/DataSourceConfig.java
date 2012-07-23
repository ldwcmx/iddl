/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.config;

import java.util.HashMap;
import java.util.Map;

import com.iacrqq.util.StringUtil;
import com.it.iddl.common.DBConstants;
import com.it.iddl.common.DBStatus;
import com.it.iddl.common.DBType;

/**
 * 数据源配置信息
 * @author sihai
 *
 */
public class DataSourceConfig {
	
	public static final String IP = "ip";
	public static final String PORT = "port";
	public static final String DB_NAME = "dbName";
	public static final String USER_NAME = "userName";
	public static final String PASSWORD = "password";
	public static final String DRIVER_CLASS_NAME = "driverClassName";
	public static final String SORTER_CLASS_NAME = "sorterClassName";
	public static final String PREPARED_STATEMENT_CACHE_SIZE = "preparedStatementCacheSize";
	public static final String MIN_POOL_SIZE = "minPoolSize";
	public static final String MAX_POOL_SIZE = "maxPoolSize";
	public static final String BLOCKING_TIMEOUT = "blockingTimeout";
	public static final String IDLE_TIMEOUT = "idleTimeout";
	public static final String ORACLE_CONNECTION_TYPE = "oracleConnectionType";
	public static final String DB_TYPE = "dbType";
	public static final String DB_STATUS = "dbStatus";
	public static final String CONNECTION_PROPERTIES = "connectionProperties";
	public static final String WRITE_RESTRICT_TIMES = "writeRestrictTimes";
	public static final String READ_RESTRICT_TIMES = "readRestrictTimes";
	public static final String TIME_SLICE_MILLIS = "timeSliceInMillis";
	public static final String THREAD_COUNT_RESTRICT = "threadCountRestrict";
	public static final String MAX_CONCURRENT_READ_RESTRICT = "maxConcurrentReadRestrict";
	public static final String MAX_CONCURRENT_WRITE_RESTRICT = "maxConcurrentWriteRestrict";
	public static final String IS_SINGLE_IN_GROUP = "isSingleInGroup";
	
	public static final int DEFAULT_PREPARED_STATEMENT_CACHE_SIZE = 32;
	public static final int DEFAULT_MIN_POOL_SIZE = 1;
	public static final int DEFAULT_MAX_POOL_SIZE = 1;
	public static final int DEFAULT_BLOCKING_TIMEOUT = 5000;
	public static final int DEFAULT_IDLE_TIMEOUT = 5000;
	public static final int DEFAULT_WRITE_RESTRICT_TIMES = 16;
	public static final int DEFAULT_READ_RESTRICT_TIMES = 16;
	public static final int DEFAULT_TIME_SLICE_MILLIS = 32;
	public static final int DEFAULT_THREAD_COUNT_RESTRICT = 4;
	public static final int DEFAULT_MAX_CONCURRENT_READ_RESTRICT = 4;
	public static final int DEFAULT_MAX_CONCURRENT_WRITE_RESTRICT = 4;
	
	private String ip;			// 数据库IP
	private int port;			// 数据库Port
	private String dbName;		// 数据库名

	private String userName;	// 用户名
	private String password;	// 密码

	private String driverClassName;	// 驱动类名
	private String sorterClassName;	// 排序

	private int preparedStatementCacheSize;

	private int minPoolSize = DEFAULT_MIN_POOL_SIZE;	// 连接池最小数目
	private int maxPoolSize = DEFAULT_MAX_POOL_SIZE;	// 连接池最大数目

	private int blockingTimeout = DEFAULT_BLOCKING_TIMEOUT;	//
	private long idleTimeout = DEFAULT_IDLE_TIMEOUT;		// 

	private String oracleConnectionType = DBConstants.DEFAULT_ORACLE_CONNECTION_TYPE;

	private DBType dbType;										// 数据库类型
	private DBStatus dbStatus = DBStatus.NA_STATUS;	// 数据库状态

	private Map<String, String> connectionProperties = new HashMap<String, String>();
	
	private int writeRestrictTimes = DEFAULT_WRITE_RESTRICT_TIMES;		// 写次数限制
	private int readRestrictTimes = DEFAULT_READ_RESTRICT_TIMES;		// 读次数限制

	private int timeSliceInMillis = DEFAULT_TIME_SLICE_MILLIS;		// 统计时间片 

	private int threadCountRestrict = DEFAULT_THREAD_COUNT_RESTRICT;	// 线程技术count限制
	
	private int maxConcurrentReadRestrict = DEFAULT_MAX_CONCURRENT_READ_RESTRICT;	// 允许并发读的最大个数，0为不限制
	private int maxConcurrentWriteRestrict = DEFAULT_MAX_CONCURRENT_WRITE_RESTRICT; // 允许并发写的最大个数，0为不限制
	
	private volatile boolean isSingleInGroup = true;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriverClassName() {
		if (StringUtil.isBlank(driverClassName) && null != this.dbType) {
			return this.dbType.getDriverClassName();
		}
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getSorterClassName() {
		if (StringUtil.isBlank(sorterClassName) && null != this.dbType) {
			return this.dbType.getSorterClassName();
		}
		return sorterClassName;
	}

	public void setSorterClassName(String sorterClassName) {
		this.sorterClassName = sorterClassName;
	}

	public int getPreparedStatementCacheSize() {
		return preparedStatementCacheSize;
	}

	public void setPreparedStatementCacheSize(int preparedStatementCacheSize) {
		this.preparedStatementCacheSize = preparedStatementCacheSize;
	}

	public int getMinPoolSize() {
		return minPoolSize;
	}

	public void setMinPoolSize(int minPoolSize) {
		this.minPoolSize = minPoolSize;
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}

	public int getBlockingTimeout() {
		return blockingTimeout;
	}

	public void setBlockingTimeout(int blockingTimeout) {
		this.blockingTimeout = blockingTimeout;
	}

	public long getIdleTimeout() {
		return idleTimeout;
	}

	public void setIdleTimeout(long idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public String getOracleConnectionType() {
		return oracleConnectionType;
	}

	public void setOracleConnectionType(String oracleConnectionType) {
		this.oracleConnectionType = oracleConnectionType;
	}

	public DBType getDbType() {
		return dbType;
	}

	public void setDbType(DBType dbType) {
		this.dbType = dbType;
	}

	public DBStatus getDbStatus() {
		return dbStatus;
	}

	public void setDbStatus(DBStatus dbStatus) {
		this.dbStatus = dbStatus;
	}

	public Map<String, String> getConnectionProperties() {
		return connectionProperties;
	}

	public void setConnectionProperties(Map<String, String> connectionProperties) {
		this.connectionProperties = connectionProperties;
	}

	public int getWriteRestrictTimes() {
		return writeRestrictTimes;
	}

	public void setWriteRestrictTimes(int writeRestrictTimes) {
		this.writeRestrictTimes = writeRestrictTimes;
	}

	public int getReadRestrictTimes() {
		return readRestrictTimes;
	}

	public void setReadRestrictTimes(int readRestrictTimes) {
		this.readRestrictTimes = readRestrictTimes;
	}

	public int getTimeSliceInMillis() {
		return timeSliceInMillis;
	}

	public void setTimeSliceInMillis(int timeSliceInMillis) {
		this.timeSliceInMillis = timeSliceInMillis;
	}

	public int getThreadCountRestrict() {
		return threadCountRestrict;
	}

	public void setThreadCountRestrict(int threadCountRestrict) {
		this.threadCountRestrict = threadCountRestrict;
	}

	public int getMaxConcurrentReadRestrict() {
		return maxConcurrentReadRestrict;
	}

	public void setMaxConcurrentReadRestrict(int maxConcurrentReadRestrict) {
		this.maxConcurrentReadRestrict = maxConcurrentReadRestrict;
	}

	public int getMaxConcurrentWriteRestrict() {
		return maxConcurrentWriteRestrict;
	}

	public void setMaxConcurrentWriteRestrict(int maxConcurrentWriteRestrict) {
		this.maxConcurrentWriteRestrict = maxConcurrentWriteRestrict;
	}

	public boolean getIsSingleInGroup() {
		return isSingleInGroup;
	}

	public void setIsSingleInGroup(boolean isSingleInGroup) {
		this.isSingleInGroup = isSingleInGroup;
	}
}
