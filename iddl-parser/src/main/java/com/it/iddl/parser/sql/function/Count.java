/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.function;

/**
 * 
 * @author sihai
 *
 */
public class Count extends OneArgFunction {

	@Override
	public String getFunctionName() {
		return "count";
	}
}
