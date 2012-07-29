/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import com.it.iddl.parser.sql.objecttree.output.handler.impl.ReplaceHandler;

/**
 * 
 * @author sihai
 *
 */
public class IndexWrapper implements ReplacableWrapper {

	private String originalTableName;
	
	public void visit(ReplaceHandler handler) {
		
	}
	
	public String getOriginalTableName() {
		return originalTableName;
	}
	
	public void setOriginalTableName(String originalTableName) {
		this.originalTableName = originalTableName;
	}
	
	@Override
	public String getReplacedString() {
		return originalTableName;
	}
}
