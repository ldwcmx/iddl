/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.exception;

/**
 * 
 * @author sihai
 *
 */
public class AtomDataSourceException extends RuntimeException {

	public AtomDataSourceException() {
		super();
	}

	public AtomDataSourceException(String msg) {
		super(msg);
	}

	public AtomDataSourceException(Throwable cause) {
		super(cause);
	}

	public AtomDataSourceException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
