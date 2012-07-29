/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.Collections;
import java.util.Map;

/**
 * 
 * @author sihai
 *
 */
public class SQLAndTableAtParser {

	public String sql = "";
	public Map<String,String> table = Collections.emptyMap();
	public Map<Integer, Object> modifiedMap = Collections.emptyMap();
}
