/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.date;

import java.util.List;

import com.it.iddl.parser.sql.function.OneArgFunction;
import com.it.iddl.parser.sql.objecttree.mysql.function.MySQLFunctionUtils;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class FromDays extends OneArgFunction{

	public String getFunctionName() {
		return "from_days";
	}

	public Comparable<?> getVal(List<Object> args) {
		Comparable<?> days = Utils.getVal(args, arg1);
		if (days instanceof Integer) {
			return MySQLFunctionUtils.fromDays((Integer) days);
		} else {
			throw new IllegalArgumentException("from days 只支持int型的参数");
		}
	}
}
