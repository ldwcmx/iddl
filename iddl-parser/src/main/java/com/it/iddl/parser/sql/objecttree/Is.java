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
public class Is extends ComparableExpression {
	
	protected int getComparativeOperation() {
		return Comparative.EQUIVALENT;
	}

	public String getRelationString() {
		return " is ";
	}
}
