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

import com.it.iddl.parser.sql.function.Avg;
import com.it.iddl.parser.sql.function.Count;
import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.sql.function.Max;
import com.it.iddl.parser.sql.function.Min;
import com.it.iddl.parser.sql.function.Sum;
import com.it.iddl.parser.sql.objecttree.mysql.function.controlflow.If;
import com.it.iddl.parser.sql.objecttree.mysql.function.controlflow.IfNull;
import com.it.iddl.parser.sql.objecttree.mysql.function.controlflow.NullIf;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.AddDate;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Convert_tz;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.CurTime;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Curdate;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.DateAdd;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.DateDiff;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.DayOfMonth;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.DayOfYear;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.FromDays;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Interval;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Month;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Now;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.StrToDate;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Sysdate;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.ToDays;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.Year;
import com.it.iddl.parser.sql.objecttree.mysql.function.string.Concat;
import com.it.iddl.parser.sql.objecttree.mysql.function.string.STRCMP;

/**
 * 
 * @author sihai
 *
 */
public class MySQLFunctionRegister {

	public final static MySQLFunctionRegister register = new MySQLFunctionRegister();
	
	private  final static Map<String, Class<? extends Function>> functionRegister = new HashMap<String, Class<? extends Function>>();
	static{
		//control
		functionRegister.put("IFNULL", IfNull.class);
		functionRegister.put("IF", If.class);
		functionRegister.put("NULLIF", NullIf.class);
		//group 
		functionRegister.put("COUNT", Count.class);
		functionRegister.put("MAX", Max.class);
		functionRegister.put("MIN", Min.class);
		functionRegister.put("AVG", Avg.class);
		functionRegister.put("SUM", Sum.class);
		//date
		functionRegister.put("NOW", Now.class);
		functionRegister.put("SYSDATE", Sysdate.class);
		functionRegister.put("FROM_DAYS", FromDays.class);
		functionRegister.put("TO_DAYS", ToDays.class);
		functionRegister.put("CURDATE", Curdate.class);
		functionRegister.put("CURTIME", CurTime.class);
		functionRegister.put("ADDDATE", AddDate.class);
		functionRegister.put("CONVERT_TZ", Convert_tz.class);
		functionRegister.put("DATEADD", DateAdd.class);
		functionRegister.put("DATEDIFF", DateDiff.class);
		functionRegister.put("DAYOFMONTH", DayOfMonth.class);
		functionRegister.put("YEAR", Year.class);
		functionRegister.put("DAYOFYEAR", DayOfYear.class);
		functionRegister.put("MONTH", Month.class);
		functionRegister.put("STR_TO_DATE", StrToDate.class);
		
		//str
		functionRegister.put("STRCMP", STRCMP.class);
		//后加的，因为有个版本V810没有合并到主干
		functionRegister.put("CONCAT", Concat.class);
		functionRegister.put("INTERVAL",Interval.class);
	}
	public boolean containsKey(String key){
		return  functionRegister.containsKey(key);
	}
	public Function get(String key){
		Function cls=null;
		try {
			if(key==null||key.trim().equals("")){
				throw new IllegalArgumentException("group function不能为空");
			}
			cls=functionRegister.get(key.toUpperCase()).newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);	
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);	
		}
		return cls;
	}
}
