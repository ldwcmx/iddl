/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom.common;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Atom����Դ�ĳ���������
 *
 * @author qihao
 *
 */
public class AtomConstants {

	public final static String DEFAULT_DIAMOND_GROUP = null;

	public final static String DEFAULT_MYSQL_CHAR_SET = "gbk";

	//public final static String ORACLE_DBTYPE_STR = "ORACLE";

	//public final static String MYSQL_DBTYPE_STR = "MYSQL";

	public final static String DEFAULT_ORACLE_CON_TYPE = "oci";

	public final static String DB_STATUS_R = "R";

	public final static String DB_STATUS_W = "W";

	public final static String DB_STATUS_RW = "RW";

	public final static String DB_STATUS_NA = "NA";

	public static Map<String, String> DEFAULT_ORACLE_CONNECTION_PROPERTIES = new HashMap<String, String>(
			2);
	static {
		AtomConstants.DEFAULT_ORACLE_CONNECTION_PROPERTIES.put(
				"SetBigStringTryClob", "true");
		AtomConstants.DEFAULT_ORACLE_CONNECTION_PROPERTIES.put(
				"defaultRowPrefetch", "50");
	}

	public static Map<String, String> DEFAULT_MYSQL_CONNECTION_PROPERTIES = new HashMap<String, String>(
			1);
	static {
		AtomConstants.DEFAULT_MYSQL_CONNECTION_PROPERTIES.put(
				"characterEncoding", "gbk");
	}

	public final static String DEFAULT_ORACLE_DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";

	public final static String DEFAULT_MYSQL_DRIVER_CLASS = "com.mysql.jdbc.Driver";

	public final static String DEFAULT_ORACLE_SORTER_CLASS = "com.taobao.datasource.resource.adapter.jdbc.vendor.OracleExceptionSorter";

	public final static String DEFAULT_MYSQL_SORTER_CLASS = "com.taobao.datasource.resource.adapter.jdbc.vendor.MySQLExceptionSorter";


	public final static String MYSQL_INTEGRATION_SORTER_CLASS = "com.mysql.jdbc.integration.jboss.ExtendedMysqlExceptionSorter";

	public final static String DEFAULT_MYSQL_VALID_CONNECTION_CHECKERCLASS = "com.mysql.jdbc.integration.jboss.MysqlValidConnectionChecker";

	/**
	 * ȫ������dataIdģ��
	 */
	private static MessageFormat GLOBAL_FORMAT = new MessageFormat(
			"com.taobao.tddl.atom.global.{0}");

	/**
	 * Ӧ������dataIdģ��
	 */
	private static MessageFormat APP_FORMAT = new MessageFormat(
			"com.taobao.tddl.atom.app.{0}.{1}");

	private static MessageFormat PASSWD_FORMAT = new MessageFormat(
			"com.taobao.tddl.atom.passwd.{0}.{1}.{2}");

	/**
	 * dbNameģ��
	 */
	private static MessageFormat DB_NAME_FORMAT = new MessageFormat(
			"atom.dbkey.{0}^{1}");

	/**
	 * ����dbKey��ȡȫ������dataId
	 *
	 * @param dbKey
	 *            ���ݿ���KEY
	 * @return
	 */
	public static String getGlobalDataId(String dbKey) {
		return GLOBAL_FORMAT.format(new Object[] { dbKey });
	}

	/**
	 * ����Ӧ������dbKey��ȡָ����Ӧ������dataId
	 *
	 * @param appName
	 * @param dbKey
	 * @return
	 */
	public static String getAppDataId(String appName, String dbKey) {
		return APP_FORMAT.format(new Object[] { appName, dbKey });
	}

	/**
	 * ����dbKey��userName��ö�Ӧ��passwd��dataId
	 *
	 * @param dbKey
	 * @param userName
	 * @return
	 */
	public static String getPasswdDataId(String dbName, String dbType,
			String userName) {
		return PASSWD_FORMAT.format(new Object[] { dbName, dbType, userName });
	}

	/**
	 * @param appName
	 * @param dbkey
	 * @return
	 */
	public static String getDbNameStr(String appName, String dbkey) {
		return DB_NAME_FORMAT.format(new Object[] { appName, dbkey });
	}
}
