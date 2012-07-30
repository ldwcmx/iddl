/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.type;

import java.util.HashMap;
import java.util.Map;

import com.it.iddl.common.exception.runtime.CantFindTargetTabRuleTypeHandlerException;
import com.it.iddl.rule.TableRuleType;

/**
 * 
 * @author sihai
 *
 */
public class TableNameTypeRegister {

	private static final Map<TableRuleType,TableNameTypeHandler> handler=new HashMap<TableRuleType, TableNameTypeHandler>();
	
	static{
		handler.put(TableRuleType.PREFIX, new PrefixTypeHandler());
		handler.put(TableRuleType.SUFFIX, new SuffixTypeHandler());
	}
	
	public static TableNameTypeHandler getTableNameHandler(TableRuleType type){
		if(type==null){
			throw new IllegalArgumentException("未输入TableRuleType");
		}
		TableNameTypeHandler tHandler=handler.get(type);
		if(tHandler==null){
			throw new CantFindTargetTabRuleTypeHandlerException(type.toString());
		}
		return tHandler;
	}
}
