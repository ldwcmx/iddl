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
public class NotLike extends ComparableExpression {

	protected int getComparativeOperation() {
		return Comparative.NOT_LIKE;
	}

	public String getRelationString() {
		return " not like ";
	}
}
