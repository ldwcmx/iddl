/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.function;

import com.it.iddl.parser.sql.function.OperationBeforOneOrTwoArgsFunction;


/**
 * 
 * @author sihai
 *
 */
public class Trunc extends OperationBeforOneOrTwoArgsFunction {

	@Override
	public String getFunctionName() {
		return "TRUNC";
	}
}
