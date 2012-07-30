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
public class IDDLRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6546001888182290887L;
	
	public IDDLRuntimeException(String arg) {
		super(arg);
	}
	
	public IDDLRuntimeException() {
		super();
	}
    
	public IDDLRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public IDDLRuntimeException(Throwable throwable){
		super(throwable);
	}
}
