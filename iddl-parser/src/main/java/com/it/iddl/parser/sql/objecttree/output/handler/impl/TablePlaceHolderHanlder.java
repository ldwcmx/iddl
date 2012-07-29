/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.output.handler.impl;

import java.util.Map;

import com.it.iddl.parser.sql.objecttree.ReplacableWrapper;

/**
 * 
 * @author sihai
 *
 */
public class TablePlaceHolderHanlder extends PlaceHolderReplaceHandler {

	@Override
	public String getReplacedString(Map<String, String> targetTableName, ReplacableWrapper replacedObj) {
		String replacedTable = targetTableName.get(replacedObj.getReplacedString());
		if(replacedTable != null){
			return replacedTable;
		}else{
			return replacedObj.getReplacedString();
		}
	}
}
