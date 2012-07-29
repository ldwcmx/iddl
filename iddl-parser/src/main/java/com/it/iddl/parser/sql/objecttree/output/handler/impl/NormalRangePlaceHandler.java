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
public class NormalRangePlaceHandler extends RangePlaceHandler {

	public NormalRangePlaceHandler(Number skip, Number max) {
		super(skip, max);
	}
	public NormalRangePlaceHandler() {
		super();
	}

	@Override
	public String changeValue(PageWrapper pageWrapper, Map<Integer, Object> changeParameterMap) {
		Integer index = pageWrapper.getIndex();
		Number value = pageWrapper.getValue();
		if (index != null) {
			return "?";
		} else if (value != null) {
			return value.toString();
		} else {
			throw new IllegalStateException("不应该出现没有值直接写在sql,但也没有index的情况");
		}
	}
}
