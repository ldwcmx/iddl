/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.config;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.zookeeper.AsyncCallback.StatCallback;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.KeeperException.Code;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import com.iacrqq.util.StringUtil;
import com.it.iddl.config.exception.ConfigException;

/**
 * 基于zookeeper的配置管理器
 * @author sihai
 *
 */
public class ZookeeperConfigManager extends AbstractConfigManager {
	
	private static Log logger = LogFactory.getLog(ZookeeperConfigManager.class);
	
	private static final String ZOOKEEPER_ATOM_DATA_SOURCE_NODE_FORMAT = "/iddl/atom/{0}/{1}";
	private static final String ZOOKEEPER_GROUP_DATA_SOURCE_NODE_FORMAT = "/iddl/group/{0}/{1}";
	
	private static String DEFAULT_CACHE_DIRECTORY = "/tmp/iddl/zookeeper";
	private static String CACHE_FILE_NAME  = "zookeeper.cache";
	
	private ZookeeperConfig zookeeperConfig;
	private String    cacheFileName;
	private ZooKeeper zookeeper;
	private ZookeeperDataMonitor dataMonitor;
	
	private List<String> configIdList;							// 
	private volatile boolean connected2ConfigCenter = false;
	private CountDownLatch latch;
	
	private Map<String, String> cache;
	private ReentrantReadWriteLock _cache_rw_lock_;		// protect cache
	
	@Override
	protected String getValue(String configId) throws ConfigException {
		
		// 先走cache
		try {
			_cache_rw_lock_.readLock().lock();
			String value = cache.get(configId);
			if(null != value) {
				return value;
			}
		} finally {
			_cache_rw_lock_.readLock().unlock();
		}
		
		// cache未命中
		try {
			String value = new String(zookeeper.getData(configId, null, null));
			// 缓存
			if(null != value) {
				try {
					_cache_rw_lock_.writeLock().lock();
					cache.put(configId, value);
					// 更新cache文件
					this.updateCacheFile(this.cacheFileName);
				} finally {
					_cache_rw_lock_.writeLock().unlock();
				}
			}
			return value;
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new ConfigException(e);
		}  catch (KeeperException e) {
			logger.error(e);
			throw new ConfigException(e);
		}
	}

	@Override
	protected void monitor(String configId) {
		synchronized(configIdList) {
			configIdList.add(configId);
		}
		zookeeper.exists(configId, true, dataMonitor, null);
	}

	@Override
	protected void unmonitor(String configId) {
		synchronized(configIdList) {
			configIdList.remove(configId);
		}
		
		try {
			_cache_rw_lock_.writeLock().lock();
			cache.remove(configId);
		} finally {
			_cache_rw_lock_.writeLock().unlock();
		}
	}

	@Override
	public void init(Object config) throws ConfigException {
		zookeeperConfig = (ZookeeperConfig)config;
		configIdList = new ArrayList<String>();
		// init cache directory
		File cacheDirectory = new File(zookeeperConfig.getCacheDirecory());
		if(!cacheDirectory.exists()) {
			cacheDirectory.mkdirs();
		}
		_cache_rw_lock_ = new ReentrantReadWriteLock();
		// restore from cache file
		cacheFileName = String.format("%s%s%s", zookeeperConfig.getCacheDirecory(), File.separator, CACHE_FILE_NAME);
		restoreFromCacheFile(cacheFileName);
		
		connected2ConfigCenter = false;
		try {
			connect2Zookeeper(cache.isEmpty(), DEFAULT_TIMEOUT);
			if(connected2ConfigCenter) {
				logger.info(String.format("Connected to config center, host:%s, port:%d", zookeeperConfig.getZookeeperHost(), zookeeperConfig.getZookeeperPort()));
			}
		} catch (IOException e) {
			logger.error(String.format("Can not connect to config center, host:%s, port:%d, so try to use local configuration", zookeeperConfig.getZookeeperHost(), zookeeperConfig.getZookeeperPort()));
		}
		
		if(cache.isEmpty()) {
			if(!connected2ConfigCenter) {
				throw new RuntimeException(String.format("Failed restore cache from cache file:%s, and can not connect to config center, host:%s, port:%s", cacheDirectory + File.separator + CACHE_FILE_NAME, zookeeperConfig.getZookeeperHost(), zookeeperConfig.getZookeeperPort()));
			}
		}
	}

