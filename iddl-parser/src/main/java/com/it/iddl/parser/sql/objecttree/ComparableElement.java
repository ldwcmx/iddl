/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

public class ComparableElement {

	public int  operator;
	public Comparable<?> comparable;
	/**
	 * 这个参数目前只用是用来表示in的时候是false,其他时候都是true.or表达式会在Or表达式内自己做处理
	 */
	public boolean isAnd;
	
	/**
	 * 
	 * @param comp
	 * @param isAnd
	 * @param operator
	 */
	public ComparableElement(Comparable<?> comparable, boolean isAnd, int operator) {
		this.comparable = comparable;
		this.isAnd = isAnd;
		this.operator = operator;
	}
}
