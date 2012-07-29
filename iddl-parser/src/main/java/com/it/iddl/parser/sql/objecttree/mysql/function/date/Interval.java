/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql.function.date;

import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class Interval implements Function {
	
	protected Object expr;
	protected Object dateUnit;
    
	@Override
	public String getFunctionName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getNestedColumnName() {
		return null;
	}

	@Override
	public void setValue(List<Object> values) {
		if(values.size() != 2){
			throw new IllegalArgumentException("参数少于两个");
		}
		expr=values.get(0);
		dateUnit= values.get(1);
	}

	@Override
	public Comparable<?> eval() {
		return this;
	}

	@Override
	public void appendSQL(StringBuilder sb) {
		sb.append(" INTERVAL ");
		sb.append(expr.toString());
		Utils.appendSQL(dateUnit,sb);
	}

	@Override
	public StringBuilder regTableModifiable(Set<String> logicTableNames,
			List<Object> list, StringBuilder sb) {
		sb.append(" INTERVAL ");
		Utils.appendSQLWithList(logicTableNames, expr, sb, list);
		Utils.appendSQLWithList(logicTableNames, dateUnit, sb,list);
		return sb;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(" INTERVAL ");
		Utils.appendSQL(expr, sb);
		Utils.appendSQL(dateUnit, sb);
		return sb.toString();
	}

	@Override
	public Comparable<?> getValue(List<Object> args) {
		return null;
	}
}
