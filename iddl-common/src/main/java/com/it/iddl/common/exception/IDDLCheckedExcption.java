/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.exception;

/**
 * 
 * @author sihai
 *
 */
public class IDDLCheckedExcption extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7280557852494520365L;
	
	public IDDLCheckedExcption() {
		super();
	}
	public IDDLCheckedExcption(Throwable throwable){
		super(throwable);
	}
    public IDDLCheckedExcption(String message, Throwable cause) {
        super(message, cause);
    }
	public IDDLCheckedExcption(String arg) {
		super(arg);
	}
}
