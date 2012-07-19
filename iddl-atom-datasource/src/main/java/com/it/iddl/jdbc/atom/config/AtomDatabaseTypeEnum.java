/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom.config;

import com.it.iddl.jdbc.atom.common.AtomConstants;

/**
 * 数据库类型枚举类型
 * 
 * @author sihai
 *
 */
public enum AtomDatabaseTypeEnum {

	ORACLE(AtomConstants.DEFAULT_ORACLE_DRIVER_CLASS, AtomConstants.DEFAULT_ORACLE_SORTER_CLASS),

	MYSQL(AtomConstants.DEFAULT_MYSQL_DRIVER_CLASS, AtomConstants.DEFAULT_MYSQL_SORTER_CLASS);

	private String driverClassName;
	private String sorterClassName;

	AtomDatabaseTypeEnum(String driverClassName, String sorterClassName) {
		this.driverClassName = driverClassName;
		this.sorterClassName = sorterClassName;
	}

	public static AtomDatabaseTypeEnum getAtomDbTypeEnumByType(String type) {
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
			return AtomDatabaseTypeEnum.valueOf(type.trim().toUpperCase());
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
