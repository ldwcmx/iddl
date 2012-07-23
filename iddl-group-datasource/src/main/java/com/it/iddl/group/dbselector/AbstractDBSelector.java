/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.dbselector;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.common.DBType;
import com.it.iddl.common.jdbc.sorter.ExceptionSorter;
import com.it.iddl.common.jdbc.sorter.MySQLExceptionSorter;
import com.it.iddl.common.jdbc.sorter.OracleExceptionSorter;
import com.it.iddl.group.exception.NoMoreDataSourceException;
import com.it.iddl.group.jdbc.GroupDataSourceWrapper;
import com.it.iddl.util.NagiosUtil;

/**
 * 抽象的DB选择器
 * @author sihai
 *
 */
public abstract class AbstractDBSelector implements DBSelector {
	
	private static final Log logger = LogFactory.getLog(AbstractDBSelector.class);
	
	private static final Map<DBType, ExceptionSorter> exceptionSorters = new HashMap<DBType, ExceptionSorter>(2);
	
	private DBType dbType = DBType.MYSQL;							// 
	protected ExceptionSorter exceptionSorter = exceptionSorters.get(dbType);
	private String id = "undefined"; 								// id值未使用
	
	protected boolean readable = false;								// 
	protected boolean isSupportRetry = true; 						// 默认情况下支持重试

	private static final int DEFAULT_RETRY_BAD_DB_INTERVAL = 2000; 	// milliseconds
	protected static int retryBadDbInterval; 						// milliseconds
	
	static {
		exceptionSorters.put(DBType.ORACLE, new OracleExceptionSorter());
		exceptionSorters.put(DBType.MYSQL, new MySQLExceptionSorter());
	}
	
	static {
		int interval = DEFAULT_RETRY_BAD_DB_INTERVAL;
		String propvalue = System.getProperty("com.it.iddl.DBSelector.retryBadDbInterval");
		if (propvalue != null) {
			try {
				interval = Integer.valueOf(propvalue.trim());
			} catch (Exception e) {
				logger.error("", e);
			}
		}
		retryBadDbInterval = interval;
	}

	public AbstractDBSelector() {
		this("undefined");
	}

	public AbstractDBSelector(String id) {
		this.id = id;
	}
	
	public void setSupportRetry(boolean isSupportRetry) {
		this.isSupportRetry = isSupportRetry;
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public boolean isSupportRetry() {
		return isSupportRetry;
	}

	@Override
	public void setDbType(DBType dbType) {
		this.dbType = dbType;
		this.exceptionSorter = exceptionSorters.get(this.dbType);
	}

	@Override
	public void setReadable(boolean readable) {
		this.readable = readable;
	}
	
	@Override
	public <T> T tryExecute(DataSourceTryer<T> tryer, int times, Object... args)
			throws SQLException {
		return this.tryExecute(new LinkedHashMap<DataSource, SQLException>(0), tryer, times, args);
	}

	@Override
	public <T> T tryExecute(Map<DataSource, SQLException> failedDataSources, DataSourceTryer<T> tryer, int times, Object... args) throws SQLException {
		
		// dataSourceIndex放在args最后一个.以后改动要注意
		// local set dataSourceIndex was placed first
		Integer dataSourceIndex = null;
		if (args != null && args.length > 0) {
			dataSourceIndex = (Integer) args[args.length - 1];
		}
		
		// 如果业务层直接指定了一个数据源，就直接在指定的数据源上进行查询更新操作，失败时不再重试。
		if (dataSourceIndex != null && dataSourceIndex != NOT_EXIST_USER_SPECIFIED_INDEX) {
			DataSourceHolder dsHolder = findDataSourceWrapperByIndex(dataSourceIndex);
			if (dsHolder == null) {
				throw new IllegalArgumentException("找不到索引编号为 '" + dataSourceIndex + "'的数据源");
			}
			return tryOnDataSourceHolder(dsHolder, failedDataSources, tryer, times, args);
		} else {
			return tryExecuteInternal(failedDataSources, tryer, times, args);
		}
	}
	
	/**
	 * 
	 * @param <T>
	 * @param dsHolder
	 * @param failedDataSources
	 * @param tryer
	 * @param times
	 * @param args
	 * @return
	 * @throws SQLException
	 */
	protected <T> T tryOnDataSourceHolder(DataSourceHolder dsHolder, Map<DataSource, SQLException> failedDataSources, DataSourceTryer<T> tryer, int times, Object... args) throws SQLException {
		List<SQLException> exceptions = new LinkedList<SQLException>();
		if (failedDataSources != null) {
			exceptions.addAll(failedDataSources.values());
		}
		if (failedDataSources != null && failedDataSources.containsKey(dsHolder.gdsw)) {
			return tryer.onSQLException(exceptions, exceptionSorter, args);
		}
		
		try {
			if (dsHolder.isNotAvailable) {
				boolean toTry = System.currentTimeMillis() - dsHolder.lastRetryTime > retryBadDbInterval;
				if (toTry && dsHolder.lock.tryLock()) {
					// 这里不进行二次检测isNotAvailable是没问题的
					try {
						T t = tryer.tryOnDataSource(dsHolder.gdsw, args); 	// 同一个时间只会有一个线程继续使用这个数据源。
						dsHolder.isNotAvailable = false; 					// 用一个线程重试，执行成功则标记为可用，自动恢复
						return t;
					} finally {
						dsHolder.lastRetryTime = System.currentTimeMillis();
						dsHolder.lock.unlock();
					}
				} else {
					exceptions.add(new NoMoreDataSourceException("dbKey:"
							+ dsHolder.gdsw.getDbKey()
							+ " not Available,toTry:" + toTry));
					return tryer.onSQLException(exceptions, exceptionSorter,
							args);
				}
			} else {
				return tryer.tryOnDataSource(dsHolder.gdsw, args); // 有一次成功直接返回
			}
		} catch (SQLException e) {
			if (exceptionSorter.isExceptionFatal(e)) {
				NagiosUtil.warn(NagiosUtil.KEY_DB_NOT_AVAILABLE + "|" + dsHolder.gdsw.getDbKey(), e.getMessage());
				dsHolder.isNotAvailable = true;
			}
			exceptions.add(e);
			return tryer.onSQLException(exceptions, exceptionSorter, args);
		}
	}
	
	protected <T> T tryExecuteInternal(DataSourceTryer<T> tryer, int times, Object... args) throws SQLException {
		return this.tryExecuteInternal(new LinkedHashMap<DataSource, SQLException>(0), tryer, times, args);
	}
	
	////////////////////////////////////////////////////////////////////////
	//		abstract methods
	////////////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 * @param dataSourceIndex
	 * @return
	 */
	protected abstract DataSourceHolder findDataSourceWrapperByIndex(int dataSourceIndex);
	
	/**
	 * 
	 * @param <T>
	 * @param failedDataSources
	 * @param tryer
	 * @param times
	 * @param args
	 * @return
	 * @throws SQLException
	 */
	protected abstract <T> T tryExecuteInternal(Map<DataSource, SQLException> failedDataSources, DataSourceTryer<T> tryer, int times, Object... args) throws SQLException;
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	protected static class DataSourceHolder {
		
		public final GroupDataSourceWrapper gdsw;
		public final ReentrantLock lock = new ReentrantLock();
		public volatile boolean isNotAvailable = false;
		public volatile long lastRetryTime = 0;

		public DataSourceHolder(GroupDataSourceWrapper gdsw) {
			this.gdsw = gdsw;
		}
	}
}
