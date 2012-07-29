/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class ExpressionGroup implements Expression {

	protected List<Expression> expressionList = new ArrayList<Expression>();  

	protected String getConjunction(){
		return " and ";
	}
	public void addExpression(Expression expression){
		expressionList.add(expression);
	}
	
	public void addExpressionGroup(ExpressionGroup expGroup){
		expressionList.add(expGroup);
	}

	public void appendSQL(StringBuilder sb) {
		boolean appendSplitter = false;
		for (SQLFragment expression : expressionList) {
			if (appendSplitter) {
				sb.append(getConjunction());
			} else {
				appendSplitter = true;
			}
			if(expression instanceof ORExpressionGroup){
				sb.append("(");
				Utils.appendSQL(expression, sb);
				sb.append(")");
			}else{
				Utils.appendSQL(expression, sb);
			}
			
		}
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		boolean appendSplitter = false;
		for (SQLFragment expression : expressionList) {
			if (appendSplitter) {
				sb.append(getConjunction());
			} else {
				appendSplitter = true;
			}
			if(this instanceof ORExpressionGroup) {
				if(Constant.useToString(expression)) {
					sb.append(expression.toString());
				} else {
					Utils.appendSQL(expression, sb);
				}
			} else if(!Constant.useToString(expression)) {
				Utils.appendSQL(expression, sb);
			} else if(expression instanceof ComparableExpression) {
				sb.append(expression.toString());
			} else if(expression instanceof ExpressionGroup) {
				if(expression instanceof ORExpressionGroup) {
					sb.append('(');
					sb.append(expression.toString());
					sb.append(')');
				} else {
					sb.append(expression.toString());
				}
			} else {
				sb.append(expression.toString());
			}
		}
		return sb.toString();
	}

	public void eval(RowJepVisitor visitor, boolean inAnd) {
		for(Expression e :expressionList){
			if(e instanceof ORExpressionGroup){
				RowJepVisitor vis=new RowJepVisitor();
				e.eval(vis, true);
				Map<String, Comparative> mp= vis.getComparable();
				for(Entry<String,Comparative> et:mp.entrySet()){
					visitor.put(et.getKey(), new ComparableElement(et.getValue(),true,et.getValue().getComparison()));
				}
			}else{
				e.eval(visitor, true);
			}
		}
		
	}

	public List<Expression> getExpressions() {
		return expressionList;
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		boolean appendSplitter = false;
		for (SQLFragment expression : expressionList) {
			if (appendSplitter) {
				sb.append(getConjunction());
			} else {
				appendSplitter = true;
			}
			if(expression instanceof ORExpressionGroup){
				sb.append("(");
				sb=Utils.appendSQLWithList(oraTabName, expression, sb, list);
				sb.append(")");
			}else{
				sb=Utils.appendSQLWithList(oraTabName, expression, sb, list);
			}
			
		}
		return sb;
	}
}
