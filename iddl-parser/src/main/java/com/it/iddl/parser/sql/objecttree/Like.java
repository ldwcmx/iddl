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
public class Like extends ComparableExpression {

	protected int getComparativeOperation() {
		return Comparative.LIKE;
	}

	public String getRelationString() {
		return " like ";
	}
}
