/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.jdbc.atom;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.jdbc.atom.config.AtomDataSourceConfigManager;
import com.it.iddl.jdbc.atom.config.DataSourceConfig;
import com.it.iddl.jdbc.atom.config.impl.ZookeeperAtomDataSourceConfigManager;
import com.it.iddl.jdbc.atom.config.listener.DataSourceConfigListener;
import com.it.iddl.jdbc.atom.exception.AtomException;

/**
 * <p>
 * ֧�ֶ�̬���õ�ԭ������Դ, ��Ӧһ�����ݿ������Դ,
 * ֧���������Ķ�̬����������Ϣ, ������Ϣ�����, ����Դ�Զ��޷���������
 * </p>
 * @author sihai
 *
 */
public class DynamicAtomDataSource extends AbstractAtomDataSource {

private static Log logger = LogFactory.getLog(DynamicConfigSupporter.class);
	
	private String appName;						// ϵͳ�����Ӧ������
	private String dbKey;						// ϵͳ��������ݿ�key
	
	private volatile DataSourceConfig config;	// ����ʱ����
	private DataSourceConfig localConfig;		// ���ȵı�������
	
	private AtomDataSourceConfigManager configManager;
	
	public void init() throws AtomException {
		
		// Ĭ��ʹ��zookeeper
		configManager = new ZookeeperAtomDataSourceConfigManager();
		configManager.init(null);
		
		DataSourceConfig config = configManager.getConfig(appName, dbKey);
		// 
		build(config);
		
		configManager.register(new DataSourceConfigListener() {
			@Override
			public void changed(DataSourceConfig newConfig) {
				// ˢ������Դ
				reflush(newConfig);
			}
		});
	}
	
	
	@Override
	public void destroy() throws AtomException {
		// TODO Auto-generated method stub
	}

	@Override
	public void flush()  {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected DataSource getDataSource() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * ��������Դ
	 * @param config
	 */
	private void build(DataSourceConfig config) {
		
	}
	
	/**
	 * ˢ������Դ
	 * @param newConfig
	 */
	private void reflush(DataSourceConfig newConfig) {
		
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDbKey() {
		return dbKey;
	}

	public void setDbKey(String dbKey) {
		this.dbKey = dbKey;
	} 
}
