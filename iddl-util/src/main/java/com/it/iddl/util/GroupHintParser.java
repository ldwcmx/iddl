/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-util
 */
package com.it.iddl.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author sihai
 *
 */
public class GroupHintParser {

	public static Log logger = LogFactory.getLog(GroupHintParser.class);

	/**
	 * 
	 * @param sql
	 * @param defaultValue
	 * @return
	 */
	public static Integer convertHint2Index(String sql, int defaultValue) {
		String groupIndexHint = extractIDDLGroupHintString(sql);
		if (null != groupIndexHint && !groupIndexHint.equals("")) {
		    String[] piece = groupIndexHint.split(":");
		    return Integer.valueOf(piece[1]);
		} else {
			return defaultValue;
		}
	}

	private static String extractIDDLGroupHintString(String sql) {
		return StringUtil.getBetween(sql.toLowerCase(), "/*+iddl_group({", "})*/");
	}

	public static String removeIDDLGroupHint(String sql) {
		String iddlHint = extractIDDLGroupHintString(sql);
		if(null == iddlHint ||"".equals(iddlHint)){
			return  sql;
		}
		
	    sql = StringUtil.removeBetweenWithSplitor(sql.toLowerCase(), "/*+iddl_group({", "})*/");
	    return sql;
	}

	public static void main(String[] args) {
		String sql="/*+IDDL_GROUP({groupIndex:12})*/select * from tab";

		System.out.println(convertHint2Index(sql, -1));
		System.out.println(removeIDDLGroupHint(sql));
	}
}
