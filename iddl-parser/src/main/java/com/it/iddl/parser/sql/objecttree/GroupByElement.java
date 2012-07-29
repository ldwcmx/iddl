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
 * SELECT name, COUNT(*) FROM table GROUP BY table.name
 * 					   				-------------------
 * @author sihai
 *
 */
public class GroupByElement implements SQLFragment {

	private String table;		// 
	private String name;		// 
	private boolean isASC;		// 
	
	public GroupByElement(String table, String name, boolean isASC) {
		this.table = table;
		this.name = name;
		this.isASC = isASC;
	}
	
	public String getTable() {
		return table;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isASC() {
		return isASC;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public void appendSQL(StringBuilder sb) {
		if (table!= null) {
			sb.append(table).append(".");
		}
		sb.append(name);
		if (isASC) {
			sb.append(" ASC ");
		} else {
			sb.append(" DESC ");
		}		
	}
	
	@Override
	public StringBuilder regTableModifiable(Set<String> logicTableNames, List<Object> list, StringBuilder sb) {
		if(table != null){
			if(logicTableNames.contains(table)){
				if(sb != null) {
					list.add(sb.toString());
					TableWrapper wr = new TableWrapper();
					wr.setOriginalTableName(table);
					list.add(wr);
					sb = new StringBuilder();
					sb.append(".");
				} else {
					throw new IllegalStateException("wrong state");
				}
			}else{
				sb.append(table).append(".");
			}
		}
		sb.append(name);
		if (isASC) {
			sb.append(" ASC ");
		} else {
			sb.append(" DESC ");
		}
		return sb;
	}
}
