/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import net.sf.json.JSONObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.it.iddl.atom.config.DataSourceConfig;
import com.it.iddl.common.DBStatus;
import com.it.iddl.common.DBType;
import com.it.iddl.common.http.NHttpServer;
import com.it.iddl.util.PropertyUtil;
import com.it.iddl.util.ZookeeperUtil;

/**
 * 
 * @author sihai
 *
 */
public class DynamicGroupDataSourceTest {

	
	private static final String APP_NAME = "testApp";
	private static final String DB_KEY_0 = "testDB1";
	private static final String DB_KEY_1 = "testDB2";
	private static final String GROUP_KEY = "group1";
	private static final String GATEWAY = "http://127.0.0.1:8206/connectionURL.html";
	private static final String GROUP_CONF = "testDB1:r10w10p0q0,testDB2:r10w10p0q0";
	
	private NHttpServer server;
	
	@Before
	public void initEnv() {
		initGateway();
		initConfigCenter();
		initConf();
	}
	
	@After
	public void stopEnv() {
		stopGateway();
		stopConfigCenter();
	}
	
	@Test
	public void test() throws Exception {
		DynamicGroupDataSource dgs = new DynamicGroupDataSource();
		dgs.setAppName(APP_NAME);
		dgs.setGroupKey(GROUP_KEY);
		dgs.setGateway(GATEWAY);
		dgs.init();
		
		Connection connection = null;
		try {
			dgs.init();
			connection = dgs.getConnection();
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
			if(null != dgs) {
			}
		}
	}
	
	private void initGateway() {
		URL url = Thread.currentThread().getContextClassLoader().getResource("docRoot");
		
		server = new NHttpServer(url.getFile(), 8206);
		server.init();
	}
	
	private void initConfigCenter() {
		
	}
	
	private void initConf() {
		// Atom
		DataSourceConfig config = new DataSourceConfig();
		config.setIp("127.0.0.1");
		config.setPort(3306);
		config.setDbName("icommunity");
		config.setUserName("icommunity");
		config.setPassword("thinkmall");
		config.setDbType(DBType.MYSQL);
		config.setDbStatus(DBStatus.RW_STATUS);
		config.setDriverClassName(DBType.MYSQL.getDriverClassName());
		config.setSorterClassName(DBType.MYSQL.getSorterClassName());
		JSONObject json = JSONObject.fromObject(config);
		json.put(DataSourceConfig.CONNECTION_PROPERTIES, PropertyUtil.asString(config.getConnectionProperties()));
		json.put(DataSourceConfig.DB_TYPE, DBType.MYSQL.name());
		json.put(DataSourceConfig.DB_STATUS, DBStatus.RW_STATUS.name());
		ZookeeperUtil.createZNode("127.0.0.1:2181", "iddl", "iddl", String.format("/iddl/atom/%s/%s", APP_NAME, DB_KEY_0), json.toString().getBytes());
		
		config.setIp("127.0.0.1");
		config.setPort(3306);
		config.setDbName("test");
		config.setUserName("icommunity");
		config.setPassword("thinkmall");
		config.setDbType(DBType.MYSQL);
		config.setDbStatus(DBStatus.RW_STATUS);
		config.setDriverClassName(DBType.MYSQL.getDriverClassName());
		config.setSorterClassName(DBType.MYSQL.getSorterClassName());
		json = JSONObject.fromObject(config);
		json.put(DataSourceConfig.CONNECTION_PROPERTIES, PropertyUtil.asString(config.getConnectionProperties()));
		json.put(DataSourceConfig.DB_TYPE, DBType.MYSQL.name());
		json.put(DataSourceConfig.DB_STATUS, DBStatus.RW_STATUS.name());
		ZookeeperUtil.createZNode("127.0.0.1:2181", "iddl", "iddl", String.format("/iddl/atom/%s/%s", APP_NAME, DB_KEY_1), json.toString().getBytes());
		
		// Group
		ZookeeperUtil.createZNode("127.0.0.1:2181", "iddl", "iddl", String.format("/iddl/group/%s/%s", APP_NAME, GROUP_KEY), GROUP_CONF.getBytes());
	}
	
	private void stopGateway() {
		server.stop();
	}
	
	private void stopConfigCenter() {
		
	}
}