	@Override
	public void stop() throws ConfigException {
		if(null != configIdList) {
			configIdList.clear();
		}
		if(null != zookeeper) {
			try {
				zookeeper.close();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				throw new ConfigException(e);
			}
		}
		if(null != cache) {
			cache.clear();
		}
	}
	
	@Override
	public String makeAtomConfigId(String appName, String dbKey) {
		return MessageFormat.format(ZOOKEEPER_ATOM_DATA_SOURCE_NODE_FORMAT, appName, dbKey);
	}
	
	@Override
	public String makeGroupConfigId(String appName, String groupKey) {
		return MessageFormat.format(ZOOKEEPER_GROUP_DATA_SOURCE_NODE_FORMAT, appName, groupKey);
	}
	
	/**
	 * 
	 * @param zNode
	 * @throws InterruptedException
	 * @throws KeeperException
	 */
	private void _changed_(String zNode) throws InterruptedException, KeeperException {
		
		synchronized(configIdList) {
			if(!configIdList.contains(zNode)) {
				return;
			}
			
			try {
				_cache_rw_lock_.writeLock().lock();
				String value = null;
				String oldValue = null;
				
				value = new String(zookeeper.getData(zNode, null, null));
				oldValue = cache.get(zNode);
				if(!StringUtil.equals(value, oldValue)) {
					cache.put(zNode, value);
					this.changed(zNode, value);
					logger.warn(String.format("zNode:%s changed, old value:%s, new value:%s", zNode, oldValue, value));
				}
				
				updateCacheFile(cacheFileName);
			} finally {
				_cache_rw_lock_.writeLock().unlock();
			}
		}
	}
	
