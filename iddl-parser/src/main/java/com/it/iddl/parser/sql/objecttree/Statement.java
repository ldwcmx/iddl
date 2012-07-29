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
public interface Statement extends SQLFragment {

	/**
	 * 
	 * @return
	 */
	boolean isDML();
}
