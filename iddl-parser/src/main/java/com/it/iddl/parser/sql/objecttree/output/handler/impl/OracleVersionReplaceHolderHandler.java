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
public class OracleVersionReplaceHolderHandler extends PlaceHolderReplaceHandler {

	@Override
	public String getReplacedString(Map<String, String> targetTableName, ReplacableWrapper replacedObj) {
		return ",sync_version=nvl(sync_version,0) + 1 ";
	}
}
