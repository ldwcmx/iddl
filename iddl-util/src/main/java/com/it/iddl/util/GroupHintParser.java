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
		String groupIndexHint = extractTDDLGroupHintString(sql);
		if (null != groupIndexHint && !groupIndexHint.equals("")) {
		    String[] piece=groupIndexHint.split(":");
		    return Integer.valueOf(piece[1]);
		} else {
			return defaultValue;
		}
	}

	private static String extractTDDLGroupHintString(String sql) {
		return StringUtils.getBetween(sql.toLowerCase(), "/*+tddl_group({", "})*/");
	}

	public static String removeTddlGroupHint(String sql) {
		String tddlHint= extractTDDLGroupHintString(sql);
		if(null==tddlHint||"".equals(tddlHint)){
			return  sql;
		}
		
	    sql = StringUtils.removeBetweenWithSplitor(sql.toLowerCase(), "/*+tddl_group({", "})*/");
	    return sql;
	}

	public static void main(String[] args) {
		String sql="/*+TDDL_GROUP({groupIndex:12})*/select * from tab";

		System.out.println(convertHint2Index(sql, -1));
		System.out.println(removeTddlGroupHint(sql));
	}
}
