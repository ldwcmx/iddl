/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.function;

/**
 * select group_function from table where xxx
 * 
 * @author sihai
 *
 */
public enum GroupFunctionType {
	MIN,
	MAX,
	COUNT,
	AVG,
	SUM,
	/**
	 * 非以上的任何一种情况 
	 */
	NORMAL
}
