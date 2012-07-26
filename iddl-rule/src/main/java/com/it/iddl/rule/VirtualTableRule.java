/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.it.iddl.common.DBType;

/**
 * <p>
 * IDataSource持有所有虚拟表名到该对象的引用
 * tddl-client根据解析/预解析结果取得虚拟表名
 * 根据虚拟表名取得对应的VirtualTableRule对象
 * </p>
 * 
 * @author sihai
 *
 * @param <D>
 * @param <T>
 */
public interface VirtualTableRule<D, T> {

	/**
	 * 库规则链
	 * @return
	 */
	List<Rule<String>> getDatabaseRuleList();
	
	/**
	 * 表规则链
	 * @return
	 */
	List<Rule<String>> getTableRuleList();
	
	/**
	 * 返回本规则实际对应的全部库表拓扑结构
	 * @return key:dbIndex; value:实际物理表名的集合
	 */
	Map<String, Set<String>> getActualTopology();
	
	/**
	 * 
	 * @return
	 */
	Object getOuterContext();
	
	/**
	 * 
	 * @return
	 */
	//public TableSlotMap getTableSlotMap();
	
	/**
	 * 
	 * @return
	 */
	//public DBTableMap getDbTableMap();

	//=========================================================================
	// 规则和其他属性的分割线
	//=========================================================================

	DBType getDbType();

	boolean isAllowReverseOutput();

	boolean isAllowFullTableScan();

	boolean isNeedRowCopy();

	List<String> getUniqueKeys();
	
	public String getTbNamePattern();
}
