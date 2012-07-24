package com.it.iddl.common.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetFloatHandler implements ParameterHandler {
	public void setParameter(PreparedStatement stmt, Object[] args)
			throws SQLException {
		stmt.setFloat((Integer) args[0], (Float) args[1]);
	}
}
