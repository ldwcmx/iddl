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

import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.util.Utils;

/**
 * 表示in的关系
 * 
 * col not in (？，？，？）。。。
 * 
 * @author sihai
 *
 */
public class NotInExpression implements Expression {

	protected Object left;
	protected Object right;
	protected  int getComparativeOperation(){
		return Comparative.NOT_EQUIVALENT;
	}
	public  String getRelationString(){
		return " not in ";
	}
	public void appendSQL(StringBuilder sb) {
		Utils.appendSQLList(left, sb);
		
		sb.append(getRelationString());
		Utils.appendSQLList(right, sb);
	}
	
	@SuppressWarnings("rawtypes")
	public void eval(RowJepVisitor visitor, boolean inAnd) {
		String colName = null;
		if (left instanceof Column) {
			colName = ((Column) left).getColumn();
		} else if (left instanceof Function) {
			// ifnull(col,0); nvl(col,0)
			colName = ((Function) left).getNestedColumnName();
		} else {
			throw new IllegalArgumentException("不能找到列名，请确保列名在等式左面");
		}
		int operator = getComparativeOperation();

		ComparativeOR or = null;

		if (right instanceof List) {

			List li = (List) right;
			or = new ComparativeOR(li.size());

			for (Object obj : li) {
				
				this.buildOneEqComparative(or, obj, colName, false, operator);
				
			}
			
		} else if (right instanceof Value) {
			
			or = new ComparativeOR();
			
			this.buildOneEqComparative(or, right, colName, inAnd, operator);
			
		} else {
			throw new IllegalStateException(
					"不支持非list或select的情况，这可能是由于不是in函数引起的");
		}

	}
	private void buildOneEqComparative(ComparativeOR comparativeOR,Object right,String colName,boolean inAnd,int operator){
		if (right instanceof Value) {
			
			Value val = (Value) right;
			
			Comparable<?> temp =val.eval();
			
			comparativeOR.addComparative(new Comparative(operator,temp));
			
		}  else {
			//如果不是Value对象
			if(colName==null){
				
				throw new IllegalArgumentException("sql元素："+left+"|"+getRelationString()+"|"+right+"中找到指定的列名");
			}
			if(right instanceof Comparable){
				
				comparativeOR.addComparative(new Comparative(operator,(Comparable<?>) right));
			
			} else {
				
				comparativeOR.addComparative(new Comparative(operator,UnknowValueObject.getUnknowValueObject()));
		
			}
			
		}
	}
	public Object getLeft() {
		return left;
	}
	public void setLeft(Object left) {
		this.left = left;
	}
	public Object getRight() {
		return right;
	}
	public void setRight(Object right) {
		this.right = right;
	}
//	public void regTableModifiable(String oraTabName,
//			List<ModifiableTableName> list) {
//		ModifiedTableUtils.regModifiedTab(left, oraTabName, list);
//		ModifiedTableUtils.regModifiedTab(right, oraTabName, list);
//	}
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		sb=Utils.appendSQLListWithList(oraTabName, left, sb, list);
		sb.append(getRelationString());
		sb=Utils.appendSQLListWithList(oraTabName, right, sb, list);
		return sb;
	}
}
