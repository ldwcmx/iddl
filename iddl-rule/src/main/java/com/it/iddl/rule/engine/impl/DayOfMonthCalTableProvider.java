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
public class DayOfMonthCalTableProvider extends CommonTableRuleProvider {

	@Override
	protected int getCalendarType() {
		return Calendar.DAY_OF_MONTH;
	}
}
