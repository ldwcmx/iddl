/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.function;

import java.util.List;

import com.it.iddl.parser.sql.objecttree.Value;

/**
 * 
 * @author sihai
 *
 */
public interface Function extends Value {

	/**
	 * 
	 * @return
	 */
	String getFunctionName();
	
	/**
	 * 
	 * @param valueList
	 */
	void setValue(List<Object> valueList);
	
	/**
	 * 获得在函数中的列名，如果有两个参数都为列名则抛出异常
	 * @return	the column name in function,
	 * 		 null if no nestedColName
	 */
	String getNestedColumnName();
}
