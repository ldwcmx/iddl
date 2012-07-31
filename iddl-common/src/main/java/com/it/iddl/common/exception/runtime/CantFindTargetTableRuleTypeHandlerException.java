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
public class CantFindTargetTableRuleTypeHandlerException extends IDDLRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7766252426871121814L;

	public CantFindTargetTableRuleTypeHandlerException(String msg) {
		super("无法找到"+msg+"对应的处理器");
	}
}
