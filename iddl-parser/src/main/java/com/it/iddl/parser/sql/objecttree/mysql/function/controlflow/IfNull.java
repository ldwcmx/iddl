/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.controlflow;

import com.it.iddl.parser.sql.function.OperationBeforTwoArgsFunction;

/**
 * 
 * @author sihai
 *
 */
public class IfNull extends OperationBeforTwoArgsFunction{

	public String getFunctionName() {
		return "ifnull";
	}
}
