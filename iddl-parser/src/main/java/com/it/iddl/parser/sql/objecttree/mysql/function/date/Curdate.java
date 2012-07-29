/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.date;

import com.it.iddl.parser.sql.function.NoArgFunction;

/**
 * 
 * @author sihai
 *
 */
public class Curdate extends NoArgFunction {
	
	public String getFunctionName() {
		return "curdate";
	}
}
