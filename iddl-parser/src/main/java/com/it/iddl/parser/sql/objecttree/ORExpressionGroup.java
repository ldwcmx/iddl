/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class ORExpressionGroup extends ExpressionGroup {

	public String getConjunction() {
		return " or ";
	}

	public void eval(RowJepVisitor visitor, boolean inAnd) {
		RowJepVisitor[] viss=new RowJepVisitor[expressionList.size()];
		int i=0;
		for (Expression e : expressionList) {
			viss[i]=new RowJepVisitor();
			e.eval( viss[i],false);
			i++;
		}
		Map<String, Comparative> retMap=new HashMap<String, Comparative>();
		//共需要做n次合并
		for(int j=0;j<viss.length;j++){
			Map<String, Comparative> n= viss[j].getComparable();
			for(Entry<String, Comparative> ent:n.entrySet()){
				String key=ent.getKey();
				Comparative val=ent.getValue();
				Comparative temp=retMap.get(key);
				//为空的时候把当前的And树放在Map中
				if(temp==null){
					retMap.put(key, val);
				}else{
					//如果不为空则在上面添加一个OR节点。
					ComparativeOR or=new ComparativeOR();
					or.addComparative(temp);
					or.addComparative(val);
					retMap.put(key,or);
				}
				
			}
		}
		visitor.setComparable(retMap);
	}
	public void appendSQL(StringBuilder sb) {
		boolean appendSplitter = false;
		for (SQLFragment expression : expressionList) {
			if (appendSplitter) {
				sb.append(getConjunction());
			} else {
				appendSplitter = true;
			}
				Utils.appendSQL(expression, sb);
		}
	}
	@Override
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		boolean appendSplitter = false;
		for (SQLFragment expression : expressionList) {
			if (appendSplitter) {
				sb.append(getConjunction());
			} else {
				appendSplitter = true;
			}
				sb=Utils.appendSQLWithList(oraTabName, expression, sb, list);
		}
		return sb;
	}
}
