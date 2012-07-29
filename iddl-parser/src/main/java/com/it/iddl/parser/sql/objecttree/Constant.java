/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import org.apache.zookeeper.Op.Delete;

import com.it.iddl.parser.sql.objecttree.impl.TableNameSubQueryImpl;

/**
 * 
 * @author sihai
 *
 */
public class Constant {

	private final static Class<?>[] HAS_TOSTRING = { ExpressionGroup.class,
			ComparableExpression.class, Select.class, Delete.class,
			WhereCondition.class, TableNameSubQueryImpl.class };

	public static boolean useToString(Object obj) {
		for (Class<?> clazz : HAS_TOSTRING) {
			if (clazz.isInstance(obj)) {
				return true;
			}
		}
		return false;
	}
}
