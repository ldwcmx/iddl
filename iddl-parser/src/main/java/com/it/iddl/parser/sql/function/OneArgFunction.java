/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.function;

import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.Column;
import com.it.iddl.parser.sql.objecttree.UnknowValueObject;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public abstract class OneArgFunction implements Function {

	protected Object arg1;
	
	public void setValue(List<Object> values) {
		if(values.size()!=1){
			throw new IllegalArgumentException("参数不为一个");
		}
		arg1=values.get(0);
	}

	public final Comparable<?> eval() {
		return this;
	}

	public String getNestedColumnName() {
		String ret=null;
		
		if(arg1 instanceof Column){
			ret=((Column)arg1).getColumn();
		}
		return ret;
	}

	public void appendSQL(StringBuilder sb) {
		sb.append(getFunctionName());
		sb.append("(");
		Utils.appendSQLList(arg1, sb);
		sb.append(")");
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		sb.append(getFunctionName());
		sb.append("(");
		sb=Utils.appendSQLListWithList(oraTabName, arg1, sb, list);
		sb.append(")");
		return sb;
	}
	
	public Comparable<?> getValue(List<Object> args) {
		return UnknowValueObject.getUnknowValueObject();
	}
	
	public int compareTo(Object o) {
		throw new IllegalStateException("should not be here");
	}
}
