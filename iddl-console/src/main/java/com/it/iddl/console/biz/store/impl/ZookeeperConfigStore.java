/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.biz.store.impl;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;
import org.apache.zookeeper.server.auth.DigestAuthenticationProvider;

import com.iacrqq.util.StringUtil;
import com.it.iddl.console.biz.ConfigManager;
import com.it.iddl.console.biz.store.ConfigStore;

/**
 * 基于zookeeper实现的ConfigStore
 * @author sihai
 *
 */
public class ZookeeperConfigStore implements ConfigStore {

	private static Log logger = LogFactory.getLog(ZookeeperConfigStore.class);
	
	private String    connectionURL;
	private ZooKeeper zookeeper;
	private String administrator;
	private String password;
	private List<ACL> aclList;
	private String    root = DEFAULT_ZOOKEEPER_ROOT;
	private volatile boolean connected2ConfigCenter = false;
	private CountDownLatch latch;
	
	@Override
	public void init(Properties properties) {
		connectionURL = properties.getProperty(CONNECTION_URL);
		if(StringUtil.isBlank(connectionURL)) {
			throw new IllegalArgumentException(String.format("Please assign %s", CONNECTION_URL));
		}
		if(properties.containsKey(ZOOKEEPER_ROOT)) {
			root = properties.getProperty(ZOOKEEPER_ROOT);
		}
		administrator = properties.getProperty(ConfigManager.CONSOLE_ADMINISTRATOR);
		password = properties.getProperty(ConfigManager.CONSOLE_PASSWORD);
		try {
			connect2Zookeeper(true, DEFAULT_TIMEOUT);
		} catch (IOException e) {
			throw new RuntimeException("Connect to store failed.", e);
		}
		try {
			aclList = new ArrayList<ACL>();
			aclList.add(new ACL(ZooDefs.Perms.ALL, new Id("digest",DigestAuthenticationProvider.generateDigest(String.format("%s:%s", administrator, password)))));
			aclList.add(new ACL(ZooDefs.Perms.READ, Ids.ANYONE_ID_UNSAFE));
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void store(String key, String value) {
		checkConnection();
		try {
			createIfNeed(key);
			zookeeper.setData(key, value.getBytes(), -1);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException("Store data failed.", e);
		} catch (KeeperException e) {
			throw new RuntimeException("Store data failed.", e);
		}
	}

	@Override
	public void remove(String key) {
		checkConnection();
		try {
			zookeeper.delete(key, -1);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException("Store data failed.", e);
		} catch (KeeperException e) {
			throw new RuntimeException("Store data failed.", e);
		}
	}

	@Override
	public String get(String key) {
		checkConnection();
		try {
			byte[] bytes = zookeeper.getData(key, null, null);
			if(null != bytes) {
				return new String(bytes);
			} else {
				return "";
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException("Store data failed.", e);
		} catch (KeeperException e) {
			throw new RuntimeException("Store data failed.", e);
		}
	}

	@Override
	public Map<String, String> list() {
		checkConnection();
		try {
			Map<String, String> resultMap = new HashMap<String, String>();
			processChild("", root, resultMap);
			return resultMap;
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException("Store data failed.", e);
		} catch (KeeperException e) {
			throw new RuntimeException("Store data failed.", e);
		}
	}
	
	/**
	 * 
	 * @param sync
	 * @param timeout
	 * @throws IOException
	 */
	private void connect2Zookeeper(boolean sync, int timeout) throws IOException {
		zookeeper = new ZooKeeper(connectionURL, timeout, new ZookeeperWatcher());
		zookeeper.addAuthInfo("digest", String.format("%s:%s", administrator, password).getBytes());
		if(sync) {
			latch = new CountDownLatch(1);
			try {
				latch.await(timeout * 2, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				logger.error(String.format("Waiting connect to store server, connectionURL:%s, exception:", connectionURL), e);
				Thread.currentThread().interrupt();
			}
		}
	}
	
	private void checkConnection() {
		if(!connected2ConfigCenter) {
			throw new RuntimeException("Not connected to store server");
		}
	}
	
	private void processChild(String parent, String child, Map<String, String> resultMap) throws InterruptedException, KeeperException {
		String path = parent + (child.startsWith("/") ? "" : "/") + child;
		List<String> children = zookeeper.getChildren(path, false);
		if(!children.isEmpty()) {
			for(String c : children) {
				processChild(path, c, resultMap);
			}
		} else {
			resultMap.put(path, get(path));
		}
	}
	
	private void createIfNeed(String key) throws InterruptedException, KeeperException {
		StringBuilder path = new StringBuilder("");
		String[] components = key.split("/");
		int length = components.length;
		if(length > 2) {
			for(int i = 1; i < length; i++) {
				path.append("/");
				path.append(components[i]);
				if(null == zookeeper.exists(path.toString(), null)) {
					zookeeper.create(path.toString(), null, aclList, CreateMode.PERSISTENT);
				}
			}
		}
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	private class ZookeeperWatcher implements Watcher {
		@Override
		public void process(WatchedEvent event) {
			if(event.getType() == Event.EventType.None) {
	            // We are are being told that the state of the
	            // connection has changed
	            switch (event.getState()) {
	            case SyncConnected:
	                // In this particular example we don't need to do anything
	                // here - watches are automatically re-registered with 
	                // server and any watches triggered while the client was 
	                // disconnected will be delivered (in order of course)
	            	connected2ConfigCenter = true;
	            	if(null != latch) {
	            		latch.countDown();
	            	}
	                break;
	            case Expired:
	                // It's all over
	            	connected2ConfigCenter = false;
	                break;
	            }
	        }
		}
	}
}
