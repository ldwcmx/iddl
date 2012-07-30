/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.sql.objecttree.Column;
import com.it.iddl.parser.sql.objecttree.SQLFragment;

/**
 * 
 * @author sihai
 *
 */
public class FunctionColumn implements Function,Column {

	Function function;
	String alias;
	
	public FunctionColumn(Function function){
		this.function=function;
	}
	
	public FunctionColumn(){
		
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	@Override
	public String getFunctionName() {
		return function.getFunctionName();
	}

	public void setValue(List<Object> values) {
		function.setValue(values);
	}

	public Comparable<?> getValue(List<Object> args) {
		return function.getValue(args);
	}
	public Comparable<?> eval() {
		return this;
	}

	public String getNestedColumnName() {
		return function.getNestedColumnName();
	}

	public void appendSQL(StringBuilder sb) {
		function.appendSQL(sb);
		if(alias!=null){
			sb.append(" as ").append(alias);
		}
	}

	public String getAlias() {
		return alias;
	}

	public String getColumn() {
		StringBuilder sb=new StringBuilder();
		appendSQL(sb);
		return sb.toString();
	}

	public String getTable() {
		throw new RuntimeException("还不支持");
	}

	public void setModifiedTableName(String table) {
		throw new IllegalStateException("不应该被调用");
	}
	public String getModifiedTableName() {
		throw new IllegalStateException("不应该被调用");
	}
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		sb=function.regTableModifiable(oraTabName, list, sb);
		if(alias!=null){
			sb.append(" as ").append(alias);
		}
		return sb;
	}

	public int compareTo(Object arg0) {
		throw new IllegalStateException("should not be here");
	}

	public void setAliasMap(Map<String, SQLFragment> aliasMap) {
		if(alias!=null){
			aliasMap.put(alias, this);
		}
	}

	public Class<? extends Function> getNestClass() {
		return function.getClass();
	}
}
