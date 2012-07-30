/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.rule.EmptySetRuntimeException;
import com.it.iddl.rule.ExtralParameterContext;
import com.it.iddl.rule.Field;
import com.it.iddl.rule.SamplingField;
import com.it.iddl.rule.cartesian.CartesianProductCalculator;
import com.it.iddl.rule.engine.util.RuleUtil;
import com.it.iddl.rule.enumerator.Enumerator;
import com.it.iddl.rule.enumerator.EnumeratorImpl;
import com.it.iddl.util.StringUtil;


/**
 * 结果集是一列数的规则
 * 
 * @author sihai
 *
 */
public abstract class CartesianProductBasedListResultRule extends ListAbstractResultRule {

	private final Log logger = LogFactory.getLog(CartesianProductBasedListResultRule.class);
	Enumerator enumerator = new EnumeratorImpl();
	
	/**
	 * 
	 */
	public Map<String/* 结果的值，如db的index或table的index */, Field> eval(
			Map<String, Comparative> argumentsMap,ExtralParameterContext extralParameterContext) {
		Map<String, Set<Object>> enumeratedMap = prepareEnumeratedMap(argumentsMap);// 生成描点集合
		if (logger.isDebugEnabled()) {
			logger.debug("Sampling filed message : " + enumeratedMap);
		}
		Map<String, Field> map = evalElement(enumeratedMap,extralParameterContext);
		decideWhetherOrNotToThrowSpecEmptySetRuntimeException(map);// 决定是否抛出runtimeException
		return map;
	}
	
	/**
	 * 决定是否抛出runtimeException
	 * 
	 * @param map
	 */
	private void decideWhetherOrNotToThrowSpecEmptySetRuntimeException(
			Map<String, Field> map) {
		if ((map == null || map.isEmpty())
				&& ruleRequireThrowRuntimeExceptionWhenSetIsEmpty()) {
			throw new EmptySetRuntimeException();
		}
	}
	
	/**
	 * TODO:这个要提到父类方法中
	 * 
	 * @param argumentsMap
	 * @return
	 */
	public Map<String, Set<Object>> prepareEnumeratedMap(
			Map<String, Comparative> argumentsMap) {
		if (logger.isDebugEnabled()) {
			logger.debug("eval at CartesianProductRule ,param is " + argumentsMap);
		}

		Map<String/* column */, Set<Object>/* 描点 */> enumeratedMap = RuleUtil.getSamplingField(argumentsMap, parameters);
		return enumeratedMap;
	}
	
	/**
	 * 
	 * 真正的计算过程，将列->描点带入规则引擎进行计算，获取最终结果。
	 * 
	 * @param enumeratedMap
	 * @return 返回的map不会为null,但有可能为空的map，如果map不为空，则内部的子map必定不为空。最少会有一个值
	 */
	public Map<String/* 结果的值 */, Field> evalElement(
			Map<String, Set<Object>> enumeratedMap,ExtralParameterContext extralParameterContext) {
		Map<String/* 结果的值 */, Field> map;
		if (enumeratedMap.size() == 1) {
			// 列个数等于一个值不需要进行笛卡尔积
			List<String> columns = new ArrayList<String>(1);
			Set<Object> enumeratedValues = null;
			for (Entry<String, Set<Object>> entry : enumeratedMap.entrySet()) {
				columns.add(entry.getKey());
				enumeratedValues = entry.getValue();
			}
			
			SamplingField samplingField = new SamplingField(columns, 1);
			// 返回值最多也就是与函数的x的个数相对应
			map = new HashMap<String, Field>(enumeratedValues.size());
			// 为计算列赋予列名字段
			for (Object value : enumeratedValues) {
				samplingField.clear();
				samplingField.add(0, value);
				evalOnceAndAddToReturnMap(map, samplingField,
						enumeratedValues.size(),extralParameterContext);
			}
			
			return map;
			
		} else {
			// 多于一个值，需要进行笛卡尔积
			CartesianProductCalculator cartiesianProductCalculator = new CartesianProductCalculator(enumeratedMap);
			/*
			 * 确实很难确定set的大小，但一般来说分库是16个，所以这里就定16个暂时。还有一种可能的考虑是将
			 * capacity设置为最大可能出现的结果。
			 */
			map = new HashMap<String, Field>(16);
			for (SamplingField samplingField : cartiesianProductCalculator) {
				evalOnceAndAddToReturnMap(map, samplingField, 16,extralParameterContext);
			}
			
			return map;
		}
	}

