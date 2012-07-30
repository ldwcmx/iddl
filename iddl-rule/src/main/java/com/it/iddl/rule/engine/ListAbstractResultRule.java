/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine;

import java.util.Map;
import java.util.Set;

import com.it.iddl.rule.ExtralParameterContext;
import com.it.iddl.rule.Field;
import com.it.iddl.rule.SamplingField;
import com.it.iddl.rule.sql.Comparative;

/**
 * 
 * @author sihai
 *
 */
public abstract class ListAbstractResultRule extends AbstractRule {

	public abstract Map<String/* column */, Field> eval(Map<String, Comparative> sharedValueElementMap, ExtralParameterContext extralParameterContext);

	public abstract Map<String/* 结果的值 */, Field> evalElement(Map<String, Set<Object>> enumeratedMap, ExtralParameterContext extralParameterContext);
	
	/**
	 * 得到描点参数值
	 * @param argumentsMap
	 * @return
	 */
	public abstract Map<String, Set<Object>> prepareEnumeratedMap(Map<String, Comparative> argumentsMap);
	
	/**
	 * 针对多column,多value的规则计算
	 * @param samplingField
	 * @param extraParameterContext
	 * @return
	 */
	public abstract ResultAndMappingKey evalueateSamplingField(SamplingField samplingField, ExtralParameterContext extralParameterContext);
	
	/**
	 * 针对单column,单value的规则计算
	 * @param column
	 * @param value
	 * @param extraParameterContext
	 * @return
	 */
	public abstract ResultAndMappingKey evalueateSimpleColumAndValue(String column,Object value, ExtralParameterContext extralParameterContext);
}
