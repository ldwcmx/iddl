/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle;

import java.util.Map;

import com.it.iddl.parser.sql.objecttree.BindVar;
import com.it.iddl.parser.sql.objecttree.ComparableExpression;
import com.it.iddl.parser.sql.objecttree.GreaterThanOrEquivalent;

/**
 * 
 * @author sihai
 *
 */
public class OracleFrom extends OraclePageWrapper {
	
	private int add = 0;
	
	public OracleFrom(ComparableExpression comp) {
		super(comp);
		if(comparableExpression instanceof GreaterThanOrEquivalent) {
			add = 1;
		}
	}

	public void modifyParam(Number skip, Number max,Map<Integer, Object> changeParam) {
		Object obj=null;
		if(skip instanceof Long){
			obj=(Long)skip + add;
		}else if(skip instanceof Integer){
			obj=(Integer)skip + add;
		}else{
			throw new IllegalArgumentException("ֻ֧只支持int long的情况");
		}
		changeParam.put(((BindVar)comparableExpression.getRight()).getIndex(), obj);
	}
	
	public String getSQLReturn(Number skip, Number max) {
		if(skip instanceof Long){
			return ((Long)((Long)skip + add)).toString();
		}else if(skip instanceof Integer){
			return ((Integer)((Integer)skip + add)).toString();
		}else{
			throw new IllegalArgumentException("ֻ֧只支持int long的情况");
		}
	}

}
