/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.common.Config;
import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.rule.engine.entry.TableRule;


/**
 * 
 * @author sihai
 *
 */
public class ModTableProvider extends CommonTableRuleProvider {

	private static final Log logger = LogFactory.getLog(ModTableProvider.class);

	public static final String FUNCTION_NAME_MOD = "mod";

	protected Set<String> addAEqComparabToXXXFix(TableRule tableRule,
			String vTabName, Comparative comparative,int offset, Config config){
		Set<String> temp=new HashSet<String>();
		String expression = tableRule.getExpFunction();
		if (expression.startsWith(FUNCTION_NAME_MOD)) {
			long value = Long.parseLong(comparative.getValue().toString());
			int modulus = Integer.parseInt(expression.substring(FUNCTION_NAME_MOD.length()));

			if (logger.isDebugEnabled()) {
				StringBuilder buffer = new StringBuilder();
				buffer.append("expression = ").append(expression).append(", ");
				buffer.append("value = ").append(value).append(", ");
				buffer.append("modulus = ").append(modulus);

				logger.debug(buffer.toString());
			}
			String n=processOne(Integer.valueOf((int) (value % modulus))+offset, tableRule, vTabName);
			if(n!=null){
				temp.add(n);
			}
		} else {
			throw new IllegalArgumentException("invalid mod expression: " + expression);
		}
		return temp;
	}
	
	protected List<Object> getXxxfixlist(Comparative start, Comparative end,int offset, TableRule tableRule) {
		List<Object> li=new ArrayList<Object>();
		long st = Long.parseLong(start.getValue().toString());
		long ed = Long.parseLong(end.getValue().toString());
		int startType = getType(start);
		int endType = getType(end);
		String expression = tableRule.getExpFunction();
		int modulus = Integer.parseInt(expression.substring(FUNCTION_NAME_MOD.length()));
		if(startType == LESS_GREAT){
			st++;
		}
		if(endType == LESS_OR_EQUAL_GREAT_OR_EQUAL){
			ed++;
		}
		for(long i=st;i<ed;i++){
			li.add(Integer.valueOf((int) (i % modulus)+offset));
		}
		return li;
	}
}
