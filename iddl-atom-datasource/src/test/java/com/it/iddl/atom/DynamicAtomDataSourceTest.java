/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import junit.framework.TestCase;
import net.sf.json.JSONObject;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Before;
import org.junit.Test;

import com.it.iddl.atom.config.DataSourceConfig;
import com.it.iddl.common.DBStatus;
import com.it.iddl.common.DBType;
import com.it.iddl.util.PropertyUtil;

/**
 * 
 * @author sihai
 *
 */
public class DynamicAtomDataSourceTest extends TestCase {

	private static final String APP_NAME = "testApp";
	private static final String DB_KEY = "testDB";
	
	@Before
	public void init() throws Exception {
		
		DataSourceConfig config = new DataSourceConfig();
		config.setIp("192.168.10.100");
		config.setPort(3306);
		config.setDbName("icommunity");
		config.setUserName("icommunity");
		config.setPassword("thinkmall");
		config.setDbType(DBType.MYSQL);
		config.setDbStatus(DBStatus.RW_STATUS);
		config.setDriverClassName(DBType.MYSQL.getDriverClassName());
		config.setSorterClassName(DBType.MYSQL.getSorterClassName());
		
		config(config);
	}
	
	@Test
	public void test() throws Exception {
		init();
		DynamicAtomDataSource ds = new DynamicAtomDataSource();
		ds.setAppName(APP_NAME);
		ds.setDbKey(DB_KEY);
		ds.setGateway("http:/www.google.com");
		
		Connection connection = null;
		try {
			ds.init();
			connection = ds.getConnection();
			Statement s = connection.createStatement();
			s.execute("DROP TABLE IF EXISTS test");
			s.execute("CREATE TABLE test (id INT AUTO_INCREMENT, value varchar(128), PRIMARY KEY (id))");
			s.close();
			PreparedStatement ps = connection.prepareStatement("INSERT INTO test (id, value) VALUES (null, ?)");
			for(int i = 0; i < 100000; i++) {
				ps.setString(1, String.format("value_%d", i));
				ps.addBatch();
				if(i > 0 && i % 10000 == 0) {
					ps.executeBatch();
				}
			}
			ps.executeBatch();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != connection) {
				connection.close();
			}
		}
		
		changeDbName();
		Thread.sleep(10 * 1000);
		
		try {
			connection = ds.getConnection();
			Statement s = connection.createStatement();
			s.execute("DROP TABLE IF EXISTS test");
			s.execute("CREATE TABLE test (id INT AUTO_INCREMENT, value varchar(128), PRIMARY KEY (id))");
			s.close();
			PreparedStatement ps = connection.prepareStatement("INSERT INTO test (id, value) VALUES (null, ?)");
			for(int i = 0; i < 100000; i++) {
				ps.setString(1, String.format("value_%d", i));
				ps.addBatch();
				if(i > 0 && i % 10000 == 0) {
					ps.executeBatch();
				}
			}
			ps.executeBatch();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != connection) {
				connection.close();
			}
		}
		
		changeDbServer();
		Thread.sleep(10 * 1000);
		try {
			connection = ds.getConnection();
			Statement s = connection.createStatement();
			s.execute("DROP TABLE IF EXISTS test");
			s.execute("CREATE TABLE test (id INT AUTO_INCREMENT, value varchar(128), PRIMARY KEY (id))");
			s.close();
			PreparedStatement ps = connection.prepareStatement("INSERT INTO test (id, value) VALUES (null, ?)");
			for(int i = 0; i < 100000; i++) {
				ps.setString(1, String.format("value_%d", i));
				ps.addBatch();
				if(i > 0 && i % 10000 == 0) {
					ps.executeBatch();
				}
			}
			ps.executeBatch();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != connection) {
				connection.close();
			}
			if(null != ds) {
				ds.destroy();
			}
		}
	}
	
	private void config(DataSourceConfig config) throws Exception {
		ZooKeeper zookeeper = new ZooKeeper(String.format("%s:%d", "localhost", 2181), 5000, new ZookeeperWatcher());
		JSONObject json = JSONObject.fromObject(config);
		json.put(DataSourceConfig.CONNECTION_PROPERTIES, PropertyUtil.asString(config.getConnectionProperties()));
		json.put(DataSourceConfig.DB_TYPE, DBType.MYSQL.name());
		json.put(DataSourceConfig.DB_STATUS, DBStatus.RW_STATUS.name());
		zookeeper.setData(String.format("/iddl/ds/%s/%s", APP_NAME, DB_KEY), json.toString().getBytes(), -1);
		zookeeper.close();
	}
	
	private void changeDbName() throws Exception {
		DataSourceConfig config = new DataSourceConfig();
		config.setIp("192.168.10.101");
		config.setPort(3306);
		config.setDbName("test");
		config.setUserName("icommunity");
		config.setPassword("thinkmall");
		config.setDbType(DBType.MYSQL);
		config.setDbStatus(DBStatus.RW_STATUS);
		config.setDriverClassName(DBType.MYSQL.getDriverClassName());
		config.setSorterClassName(DBType.MYSQL.getSorterClassName());
		
		config(config);
	}
	
	private void changeDbServer() throws Exception {
		DataSourceConfig config = new DataSourceConfig();
		config.setIp("192.168.10.100");
		config.setPort(3306);
		config.setDbName("icommunity");
		config.setUserName("icommunity");
		config.setPassword("thinkmall");
		config.setDbType(DBType.MYSQL);
		config.setDbStatus(DBStatus.RW_STATUS);
		config.setDriverClassName(DBType.MYSQL.getDriverClassName());
		config.setSorterClassName(DBType.MYSQL.getSorterClassName());
		
		config(config);
	}
	
	private static class ZookeeperWatcher implements Watcher {
		@Override
		public void process(WatchedEvent event) {
			
		}
	}
}
