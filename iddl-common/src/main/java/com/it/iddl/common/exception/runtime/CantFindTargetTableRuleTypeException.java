/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.exception.runtime;

/**
 * 
 * @author sihai
 *
 */
public class CantFindTargetTableRuleTypeException extends IDDLRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7766252426871121814L;

	public CantFindTargetTableRuleTypeException(String msg) {
		super("无法根据输入的tableRule:"+msg+"找到对应的处理方法。");
	}
}
