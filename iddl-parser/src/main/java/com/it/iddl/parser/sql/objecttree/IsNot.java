/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

/**
 * 
 * @author sihai
 *
 */
public class IsNot extends ComparableExpression {
	
	protected int getComparativeOperation() {
		return Comparative.NOT_EQUIVALENT;
	}

	public String getRelationString() {
		return " is not ";
	}
}
