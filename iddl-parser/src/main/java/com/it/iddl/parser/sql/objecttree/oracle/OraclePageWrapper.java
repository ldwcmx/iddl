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

import com.it.iddl.parser.sql.objecttree.BindVar;
import com.it.iddl.parser.sql.objecttree.ComparableExpression;
import com.it.iddl.parser.sql.objecttree.PageWrapper;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public abstract class OraclePageWrapper implements PageWrapper {
	
	protected ComparableExpression comparableExpression;
	
	protected Integer index = null;
	
	protected Number value;
	
	public Integer getIndex() {
		return index;
	}
	public Number getValue() {
		return value;
	}
	public boolean canBeChange() {
		return true;
	}
	
	public OraclePageWrapper(ComparableExpression comp) {
		this.comparableExpression = comp;
		if (comparableExpression.getRight() instanceof BindVar) {
			 index = ((BindVar)comparableExpression.getRight()).getIndex();;
		} else {
			 Object right = comparableExpression.getRight();
			if(right instanceof Number){
				value = (Number) comparableExpression.getRight();	
			}else{
				throw new IllegalArgumentException("not number ,can't change " +
						""+comparableExpression.getRight());
			}
			
		}
	}
	
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		sb = Utils.appendSQLListWithList(oraTabName, comparableExpression.getLeft(), sb, list);
		sb.append(comparableExpression.getRelationString());
		list.add(sb.toString());
		list.add(this);
		return new StringBuilder();
	}
	
}
