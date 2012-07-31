/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.impl;

import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.common.Config;
import com.it.iddl.common.exception.IDDLCheckedExcption;
import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.rule.engine.TableRuleProvider;
import com.it.iddl.rule.engine.entry.TableRule;
import com.taobao.tddl.common.exception.checked.ParseSQLJEPException;
import com.taobao.tddl.common.exception.runtime.NotSupportException;
import com.taobao.tddl.rule.ruleengine.entities.inputvalue.TabRule;

/**
 * 
 * @author sihai
 *
 */
public abstract class CommonTableRuleProvider implements TableRuleProvider {

	protected final static String CALENDAR = "CALENDAR";
	private static final Log logger = LogFactory.getLog(CommonTableRuleProvider.class);
	protected final static int LESS_GREAT = 1;
	protected final static int LESS_OR_EQUAL_GREAT_OR_EQUAL = 0;
	
	/**
	 * 
	 */
	public Set<String> getTables(Map<String, Comparative> map, TableRule table, String tabName, Config config) throws IDDLCheckedExcption {
		validTabRule(table);

		Comparable<?> comparable= null;
		comparable = map.get(table.getParameter());
		return parseTableNameObj(table, tabName, comparable,config);
	}
	
	protected Set<String> parseTableNameObj(TabRule tab, String vTabName,
			Comparable<?> comparable,Config config) throws ParseSQLJEPException {
		if (comparable instanceof Comparative) {
			//if current input is a subType of Comparative
			return analyzeComparative(tab, vTabName, comparable,config);

		} else if (comparable == null) {
			//if comparable is null,return DefaultTable()
			Set<String> temp = getDefaultTabSet(tab);
			return temp;
		} else {
			throw new NotSupportException("不支持除了Comparative类型和其子类型的其他情况");
		}
	}
}
