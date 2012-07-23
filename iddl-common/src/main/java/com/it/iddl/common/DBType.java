/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.common;


/**
 * 数据库类型枚举类型
 * 
 * @author sihai
 *
 */
public enum DBType {

	ORACLE(DBConstants.DEFAULT_ORACLE_DRIVER_CLASS, DBConstants.DEFAULT_ORACLE_SORTER_CLASS),
	MYSQL(DBConstants.DEFAULT_MYSQL_DRIVER_CLASS, DBConstants.DEFAULT_MYSQL_SORTER_CLASS),
	POSTGRESQL(DBConstants.DEFAULT_POSTGRESQL_DRIVER_CLASS, DBConstants.DEFAULT_POSTGRESQL_SORTER_CLASS);
	
	private String driverClassName;
	private String sorterClassName;

	DBType(String driverClassName, String sorterClassName) {
		this.driverClassName = driverClassName;
		this.sorterClassName = sorterClassName;
	}

	public static DBType getAtomDbTypeEnumByType(String type) {
		/*
		if (StringUtil.isNotBlank(type)) {
			for (AtomDbTypeEnum typeEnum : AtomDbTypeEnum.values()) {
				if (typeEnum.getType().equals(type.toUpperCase().trim())) {
					return typeEnum;
				}
			}
		}
		return null;
		*/
		try {
			return DBType.valueOf(type.trim().toUpperCase());
		} catch (Exception e) {
			return null;
		}
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getSorterClassName() {
		return sorterClassName;
	}

	/*public String getType() {
		return type;
	}*/
}
