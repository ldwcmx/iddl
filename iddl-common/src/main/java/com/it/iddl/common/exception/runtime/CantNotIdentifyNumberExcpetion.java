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
public class CantNotIdentifyNumberExcpetion extends IDDLRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5930054240160107470L;

	public CantNotIdentifyNumberExcpetion(String input,String input1,Throwable e) {
		super(String.format("关键字：%s,或：%s 不能识别为一个数，请重新设定", input, input1), e);
	}
}
