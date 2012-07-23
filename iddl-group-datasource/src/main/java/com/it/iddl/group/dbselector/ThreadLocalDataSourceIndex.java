/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.group.dbselector;

import com.it.iddl.common.ThreadLocalConstants;
import com.it.iddl.common.ThreadLocalMap;

/**
 * 
 * @author sihai
 *
 */
public class ThreadLocalDataSourceIndex {

	/**
	 * 
	 * @return
	 */
	public static boolean existsIndex() {
		return getIndexAsObject() != null;
	}

	/**
	 * 
	 * @return
	 */
	public static Integer getIndexAsObject() {
		Integer indexObject = null;
		try {
			indexObject = (Integer) ThreadLocalMap.get(ThreadLocalConstants.DATASOURCE_INDEX);
			if (indexObject == null)
				return null;

			return indexObject;
		} catch (Exception e) {
			throw new IllegalArgumentException(msg(indexObject));
		}
	}

	/**
	 * 
	 * @return
	 */
	public static int getIndex() {
		Integer indexObject = null;
		try {
			indexObject = (Integer) ThreadLocalMap.get(ThreadLocalConstants.DATASOURCE_INDEX);
			//不存在索引时返回-1，这样调用者只要知道返回值是-1就会认为业务层没有设置过索引
			if (indexObject == null)
				return DBSelector.NOT_EXIST_USER_SPECIFIED_INDEX;

			int index = indexObject.intValue();
			//如果业务层已设置了索引，此时索引不能为负值
			if (index < 0)
				throw new IllegalArgumentException(msg(indexObject));

			return index;
		} catch (Exception e) {
			throw new IllegalArgumentException(msg(indexObject));
		}
	}
	
	/**
	 * 
	 */
	public static void clearIndex() {
		ThreadLocalMap.remove(ThreadLocalConstants.DATASOURCE_INDEX);
	}
	
	/**
	 * 
	 * @param indexObject
	 * @return
	 */
	private static String msg(Integer indexObject) {
		return indexObject + " 不是一个有效的数据源索引，索引只能是大于0的数字";
	}
}
