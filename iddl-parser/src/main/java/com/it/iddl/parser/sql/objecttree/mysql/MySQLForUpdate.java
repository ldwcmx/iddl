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

import com.it.iddl.parser.sql.objecttree.SelectUpdate;

/**
 * 
 * @author sihai
 *
 */
public class MySQLForUpdate implements SelectUpdate {

	public void appendSQL(StringBuilder sb) {
		sb.append(" FOR UPDATE");
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		sb.append(" FOR UPDATE");
		return sb;
	}
}
