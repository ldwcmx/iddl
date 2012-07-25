/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasources
 */
package com.it.iddl.group;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.it.iddl.common.DBType;
import com.it.iddl.group.dbselector.DBSelector;
import com.it.iddl.group.exception.GroupException;
import com.it.iddl.group.jdbc.GroupConnection;
import com.it.iddl.group.jdbc.GroupDataSourceWrapper;


/**
 * <p>
 * 抽象的GroupDataSource
 * </p>
 * <code>GroupDataSource</code>内部包含一组(>=1个)同构的数据库，这一组数据库的不同个体有不同的读写优先级和权重，
 * 当读写数据时也只是按读写优先级和权重对其中的一个数据库操作，如果第一个数据库读写失败了，再尝试下一个数据库，
 * 如果第一个数据库读写成功了，直接返回结果给应用层，其他数据库的同步更新由底层数据库内部完成，<b><code>GroupDataSource</code>不负责数据同步</b>。
 *
 * 使用<code>GroupDataSource</code>的步骤:
 * <pre>
 *      AbstractGroupDataSource groupDataSource = new XXXGroupDataSource();
 *      groupDataSource.setDbGroupKey("myDbGroup");
 *      //......调用其他setter
 *      groupDataSource.init();
 *      groupDataSource.getConnection();
 * </pre>
 *
 * <p>
 * 	将读写分离到不同的DBSelector
 * </p>
 * @author sihai
 *
 */
public abstract class AbstractGroupDataSource implements DataSource {
	
	public static final int DEFAULT_RETRY_TIMES = 3;
	
	protected String appName;						// 
	protected String groupKey;						// 
	protected String groupConf;						// 
	private DBType dbType = DBType.MYSQL;			// 
	
	private int retryTimes = DEFAULT_RETRY_TIMES; 	// 默认读写失败时重试3次
	
	/* ========================================================================
	 * 以下是保留当前写操作是在哪个库上执行的, 满足类似日志库插入的场景
	 * ======================================================================*/
	private static ThreadLocal<GroupDataSourceWrapper> targetThreadLocal;
	
	/**
	 * 
	 * @param isRead
	 * @return
	 */
	public abstract DBSelector getDBSelector(boolean isRead);
	
	/**
	 * 
	 * @throws GroupException
	 */
	public abstract void internalInit() throws GroupException;
	
	/**
	 * 初始化
	 * @throws GroupException
	 */
	public void init() throws GroupException {
		internalInit();
	}
	
	/**
	 * 通过spring注入或直接调用该方法开启、关闭目标库记录
	 */
	public void setTracerWriteTarget(boolean isTraceTarget) {
		if (isTraceTarget) {
			if (targetThreadLocal == null) {
				targetThreadLocal = new ThreadLocal<GroupDataSourceWrapper>();
			}
		} else {
			targetThreadLocal = null;
		}
	}
	
	/**
	 * 在执行完写操作后，调用改方法获得当前线程写操作是在哪个数据源执行的
	 * 获取完自动立即清空
	 */
	public GroupDataSourceWrapper getCurrentTarget() {
		if (targetThreadLocal == null) {
			return null;
		}
		GroupDataSourceWrapper dsw = targetThreadLocal.get();
		targetThreadLocal.remove();
		return dsw;
	}

	/**
	 * 下游调用该方法设置目标库
	 */
	public void setWriteTarget(GroupDataSourceWrapper dsw) {
		if (targetThreadLocal != null) {
			targetThreadLocal.set(dsw);
		}
	}
	
	/* ========================================================================
	 * 遍历需求API
	 * ======================================================================*/
	//在ConfigManager中我们将配置信息最终封装为读写DBSelector，要得到从dbKey到DataSource的映射，将DBSelector中的信息方向输出。
	public Map<String, DataSource> getDataSourceMap() {
		Map<String, DataSource> dsMap = new LinkedHashMap<String, DataSource>();
		dsMap.putAll(this.getDBSelector(true).getDataSources());
		dsMap.putAll(this.getDBSelector(false).getDataSources());
		return dsMap;
	}

	public Map<String, DataSource> getDataSourcesMap(boolean isRead) {
		return this.getDBSelector(isRead).getDataSources();
	}
	
	////////////////////////////////////////////////////////////////
	//		以下是javax.sql.DataSource的API实现
	////////////////////////////////////////////////////////////////
	@Override
	public Connection getConnection() throws SQLException {
		return new GroupConnection(this);
	}
	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		return new GroupConnection(this, username, password);
	}
	
	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	////////////////////////////////////////////////////////////////
	//		For jdk1.6
	////////////////////////////////////////////////////////////////
	public <T> T unwrap(Class<T> iface) throws SQLException {
		if(isWrapperFor(iface)){
			return (T) this;
		}else{
			throw new SQLException("not a wrapper for "+ iface);
		}
	}
	
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return this.getClass().isAssignableFrom(iface);
	}
	
	////////////////////////////////////////////////////////////////
	//		For jdk1.7
	////////////////////////////////////////////////////////////////
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}
	
	
	////////////////////////////////////////////////////////////////
	//		setter/getter
	////////////////////////////////////////////////////////////////
	public int getRetryTimes() {
		return retryTimes;
	}

	public void setRetryTimes(int retryTimes) {
		this.retryTimes = retryTimes;
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getGroupKey() {
		return groupKey;
	}

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public String getGroupConf() {
		return groupConf;
	}

	public void setGroupConf(String groupConf) {
		this.groupConf = groupConf;
	}

	public DBType getDbType() {
		return dbType;
	}

	public void setDbType(DBType dbType) {
		this.dbType = dbType;
	}
}
