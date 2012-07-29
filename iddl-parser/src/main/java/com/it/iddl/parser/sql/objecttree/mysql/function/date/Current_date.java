/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.date;

import java.util.Date;
import java.util.List;

import com.it.iddl.parser.sql.function.Constant;

/**
 * 
 * @author sihai
 *
 */
public class Current_date extends Constant {
	
	@Override
	public String getFunctionName() {
		return "current_date";
	}

	public Comparable<?> getValue(List<Object> args) {
		return new Date();
	}
}
