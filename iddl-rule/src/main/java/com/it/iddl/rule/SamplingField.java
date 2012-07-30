/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class SamplingField {

	/**
	 * 表示按照列名的顺序通过笛卡尔积的形式枚举出的一组值
	 */
	final List<Object> enumFields ;
	
	private String mappingTargetKey;

	private Object mappingValue;
	
	/**
	 * 一组列名
	 */
	private final  List<String> columns ;
	
	final int capacity ;
	
	public SamplingField(List<String> columns,int capacity) {
		this.enumFields = new ArrayList<Object>(capacity);
		this.capacity = capacity;
		this.columns =Collections.unmodifiableList(columns);
	}
	
	public void add(int index,Object value){
		enumFields.add(index,value);
	}
	
	public List<String> getColumns() {
		return columns;
	}

	public List<Object> getEnumFields() {
		return enumFields;
	}

	//final类型的enumFields,并且无setter,且初始化时肯定实例化,所以肯定不为null
	public void clear() {
		enumFields.clear();
	}


	public String getMappingTargetKey() {
		return mappingTargetKey;
	}
	public void setMappingTargetKey(String mappingTargetKey) {
		this.mappingTargetKey = mappingTargetKey;
	}
	@Override
	public String toString() {
		return "columns:"+columns+"enumedFileds:"+enumFields;
	}
	public Object getMappingValue() {
		return mappingValue;
	}
	public void setMappingValue(Object mappingValue) {
		this.mappingValue = mappingValue;
	}
}
