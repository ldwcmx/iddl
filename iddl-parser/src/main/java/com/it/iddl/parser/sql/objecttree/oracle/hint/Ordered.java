/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.hint;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.HintSetter;

/**
 * 
 * @author sihai
 *
 */
public class Ordered implements HintSetter {

	public List<String> getArgumentList() {
		return Collections.emptyList();
	}

	public void appendSQL(StringBuilder sb) {
		sb.append("ORDERED");
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		return sb.append("ORDERED");
	}

	public void addHint(List<String> args) {
		//do nothing
	}
}