	/**
	 * 
	 * @param cacheFileName
	 */
	private void restoreFromCacheFile(String cacheFileName) {
		
		try {
			_cache_rw_lock_.writeLock().lock();
			ObjectInputStream reader = null;
			try {
				reader = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(cacheFileName))));
				if(cache != null) {
					cache.clear();
				}
				cache = (Map<String, String>)reader.readObject();
			} catch (ClassNotFoundException e) {
				logger.warn(String.format("Restore cache from cache file:%s, failed", cacheFileName), e);
			} catch(IOException e) {
				logger.warn(String.format("Restore cache from cache file:%s, failed", cacheFileName), e);
			} finally {
				if(reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						logger.error(String.format("Close cache file:%s, failed", cacheFileName), e);
					}
				}
			}
			
			// 
			if(null == cache) {
				cache = new HashMap<String, String>();
			}
			
		} finally {
			_cache_rw_lock_.writeLock().unlock();
		}
	}

	/**
	 * 本方法假设您已经持有_cache_rw_lock_读锁,或写锁
	 * @param cacheFileName
	 */
	private void updateCacheFile(String cacheFileName) {
		ObjectOutputStream writer = null;
		try {
			writer = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(cacheFileName))));
			writer.writeObject(cache);
			writer.flush();
		} catch(IOException e) {
			logger.warn(String.format("Write cache to cache file:%s, failed", cacheFileName), e);
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					logger.error(String.format("Close cache file:%s, failed", cacheFileName), e);
				}
			}
		}
	}
	
	private void connect2Zookeeper(boolean sync, int timeout) throws IOException {
		zookeeper = new ZooKeeper(String.format("%s:%d", zookeeperConfig.getZookeeperHost(), zookeeperConfig.getZookeeperPort()), timeout, new ZookeeperWatcher());
		if(sync) {
			latch = new CountDownLatch(1);
			try {
				latch.await(timeout * 2, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				logger.error(String.format("Waiting connect to config center, host:%s port:%d, exception:", zookeeperConfig.getZookeeperHost(), zookeeperConfig.getZookeeperPort()), e);
				Thread.currentThread().interrupt();
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
			
			if(null == dataMonitor) {
				dataMonitor = new ZookeeperDataMonitor(zookeeper, null);
			}
			
			dataMonitor.process(event);
		}
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	public class ZookeeperDataMonitor implements Watcher, StatCallback {

	    private Watcher chainedWatcher;
	    public ZookeeperDataMonitor(ZooKeeper zookeeper, Watcher chainedWatcher) {
	        this.chainedWatcher = chainedWatcher;
	        // Get things started by checking if the node exists. We are going
	        // to be completely event driven
	        //zookeeper.exists(databaseZnode, true, this, null);
	        //zookeeper.exists(appZnode, true, this, null);
	    }

	    public void process(WatchedEvent event) {
	        String path = event.getPath();
	         if(event.getType() != Event.EventType.None) {
	            if (path != null && configIdList.contains(path)) {
	                // Something has changed on the node, let's find out
	                zookeeper.exists(path, true, this, null);
	            }
	        }
	        if (chainedWatcher != null) {
	            chainedWatcher.process(event);
	        }
	    }

	    public void processResult(int rc, String path, Object ctx, Stat stat) {
	        boolean exists;
	        switch (rc) {
	        case Code.Ok:
	            exists = true;
	            break;
	        case Code.NoNode:
	            exists = false;
	            break;
	        case Code.SessionExpired:
	        case Code.NoAuth:
	        	connected2ConfigCenter = false;
	            return;
	        default:
	            // Retry errors
	            zookeeper.exists(path, true, this, null);
	            return;
	        }
	        
	        if(exists) {
		        try {
	        		_changed_(path);
	        	} catch (KeeperException e) {
	        		logger.error(String.format("Get %s config from config center, host:%s, port:%d failed", path, zookeeperConfig.getZookeeperHost(), zookeeperConfig.getZookeeperPort()), e);
	        	} catch (InterruptedException e) {
	        		logger.error(String.format("Get %s config from config center, host:%s, port:%d failed", path, zookeeperConfig.getZookeeperHost(), zookeeperConfig.getZookeeperPort()), e);
	        		Thread.currentThread().interrupt();
	        	}
	        } else {
	        	// TODO
	        }
	    }
	}
	
	/**
	 * Zookeeper配置
	 * @author sihai
	 *
	 */
	public static class ZookeeperConfig {
		
		private String    zookeeperHost = DEFAULT_CONFIG_SERVER_ZOOKEEPER_HOST;
		private int		  zookeeperPort = DEFAULT_CONFIG_SERVER_ZOOKEEPER_PORT;
		private String    cacheDirecory = DEFAULT_CACHE_DIRECTORY;
		
		public String getZookeeperHost() {
			return zookeeperHost;
		}

		public void setZookeeperHost(String zookeeperHost) {
			this.zookeeperHost = zookeeperHost;
		}

		public int getZookeeperPort() {
			return zookeeperPort;
		}

		public void setZookeeperPort(int zookeeperPort) {
			this.zookeeperPort = zookeeperPort;
		}
		
		public String getCacheDirecory() {
			return cacheDirecory;
		}

		public void setCacheDirecory(String cacheDirecory) {
			this.cacheDirecory = cacheDirecory;
		}

		/**
		 * 从properties加载
		 * @param properties
		 * @return
		 */
		public static ZookeeperConfig fromProperties(Properties properties) {
			ZookeeperConfig config = new ZookeeperConfig();
			
			if(properties.contains(CONFIG_SERVER_SERVER_HOST)) {
				config.zookeeperHost = (String)properties.get(CONFIG_SERVER_SERVER_HOST);
			}
			if(properties.contains(CONFIG_SERVER_SERVER_PORT)) {
				config.zookeeperPort = Integer.valueOf((String)properties.get(CONFIG_SERVER_SERVER_PORT));
			}
			if(properties.contains(CONFIG_MANAGER_CACHE_DIRECTORY)) {
				config.cacheDirecory = (String)properties.get(CONFIG_MANAGER_CACHE_DIRECTORY);
			}
			return config;
		}
	}
}
