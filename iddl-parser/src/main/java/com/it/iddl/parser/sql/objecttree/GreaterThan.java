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

import com.it.iddl.parser.sql.objecttree.oracle.OracleFrom;

/**
 * 
 * @author sihai
 *
 */
public class GreaterThan extends ComparableExpression {

	protected int getComparativeOperation() {
		return Comparative.GREATER_THAN;
	}

	public String getRelationString() {
		return " > ";
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		if(this.isRownum()) {
			return  new OracleFrom(this).regTableModifiable(oraTabName, list, sb);
		} else {
			return super.regTableModifiable(oraTabName, list, sb);
		}
	}
}
