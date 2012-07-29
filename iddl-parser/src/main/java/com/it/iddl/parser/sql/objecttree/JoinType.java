/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

/**
 * 
 * @author sihai
 *
 */
public enum JoinType {

	/**
	*内连接
	*/
	INNER
	,/**
	* 左外连接
	*/
	LEFT,
	LEFT_OUTER,
	/**
	 * 右外连接
	 */
	RIGHT,
	RIGHT_OUTER,
	
	/**
	 * 全连接
	 */
	
	FULL,
	FULL_OUTER,
	/**
	 * 这个暂时没用过
	 */
	UNION,
	/**
	 * 交叉连接
	 */
	CROSS;
}
