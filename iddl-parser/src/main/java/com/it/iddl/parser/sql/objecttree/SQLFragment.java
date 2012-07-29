/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.List;
import java.util.Set;

/**
 * 
 * @author sihai
 *
 */
public interface SQLFragment extends Cloneable {
	
	/**
	 * 
	 * @param sb
	 */
	public void appendSQL(StringBuilder sb);
	 
	/**
	 * 将一个sql中不变的StringToken缓存到第二个参数那个list中，token之间有可能会有一些可变的
	 * 东西，比如limit m,n中的m,n.还有表名等
	 * @param logicTableNames
	 * @param list
	 * @param sb
	 * @return
	 */
	public StringBuilder regTableModifiable(Set<String> logicTableNames, List<Object> list, StringBuilder sb);
}
