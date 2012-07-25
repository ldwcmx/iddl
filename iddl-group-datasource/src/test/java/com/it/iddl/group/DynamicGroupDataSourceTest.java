/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group;

import org.junit.Test;

/**
 * 
 * @author sihai
 *
 */
public class DynamicGroupDataSourceTest {

	private static final String APP_NAME = "testApp";
	private static final String GROUP_KEY = "group1";
	private static final String GATEWAY = "http://www.google.com";
	
	@Test
	public void test() throws Exception {
		DynamicGroupDataSource dgs = new DynamicGroupDataSource();
		dgs.setAppName(APP_NAME);
		dgs.setGroupKey(GROUP_KEY);
		dgs.setGateway(GATEWAY);
		dgs.init();
	}
}