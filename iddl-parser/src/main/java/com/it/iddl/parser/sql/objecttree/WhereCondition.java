/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * where语句的条件
 * @author sihai
 *
 */
public class WhereCondition implements SQLFragment {

	private BindIndexHolder holder=null;

	public final static WhereCondition NULL_WHERE_CONDITION = new WhereCondition();
	private List<OrderByElement> orderByColumnList = new ArrayList<OrderByElement>();
	private List<GroupByElement> groupByColumnList = new ArrayList<GroupByElement>();
	private ORExpressionGroup orExpressionGroup = new ORExpressionGroup();

	public WhereCondition() {
	}
	
	public BindIndexHolder getHolder() {
		return holder;
	}

	public void setHolder(BindIndexHolder holder) {
		this.holder = holder;
	}

	public ORExpressionGroup getExpGroup() {
		return orExpressionGroup;
	}
	
	/**
	 * 清空whereCondition
	 */
	public void clear() {
		orExpressionGroup = null;

		if (null != groupByColumnList) {
			groupByColumnList.clear();
		}

		if (null != orderByColumnList) {
			orderByColumnList.clear();
		}
	}
	public int selfAddAndGet(){
		return holder.selfAddAndGet();
	}
	public void addAndExpression(ExpressionGroup exp) {
		orExpressionGroup.addExpressionGroup(exp);
	}


	public void appendSQL(StringBuilder sb) {

		StringBuilder temp=new StringBuilder();
		orExpressionGroup.appendSQL(temp);
		if(temp.length()!=0){
			sb.append(" WHERE ");
			sb.append(temp);
		}
		if (groupByColumnList.size() != 0) {
			sb.append(" GROUP BY ");
			boolean comma = false;
			for (GroupByElement ol : groupByColumnList) {
				if (comma) {
					sb.append(",");
				}
				comma = true;
				ol.appendSQL(sb);
			}
		}
		if (orderByColumnList.size() != 0) {
			sb.append(" ORDER BY ");
			boolean comma = false;
			for (OrderByElement ol : orderByColumnList) {
				if (comma) {
					sb.append(",");
				}
				comma = true;
				ol.appendSQL(sb);
			}
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		StringBuilder temp=new StringBuilder();
		temp.append(orExpressionGroup.toString());
		if(temp.length()!=0){
			sb.append(" WHERE ");
			sb.append(temp);
		}
		if (groupByColumnList.size() != 0) {
			sb.append(" GROUP BY ");

			boolean appendCommaSpliter = false;
			for (GroupByElement ol : groupByColumnList) {
				if (appendCommaSpliter) {
					sb.append(",");
				}
				appendCommaSpliter = true;
				if (ol.getTable() != null) {
					sb.append(ol.getTable()).append(".");
				}

				sb.append(ol.getName());
				if (ol.isASC()) {
					sb.append(" ASC ");
				} else {
					sb.append(" DESC ");
				}
			}
		}
		if (orderByColumnList.size() != 0) {
			sb.append(" ORDER BY ");

			boolean appendCommaSpliter = false;
			for (OrderByElement ol : orderByColumnList) {
				if (appendCommaSpliter) {
					sb.append(",");
				}
				appendCommaSpliter = true;
				if (ol.getTable() != null) {
					sb.append(ol.getTable()).append(".");
				}

				sb.append(ol.getName());
				if (ol.isASC()) {
					sb.append(" ASC ");
				} else {
					sb.append(" DESC ");
				}
			}
		}
		return sb.toString();
	}
	public Map<String,Comparative> eval(){
		RowJepVisitor visitor=new RowJepVisitor();
		 orExpressionGroup.eval(visitor,false);
		 return visitor.getComparable();
	}


//	public void regTableModifiable(String oraTabName,
//			List<ModifiableTableName> list) {
//		expGroup.regTableModifiable(oraTabName, list);
//		for(OrderByElement ele:orderByColumns){
//			ele.regTableModifiable(oraTabName, list);
//		}
//	}
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		
		if(orExpressionGroup.getExpressions().size()!=0){
			sb.append(" WHERE ");
			sb=orExpressionGroup.regTableModifiable(oraTabName, list, sb);
		}
		if (groupByColumnList.size() != 0) {
			sb.append(" GROUP BY ");
			boolean comma = false;
			for (GroupByElement ol : groupByColumnList) {
				if (comma) {
					sb.append(",");
				}
				comma = true;
				sb=ol.regTableModifiable(oraTabName, list, sb);
			}
		}
		if (orderByColumnList.size() != 0) {
			sb.append(" ORDER BY ");
			boolean comma = false;
			for (OrderByElement ol : orderByColumnList) {
				if (comma) {
					sb.append(",");
				}
				comma = true;
				sb=ol.regTableModifiable(oraTabName, list, sb);
			}
		}
		return sb;
	}
	
	public List<OrderByElement> getOrderByColumnList() {
		return orderByColumnList;
	}

	public void setOrderByColumnList(List<OrderByElement> orderByColumnList) {
		this.orderByColumnList = orderByColumnList;
	}

	public List<GroupByElement> getGroupByColumnList() {
		return groupByColumnList;
	}

	public void setGroupByColumns(List<GroupByElement> groupByColumnList) {
		this.groupByColumnList = groupByColumnList;
	}
}
