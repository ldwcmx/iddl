/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.entry.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.it.iddl.rule.AdvancedParameter;
import com.it.iddl.rule.engine.ListAbstractResultRule;
import com.it.iddl.rule.engine.entry.RuleChain;

/**
 * 
 * @author sihai
 *
 */
public class RuleChainImpl implements RuleChain {

	public static final int NO_INDEX = -1;
	/**
	 * 判断当前RuleChain是否初始化，防止后面写代码忘记。
	 */
	private volatile boolean isInited = false;
	
	/**
	 * 主要用于传递库参数和表参数时使用。
	 */
	private boolean isDatabaseRuleChain = false;
	
	private List<Set<String>> requiredArgumentSortByLevel ;
	
	/**
	 * 结果为一个list 数组的计算式，用在一对多的情况中
	 */
	protected List<ListAbstractResultRule> listResultRule;
	
	@Override
	public ListAbstractResultRule getRuleByIndex(int index) {
		if(index != NO_INDEX ){
			return getListRuleByIndexInternal(index);
		}else{
			return null;
		}
	}
	
	private ListAbstractResultRule getListRuleByIndexInternal(int index) {
		ListAbstractResultRule listRule = listResultRule.get(index);
		return listRule;
	}
	
	public List<Set<String>> getRequiredArgumentSortByLevel() {
		if(!isInited){
			throw new IllegalStateException("not inited ");
		}
		return requiredArgumentSortByLevel;
	}

	public void init() {
		if(!isInited){
			if(listResultRule == null){
				throw new IllegalArgumentException("没有输入规则");
			}
			requiredArgumentSortByLevel = new ArrayList<Set<String>>(listResultRule.size());
			for(ListAbstractResultRule listRule:listResultRule){
				listRule.init();
				Set<AdvancedParameter> parameterSet = listRule.getParameters();
				Set<String> argStringSet = new  HashSet<String>(parameterSet.size());
				for(AdvancedParameter keyAndAtomIncValue:parameterSet){
					argStringSet.add(keyAndAtomIncValue.key);
				}
				requiredArgumentSortByLevel.add(argStringSet);
			}

			isInited = true;
		}
	}
	public List<ListAbstractResultRule> getListResultRule() {
		return listResultRule;
	}

	public void setListResultRule(List<ListAbstractResultRule> listResultRule) {
		this.listResultRule = listResultRule;
	}
	
	public void setDatabaseRuleChain(boolean isDatabaseRuleChain) {
		this.isDatabaseRuleChain = isDatabaseRuleChain;
	}
	
	public boolean isDatabaseRuleChain() {
		return isDatabaseRuleChain;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(!(obj instanceof RuleChain)){
			return false;
		}
		RuleChain targetRuleChain = (RuleChain) obj;
		List<ListAbstractResultRule> listResultRules = targetRuleChain.getListResultRule();
		boolean isDatabase =targetRuleChain.isDatabaseRuleChain();
		if((isDatabase == this.isDatabaseRuleChain)
				&&this.listResultRule == listResultRules){
			return true;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		 int result = 19;
		 result = 31*result +listResultRule.hashCode();
		 result = 31*result+(isDatabaseRuleChain?0:1);
		 return result;
	}
}
