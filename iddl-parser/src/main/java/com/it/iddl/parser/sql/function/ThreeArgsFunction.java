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
 * @author sihai
 *
 */
public abstract class ThreeArgsFunction implements Function {

	protected Object arg1;
	protected Object arg2;
	protected Object arg3;
	public void setValue(List<Object> values) {
		if(values.size()!=3){
			throw new IllegalArgumentException("参数少于三个");
		}
		arg1=values.get(0);
		arg2=values.get(1);
		arg3=values.get(2);
	}


	public String getNestedColumnName() {
		String ret=null;
		
		if(arg1 instanceof Column){
			ret=((Column)arg1).getColumn();
		}
		if(arg2 instanceof Column){
			if(ret==null){
				ret=((Column)arg2).getColumn();
			}else{
				throw new IllegalArgumentException("三参数函数中不能出现多个列名的函数");
			}
		}
		if(arg3 instanceof Column){
			if(ret==null){
				ret=((Column)arg3).getColumn();
			}else{
				throw new IllegalArgumentException("三参数函数中不能出现多个列名的函数");
			}
		}
		return ret;
	}

	public void appendSQL(StringBuilder sb) {
		sb.append(getFunctionName());
		sb.append("(");
		Utils.appendSQLList(arg1, sb);
		sb.append(",");
		Utils.appendSQLList(arg2, sb);
		sb.append(",");
		Utils.appendSQLList(arg3, sb);
		sb.append(")");
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		sb.append(getFunctionName());
		sb.append("(");
		sb=Utils.appendSQLListWithList(oraTabName, arg1, sb, list);
		sb.append(",");
		sb=Utils.appendSQLListWithList(oraTabName, arg2, sb, list);
		sb.append(",");
		sb=Utils.appendSQLListWithList(oraTabName, arg3, sb, list);
		sb.append(")");
		return sb;
	}

	public int compareTo(Object o) {
		throw new IllegalStateException("should not be here");
	}
	public java.lang.Comparable<?> eval() {
		return this;
	};
	public Comparable<?> getValue(List<Object> args) {
		return UnknowValueObject.getUnknowValueObject();
	}
}
