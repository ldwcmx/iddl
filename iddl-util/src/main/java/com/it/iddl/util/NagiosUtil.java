/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-util
 */
package com.it.iddl.util;

/**
 * 
 * @author sihai
 *
 */
public class NagiosUtil {
	
	public static final String KEY_DB_NOT_AVAILABLE = "DB_NOT_AVAILABLE"; //数据库不可用,KEY前缀+dbindex
	public static final String KEY_SQL_PARSE_FAIL = "SQL_PARSE_FAIL"; //业务执行了特殊的SQL造成解析失败
	public static final String KEY_REPLICATION_FAIL_RATE = "REPLICATION_FAIL_RATE"; //行复制失败率
	public static final String KEY_REPLICATION_TIME_AVG = "REPLICATION_TIME_AVG"; //一段时间内的行复制平均响应时间
	public static final String KEY_INSERT_LOGDB_FAIL_RATE = "INSERT_LOGDB_FAIL_RATE"; //插日志库失败率
	public static final String KEY_INSERT_LOGDB_TIME_AVG = "INSERT_LOGDB_TIME_AVG"; //一段时间内的插日志库平均响应时间
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public static void warn(String key, String value) {
		
	}
}
