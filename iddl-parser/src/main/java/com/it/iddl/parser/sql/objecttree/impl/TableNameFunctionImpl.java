/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.parser.sql.objecttree.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.sql.objecttree.JoinClause;
import com.it.iddl.parser.sql.objecttree.SQLFragment;
import com.it.iddl.parser.sql.objecttree.TableName;

/**
 * 
 * @author sihai
 *
 */
public class TableNameFunctionImpl implements TableName {

	private String alias;
	private Function function;
	// TODO
	private boolean isOracle;
	
	public TableNameFunctionImpl(Function func,String alias) {
		this.function=func;
		this.alias=alias;
	}
	public TableNameFunctionImpl(Function func,String alias, boolean isOracle) {
		this.function=func;
		this.alias=alias;
		this.isOracle = isOracle;
	}
	
	public void appendAliasToSQLMap(Map<String, SQLFragment> map) {
		if(alias!=null){
			map.put(alias.toUpperCase(), this);
		}
	}

	public String getAlias() {
		return alias;
	}

	public Set<String> getTableName() {
		throw new IllegalArgumentException("should not be here");
	}

	public void setAlias(String alias) {
		this.alias=alias;
	}

	public void appendSQL(StringBuilder sb) {
		function.appendSQL(sb);
		if(alias != null) {
			sb.append(isOracle ? " " : " AS ");
			sb.append(alias);
		}
	}

	public Function getFunction(){
		return function;
	}
	public StringBuilder regTableModifiable(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		sb=function.regTableModifiable(oraTabName, list, sb);
		if(alias != null) {
			sb.append(isOracle ? " " : " AS ");
			sb.append(alias);
		}
		return sb;
		 
	}
	public void setJoinClause(JoinClause joinClause) {
		if(joinClause != null){
			throw new IllegalArgumentException(" not support join in Table function ");
		}
		
	}
}
