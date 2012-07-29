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

import com.it.iddl.parser.sql.function.Function;

/**
 * 
 * @author sihai
 *
 */
public class OracleConsistStringRegister {
	
	public final static OracleConsistStringRegister register = new OracleConsistStringRegister();
	private  final static Map<String, Class<? extends Function>> consistRegister=new HashMap<String, Class<? extends Function>>();
	
	static{
		consistRegister.put("SYSDATE",Sysdate.class);
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
