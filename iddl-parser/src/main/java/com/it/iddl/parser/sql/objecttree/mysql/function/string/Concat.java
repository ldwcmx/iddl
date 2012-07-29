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
public class Concat extends OperationBeforTwoArgsFunction {
	
	@Override
	public String getFunctionName() {
		return "CONCAT";
	}
}