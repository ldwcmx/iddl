/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.atom.common;

import java.text.MessageFormat;
import java.util.Map;

import com.iacrqq.util.StringUtil;

/**
 * 
 * @author sihai
 *
 */
public class AtomCononectionURLTool {

	private static MessageFormat MYSQL_URL_FORMAT = new MessageFormat("jdbc:mysql://{0}:{1}/{2}");
	private static MessageFormat ORACLE_URL_THIN_FORMAT = new MessageFormat("jdbc:oracle:thin:@{0}:{1}:{2}");
	private static MessageFormat ORACLE_URL_OCI_FORMAT = new MessageFormat("jdbc:oracle:oci:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST={0})(PORT={1})))(CONNECT_DATA=(SERVER=DEDICAT)(SERVICE_NAME={2})))");
	
	/**
	 * 
	 * @param ip
	 * @param port
	 * @param sid
	 * @param connectionType
	 * @return
	 */
	public static final String getOracleConnectionURL(String ip, String port, String sid, String connectionType) {
		if (StringUtil.isBlank(connectionType) || AtomConstants.DEFAULT_ORACLE_CON_TYPE.equals(connectionType.toLowerCase().trim())) {
			return ORACLE_URL_OCI_FORMAT.format(new String[]{ip, port, sid});
		} else {
			return ORACLE_URL_THIN_FORMAT.format(new String[]{ip, port, sid});
		}
	}
	
	/**
	 * 
	 * @param ip
	 * @param port
	 * @param dbName
	 * @param prams
	 * @return
	 */
	public static final String getMySqlConURL(String ip, String port, String dbName, Map<String, String> prams) {
		String connectionURL = MYSQL_URL_FORMAT.format(new String[] { ip, port, dbName });
		if (null == prams || prams.isEmpty()) {
			prams = AtomConstants.DEFAULT_MYSQL_CONNECTION_PROPERTIES;
		}
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : prams.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			if (StringUtil.isNotBlank(key) && StringUtil.isNotBlank(value)) {
				sb.append(key);
				sb.append("=");
				sb.append(value);
				sb.append("&");
			}
		}
		String pramStr = StringUtil.substringBeforeLast(sb.toString(), "&");
		connectionURL = connectionURL + "?" + pramStr;
		return connectionURL;
	}
}
