/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.Map;

/**
 * select |column| from
 * 
 * @author sihai
 *
 */
public interface Column extends SQLFragment {
	/**
	 * 
	 * @return
	 */
	String getColumn() ;
	
	/**
	 * 
	 * @return
	 */
	String getTable() ;
	
	/**
	 * 
	 * @return
	 */
	String getAlias() ;
	
	/**
	 * 
	 * @param aliasMap
	 */
	void setAliasMap(Map<String, SQLFragment> aliasMap);
	
	/**
	 * 
	 * @return
	 */
	Class getNestClass();
}
