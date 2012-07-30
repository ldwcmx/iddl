/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.cartesian;

/**
 * 
 * @author sihai
 *
 */
public interface Parent {

	/**
	 * 询问父列有没有值
	 * 
	 * @return
	 */
	public boolean parentHasNext();

	/**
	 * 通知parent进位的方法
	 */
	public void add();
}