	/**
	 * 如果子规则需要在返回值为null或为空collections时抛出异常，则继承此类后将false变为true即可
	 * 
	 * @return
	 */
	protected boolean ruleRequireThrowRuntimeExceptionWhenSetIsEmpty() {
		return false;
	}

	void evalOnceAndAddToReturnSet(Set<String> set,
			SamplingField samplingField, int valueSetSize) {
		ResultAndMappingKey resultAndMappingKey = evalueateSamplingField(samplingField,null);
		String targetIndex = resultAndMappingKey.result;
		// ODOT:重复判断
		if (targetIndex != null) {
			String[] targets = StringUtil.split(targetIndex, "\\|");
			for (String str : targets) {
				set.add(str);
			}
		} else {
			throw new IllegalArgumentException("规则引擎的结果不能为null");
		}
	}

	/**
	 * 对一个数据进行计算
	 * 
	 * 只有在数据计算获取了值的时候才会将对应该值获取的列和定义域内的值放入map中。
	 * 
	 * @param map
	 * @param samplingField
	 * @param valueSetSize
	 * @Test 这个方法在TairBasedMappingRule的集成测试和单元测试里都有
	 */
	void evalOnceAndAddToReturnMap(Map<String/* 结果的值 */, Field> map,
			SamplingField samplingField, int valueSetSize, ExtralParameterContext extralParameterContext) {
		ResultAndMappingKey returnAndMappingKey = evalueateSamplingField(samplingField,extralParameterContext);
		if (returnAndMappingKey != null) {
			String[] targets = StringUtils.split(returnAndMappingKey.result,
			"\\|");
			for (String target : targets) {
				List<String> lists = samplingField.getColumns();
				List<Object> values = samplingField.getEnumFields();
				
				Field colMap = prepareColumnMap(map, samplingField, target,returnAndMappingKey);
				
				int index = 0;
				for (String column : lists) {
					Object value = values.get(index);
					Set<Object> set = prepareEnumeratedSet(valueSetSize,
							colMap, column);
					set.add(value);
					index++;
				}
			}
			
		}
	}

	private Set<Object> prepareEnumeratedSet(int valueSetSize, Field colMap,
			String column) {
		// sourcekey 初始化以后就内部的set就一直存在
		Set<Object> set = colMap.sourceKeys.get(column);
		if (set == null) {
			set = new HashSet<Object>(valueSetSize);
			colMap.sourceKeys.put(column, set);
		}
		return set;
	}

	private Field prepareColumnMap(Map<String, Field> map,
			SamplingField samplingField, String targetIndex,ResultAndMappingKey returnAndMappingKey) {
		Field colMap = map.get(targetIndex);
		if (colMap == null) {
			int size = samplingField.getColumns().size();
			colMap = new Field(size);
			map.put(targetIndex, colMap);
		}

		if (returnAndMappingKey.mappingTargetColumn != null&&colMap.mappingTargetColumn == null) {
			colMap.mappingTargetColumn = returnAndMappingKey.mappingTargetColumn;
		}
		if (returnAndMappingKey.mappingKey != null) {
			if(colMap.mappingKeys == null){
				colMap.mappingKeys = new HashSet<Object>();
			}
			colMap.mappingKeys.add(returnAndMappingKey.mappingKey);
		}

		return colMap;
	}

	/**
	 * 根据一组参数，计算出一个结果
	 * 
	 * @return 通过规则的结果可能在以下情况下为null: 映射规则原规则存在，但映射后的目标不存在，会返回null。 其余时刻，会抛异常
	 * 
	 */
	public abstract ResultAndMappingKey evalueateSamplingField(
			SamplingField samplingField,ExtralParameterContext extralParameterContext);

}
