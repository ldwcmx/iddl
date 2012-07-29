/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser;

import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

import com.it.iddl.common.sql.SQLType;
import com.it.iddl.parser.sql.objecttree.DMLCommon;
import com.it.iddl.util.concurrent.BoundedConcurrentHashMap;

/**
 * 
 * @author sihai
 *
 */
public class ParserCache {

	private static final ParserCache instance = new ParserCache();
	public final int capacity;
	private final Map<String, ItemValue> map;
	
	private final ReentrantLock lock = new ReentrantLock();

	private ParserCache() {
		int size = 389;
		String propSize = System.getProperty("com.it.iddl.parser.cachesize");
		if (propSize != null) {
			try {
				size = Integer.parseInt(propSize);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		capacity = size;
		map = new BoundedConcurrentHashMap<String, ItemValue>(capacity);
	}
	
	public static final ParserCache instance() {
		return instance;
	}

	public int size() {
		return map.size();
	}
	
	protected ItemValue get(String sql) {
		return map.get(sql);
	}

	public SQLType getSQLType(String sql) {
		ItemValue itemValue = get(sql);
		if (itemValue != null) {
			return itemValue.getSQLType();
		} else {
			return null;
		}
	}

	public SQLType setSQLTypeIfAbsent(String sql, SQLType sqlType) {
		ItemValue itemValue = get(sql);
		SQLType returnSqlType = null;
		if (itemValue == null) {
			//完全没有的情况，在这种情况下，肯定是因为还没有现成请求过解析某条sql
			lock.lock();
			try {
				// 双检查lock
				itemValue = get(sql);
				if (itemValue == null) {
					itemValue = new ParserCache.ItemValue();
					put(sql, itemValue);
				}
			} finally {
				lock.unlock();
			}
			//cas 更新ItemValue中的SQLType对象
			returnSqlType = itemValue.setSQLTypeIfAbsent(sqlType);
		} else if (itemValue.getSQLType()== null) {
			//cas 更新ItemValue中的SqlType对象
			returnSqlType = itemValue.setSQLTypeIfAbsent(sqlType);
		} else {
			returnSqlType = itemValue.getSQLType();
		}
		return returnSqlType;
	}

	public FutureTask<DMLCommon> getFutureTask(String sql) {
		ItemValue itemValue = get(sql);
		if (itemValue != null) {
			return itemValue.getFutureDMLCommon();
		} else {
			return null;
		}
	}

	public List<Object> getTableNameReplacement(String sql) {
		ItemValue itemValue = get(sql);
		if (itemValue != null) {
			return itemValue.getTableNameReplacement();
		} else {
			return null;
		}
	}

	public List<Object> setTableNameReplacementIfAbsent(String sql, List<Object> tablenameReplacement) {
		ItemValue itemValue = get(sql);
		List<Object> returnList = null;
		if (itemValue == null) {
			//完全没有的情况，在这种情况下，肯定是因为还没有现成请求过解析某条sql
			lock.lock();
			try {
				// 双检查lock
				itemValue = get(sql);
				if (itemValue == null) {
					itemValue = new ParserCache.ItemValue();
					put(sql, itemValue);
				}
			} finally {
				lock.unlock();
			}
			//cas 更新ItemValue中的TableNameReplacement对象
			returnList = itemValue.setTableNameReplacementIfAbsent(tablenameReplacement);
		} else if (itemValue.getTableNameReplacement() == null) {
			//cas 更新ItemValue中的TableNameReplacement对象
			returnList = itemValue.setTableNameReplacementIfAbsent(tablenameReplacement);
		} else {
			returnList = itemValue.getTableNameReplacement();
		}
		return returnList;

	}

	public FutureTask<DMLCommon> setFutureTaskIfAbsent(String sql, FutureTask<DMLCommon> future) {
		ItemValue itemValue = get(sql);
		FutureTask<DMLCommon> returnFutureTask = null;
		if (itemValue == null) {
			//完全没有的情况，在这种情况下，肯定是因为还没有现成请求过解析某条sql
			lock.lock();
			try {
				// 双检查lock
				itemValue = get(sql);
				if (itemValue == null) {
					itemValue = new ParserCache.ItemValue();
					put(sql, itemValue);
				}
			} finally {
				lock.unlock();
			}
			//cas 更新ItemValue中的DMLCommon对象
			returnFutureTask = itemValue.setFutureDMLCommonIfAbsent(future);

		} else if (itemValue.getFutureDMLCommon() == null) {
			//cas 更新ItemValue中的DMLCommon对象
			returnFutureTask = itemValue.setFutureDMLCommonIfAbsent(future);
		} else {
			returnFutureTask = itemValue.getFutureDMLCommon();
		}

		return returnFutureTask;
	}

	protected void put(String sql, ItemValue itemValue) {
		map.put(sql, itemValue);
	}
	
	protected static class ItemValue {

		/**
		 * 数据的CRUD类型
		 */
		private AtomicReference<SQLType> sqlType = new AtomicReference<SQLType>();

		/**
		 * 除去virtualTableName以外的其他sql字段
		 */
		private AtomicReference<List<Object>> tableNameReplacement = new AtomicReference<List<Object>>();

		/**
		 * 缓存的整个sql
		 */
		private AtomicReference<FutureTask<DMLCommon>> futureDMLCommon = new AtomicReference<FutureTask<DMLCommon>>();

		public SQLType getSQLType() {
			return sqlType.get();
		}

		public SQLType setSQLTypeIfAbsent(SQLType sqlTypeinput) {
			//如果原值为null则会原子的设置新值进去。并且返回新值
			if (sqlType.compareAndSet(null, sqlTypeinput)) {
				return sqlTypeinput;
			} else {
				//如果里面的值已经不为null，则读取该值
				return sqlType.get();
			}
		}

		public List<Object> getTableNameReplacement() {
			return tableNameReplacement.get();
		}

		public List<Object> setTableNameReplacementIfAbsent(List<Object> tableNameReplacementList) {
			//如果原值为null则会原子的设置新值进去。并且返回新值
			if (tableNameReplacement.compareAndSet(null, tableNameReplacementList)) {
				return tableNameReplacementList;
			} else {
				//如果里面的值已经不为null，则读取该值
				return tableNameReplacement.get();
			}

		}

		public FutureTask<DMLCommon> getFutureDMLCommon() {
			return futureDMLCommon.get();
		}

		public FutureTask<DMLCommon> setFutureDMLCommonIfAbsent(FutureTask<DMLCommon> future) {
			//如果原值为null则会原子的设置新值进去。并且返回新值
			if (futureDMLCommon.compareAndSet(null, future)) {
				return future;
			} else {
				//如果里面的值已经不为null，则读取该值
				return futureDMLCommon.get();
			}
		}
	}
}
