/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common;

import java.util.Calendar;
import java.util.Date;

import org.dom4j.Node;

/**
 * 
 * @author sihai
 *
 */
public class Config {

	
	/**
	 * 
	 * @author sihai
	 *
	 */
	public static class Route {
		
		private int size;
		private Route.Expression<?> expression;

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public Route.Expression<?> getExpression() {
			return expression;
		}

		public void setExpression(Route.Expression<?> expression) {
			this.expression = expression;
		}
		
		public static interface Expression<ArgType> {
			/*
			 * @param arg 这个参数是运行时传过来的散库散表字段
			 * @return 运算后的散库散表信息
			 */
			int execute(ArgType arg);
		}
		
		//
		public static abstract class AbstractExpression<ArgType> implements Route.Expression<ArgType> {
			
		}
	}
	
	/*
	 * 这是最原始的不进行任何计算直接作为分库分表信息
	 */
	public static class SimpleExpression extends Route.AbstractExpression<Integer> {
		public int execute(Integer arg) {
			return arg;
		}
	}
	
	/*
	 * 取模运算
	 */
	public static class ModExpression extends Route.AbstractExpression<Integer> {

		private int arg0;

		ModExpression(int arg0) {
			this.arg0 = arg0;
		}

		public int execute(Integer arg) {
			return arg % arg0;
		}
	}
	
	/*
	 * 
	 */
	public static class DayOfYear extends Route.AbstractExpression<Date> {

		public int execute(Date arg) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(arg);
			int dayofyear = cal.get(Calendar.DAY_OF_YEAR);
			return dayofyear;
		}
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	public static class DayOfMonth extends Route.AbstractExpression<Date> {
		public int execute(Date arg) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(arg);
			return cal.get(Calendar.DAY_OF_MONTH);
		}
	}
	
	public static class DayOfWeek extends Route.AbstractExpression<Date> {
		public int execute(Date arg) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(arg);
			return cal.get(Calendar.DAY_OF_WEEK);
		}
	}
	public static class DayOfWeek_sun_is_7 extends Route.AbstractExpression<Date> {
		public int execute(Date arg) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(arg);
			int ret = cal.get(Calendar.DAY_OF_WEEK)-1;
			if(ret == 0){
				ret = 7;
			}
			return ret;
		}
	}

	public static class MonthOfYear extends Route.AbstractExpression<Date> {
		public int execute(Date arg) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(arg);
			return cal.get(Calendar.MONTH);
		}
	}
	
	public static class MonthOfYear_JanuaryIs1 extends Route.AbstractExpression<Date> {
		public int execute(Date arg) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(arg);
			return cal.get(Calendar.MONTH) + 1;
		}
	}
	
	/**
	 * 
	 */
	public static class ExpressionFactory {
		
		static Route.Expression<?> create(Node node) throws Config.ConfigException {
			if(node == null) {
				return new SimpleExpression();
			} else if ("mod".equals(node.getName())) {
				try {
					return new ModExpression(Integer.parseInt(node.getText()));
				} catch (NumberFormatException e) {
					throw new Config.ConfigException(e);
				}
			} else if ("dayofyear".equals(node.getName())) {
				return new DayOfYear();
			} else if ("dayofmonth".equals(node.getName())) {
				return new DayOfMonth();
			} else if ("dayofweek".equals(node.getName())) {
				return new DayOfWeek();
			} else if ("monthofyear".equals(node.getName())) {
				return new MonthOfYear();
			} else if("dayofweek-sun-is-7".equals(node.getName())){
				return new DayOfWeek_sun_is_7();
			} else if("monthofyear-january-is-1".equals(node.getName())) {
				return new MonthOfYear_JanuaryIs1();
			} else {
				throw new Config.ConfigException();
			}
		}
	}
	
	/**
	 * 
	 */
	public static class ConfigException extends Exception {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -7942709930208078160L;

		public ConfigException() {
			super();
		}
		
		public ConfigException(Throwable t) {
			super(t);
		}

		public ConfigException(String msg) {
			super(msg);
		}
		
		public ConfigException(String msg, Throwable t) {
			super(msg, t);
		}
	}
}
