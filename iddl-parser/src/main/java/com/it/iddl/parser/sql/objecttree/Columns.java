/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.it.iddl.parser.sql.function.Avg;
import com.it.iddl.parser.sql.function.Count;
import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.sql.function.GroupFunctionType;
import com.it.iddl.parser.sql.function.Max;
import com.it.iddl.parser.sql.function.Min;
import com.it.iddl.parser.sql.function.Sum;
import com.it.iddl.parser.sql.objecttree.impl.ColumnImpl;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class Columns implements SQLFragment {

	private List<Column> columns = new ArrayList<Column>();
	private static final Map<Class<? extends Function>, GroupFunctionType> groupfunc = new HashMap<Class<? extends Function>, GroupFunctionType>();
	
	static {
		groupfunc.put(Count.class, GroupFunctionType.COUNT);
		groupfunc.put(Max.class, GroupFunctionType.MAX);
		groupfunc.put(Min.class, GroupFunctionType.MIN);
		groupfunc.put(Avg.class, GroupFunctionType.AVG);
		groupfunc.put(Sum.class, GroupFunctionType.SUM);

	}

	public Column[] getColumns() {
		return columns.toArray(new Column[columns.size()]);

	}

	public GroupFunctionType getSelectType(){
		for(Column col : columns){
			GroupFunctionType type = groupfunc.get(col.getNestClass());
			if(type != null){
				if(columns.size() == 1){
					return type;
				}else{
					return GroupFunctionType.NORMAL;
				}
			}
		}
		return GroupFunctionType.NORMAL;
	}

	public List<Column> getColumnsList() {
		return columns;
	}

	public void setColumns(Column[] columns) {
		this.columns.addAll(Arrays.asList(columns));
	}

	public void setColumns(Collection<Column> cols) {
		this.columns.addAll(cols);
	}

	public void addColumn(String table, String col, String alias) {
		columns.add(new ColumnImpl(table, col, alias));
	}

	public void addColumn(Column col) {
		columns.add(col);
	}

	public void addColumnTabAndCol(String tab, String col) {
		columns.add(new ColumnImpl(tab, col, null));
	}

	public void appendSQL(StringBuilder sb) {
		boolean firstElement = true;
		for (Column col : columns) {
			if (firstElement) {
				firstElement = false;
			} else {
				sb.append(",");
			}
			Utils.appendSQLList(col, sb);
		}
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		boolean firstElement = true;
		for (Column col : columns) {
			if (firstElement) {
				firstElement = false;
			} else {
				sb.append(",");
			}
			sb = Utils.appendSQLListWithList(oraTabName, col, sb, list);
		}
		return sb;
	}

	/**
	 * 将列名的别名和列名本身放入到别名map中。
	 * key会自动转为大写
	 * @param sqlAliasMap
	 */
	public void appendAliasToColumnMap(Map<String, SQLFragment> sqlAliasMap) {
		for (Column col : columns) {
			if (col.getAlias() != null) {
				sqlAliasMap.put(col.getAlias().toUpperCase(), col);
			}
		}
	}
	
	/**
	 * 返回用String形式封装好的Column列表---当为Distinct函数时，分库分表需要获取Distinct后面的作用的columns的每个列的名称
	 * @return
	 */
	public List<String> getColumnList2String(){
		List<Column> list=getColumnsList();
		List<String> columnList2String=new ArrayList<String>();
		for(Column col:list){
			col.toString();
			StringBuilder sb=new StringBuilder();
			col.appendSQL(sb);
			columnList2String.add(sb.toString().trim());
		}
		return columnList2String;
	}
}
