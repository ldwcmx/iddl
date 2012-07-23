/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.exception;

import java.sql.SQLException;

/**
 * 当一组的数据库都试过，都不可用了，并且没有更多的数据源了，抛出该错误
 * @author sihai
 *
 */
public class NoMoreDataSourceException extends SQLException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5563119460701735886L;

	public NoMoreDataSourceException(String reason) {
		super(reason);
	}
}
