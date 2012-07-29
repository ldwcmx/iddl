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
public interface HintSetter extends Hint {
	
	/**
	 * 
	 * @param args
	 */
	void addHint(List<String> args);
}
