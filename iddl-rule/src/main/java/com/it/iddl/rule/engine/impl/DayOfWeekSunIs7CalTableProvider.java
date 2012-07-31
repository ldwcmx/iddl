/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.impl;

import java.util.Calendar;

/**
 * 
 * @author sihai
 *
 */
public class DayOfWeekSunIs7CalTableProvider extends CommonTableRuleProvider {

	@Override
	protected int getCalendarType() {
		return Calendar.DAY_OF_WEEK;
	}

	@Override
	protected int getReturnInt(Calendar cal, int calType) {
		int ret = cal.get(calType)-1;
		if(ret == 0){
			ret = 7;
		}
		return ret;
	}
}
