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
public class GroupException extends Exception {

	public GroupException() {
		super();
	}

	public GroupException(String msg) {
		super(msg);
	}

	public GroupException(Throwable cause) {
		super(cause);
	}

	public GroupException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
