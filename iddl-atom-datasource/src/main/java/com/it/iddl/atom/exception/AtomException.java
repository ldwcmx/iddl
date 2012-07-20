/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.exception;

/**
 * 
 * @author sihai
 *
 */
public class AtomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8892974702400679531L;

	public AtomException() {
		super();
	}

	public AtomException(String msg) {
		super(msg);
	}

	public AtomException(Throwable cause) {
		super(cause);
	}

	public AtomException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
