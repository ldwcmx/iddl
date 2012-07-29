/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.output.handler.impl;

import java.util.Map;

import com.it.iddl.parser.sql.objecttree.PageWrapper;

/**
 * 
 * @author sihai
 *
 */
public class RangePlaceHandler implements ReplaceHandler {

	protected Number skip;
	protected Number max;
	
	public RangePlaceHandler() {}
	
	public RangePlaceHandler(Number skip, Number max) {
		super();
		this.skip = skip;
		this.max = max;
	}
	
	public String changeValue(PageWrapper pageWrapper, Map<Integer, Object> changeParameterMap){
		Integer index = pageWrapper.getIndex();
		boolean canBeChanged = pageWrapper.canBeChange();
		Number value = pageWrapper.getValue();
		if(index!=null){
			if(canBeChanged){
				pageWrapper.modifyParam(skip, max, changeParameterMap);
			}
			return "?";
		}else if(value!= null){
			if(canBeChanged){
				String temp = pageWrapper.getSQLReturn(skip,max);
				if(temp == null){
					return value.toString();
				}else{
					return temp;
				}
			}else{
				return value.toString();
			}
		}else{
			throw new IllegalStateException("不应该出现没有值直接写在sql,但也没有index的情况");
		}
	}
}
