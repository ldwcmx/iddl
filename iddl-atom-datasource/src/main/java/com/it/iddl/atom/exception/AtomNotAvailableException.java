/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.exception;

import java.sql.SQLException;

/**
 * 
 * @author sihai
 *
 */
public class AtomNotAvailableException extends SQLException {

	public AtomNotAvailableException() {
		super();
	}

	public AtomNotAvailableException(String msg) {
		super(msg);
	}

	public AtomNotAvailableException(String reason, String SQLState) {
		super(reason, SQLState);
	}

	public AtomNotAvailableException(String reason, String SQLState, int vendorCode) {
		super(reason, SQLState, vendorCode);
	}
}
