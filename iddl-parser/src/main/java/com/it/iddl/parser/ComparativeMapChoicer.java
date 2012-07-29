/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser;

import java.util.List;
/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
import java.util.Map;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.Comparative;

/**
 * 
 * @author sihai
 *
 */
public interface ComparativeMapChoicer {

	/**
	 * 根据PartinationSet 获取列名和他对应值的map.
	 * @param arguments
	 * @param partnationSet
	 * @return
	 */
	Map<String, Comparative> getColumnsMap(List<Object> arguments, Set<String> partnationSet);
	
	/**
	 * 
	 * @param arguments
	 * @param columnName
	 * @return
	 */
	Comparative getColumnComparative(List<Object> arguments, String columnName);
}
