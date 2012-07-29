/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql;

import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.BindIndexHolder;
import com.it.iddl.parser.sql.objecttree.Select;
import com.it.iddl.parser.sql.objecttree.WhereCondition;

/**
 * 
 * @author sihai
 *
 */
public class MySelect extends Select {
	private RangeSelector limit = null;

	public RangeSelector getLimit() {
		return limit;
	}

	public int getSkip(List<Object> param) {
		int temp = DEFAULT_SKIP_MAX;
		int skip = super.getSkip(param);
		temp = limit.getSkip(param);
		if (temp > skip) {
			skip = temp;
		}
		return skip;
	}

	protected int getRangeOrMax(List<Object> param) {
		int temp = DEFAULT_SKIP_MAX;
		int max = super.getRangeOrMax(param);
		temp = limit.getRange(param);
		if (temp > max) {
			max = temp;
		}
		return max;
	}

	public MySelect() {
		super();
		limit = new RangeSelector((MyWhereCondition) where);
	}

	public MySelect(BindIndexHolder holder) {
		super(holder);
		limit = new RangeSelector((MyWhereCondition) where);
	}

	@Override
	protected WhereCondition getWhereCondition() {
		return new MyWhereCondition();
	}

	public void appendSQL(StringBuilder sb) {
		super.buildSelectString(sb);
		limit.appendSQL(sb);
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		sb = buildSqlStringWithModifiable(oraTabName, list, sb);
		sb = limit.regTableModifiable(oraTabName, list, sb);
		return sb;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		limit.appendSQL(sb);
		return sb.toString();
	}

	public boolean hasHavingCondition() {
		if (having.getExpGroup().getExpressions().size() != 0) {
			return true;
		} else {
			return false;
		}
	}
}
