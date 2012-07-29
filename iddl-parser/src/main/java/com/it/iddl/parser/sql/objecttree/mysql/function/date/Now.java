/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.date;

import java.util.Date;
import java.util.List;

import com.it.iddl.parser.sql.function.NoArgFunction;

/**
 * 
 * @author sihai
 *
 */
public class Now extends NoArgFunction {

	@Override
	public String getFunctionName() {
		return "now";
	}

	@Override
	public Comparable<?> getValue(List<Object> args) {
		return new Date();
	}
}
