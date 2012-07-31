/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine;

import java.util.HashMap;
import java.util.Map;

import com.it.iddl.rule.engine.impl.DayOfMonthCalTableProvider;
import com.it.iddl.rule.engine.impl.DayOfWeekCalTableProvider;
import com.it.iddl.rule.engine.impl.DayOfWeekSunIs7CalTableProvider;
import com.it.iddl.rule.engine.impl.DayOfYearCalTableProvider;
import com.it.iddl.rule.engine.impl.ModTableProvider;
import com.it.iddl.rule.engine.impl.MonthCalTableProvider;
import com.it.iddl.rule.engine.impl.NoneTableProvider;

/**
 * 
 * @author sihai
 *
 */
public class TableRuleProviderRegister {

	private static final Map<String, TableRuleProvider> register = new HashMap<String, TableRuleProvider>();
	
	static {
		register.put("dayofmonth", new DayOfMonthCalTableProvider());
		register.put("dayofweek", new DayOfWeekCalTableProvider());
		register.put("dayofyear", new DayOfYearCalTableProvider());
		register.put("month", new MonthCalTableProvider());
		register.put("none", new NoneTableProvider());
		register.put("mod", new ModTableProvider());
		register.put("primarykey", new PrimaryKeyRuleProvider());
		register.put("dayofweek-sun-is-7",new DayOfWeekSunIs7CalTableProvider());
		register.put("rightconvertmod", new RightConvertModTableProvider());
		register.put("towcolumn", new TwoColumnTableProvider());
	}
	
	public static TableRuleProvider getTableRuleProvider(String key) {
		return register.get(key);
	}
}
