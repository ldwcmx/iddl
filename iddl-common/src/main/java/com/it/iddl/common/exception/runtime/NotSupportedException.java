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
public class NotSupportedException extends IDDLRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 84544997509385299L;

	public NotSupportedException(String msg) {
		super(msg);
	}
	
	public NotSupportedException() {
		super();
	}
    
	public NotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public NotSupportedException(Throwable throwable){
		super(throwable);
	}
}
