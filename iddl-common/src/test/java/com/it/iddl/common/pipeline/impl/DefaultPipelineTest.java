/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.pipeline.impl;

import java.sql.SQLException;

import org.junit.Test;

import com.it.iddl.common.pipeline.DataBus;
import com.it.iddl.common.pipeline.Handler;

public class DefaultPipelineTest {

	@Test
	public void test() throws SQLException {
		DefaultPipeline pipeline = new DefaultPipeline();
		String name = null;
		
		// test add head
		for(int i = 0; i < 100; i++) {
			name = String.format("handler_%d", i);
			pipeline.addHead(name, new TestHandler(name));
		}
		
		pipeline.startFlow(new TestDataBus());
		
		System.out.println("----------------------------------------------");
		pipeline.reset();
		// test add head
		for(int i = 0; i < 100; i++) {
			name = String.format("handler_%d", i);
			pipeline.addTail(name, new TestHandler(name));
		}
		
		pipeline.startFlow(new TestDataBus());
		
		System.out.println("----------------------------------------------");
		pipeline.reset();
		// test add head
		for(int i = 0; i < 100; i++) {
			name = String.format("handler_%d", i);
			pipeline.addTail(name, new TestHandler(name));
		}
		
		for(int i = 0; i < 100; i+=2) {
			name = String.format("handler_%d", i);
			pipeline.remove(name);
		}
		
		pipeline.startFlow(new TestDataBus());
	}

	/**
	 * 
	 * @author sihai
	 *
	 */
	private class TestHandler implements Handler {
		
		private String name;
		
		public TestHandler(String name) {
			this.name = name;
		}
		
		@Override
		public void handleDown(DataBus dataBus) throws SQLException {
			System.out.println(String.format("%s handleDown", name));
		}
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	private class TestDataBus implements DataBus {

		@Override
		public void registerPluginContext(String name, Object context) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removePluginContext(String name) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object getPluginContext(String name) {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
