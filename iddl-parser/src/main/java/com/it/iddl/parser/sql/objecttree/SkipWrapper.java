/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.Map;

/**
 * 
 * @author sihai
 *
 */
public class SkipWrapper extends PageWrapperCommon {

	public SkipWrapper(Object val) {
		super(val);
	}

	public String getSQLReturn(Number skip, Number max) {
		if(skip instanceof Long){
			return String.valueOf(((Long)skip).longValue());
		}else if(skip instanceof Integer){
			return String.valueOf(((Integer)skip).intValue());
		}else{
			throw new IllegalArgumentException("只支持int long的情况");
		}
	}

	public void modifyParam(Number skip, Number max, Map<Integer, Object> changeParam) {

		Object obj=null;
		if(skip instanceof Long){
			obj=(Long)skip;
		}else if(skip instanceof Integer){
			obj=(Integer)skip;
		}else{
			throw new IllegalArgumentException("只支持int long的情况");
		}
		changeParam.put(index, obj);
	}
}
