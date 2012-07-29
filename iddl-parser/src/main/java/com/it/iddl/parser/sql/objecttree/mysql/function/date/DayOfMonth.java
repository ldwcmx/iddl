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

import com.it.iddl.parser.sql.function.OneArgFunction;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class DayOfMonth extends OneArgFunction {

	public String getFunctionName() {
		return "dayofmonth";
	}

	public Comparable<?> getValue(List<Object> args) {
		Comparable<?> days=Utils.getVal(args, arg1);
		if(days instanceof java.util.Date){
			Calendar cal=Calendar.getInstance();
			cal.setTime(((java.util.Date) days));
			return cal.get(Calendar.DAY_OF_MONTH);
		}else{
			throw new IllegalArgumentException("from days 只支持int型的参数");
		}
	}
}
