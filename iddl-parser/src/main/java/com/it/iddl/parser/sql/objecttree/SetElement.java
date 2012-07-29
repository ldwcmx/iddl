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

import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class SetElement {

	public Column col;
	public Object value;

	public void appendSQL(StringBuilder sb) {
		Utils.appendSQLList(col, sb);
		sb.append("=");
		Utils.appendSQLList(value, sb);

	}

	public StringBuilder regTableModifiable(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		sb = Utils.appendSQLListWithList(oraTabName, col, sb, list);
		sb.append("=");
		sb = Utils.appendSQLListWithList(oraTabName, value, sb, list);
		return sb;
	}
}
