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

/**
 * 
 * @author sihai
 *
 */
public abstract class Constant implements Function {

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
	}
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		sb.append(getFunctionName());
		return sb;
	}
	public int compareTo(Object o) {
		throw new IllegalStateException("should not be here");
	}
}
