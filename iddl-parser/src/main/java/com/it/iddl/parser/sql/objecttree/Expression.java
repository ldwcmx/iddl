/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;


/**
 * 表达式
 * 
 * 类似
 * column comparasion value
 * 如
 * col = 1;
 * 或col2 > 2;
 * @author sihai
 *
 */
public interface Expression extends SQLFragment {

	/**
	 *	将表达式col = 1 or col = 2 ...这样的表达式组。抽象为一个map.
	 *	map的key是col，也就是列名
	 *	map的value是值的集合，对应的实际类型是Comparative.
	 *	例如上面的col = 1 or col = 2;
	 *	经过这个方法后，就会被变为col -> (=1 or =2);
	 *
	 *	
	 * @param visitor
	 * @param inAnd 标明当前是否在andExpressionGroup中
	 */
	void eval(RowJepVisitor visitor, boolean inAnd);
}
