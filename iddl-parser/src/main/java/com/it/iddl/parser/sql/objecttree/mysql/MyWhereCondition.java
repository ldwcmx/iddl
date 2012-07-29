/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.mysql;

import com.it.iddl.parser.sql.objecttree.WhereCondition;

/**
 * 
 * @author sihai
 *
 */
public class MyWhereCondition extends WhereCondition {
	
	private Object start =null;
	private Object range = null;
	
	public Object getStart() {
		return start;
	}
	
	public Object getRange() {
		return range;
	}
	
	public void setRange(Object range) {
		this.range = range;
	}
	
	public void setStart(Object start) {
		this.start = start;
	}
}
