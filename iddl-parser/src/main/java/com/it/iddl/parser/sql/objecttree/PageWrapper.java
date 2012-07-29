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
 * 
 * @author sihai
 *
 */
public interface PageWrapper {

	/**
	 * 
	 * @param limitFrom
	 * @param limitTo
	 * @param changeParameter
	 */
	void modifyParam(Number limitFrom, Number limitTo, Map<Integer, Object> changeParameter);
	
	/**
	 * 
	 * @param limitFrom
	 * @param limitTo
	 * @return
	 */
	String getSQLReturn(Number limitFrom, Number limitTo); 
	
	/**
	 * 
	 * @return
	 */
	Integer getIndex();
	
	/**
	 * 
	 * @return
	 */
	boolean canBeChange();
	
	/**
	 * 
	 * @return
	 */
	Number getValue();
}
