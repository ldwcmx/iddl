/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.Map;
import java.util.Set;

/**
 * 
 * 表示一个表
 * 
 * @author sihai
 *
 */
public interface TableName extends SQLFragment {

	public void setAlias(String alias);
	/**
	 * 返回所有表名，在内部会转换为lower case
	 * @return
	 */
	public Set<String> getTableName();
	public String getAlias();
	/**
	 * 将表名和别名放到一个map中， 别名key会自动转为大写
	 * @param map
	 */
	public void appendAliasToSQLMap(Map<String, SQLFragment> map);
	public void setJoinClause(JoinClause joinClause);
}
