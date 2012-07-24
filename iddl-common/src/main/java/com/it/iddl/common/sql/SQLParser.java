/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.sql;

import java.sql.SQLException;
import java.util.regex.Pattern;

import com.it.iddl.util.StringUtils;

/**
 * 
 * @author sihai
 *
 */
public class SQLParser {

	/**
	 * 用于判断是否是一个select ... for update的sql
	 */
	private static final Pattern SELECT_FOR_UPDATE_PATTERN = Pattern.compile("^select\\s+.*\\s+for\\s+update.*$", Pattern.CASE_INSENSITIVE);

	/**
	 * 获得SQL语句种类
	 *
	 * @param sql
	 *            SQL语句
	 * @throws SQLException
	 *             当SQL语句不是SELECT、INSERT、UPDATE、DELETE语句时，抛出异常。
	 */
	public static SQLType getSQLType(String sql) throws SQLException {
		//#bug 2011-11-24,modify by junyu,先不走缓存，否则sql变化巨大，缓存换入换出太多，gc太明显
//		SQLType sqlType = globalCache.getSQLType(sql);
//		if (sqlType == null) {
		SQLType sqlType = null;
		//#bug 2011-12-8,modify by junyu ,this code use huge cpu resource,and most 
		//sql have no comment,so first simple look for there whether have the comment
		String noCommentsSql = sql;
		if(sql.contains("/*")){
			noCommentsSql = StringUtils.stripComments(sql, "'\"", "'\"", true, false, true, true).trim();
		}
		
		if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql, "select")) {
			//#bug 2011-12-9,this select-for-update regex has low performance,so
			//first judge this sql whether have ' for ' string.
			if (noCommentsSql.toLowerCase().contains(" for ")&&SELECT_FOR_UPDATE_PATTERN.matcher(noCommentsSql).matches()) {
				sqlType = SQLType.SELECT_FOR_UPDATE;
			} else {
				sqlType = SQLType.SELECT;
			}
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql, "show")) {
			sqlType = SQLType.SHOW;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql, "insert")) {
			sqlType = SQLType.INSERT;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql, "update")) {
			sqlType = SQLType.UPDATE;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql, "delete")) {
			sqlType = SQLType.DELETE;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql, "replace")) {
			sqlType = SQLType.REPLACE;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql,
				"truncate")) {
			sqlType = SQLType.TRUNCATE;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql, "create")) {
			sqlType = SQLType.CREATE;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql, "drop")) {
			sqlType = SQLType.DROP;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql,
				"load")) {
			sqlType = SQLType.LOAD;
		} else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql,
				"merge")) {
			sqlType = SQLType.MERGE;
		}else if (StringUtils.startsWithIgnoreCaseAndWs(noCommentsSql,
				"alter")) {
			sqlType = SQLType.ALTER;
		} else {
			throw new SQLException("only select, insert, update, delete,replace,truncate,create,drop,load,merge sql is supported");
		}
//		sqlType = globalCache.setSQLTypeIfAbsent(sql, sqlType);
//		}
		return sqlType;
	}
}
