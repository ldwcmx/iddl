/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.function;

import com.it.iddl.parser.sql.function.OperationBeforTwoArgsFunction;

/**
 * 
 * @author sihai
 *
 */
public class OracleBitOr extends OperationBeforTwoArgsFunction {

	@Override
	public String getFunctionName() {
		return "BITOR";
	}
}
