/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.List;


/**
 * 
 * @author sihai
 *
 */
public interface Value extends SQLFragment, Comparable {

	/**
	 * 
	 * @return
	 */
	Comparable<?> eval();
	
	/**
	 * 
	 * @param args
	 * @return
	 */
	Comparable<?> getValue(List<Object> args);
}
