/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.it.iddl.common.Config;
import com.it.iddl.common.exception.checked.IDDLCheckedException;
import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.rule.engine.TableRuleProvider;
import com.it.iddl.rule.engine.entry.TableRule;

/**
 * 
 * @author sihai
 *
 */
public class NoneTableProvider implements TableRuleProvider {

	public Set<String> getTables(Comparable<?>[] row,
			Map<String, Integer> position, TableRule tableRule, String tableName)
			throws IDDLCheckedException {
		Set<String> li = new HashSet<String>();

		String obj = tableName;
		li.add(obj);
		return li;
	}

	public Set<String> getTables(Map<String, Comparative> map,
			TableRule tableRule, String tableName, Config config) throws IDDLCheckedException {
		Set<String> li = new HashSet<String>();

		String obj = tableName;
		li.add(obj);
		return li;
	}
}
