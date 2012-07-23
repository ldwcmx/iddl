/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common;

/**
 * ThreadLocal变量名
 * @author sihai
 *
 */
public interface ThreadLocalConstants {

	String ROUTE_CONDITION = "ROUTE_CONDITION";
	
	String IS_EXIST_QUITE = "IS_EXIST_QUITE";
	
	String DB_SELECTOR = "DB_SELECTOR";
	
	/**
	 * 指定在哪个规则上执行
	 */
	String RULE_SELECTOR = "RULE_SELECTOR";
	
	/**
	 * 让GroupDataSource在指定序号的DATASOURCE上执行操作
	 */
	String DATASOURCE_INDEX = "DATASOURCE_INDEX";
	
	String TABLE_MERGE_SORT_TABLENAME = "TABLE_MERGE_SORT_TABLENAME";
	
	String TABLE_MERGE_SORT_POOL = "TABLE_MERGE_SORT_POOL";
	
	String TABLE_MERGE_SORT_VIRTUAL_TABLE_NAME = "TABLE_MERGE_SORT_VIRTUAL_TABLE_NAME";
	
	/**
	 * 指定是否使用并行执行
	 */
	String PARALLEL_EXECUTE = "PARALLEL_EXECUTE";
}
