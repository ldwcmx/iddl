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
public class SuffixTypeHandler implements TableNameTypeHandler {

	private static final Log logger = LogFactory.getLog(SuffixTypeHandler.class);
	
	public List<String> buildPhysicTable(List<Object> xxxfixes, TableRule tableRule,
			String vTable) {
		List<String> physicsTab = new ArrayList<String>();
		for (Object sufo : xxxfixes) {
			String obj=buildOnePhsicTable(sufo,tableRule,vTable);
			if(obj!=null){
				physicsTab.add(obj);
				}
		}
		if(physicsTab.size()==0){
			logger.warn(vTable+"没有一个符合要求的实际表，请检查tableRule是否填写正确，尤其是allowTable中是否填写了指定的表");
		}
		return physicsTab;
	}
	public Collection<String> buildAllPassableTable(
			Collection<String> collection, int step, String tab, int start,
			int end, String padding, int placeholderbit) {
		for (int i = start; i <= end; i = i + step) {
			StringBuilder sb = new StringBuilder();
			sb.append(tab);
			sb.append(padding);
			sb.append(TypeHandlerUtils.placeHolder(placeholderbit, i));
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
				sb.append(tab);
				sb.append(padding);
				sb.append(TypeHandlerUtils.placeHolder(placeholderbit, i));
				sb.append(padding);
				sb.append(TypeHandlerUtils.placeHolder(placeholderbit, j));
				String obj = sb.toString();
				collection.add(obj);
			}
		}
		return collection;
	}

	
	public String buildOnePhsicTable(Object sufo, TableRule tableRule,
			String vTable) {

		StringBuilder sb = new StringBuilder();
		sb.append(vTable);
		Integer suf=Integer.valueOf(0); 
		if(sufo instanceof Integer){
			suf=(Integer)sufo;
		}
		sb.append(tableRule.getPadding());
		sb.append(TypeHandlerUtils.placeHolder(tableRule.getWidth(), suf));
		String table = sb.toString();
		String obj=table.toLowerCase();
		
		if (tableRule.containThisTable(obj)) {
			return obj;
		}
		return null;
	}
}
