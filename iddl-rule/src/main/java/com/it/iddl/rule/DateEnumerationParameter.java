/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule;

import java.util.Calendar;

/**
 * 用于传递自增数字和自增数字对应在Calendar里的类型
 * 
 * @author sihai
 *
 */
public class DateEnumerationParameter implements Comparable {

	public final int atomicIncreatementNumber;
	public final int calendarFieldType;
	
	/**
	 * 默认使用Date作为日期类型的基本自增单位
	 * @param atomicIncreateNumber
	 */
	public DateEnumerationParameter(int atomicIncreateNumber) {
		this.atomicIncreatementNumber = atomicIncreateNumber;
		this.calendarFieldType = Calendar.DATE;
	}
	
	public DateEnumerationParameter(int atomicIncreateNumber,int calendarFieldType){
		this.atomicIncreatementNumber = atomicIncreateNumber;
		this.calendarFieldType = calendarFieldType;
	}
	
	public int compareTo(Object o) {
		throw new IllegalArgumentException("should not be here !");
	}
}
