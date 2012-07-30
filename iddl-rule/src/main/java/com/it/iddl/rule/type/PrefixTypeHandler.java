/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.rule.engine.entry.TableRule;

/**
 * 
 * @author sihai
 *
 */
public class PrefixTypeHandler implements TableNameTypeHandler {

	private static final Log logger = LogFactory.getLog(PrefixTypeHandler.class);
	
	public List<String> buildPhysicTable(List<Object> xxxfixes, TableRule tableRule, String vTable) {
		List<String> physicsTable = new ArrayList<String>();
		for (Object preo : xxxfixes) {
			String obj=buildOnePhsicTable(preo,tableRule,vTable);
			if(obj!=null){
				physicsTable.add(obj);
			}
		}
		if(physicsTable.size()==0){
			logger.warn(vTable+"没有一个符合要求的实际表，请检查tableRule是否填写正确，尤其是allowTable中是否填写了指定的表");
		}
		return physicsTable;
	}

	public Collection<String> buildAllPassableTable(
			Collection<String> collection, int step, String tab,
			int start, int end, String padding, int placeholderbit)  {
		for (int i = start; i <= end; i = i + step) {
			StringBuilder sb = new StringBuilder();
			sb.append(TypeHandlerUtils.placeHolder(placeholderbit, i));
			sb.append(padding);
			sb.append(tab);
			String obj=sb.toString();
			collection.add(obj);
		}
		return collection;
	}

	public Collection<String> buildAllPassableTable(
			Collection<String> collection, int step, int step2, String tab,
			int start, int start2, int end, int end2, String padding,
			int placeholderbit) {
		for (int i = start; i <= end; i = i + step) {
			for (int j = start2; j <= end2; j = j + step2) {
				StringBuilder sb = new StringBuilder();
				sb.append(TypeHandlerUtils.placeHolder(placeholderbit, i));
				sb.append(padding);
				sb.append(TypeHandlerUtils.placeHolder(placeholderbit, j));
				sb.append(padding);
				sb.append(tab);
				String obj = sb.toString();
				collection.add(obj);
			}
		}
		return collection;
	}
	
	public String buildOnePhsicTable(Object preo, TableRule tableRule, String vTable) {
		Integer pre=Integer.valueOf(0); 
		if(preo instanceof Integer){
			pre=(Integer)preo;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(TypeHandlerUtils.placeHolder(tableRule.getWidth(), pre));
		sb.append(tableRule.getPadding());
		sb.append(vTable);
		String table = sb.toString();
		String obj=table.toLowerCase();
		if (tableRule.containThisTable(obj)) {
				return obj;
		}
		return null;
	}
}
