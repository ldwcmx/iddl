/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.date;

import java.util.Calendar;
import java.util.List;

import com.it.iddl.parser.sql.function.Constant;

/**
 * 
 * @author sihai
 *
 */
public class IntervalYear extends Constant {
	
	@Override
	public String getFunctionName() {
		return " year ";
	}

	@Override
	public Comparable<?> getValue(List<Object> args) {
		return Calendar.YEAR;
	}
}
