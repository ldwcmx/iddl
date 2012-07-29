/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

/**
 * 
 * @author sihai
 *
 */
public class TableWrapper implements ReplacableWrapper {

	private String originalTableName;
	
	@Override
	public String getReplacedString() {
		return null;
	}
	
	public void setOriginalTableName(String originalTableName) {
		this.originalTableName = originalTableName;
	}
}
