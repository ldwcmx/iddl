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
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.it.iddl.common.DBType;
import com.it.iddl.common.DataSourceFetcher;


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
public class AbstractGroupDataSource implements DataSource {
	
	public static final int DEFAULT_RETRY_TIMES = 3;
	
	private String appName;							// 
	private String groupKey;						// 
	private String groupConf;						// 
	private DataSourceFetcher dataSourceFetcher;	// 
	private DBType dbType = DBType.MYSQL;			// 
	
	private int retryTimes = DEFAULT_RETRY_TIMES; // 默认读写失败时重试3次
	
	/**
	 * 初始化
	 */
	public void init() {
		
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
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
	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
