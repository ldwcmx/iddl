/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle;

import com.it.iddl.parser.sql.objecttree.Expression;
import com.it.iddl.parser.sql.objecttree.ExpressionGroup;
import com.it.iddl.parser.sql.objecttree.WhereCondition;

/**
 * 
 * @author sihai
 *
 */
public class OracleWhereCondition extends WhereCondition {
	
	private ExpressionGroup rownum = new ExpressionGroup();
	
	public void addRowNum(Expression exp){
		rownum.addExpression(exp);
	}
}
