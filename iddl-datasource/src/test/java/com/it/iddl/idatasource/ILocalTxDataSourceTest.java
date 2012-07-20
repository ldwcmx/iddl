package com.it.iddl.idatasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import junit.framework.TestCase;

import org.junit.Test;

import com.it.iddl.idatasource.ILocalTxDataSource;

/**
 * 
 * @author sihai
 *
 */
public class ILocalTxDataSourceTest extends TestCase {
	
	@Test
	public void test() throws Exception {
		ILocalTxDataSource ds = new ILocalTxDataSource();
		ds.setName("icommunity_db");
		ds.init();
		Connection connection = null;
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
}
