/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.date;

import java.util.HashMap;
import java.util.Map;

import com.it.iddl.parser.sql.function.Function;

/**
 * 
 * @author sihai
 *
 */
public class MySQLDateFuctionMap {
	
	public final static MySQLDateFuctionMap register = new MySQLDateFuctionMap();
	private  final static Map<String, Class<? extends Function>> functionMap = new HashMap<String, Class<? extends Function>>();
	
	static{
		functionMap.put("NOW", Now.class);
		functionMap.put("SYSDATE", Sysdate.class);
		functionMap.put("FROM_DAYS", FromDays.class);
		functionMap.put("TO_DAYS", ToDays.class);
		functionMap.put("CURDATE", Curdate.class);
		functionMap.put("CURTIME", CurTime.class);
		functionMap.put("ADDDATE", AddDate.class);
		functionMap.put("CONVERT_TZ", Convert_tz.class);
		functionMap.put("DATEADD", DateAdd.class);
		functionMap.put("DATEDIFF", DateDiff.class);
		functionMap.put("DAYOFMONTH", DayOfMonth.class);
		functionMap.put("YEAR", Year.class);
		functionMap.put("DAYOFYEAR", DayOfYear.class);
		functionMap.put("MONTH", Month.class);
	}
	
	public boolean containsKey(String key){
		return  functionMap.containsKey(key);
	}
	
	public Function get(String key) {
		Function cls = null;
		try {
			if (key == null || key.trim().equals("")) {
				throw new IllegalArgumentException("group function不能为空");
			}
			cls = functionMap.get(key.toUpperCase()).newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		return cls;
	}
}
