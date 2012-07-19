/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom.exception;

/**
 * <p>
 * 
 * </p>
 * @author sihai
 *
 */
public class AtomIllegalException extends AtomException {

	private static final long serialVersionUID = -5341803227125385166L;

	public AtomIllegalException() {
		super();
	}

	public AtomIllegalException(String msg) {
		super(msg);
	}

	public AtomIllegalException(Throwable cause) {
		super(cause);
	}

	public AtomIllegalException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
