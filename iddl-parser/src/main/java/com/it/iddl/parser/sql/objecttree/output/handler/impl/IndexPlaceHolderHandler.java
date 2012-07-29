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
public class IndexPlaceHolderHandler extends PlaceHolderReplaceHandler {

	@Override
	public String getReplacedString(Map<String, String> targetTableName,
			ReplacableWrapper replacedObj) {
		String str = replacedObj.getReplacedString();
		String toBeReplacedTable = targetTableName.get(str);
		if(toBeReplacedTable != null){
			return toBeReplacedTable;
		}else{
			return replacedObj.getReplacedString();
		}
	}
}
