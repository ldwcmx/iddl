/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle;

import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.impl.Insert;

/**
 * 
 * @author sihai
 *
 */
public class OracleInsert extends Insert {

	@Override
	public StringBuilder regTableModifiable(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		super.appendInsert(sb);
		sb = HintUtils.appendHint(oraTabName, list, sb, hintList);
		sb = super.appendInsertBody(oraTabName, list, sb);
		return sb;
	}
}

