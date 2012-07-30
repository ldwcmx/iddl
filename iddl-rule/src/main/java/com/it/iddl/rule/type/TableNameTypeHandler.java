/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.type;

import java.util.Collection;
import java.util.List;

import com.it.iddl.rule.engine.entry.TableRule;

/**
 * 
 * @author sihai
 *
 */
public interface TableNameTypeHandler {

	/**
	 * 
	 * @param xxxfixes
	 * @param tableRule
	 * @param vtable
	 * @return
	 */
	List<String> buildPhysicTable(List<Object> xxxfixes, TableRule tableRule, String vtable);

	/**
	 * 
	 * @param xxxfixInt
	 * @param tableRule
	 * @param vtable
	 * @return
	 */
	String buildOnePhsicTable(Object xxxfixInt, TableRule tableRule, String vtable);

	/**
	 * 
	 * @param collection
	 * @param step
	 * @param vTable
	 * @param rStart
	 * @param rEnd
	 * @param padding
	 * @param placeholderbit
	 * @return
	 */
	Collection<String> buildAllPassableTable(Collection<String> collection, int step, String vTable, int rStart, int rEnd, String padding, int placeholderbit);
	
	/**
	 * 
	 * @param collection
	 * @param step
	 * @param step2
	 * @param vTab
	 * @param rStart
	 * @param sStart
	 * @param rEnd
	 * @param sEnd
	 * @param padding
	 * @param placeholderbit
	 * @return
	 */
	Collection<String> buildAllPassableTable(Collection<String> collection, int step, int step2, String vTab, int rStart, int sStart, int rEnd, int sEnd, String padding, int placeholderbit);
}
