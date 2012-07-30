/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.rule.AdvancedParameter;
import com.it.iddl.rule.engine.ListAbstractResultRule;
import com.it.iddl.rule.engine.entry.SharedElement;
import com.it.iddl.rule.engine.entry.impl.RuleChainImpl;
import com.it.iddl.rule.enumerator.Enumerator;
import com.it.iddl.rule.enumerator.EnumeratorImpl;

/**
 * 
 * @author sihai
 *
 */
public class RuleUtil {

private static final Enumerator enumerator = new EnumeratorImpl();
	
	public static Map<String, Set<Object>/* 抽样后描点的key和值的pair */> getSamplingField(Map<String, Comparative> argumentsMap,
			Set<AdvancedParameter> param) {
		// TODO:详细注释,计算笛卡尔积
		// 枚举以后的columns与他们的描点之间的对应关系
		Map<String, Set<Object>> enumeratedMap = new HashMap<String, Set<Object>>(
				param.size());
		for (AdvancedParameter entry : param) {
			String key = entry.key;
			// 当前enumerator中指定当前规则是否需要处理交集问题。
			// enumerator.setNeedMergeValueInCloseInterval();

			try {
				Set<Object> samplingField = enumerator.getEnumeratedValue(
						argumentsMap.get(key),
						entry.cumulativeTimes,
						entry.atomicIncreateValue,
						entry.needMergeValueInCloseInterval);
				enumeratedMap.put(key, samplingField);
			} catch (UnsupportedOperationException e) {
				throw new UnsupportedOperationException("当前列分库分表出现错误，出现错误的列名是:"
						+ entry.key, e);
			}

		}
		return enumeratedMap;
	}
	public static String placeHolder(int bit, int table) {
        if(bit < String.valueOf(table).length()){
        	//当width < 数值的最大位数时，应该直接返回数值
        	return String.valueOf(table);
        }
		int max = (int) Math.pow(10, (bit));
		int placedNumber = max + table;
		String xxxfixWithPlaceHoder = String.valueOf(placedNumber).substring(1);
		return xxxfixWithPlaceHoder;
	}

	public static Map<String, SharedElement> getSharedElemenetMapBySharedElementList(
			List<? extends SharedElement> sharedElementList) {
		Map<String, SharedElement> returnMap = new HashMap<String, SharedElement>();
		if (sharedElementList != null) {
			int index = 0;
			for (SharedElement sharedElement : sharedElementList) {
				returnMap.put(String.valueOf(index), sharedElement);
				index++;
			}
		}
		return returnMap;
	}

//	private static final Pattern DOLLER_PATTERN = Pattern.compile("#.*?#");

	/**
	 * #para#
	 * #para,(autoinc),(range)#
	 * 
	 * @param rules
	 * @param ruleClass
	 * @param isDatabase
	 * @return
	 */
	public static RuleChainImpl getRuleChainByRuleStringList(List<Object> rules,
			Class<? extends ListAbstractResultRule> ruleClass,
			boolean isDatabase,String extraPackagesStr) {
		if(rules == null || rules.isEmpty()){
			return null;
		}
		List<ListAbstractResultRule> list = new ArrayList<ListAbstractResultRule>();
		RuleChainImpl ruleChainImp = new RuleChainImpl();
		for (Object ruleString : rules) {
			if(ruleString instanceof String){
				ListAbstractResultRule listRule = getRuleInstance(ruleClass);
				//待井号的规则直接set
				listRule.setExpression((String)ruleString);
				listRule.setExtralPackagesString(extraPackagesStr);
				//放入上下文 
				
				list.add(listRule);
			}else if (ruleString instanceof ListAbstractResultRule){
				list.add((ListAbstractResultRule)ruleString);
			}else{
				throw new IllegalArgumentException("not support rule type : "+ruleString.getClass());
			}
		}
		ruleChainImp.setListResultRule(list);
		ruleChainImp.setDatabaseRuleChain(isDatabase);
		ruleChainImp.init();
		return ruleChainImp;
	}


	private static ListAbstractResultRule getRuleInstance(
			Class<? extends ListAbstractResultRule> ruleClass) {
		try {
			return ruleClass.newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
}
