/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.controlflow;

import com.it.iddl.parser.sql.function.ThreeArgsFunction;

/**
 * 
 * @author sihai
 *
 */
public class If extends ThreeArgsFunction {

	@Override
	public String getFunctionName() {
		return "if";
	}
}
