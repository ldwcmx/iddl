/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function;

import java.util.HashMap;
import java.util.Map;

import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Current_date;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Day;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Hour;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.IntervalMonth;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.IntervalYear;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Minute;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Second;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Sysdate;

/**
 */
public class MySQLConsistStringRegister {

	public final static MySQLConsistStringRegister register = new MySQLConsistStringRegister();
	
	private  final static Map<String, Class<? extends Function>> consistRegister = new HashMap<String, Class<? extends Function>>();
	
	static{
		consistRegister.put("SYSDATE", Sysdate.class);
		consistRegister.put("CURRENT_DATE", Current_date.class);
		/**
		 * ADD BY JUNYU
		 */
		consistRegister.put("DAY",Day.class);
		consistRegister.put("SECOND",Second.class);
		consistRegister.put("HOUR",Hour.class);
		consistRegister.put("MINUTE", Minute.class);
		
		/**
		 * 这个会导致规则冲突，因为YEAR(),MONTH()函数
		 * 与INTERVAL的YEAR,MONTH文本一致，但是ANTLR
		 * 的look ahead特性可以解决这个冲突，因为YEAR
		 * 函数后面出现的符号是(,INTERVAL的YEAR后不可能
		 * 出现这个符号，反之亦然
		 */
		consistRegister.put("YEAR", IntervalYear.class);
		consistRegister.put("MONTH", IntervalMonth.class);
	}
	public boolean containsKey(String key){
		return  consistRegister.containsKey(key);
	}
	public Function get(String key){
		Function cls=null;
		try {
			if(key==null||key.trim().equals("")){
				throw new IllegalArgumentException("group function不能为空");
			}
			cls=consistRegister.get(key.toUpperCase()).newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);	
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);	
		}
		return cls;
	}
}
