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
import com.it.iddl.parser.sql.objecttree.LessThan;

/**
 * 
 * @author sihai
 *
 */
public class OracleTo extends OraclePageWrapper {
	
	private int add = 0;

	public OracleTo(ComparableExpression comp) {
		super(comp);
		if(comparableExpression instanceof LessThan) {
			add = 1;
		}
	}
	

	public String getSQLReturn(Number skip, Number max) {
		if(max instanceof Long){
			return ((Long)((Long)max + add)).toString();
		}else if(max instanceof Integer){
			return ((Integer)((Integer)max + add)).toString();
		}else{
			throw new IllegalArgumentException("ֻ֧只支持int long的情况");
		}
	}

	public void modifyParam(Number skip, Number max,
			Map<Integer, Object> modifiedMap) {
		Object obj=null;
		if(max instanceof Long){
			obj=(Long)max + add;
		}else if(max instanceof Integer){
			obj=(Integer)max + add;
		}else{
			throw new IllegalArgumentException("ֻ֧只支持int long的情况");
		}
		modifiedMap.put(((BindVar)comparableExpression.getRight()).getIndex(), obj);
	}
}
