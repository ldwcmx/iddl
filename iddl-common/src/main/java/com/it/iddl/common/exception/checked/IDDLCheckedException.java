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
public class IDDLCheckedException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7280557852494520365L;
	
	public IDDLCheckedException() {
		super();
	}
	public IDDLCheckedException(Throwable throwable){
		super(throwable);
	}
    public IDDLCheckedException(String message, Throwable cause) {
        super(message, cause);
    }
	public IDDLCheckedException(String arg) {
		super(arg);
	}
}
