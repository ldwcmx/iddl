package com.it.iddl.parser.sql.objecttree.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.parser.sql.objecttree.DMLCommon;
import com.it.iddl.parser.sql.objecttree.ExpressionGroup;
import com.it.iddl.parser.sql.objecttree.GroupByElement;
import com.it.iddl.parser.sql.objecttree.OrderByElement;
import com.it.iddl.parser.sql.objecttree.ReplacableWrapper;
import com.it.iddl.parser.sql.objecttree.SetElement;
import com.it.iddl.parser.sql.objecttree.VersionWrapper;
import com.it.iddl.parser.sql.objecttree.WhereCondition;

public class Update extends DMLCommon {

	protected WhereCondition where = null;
	protected List<SetElement> setElements=new ArrayList<SetElement>();
	
	public void addSetElement(String colName,String table,Object obj){
		SetElement set=new SetElement();
		set.col=new ColumnImpl(table,colName,null);
		set.value=obj;
		setElements.add(set);
	}
	public List<SetElement> getSetElements(){
		return setElements;
	}
	public Update() {
		where=getWhereCondition();
		where.setHolder(holder);
	}
	
	protected WhereCondition getWhereCondition(){
		return new WhereCondition();
	}
	public WhereCondition getWhere() {
		return where;
	}

	public void addAndWhereExpressionGroup(ExpressionGroup exp) {
		where.addAndExpression(exp);
	}

	public void appendSQL(StringBuilder sb) {
		appendUpdate(sb);
		super.appendSQL(sb);
		sb.append("SET ");
		boolean comma=false;
		for(SetElement ele:setElements){
			if(comma){
				sb.append(",");
			}
			comma=true;
			ele.appendSQL(sb);
		}
		where.appendSQL(sb);
		
	}
	public Map<String, Comparative> getSubColumnsMap() {
		return where.eval();
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendUpdate(sb);
		sb.append(super.toString());
		sb.append("SET ");
		boolean comma=false;
		for(SetElement ele:setElements){
			if(comma){
				sb.append(",");
			}
			comma=true;
			ele.appendSQL(sb);
		}
		sb.append(where.toString());
		return sb.toString();
	}
	public List<OrderByElement> nestGetOrderByList() {
		return where.getOrderByColumnList();
	}

	@Override
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		appendUpdate(sb);
		return appendUpdateBody(oraTabName, list, sb);
	}
	protected StringBuilder appendUpdateBody(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		sb=super.regTableModifiable(oraTabName, list, sb);
		sb.append("SET ");
		boolean comma=false;
		for(SetElement ele:setElements){
			if(comma){
				sb.append(",");
			}
			comma=true;
			sb=ele.regTableModifiable(oraTabName, list, sb);
		}
		list.add(sb.toString());
		sb=new StringBuilder();
		ReplacableWrapper replace= new VersionWrapper();
		list.add(replace);
		sb=where.regTableModifiable(oraTabName, list, sb);
		return sb;
	}
	protected void appendUpdate(StringBuilder sb) {
		sb.append("UPDATE ");
	}
	
	@Override
	public WhereCondition getSubWhereCondition() {
		return where;
	}
	@Override
	public List<GroupByElement> nestGetGroupByList() {
		return Collections.emptyList();
	}
}
