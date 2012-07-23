/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.atom.config.DataSourceConfig;
import com.it.iddl.atom.exception.AtomNotAvailableException;
import com.it.iddl.common.DBStatus;
import com.it.iddl.common.DBType;
import com.it.iddl.common.flow.CountPunisher;
import com.it.iddl.common.flow.TimesliceFlowControl;
import com.it.iddl.common.valve.SmoothResumeValve;
import com.it.iddl.idatasource.resource.adapter.jdbc.ExceptionSorter;
import com.it.iddl.idatasource.resource.adapter.jdbc.vendor.MySQLExceptionSorter;
import com.it.iddl.idatasource.resource.adapter.jdbc.vendor.OracleExceptionSorter;
import com.it.iddl.util.NagiosUtil;

/**
 * 
 * @author sihai
 *
 */
public class AtomDataSourceWrapper implements DataSource {

	private static Log logger = LogFactory.getLog(AtomDataSourceWrapper.class);
	private final DataSource targetDataSource;		// 目标数据源
	
	final AtomicInteger threadCount = new AtomicInteger();			//包权限
	final AtomicInteger threadCountReject = new AtomicInteger();	//包权限
	final AtomicInteger concurrentReadCount = new AtomicInteger(); 	//包权限
	final AtomicInteger concurrentWriteCount = new AtomicInteger(); //包权限
	volatile TimesliceFlowControl writeFlowControl; 				//包权限
	volatile TimesliceFlowControl readFlowControl; 					//包权限

	/**
	 * 写计数
	 */
	//final AtomicInteger writeTimes = new AtomicInteger();			//包权限
	final AtomicInteger writeTimesReject = new AtomicInteger();		//包权限

	/**
	 * 读计数
	 */
	//final AtomicInteger readTimes = new AtomicInteger();			//包权限
	final AtomicInteger readTimesReject = new AtomicInteger();		//包权限
	volatile ConnectionProperties connectionProperties = new ConnectionProperties(); //包权限
	
	private DataSourceConfig config;
	
	private final ReentrantLock _retry_lock_;
	//private volatile boolean isNotAvailable = false; 		// 是否不可用
	private volatile SmoothResumeValve smoothResumeValve;
	private volatile CountPunisher timeOutPunisher;			// 3秒钟之内超时300次则惩罚，不可能的阀值，相当于关闭了

	private volatile long lastRetryTime = 0;				// 
	
	private static final int DEFAULT_RETRY_BAD_DB_INTERVAL = 2000; 	//milliseconds
	protected static int retryBadDbInterval; //milliseconds
	
	private static final Map<String, ExceptionSorter> exceptionSorterMap = new HashMap<String, ExceptionSorter>(2);
	static {
		exceptionSorterMap.put(DBType.ORACLE.name(), new OracleExceptionSorter());
		exceptionSorterMap.put(DBType.MYSQL.name(), new MySQLExceptionSorter());
	}
	
	static {
		int interval = DEFAULT_RETRY_BAD_DB_INTERVAL;
		String propvalue = System.getProperty("com.it.iddl.atom.retryBadDbInterval");
		if (propvalue != null) {
			try {
				interval = Integer.valueOf(propvalue.trim());
			} catch (NumberFormatException e) {
				logger.error("", e);
			}
		}
		retryBadDbInterval = interval;
	}
	
	/**
	 * 
	 * @param targetDataSource
	 */
	public AtomDataSourceWrapper(DataSource targetDataSource, DataSourceConfig config) {
		this.targetDataSource = targetDataSource;
		this._retry_lock_  = new ReentrantLock();
		this.smoothResumeValve = new SmoothResumeValve(20);
		this.timeOutPunisher = new CountPunisher(new SmoothResumeValve(20), 3000, 300);
		this.config = config;
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		return getConnection(null, null);
	}

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		try {
			if(smoothResumeValve.isAvailable()) {
				if(smoothResumeValve.smoothThroughOnInitial()) {
					return getConnectionByTargetDataSource(username, password);
				} else {
					throw new AtomNotAvailableException(String.format(""));
				}
			} else {
				if(System.currentTimeMillis() - lastRetryTime > retryBadDbInterval && _retry_lock_.tryLock()) {
					try {
						// 同一个时间只会有一个线程继续使用这个数据源。
						Connection t = innerGetConnection(username, password);
						smoothResumeValve.available(); //用一个线程重试，执行成功则标记为可用，自动恢复
						return t;
					} finally {
						_retry_lock_.unlock();
					}
				} else {
					throw new AtomNotAvailableException(String.format(""));
				}
			}
		} catch (SQLException e) {
			if (exceptionSorterMap.get(config.getDbType().name()).isExceptionFatal(e)) {
				// 告警
				NagiosUtil.warn(NagiosUtil.KEY_DB_NOT_AVAILABLE, e.getMessage());
				//isNotAvailable = true;
				smoothResumeValve.unAvailable();
			}
			throw e;
		}
	}
	
	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return targetDataSource.getLogWriter();
	}
	
	@Override
	public int getLoginTimeout() throws SQLException {
		return targetDataSource.getLoginTimeout();
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		targetDataSource.setLogWriter(out);
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		targetDataSource.setLoginTimeout(seconds);
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return AtomDataSourceWrapper.class.isAssignableFrom(iface);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		if(isWrapperFor(iface)){
			return (T) this;
		}else{
			throw new SQLException("not a wrapper for "+ iface);
		}
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	private Connection innerGetConnection(String username, String password) throws SQLException {
		AtomConnectionWrapper tconnectionWrapper;
		try {
			recordThreadCount();
			tconnectionWrapper = new AtomConnectionWrapper(getConnectionByTargetDataSource(username, password), this);
		} catch (SQLException e) {
			threadCount.decrementAndGet();
			throw e;
		} catch (RuntimeException e) {
			threadCount.decrementAndGet();
			throw e;
		}
		return tconnectionWrapper;
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	private Connection getConnectionByTargetDataSource(String username, String password) throws SQLException {
		if (username == null && password == null) {
			return targetDataSource.getConnection();
		} else {
			return targetDataSource.getConnection(username, password);
		}
	}

	/**
	 * 
	 * @throws SQLException
	 */
	private void recordThreadCount() throws SQLException {
		int threadCountRestriction = connectionProperties.threadCountRestriction;
		int currentThreadCount = threadCount.incrementAndGet();
		if (threadCountRestriction != 0) {
			if (currentThreadCount > threadCountRestriction) {
				threadCountReject.incrementAndGet();
				throw new SQLException("max thread count : " + currentThreadCount);
			}
		}
	}

	/**
	 * 
	 * @author sihai
	 *
	 */
	public static class ConnectionProperties {
		
		public volatile DBStatus dbStatus;
		/**
		 * 当前数据库的名字
		 */
		public volatile String datasourceName;
		
		//add by junyu,2012-4-17,日志统计使用
		public volatile String ip;
		
		public volatile String port;
		
		public volatile String realDbName;
		/**
		 * 写次数限制，0为不限制
		 */
		//public volatile int writeRestrictionTimes;

		/**
		 * 读次数限制，0为不限制
		 */
		//public volatile int readRestrictionTimes;
		/**
		 * 线程count限制，0为不限制
		 */
		public volatile int threadCountRestriction;

		/**
		 * 允许并发读的最大个数，0为不限制
		 */
		public volatile int maxConcurrentReadRestrict;

		/**
		 * 允许并发写的最大个数，0为不限制
		 */
		public volatile int maxConcurrentWriteRestrict;
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	//		For jdk7
	////////////////////////////////////////////////////////////////////////////////////
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}
}
