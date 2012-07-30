/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 
 * @author sihai
 *
 */
public class Field {

	public Map<String/* 列名 */, Set<Object>/* 得到该结果的描点值名 */> sourceKeys;

	public static final Field EMPTY_FIELD = new Field(0);

	/**
	 * 用于映射规则中存放映射后的所有值，这些值都应该有相同的列名，对应mappingTargetColumn
	 */
	public Set<Object> mappingKeys;
	 /**
	 * 对应上述mappingKeys的targetColumn
	 */
	public String mappingTargetColumn;
	
	public Field(int capacity) {
		sourceKeys = new HashMap<String, Set<Object>>(capacity);
	}
	
	public boolean equals(Object obj, Map<String, String> alias) {
		//用于比较两个field是否相等。field包含多个列，那么多列内的每一个值都应该能找到对应的值才算相等。
		if (!(obj instanceof Field))
		{
			return false;
		}
		Map<String, Set<Object>> target = ((Field) obj).sourceKeys;
		for (Entry<String, Set<Object>> entry : sourceKeys.entrySet())
		{
			String srcKey = entry.getKey();
			if (alias.containsKey(srcKey))
			{
				srcKey = alias.get(srcKey);
			}
			Set<Object> targetValueSet = target.get(srcKey);
			Set<Object> sourceValueSet = entry.getValue();
			for (Object srcValue : sourceValueSet)
			{
				boolean eq = false;
				for (Object tarValue : targetValueSet)
				{
					if(tarValue.equals(srcValue)){
						eq = true;
					}
				}
				if(!eq)
				{
					return false;
				}
			}
		}
		return true;
	}
}
