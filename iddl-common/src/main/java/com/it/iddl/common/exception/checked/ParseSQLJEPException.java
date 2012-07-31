/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.exception.checked;

/**
 * 
 * @author sihai
 *
 */
public class ParseSQLJEPException extends IDDLCheckedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4239900403275031209L;

	public ParseSQLJEPException(Throwable t){
		super("调用sqlJep的parseExpression的时候发生错误"+t.getMessage());
	}
}
