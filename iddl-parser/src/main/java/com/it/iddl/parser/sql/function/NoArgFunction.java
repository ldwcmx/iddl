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

import com.it.iddl.parser.sql.objecttree.UnknowValueObject;

/**
 * 
 * @author sihai
 *
 */
public abstract class NoArgFunction implements Function {

	public void setValue(List<Object> values) {
		if(values.size()!=0){
			throw new IllegalArgumentException("参数不为零个");
		}
	}

	public Comparable<?> eval() {
		return this;
	}

	public String getNestedColumnName() {
		return null;
	}

	public void appendSQL(StringBuilder sb) {
		sb.append(getFunctionName());
		sb.append("(");
		sb.append(")");
	}
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		sb.append(getFunctionName());
		sb.append("(");
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
