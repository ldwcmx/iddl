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
 * 用于处理一些需要直接替换sql中文字的东西
 * @author sihai
 *
 */
public abstract class PlaceHolderReplaceHandler implements ReplaceHandler {

	/**
	 * 
	 * @param targetTableName
	 * @param replacedObj
	 * @return
	 */
	public abstract String getReplacedString(Map<String, String> targetTableName, ReplacableWrapper replacedObj);
}
