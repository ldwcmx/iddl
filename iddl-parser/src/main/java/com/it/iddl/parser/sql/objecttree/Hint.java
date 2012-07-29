/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public interface Hint extends SQLFragment {

	/**
	 * 
	 * @return
	 */
	public List<String> getArgumentList();
}
