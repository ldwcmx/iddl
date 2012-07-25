/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-util
 */
package com.it.iddl.util;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;
import org.apache.zookeeper.server.auth.DigestAuthenticationProvider;

/**
 * 
 * @author sihai
 *
 */
public class ZookeeperUtil {
	
	public static void createZNode(String connectionURL, String userName, String password, String zNode, byte[] value) {
		try {
			List<ACL> aclList = new ArrayList<ACL>();
			aclList.add(new ACL(ZooDefs.Perms.ALL, new Id("digest",DigestAuthenticationProvider.generateDigest(String.format("%s:%s", userName, password)))));
			aclList.add(new ACL(ZooDefs.Perms.READ, Ids.ANYONE_ID_UNSAFE));
			
			ZooKeeper zookeeper = new ZooKeeper(String.format("%s:%d", "localhost", 2181), 5000, new ZookeeperWatcher());
			zookeeper.addAuthInfo("digest", String.format("%s:%s", userName, password).getBytes());
			createIfNeed(zookeeper, zNode, aclList);
			zookeeper.setData(zNode, value, -1);
			zookeeper.close();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException(e);
		} catch (KeeperException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException(e);
		} catch (IOException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException(e);
		} 
	}
	
	private static class ZookeeperWatcher implements Watcher {
		@Override
		public void process(WatchedEvent event) {
			
		}
	}
	
	private static void createIfNeed(ZooKeeper zookeeper, String zNode, List<ACL> aclList) throws InterruptedException, KeeperException {
		StringBuilder path = new StringBuilder("");
		String[] components = zNode.split("/");
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
}
