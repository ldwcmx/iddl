/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.date;

import com.it.iddl.parser.sql.function.OperationBeforTwoArgsFunction;

/**
 * 
 * @author sihai
 *
 */
public class DateDiff extends OperationBeforTwoArgsFunction {
	
	public String getFunctionName() {
		return "datediff";
	}
}
