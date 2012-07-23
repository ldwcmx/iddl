/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.jdbc.sorter;

import java.sql.SQLException;

/**
 * 
 * @author sihai
 *
 */
public interface ExceptionSorter {

	/**
	 * Evaluates a <code>java.sql.SQLException</code> to determine if
	 * the error was fatal
	 * 
	 * @param e the <code>java.sql.SQLException</code>
	 * 
	 * @return whether or not the exception is vatal.
	 */
	boolean isExceptionFatal(SQLException e);
}
