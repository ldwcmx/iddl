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
 * OR节点
 * 在实际的SQL中，实际上是类似
 * [Comparative]              [comparative]
 * 			\                  /
 * 			  \				  /
 *             [ComparativeOR]
 *             
 * @author sihai
 *
 */
public class ComparativeOR extends ComparativeBaseList {

	public ComparativeOR(int function, Comparable<?> value) {
		super(function, value);
	}
	
	public ComparativeOR(){};
	
	public ComparativeOR(Comparative item){
		super(item);
	}
	
	public ComparativeOR(int capacity){
		super(capacity);
	}
	
	@Override
	protected String getRelation() {
		return " or ";
	}
}
