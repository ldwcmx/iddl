/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.config;

import com.iacrqq.util.StringUtil;
import com.it.iddl.atom.common.AtomConstants;

/**
 * ��ݿ�״̬ö������
 * @author sihai
 *
 */
public enum AtomDatabaseStatusEnum {

	R_STAUTS(AtomConstants.DB_STATUS_R), W_STATUS(AtomConstants.DB_STATUS_W), RW_STATUS(AtomConstants.DB_STATUS_RW), NA_STATUS(
			AtomConstants.DB_STATUS_NA);

	private String status;

	AtomDatabaseStatusEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public static AtomDatabaseStatusEnum getAtomDbStatusEnumByType(String type) {
		AtomDatabaseStatusEnum statusEnum = null;
		if (StringUtil.isNotBlank(type)) {
			String typeStr = type.toUpperCase().trim();
			if (typeStr.length() > 1) {
				if (AtomDatabaseStatusEnum.NA_STATUS.getStatus().equals(typeStr)) {
					statusEnum = AtomDatabaseStatusEnum.NA_STATUS;
				} else if (!StringUtil.contains(typeStr, AtomDatabaseStatusEnum.NA_STATUS.getStatus())
								&&StringUtil.contains(typeStr, AtomDatabaseStatusEnum.R_STAUTS.getStatus())
								&& StringUtil.contains(typeStr, AtomDatabaseStatusEnum.W_STATUS.getStatus())) {
					statusEnum = AtomDatabaseStatusEnum.RW_STATUS;
				}
			} else {
				if (AtomDatabaseStatusEnum.R_STAUTS.getStatus().equals(typeStr)) {
					statusEnum = AtomDatabaseStatusEnum.R_STAUTS;
				} else if (AtomDatabaseStatusEnum.W_STATUS.getStatus().equals(typeStr)) {
					statusEnum = AtomDatabaseStatusEnum.W_STATUS;
				}
			}
		}
		return statusEnum;
	}

	public boolean isNaStatus() {
		return this == AtomDatabaseStatusEnum.NA_STATUS;
	}

	public boolean isRstatus() {
		return this == AtomDatabaseStatusEnum.R_STAUTS || this == AtomDatabaseStatusEnum.RW_STATUS;
	}

	public boolean isWstatus() {
		return this == AtomDatabaseStatusEnum.W_STATUS || this == AtomDatabaseStatusEnum.RW_STATUS;
	}

	public boolean isRWstatus() {
		return this == AtomDatabaseStatusEnum.RW_STATUS;
	}
}
