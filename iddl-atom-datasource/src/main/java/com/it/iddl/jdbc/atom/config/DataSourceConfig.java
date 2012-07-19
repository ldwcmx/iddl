/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom.config;

import java.util.HashMap;
import java.util.Map;

import com.iacrqq.util.StringUtil;
import com.it.iddl.jdbc.atom.common.AtomConstants;

/**
 * ����Դ������Ϣ
 * @author sihai
 *
 */
public class DataSourceConfig {
	
	private String ip;			// ���ݿ�IP
	private String port;		// ���ݿ�Port
	private String dbName;		// ���ݿ���

	private String userName;	// �û���
	private String password;	// ����

	private String driverClassName;	// ��������
	private String sorterClassName;	// ����

	private int preparedStatementCacheSize;

	private int minPoolSize;	// ���ӳ���С��Ŀ
	private int maxPoolSize;	// ���ӳ������Ŀ

	private int blockingTimeout;	//
	private long idleTimeout;		// 

	private String oracleConType = AtomConstants.DEFAULT_ORACLE_CON_TYPE;

	private AtomDatabaseTypeEnum dbTypeEnum;		// ���ݿ�����
	private AtomDatabaseStatusEnum dbStautsEnum;	// ���ݿ�״̬

	private Map<String, String> connectionProperties = new HashMap<String, String>();
	
	private int writeRestrictTimes;		// д��������
	private int readRestrictTimes;		// ����������

	private int timeSliceInMillis;		// ͳ��ʱ��Ƭ 

	private int threadCountRestrict;	// �̼߳���count����
	
	private int maxConcurrentReadRestrict;	// ������������������0Ϊ������
	private int maxConcurrentWriteRestrict; // ������д����������0Ϊ������
	
	private volatile boolean isSingleInGroup;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
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
		if (StringUtil.isBlank(driverClassName) && null != this.dbTypeEnum) {
			return this.dbTypeEnum.getDriverClassName();
		}
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getSorterClassName() {
		if (StringUtil.isBlank(sorterClassName) && null != this.dbTypeEnum) {
			return this.dbTypeEnum.getSorterClassName();
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

	public String getOracleConType() {
		return oracleConType;
	}

	public void setOracleConType(String oracleConType) {
		this.oracleConType = oracleConType;
	}

	public AtomDatabaseTypeEnum getDbTypeEnum() {
		return dbTypeEnum;
	}

	public void setDbTypeEnum(AtomDatabaseTypeEnum dbTypeEnum) {
		this.dbTypeEnum = dbTypeEnum;
	}

	public AtomDatabaseStatusEnum getDbStautsEnum() {
		return dbStautsEnum;
	}

	public void setDbStautsEnum(AtomDatabaseStatusEnum dbStautsEnum) {
		this.dbStautsEnum = dbStautsEnum;
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

	public boolean isSingleInGroup() {
		return isSingleInGroup;
	}

	public void setSingleInGroup(boolean isSingleInGroup) {
		this.isSingleInGroup = isSingleInGroup;
	}
}
