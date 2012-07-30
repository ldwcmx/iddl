/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule;

import java.util.Collections;
import java.util.Map;

/**
 * 
 * @author sihai
 *
 */
public class ReverseOutput {

	private String sql;
	private String table;
	private Map<Integer,Object> parameterMap=Collections.emptyMap();
	
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public Map<Integer,Object> getParameterMap() {
		return parameterMap;
	}
	public void setgetParameterMap(Map<Integer,Object> parameterMap) {
		this.parameterMap = parameterMap;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
}
