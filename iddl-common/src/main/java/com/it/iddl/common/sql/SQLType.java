/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.sql;


/**
 * 
 * @author sihai
 *
 */
public enum SQLType {
	SELECT(0),
	INSERT(1),
	UPDATE(2),
	DELETE(3),
	SELECT_FOR_UPDATE(4),
	REPLACE(5),
	TRUNCATE(6),
	CREATE(7),
	DROP(8),
	LOAD(9),
	MERGE(10),
	SHOW(11),
	ALTER(12),
	DEFAULT_SQL_TYPE(-100);
	
	private int i;

	private SQLType(int i) {
		this.i = i;
	}

	public int value() {
		return this.i;
	}

	public static SQLType valueOf(int i) {
		for (SQLType t : values()) {
			if (t.value() == i) {
				return t;
			}
		}
		throw new IllegalArgumentException("Invalid SqlType:" + i);
	}
}
