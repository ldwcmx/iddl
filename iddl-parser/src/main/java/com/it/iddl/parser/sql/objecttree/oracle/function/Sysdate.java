/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.function;

import java.util.Date;
import java.util.List;

import com.it.iddl.parser.sql.function.Constant;

/**
 * 
 * @author sihai
 *
 */
public class Sysdate extends Constant {

	@Override
	public String getFunctionName() {
		return "SYSDATE";
	}

	public Comparable<?> getValue(List<Object> args) {
		return new Date();
	}
}
