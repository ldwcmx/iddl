/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.util;

import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.sql.objecttree.Constant;
import com.it.iddl.parser.sql.objecttree.SQLFragment;
import com.it.iddl.parser.sql.objecttree.Select;
import com.it.iddl.parser.sql.objecttree.TableName;
import com.it.iddl.parser.sql.objecttree.UnknowValueObject;
import com.it.iddl.parser.sql.objecttree.Value;
import com.it.iddl.parser.sql.objecttree.impl.TableNameFunctionImpl;
import com.it.iddl.parser.sql.objecttree.impl.TableNameImpl;
import com.it.iddl.parser.sql.objecttree.impl.TableNameSubQueryImpl;

/**
 * 
 * @author sihai
 *
 */
public class Utils {

	private final static Object[] ARRAYOBJ = new Object[] {};


	public static void appendSQL(Object obj, StringBuilder sb) {
		if(obj instanceof Select){
			sb.append("(");
			((SQLFragment) obj).appendSQL(sb);
			sb.append(")");
		}else if (obj instanceof SQLFragment) {
			((SQLFragment) obj).appendSQL(sb);
		} else if(obj instanceof String) {
			sb.append("'").append(obj).append("'");
		} else {
			sb.append(obj);
		}
	}

	public static Comparable<?> getVal(List<Object> args,Object target){
		if(target instanceof Value){
			return ((Value) target).getValue(args);
		}else if(target instanceof Comparable){
			return (Comparable<?>)target;
		}else{
			//Column 这类的。直接返回不可比较对象
			return UnknowValueObject.getUnknowValueObject();
		}
	}
	public static StringBuilder appendSQLWithList(Set<String> oraTabName,Object obj, StringBuilder sb,List<Object> list) {
		if(obj instanceof Select){
			sb.append("(");
			sb=((SQLFragment) obj).regTableModifiable(oraTabName, list, sb);
			sb.append(")");
		}else if (obj instanceof SQLFragment) {
			sb=((SQLFragment) obj).regTableModifiable(oraTabName, list, sb);
		} else if(obj instanceof String) {
			sb.append("'").append(obj).append("'");
		} else {
			sb.append(obj);
		}
		return sb;
	}

	/**
	 * 处理内联ListValueObject
	 * 
	 * @param obj
	 * @param sb
	 */
	@SuppressWarnings("rawtypes")
	public static StringBuilder appendSQLListWithList(Set<String> oraTabName,Object obj, StringBuilder sb,List<Object> list) {

		if (obj instanceof List) {
			boolean splider = false;
			sb.append("(");
			for (Object innerObj : (List) obj) {

				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				sb=appendSQLListWithList(oraTabName,innerObj, sb,list);
			}
			sb.append(")");
		} else if (obj != null
				&& ARRAYOBJ.getClass().isAssignableFrom(obj.getClass())) {
			boolean splider = false;
			for (Object innerObj : (Object[]) obj) {
				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				sb=appendSQLWithList(oraTabName,innerObj, sb,list);
			}
		} else {
			sb=appendSQLWithList(oraTabName,obj, sb,list);
		}
		return sb;
	}
	/**
	 * 处理内联ListValueObject
	 * 
	 * @param obj
	 * @param sb
	 */
	@SuppressWarnings("unchecked")
	public static void appendSQLList(Object obj, StringBuilder sb) {

		if (obj instanceof List) {
			boolean splider = false;
			sb.append("(");
			for (Object innerObj : (List<Object>) obj) {

				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				appendSQLList(innerObj, sb);
			}
			sb.append(")");
		} else if (obj != null
				&& ARRAYOBJ.getClass().isAssignableFrom(obj.getClass())) {
			boolean splider = false;
			for (Object innerObj : (Object[]) obj) {
				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				appendSQL(innerObj, sb);
			}
		} else {
			appendSQL(obj, sb);
		}
	}
	
	public static void toString(Object obj, StringBuilder sb) {
		if (obj instanceof SQLFragment) {
			if(Constant.useToString(obj)) {
				sb.append(obj.toString());
			} else {
				((SQLFragment) obj).appendSQL(sb);
			}
		} else if(obj==null){
			throw new RuntimeException("expression中的值不能为null,如果想使用null请使用DBFunctions提供的NULL");
		} else if(obj instanceof String) {
			sb.append("'").append(obj).append("'");
		} else {
			sb.append(obj);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void listToString(Object obj, StringBuilder sb) {
		if (obj instanceof List) {
			boolean splider = false;
			for (Object innerObj : (List<Object>) obj) {

				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				listToString(innerObj, sb);
			}
		} else if (obj != null
				&& ARRAYOBJ.getClass().isAssignableFrom(obj.getClass())) {
			boolean splider = false;
			for (Object innerObj : (Object[]) obj) {
				if (splider) {
					sb.append(",");
				} else {
					splider = true;
				}
				toString(innerObj, sb);
			}
		} else {
			toString(obj, sb);
		}
	}

	/**
	 * 添加一个tableName对象，因为是在创建sql的walker方法中调用 因此被设计为非线程安全的以提升性能。 不能在除了sql
	 * walker以外的其他的方调用这个方法
	 * 
	 * @param tableName
	 * @param schemaName
	 * @param alias
	 */
	public static TableName getTableNameAndSchemaName(String tableName, String schemaName,
			String alias) {
		TableNameImpl temp = new TableNameImpl();
		temp.setTablename(tableName);
		temp.setSchemaName(schemaName);
		temp.setAlias(alias);
		return temp;
	}	
	public static TableName getTableNameAndSchemaName(String tableName, String schemaName,
			String alias, boolean isOracle) {
		TableNameImpl temp = new TableNameImpl(isOracle);
		temp.setTablename(tableName);
		temp.setSchemaName(schemaName);
		temp.setAlias(alias);
		return temp;
	}
	/**
	 * 添加一个query的tableName对象 not thread safe 不要在除mysql walker以外的地方调用此方法
	 * 
	 * @param select
	 * @param alias
	 */
	public static TableName getTableSubQuery(Select select, String alias) {
		TableNameSubQueryImpl tab = new TableNameSubQueryImpl();
		tab.setSubSelect(select);
		tab.setAlias(alias);
		return tab;
	}
	public static TableName getTableFunction(Function func, String alias) {
		TableNameFunctionImpl tab = new TableNameFunctionImpl(func, alias);
		return tab;
	}
	public static TableName getTableSubQuery(Select select, String alias, boolean isOracle) {
		TableNameSubQueryImpl tab = new TableNameSubQueryImpl(isOracle);
		tab.setSubSelect(select);
		tab.setAlias(alias);
		return tab;
	}
	public static TableName getTableFunction(Function func, String alias, boolean isOracle) {
		TableNameFunctionImpl tab = new TableNameFunctionImpl(func, alias, isOracle);
		return tab;
	}
}
