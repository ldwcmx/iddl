/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom;

import junit.framework.TestCase;

import org.junit.Test;

import com.it.iddl.config.ConfigManager;
import com.it.iddl.config.ConfigServerType;

/**
 * 
 * @author sihai
 *
 */
public class DynamicAtomDataSourceTest extends TestCase {

	private static final String APP_NAME = "testApp";
	private static final String DB_KEY = "testDB";
	
	@Test
	public void test() throws Exception {
		DynamicAtomDataSource ds = new DynamicAtomDataSource();
		ds.setAppName(APP_NAME);
		ds.setDbKey(DB_KEY);
		ds.setConfigServerType(ConfigServerType.CONFIG_SERVER_ZOOKEEPER.value());
		ds.setConfigServerHost(ConfigManager.DEFAULT_CONFIG_SERVER_ZOOKEEPER_HOST);
		ds.setConfigServerPort(ConfigManager.DEFAULT_CONFIG_SERVER_ZOOKEEPER_PORT);
		
		ds.init();
	}
}
