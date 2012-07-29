/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.function;

import java.util.List;

import com.it.iddl.parser.sql.function.ThreeArgsFunction;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class SubStr extends ThreeArgsFunction {

	@Override
	public String getFunctionName() {
		return "SUBSTR";
	}
	
	@Override
	public Comparable<?> getValue(List<Object> args) {
		Object obj = null;
		String returnStr;
		try {
			obj=Utils.getVal(args, arg1);
			String temp=(String)obj;
			returnStr = temp.substring(Integer.valueOf(arg2.toString()) , Integer.valueOf(arg3.toString()));
		} catch (ClassCastException e) {
			throw new IllegalArgumentException("错误的转换函数，"+obj+"该参数必须为String");
		}
		return returnStr;
	}
}
