/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config;

import junit.framework.TestCase;

import org.junit.Test;

import com.it.iddl.config.factory.ConfigManagerFactory;
import com.it.iddl.config.listener.AbstractConfigListener;

/**
 * 
 * @author sihai
 *
 */
public class ZookeeperConfigManagerTest extends TestCase {

	private static final String APP_NAME = "testApp";
	private static final String DB_KEY = "testDB";
	
	@Test
	public void test() throws Exception {
		ConfigManager configManger = ConfigManagerFactory.newConfigManagerInstance("http://www.google.com");
		String configId = configManger.makeAtomConfigId(APP_NAME, DB_KEY);
		String value = configManger.getConfigValue(configId);
		System.out.println(String.format("value:%s for configId:%s", value, configId));
		configManger.getConfigValue(configId, new AbstractConfigListener() {

			@Override
			public void changed(String newValue) {
				System.out.println(String.format("Config change, configId:%s, newValue:%s", getConfigId(), newValue));
			}
		});
		
		Thread.sleep(1000 * 60 * 5);
	}
}
