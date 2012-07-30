/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.entry;

/**
 * 
 * @author sihai
 *
 */
public abstract class SharedElement {

	private String id;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * 如果用户通过map的方式设置子节点，则在init的过程中会将map的key作为子节点的id设置进来。
	 * 如果用户采用list的方式设置子节点，则list的下标的string会成为子节点的id.
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void init() {
		
	}
}
