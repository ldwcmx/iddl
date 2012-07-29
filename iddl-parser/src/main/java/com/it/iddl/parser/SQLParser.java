/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser;

import com.it.iddl.common.DBType;

/**
 * SQL解析器
 * @author sihai
 *
 */
public interface SQLParser {
	/**
	 * 
	 * @param sql
	 * @param isMySQL
	 * @return
	 */
	SQLParserResult parse(String sql, DBType dbType);
}
