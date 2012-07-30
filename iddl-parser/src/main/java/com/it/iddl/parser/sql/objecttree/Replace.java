/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.impl.Insert;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class Replace extends Insert {

	public void appendSQL(StringBuilder sb) {
		
		sb.append("REPLACE INTO ");
		super.appendSQL(sb);
		sb.append("(");
		columns.appendSQL(sb);
		sb.append(")");
		sb.append(" ").append("VALUES ");
		Utils.appendSQLList(valueList, sb);
		
	}
	
	@Override
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		appendInsert(sb);
		return appendInsertBody(oraTabName, list, sb);
	}
	
	protected void appendInsert(StringBuilder sb) {
		sb.append("REPLACE ");
	}
}
