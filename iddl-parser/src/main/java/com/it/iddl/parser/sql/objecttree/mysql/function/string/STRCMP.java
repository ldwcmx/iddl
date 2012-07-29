/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.string;

import com.it.iddl.parser.sql.function.OperationBeforTwoArgsFunction;

/**
 * 
 * @author sihai
 *
 */
public class STRCMP extends OperationBeforTwoArgsFunction {

	@Override
	public String getFunctionName() {
		return "STRCMP";
	}
}
