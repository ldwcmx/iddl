/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.parser.sql.objecttree.DMLCommon;
import com.it.iddl.parser.sql.objecttree.ExpressionGroup;
import com.it.iddl.parser.sql.objecttree.GroupByElement;
import com.it.iddl.parser.sql.objecttree.OrderByElement;
import com.it.iddl.parser.sql.objecttree.WhereCondition;

/**
 * DELETE FROM table WHERE id = 1
 * @author sihai
 *
 */
public class Delete extends DMLCommon {

	protected WhereCondition where = null;

	public Delete() {
		where = getWhereCondition();
		where.setHolder(holder);
	}
	
	protected WhereCondition getWhereCondition(){
		return new WhereCondition();
	}
	
	public WhereCondition getWhere() {
		return where;
	}

	public void addAndWhereExpressionGroup(ExpressionGroup exp) {
		where.addAndExpression(exp);
	}

	public Map<String, Comparative> getSubColumnsMap() {
		return where.eval();
	}

	public void appendSQL(StringBuilder sb) {
		appendDelete(sb);
		if(hasTable()){
			sb.append("FROM ");
		}
		super.appendSQL(sb);
		where.appendSQL(sb);

	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendDelete(sb);
		if(hasTable()){
			sb.append("FROM ");
		}
		sb.append(super.toString());
		sb.append(where.toString());
		return sb.toString();
	}

	public List<OrderByElement> nestGetOrderByList() {
		return where.getOrderByColumnList();
	}
	
	@Override
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		appendDelete(sb);
		return appendDelBody(oraTabName, list, sb);
	}

	protected StringBuilder appendDelBody(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		if (hasTable()) {
			sb.append("FROM ");
		}
		sb = super.regTableModifiable(oraTabName, list, sb);
		sb = where.regTableModifiable(oraTabName, list, sb);
		return sb;
	}

	protected void appendDelete(StringBuilder sb) {
		sb.append("DELETE ");
	}
	
	@Override
	public WhereCondition getSubWhereCondition() {
		return where;
	}
	
	@Override
	public List<GroupByElement> nestGetGroupByList() {
		return Collections.emptyList();
	}
}
