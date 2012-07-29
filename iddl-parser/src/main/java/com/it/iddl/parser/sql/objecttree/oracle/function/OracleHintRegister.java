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

import com.it.iddl.parser.sql.objecttree.HintSetter;
import com.it.iddl.parser.sql.objecttree.oracle.hint.Index;
import com.it.iddl.parser.sql.objecttree.oracle.hint.Ordered;
import com.it.iddl.parser.sql.objecttree.oracle.hint.UseNL;

/**
 * 
 * @author sihai
 *
 */
public class OracleHintRegister {
	
	public final static OracleHintRegister register = new OracleHintRegister();
	private  final static Map<String, Class<? extends HintSetter>> functionRegister =new HashMap<String, Class<? extends HintSetter>>();
	static{
		//control
		functionRegister.put("USE_NL", UseNL.class);
		functionRegister.put("ORDERED", Ordered.class);
		functionRegister.put("INDEX", Index.class);
		
	}
	
	public boolean containsKey(String key){
		return  functionRegister.containsKey(key);
	}
	
	public HintSetter get(String key){
		HintSetter cls = null;
		try {
			if(key==null||key.trim().equals("")){
				throw new IllegalArgumentException("group function不能为空");
			}
			cls = functionRegister.get(key.toUpperCase()).newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);	
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);	
		}
		return cls;
	}
}
