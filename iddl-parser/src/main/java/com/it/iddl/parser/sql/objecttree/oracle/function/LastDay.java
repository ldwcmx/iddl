/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.function;

import com.it.iddl.parser.sql.function.OneArgFunction;

public class LastDay extends OneArgFunction {

	@Override
	public String getFunctionName() {
		return "LAST_DAY";
	}
}
