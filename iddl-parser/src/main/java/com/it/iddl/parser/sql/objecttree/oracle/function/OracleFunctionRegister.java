/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.function;


import java.util.HashMap;
import java.util.Map;

import com.it.iddl.parser.sql.function.Avg;
import com.it.iddl.parser.sql.function.Count;
import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.sql.function.Max;
import com.it.iddl.parser.sql.function.Min;
import com.it.iddl.parser.sql.function.Sum;

/**
 * 
 * @author sihai
 *
 */
public class OracleFunctionRegister {
	
	public final static OracleFunctionRegister register = new OracleFunctionRegister();
	private  final static Map<String, Class<? extends Function>> functionRegister=new HashMap<String, Class<? extends Function>>();
	static{
		////有一个比较特殊的函数是写死在里面的，就是cast
		//group 
		functionRegister.put("COUNT", Count.class);
		functionRegister.put("MAX", Max.class);
		functionRegister.put("MIN", Min.class);
		functionRegister.put("AVG", Avg.class);
		functionRegister.put("SUM",Sum.class);
		
		//table
		functionRegister.put("TABLE", Table.class);
		//taobao spec
		functionRegister.put("STR2VARLIST",Str2VarList.class);
		functionRegister.put("STR2NUMLIST",Str2NumList.class);
		
		//common
		functionRegister.put("BITOR", OracleBitOr.class);
		functionRegister.put("BITAND", OracleBitAnd.class);
		functionRegister.put("NVL",NVL.class);
		functionRegister.put("TRUNC", Trunc.class);
		functionRegister.put("LAST_DAY", LastDay.class);
		functionRegister.put("CONCAT",Concat.class);

		functionRegister.put("TO_DATE", ToDate.class);
		functionRegister.put("TO_CHAR", ToChar.class);
		functionRegister.put("SUBSTR", SubStr.class);
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
	
	@Override
	public String toString() {
		return "OracleFunctionRegister ["+functionRegister+"]";
	}
}
