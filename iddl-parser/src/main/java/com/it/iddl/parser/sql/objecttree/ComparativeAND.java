/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.parser.sql.objecttree;


/**
 *
 * AND节点
 * 在实际的SQL中，实际上是类似
 * [Comparative]              [comparative]
 * 			\                  /
 * 			  \				  /
 *             [ComparativeOR]
 *             
 * @author sihai
 *
 */
public class ComparativeAND extends ComparativeBaseList {

	public ComparativeAND(int function, Comparable<?> value) {
		super(function, value);
	}
	
	public ComparativeAND(){};
	
	public ComparativeAND(Comparative item){
		super(item);
	}
	
	public ComparativeAND(int capacity){
		super(capacity);
	}
	
	@Override
	protected String getRelation() {
		return " and ";
	}
}
