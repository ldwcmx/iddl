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
 * 默认情况下不加任何字段
 * @author sihai
 *
 */
public class DefaultVersionReplaceHolderHandler extends PlaceHolderReplaceHandler {

	@Override
	public String getReplacedString(Map<String, String> targetTableName, ReplacableWrapper replacedObj) {
		return "";
	}
}
