/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.sql;

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
	Comparable<?> getVal(List<Object> args);
}
