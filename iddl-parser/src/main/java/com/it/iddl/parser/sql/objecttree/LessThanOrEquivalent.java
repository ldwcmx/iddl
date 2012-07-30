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

import com.it.iddl.parser.sql.objecttree.oracle.OracleTo;

/**
 * 
 * @author sihai
 *
 */
public class LessThanOrEquivalent extends ComparableExpression {

	protected int getComparativeOperation() {
		return Comparative.LESS_THAN_OR_EQUAL;
	}

	public String getRelationString() {
		return " <= ";
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		if(this.isRownum()) {
			return  new OracleTo(this).regTableModifiable(oraTabName, list, sb);
		} else {
			return super.regTableModifiable(oraTabName, list, sb);
		}
	}
}
