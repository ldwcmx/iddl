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
public class BitAnd extends OperationBetweenTwoArgsFunction {

	@Override
	public String getFunctionName() {
		return "&";
	}
}
