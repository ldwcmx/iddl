/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.common;

import com.iacrqq.util.StringUtil;

/**
 * 数据库状态枚举
 * @author sihai
 *
 */
public enum DBStatus {

	R_STAUTS(DBConstants.DB_STATUS_R), W_STATUS(DBConstants.DB_STATUS_W), RW_STATUS(DBConstants.DB_STATUS_RW), NA_STATUS(
			DBConstants.DB_STATUS_NA);

	private String status;

	DBStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public static DBStatus getAtomDbStatusEnumByType(String type) {
		DBStatus statusEnum = null;
		if (StringUtil.isNotBlank(type)) {
			String typeStr = type.toUpperCase().trim();
			if (typeStr.length() > 1) {
				if (DBStatus.NA_STATUS.getStatus().equals(typeStr)) {
					statusEnum = DBStatus.NA_STATUS;
				} else if (!StringUtil.contains(typeStr, DBStatus.NA_STATUS.getStatus())
								&&StringUtil.contains(typeStr, DBStatus.R_STAUTS.getStatus())
								&& StringUtil.contains(typeStr, DBStatus.W_STATUS.getStatus())) {
					statusEnum = DBStatus.RW_STATUS;
				}
			} else {
				if (DBStatus.R_STAUTS.getStatus().equals(typeStr)) {
					statusEnum = DBStatus.R_STAUTS;
				} else if (DBStatus.W_STATUS.getStatus().equals(typeStr)) {
					statusEnum = DBStatus.W_STATUS;
				}
			}
		}
		return statusEnum;
	}

	public boolean isNaStatus() {
		return this == DBStatus.NA_STATUS;
	}

	public boolean isRstatus() {
		return this == DBStatus.R_STAUTS || this == DBStatus.RW_STATUS;
	}

	public boolean isWstatus() {
		return this == DBStatus.W_STATUS || this == DBStatus.RW_STATUS;
	}

	public boolean isRWstatus() {
		return this == DBStatus.RW_STATUS;
	}
}
