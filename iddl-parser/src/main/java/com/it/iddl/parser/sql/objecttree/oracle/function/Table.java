/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.function;

import java.util.List;

import com.it.iddl.parser.sql.function.OneArgFunction;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class Table extends OneArgFunction {

	@Override
	public String getFunctionName() {
		return "TABLE";
	}

	@Override
	public Comparable<?> getValue(List<Object> args) {
		return Utils.getVal(args,arg1);
	}
}
