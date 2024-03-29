/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.dbselector;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.common.weight.WeightRandom;
import com.it.iddl.group.exception.NoMoreDataSourceException;
import com.it.iddl.group.jdbc.GroupDataSourceWrapper;
import com.it.iddl.util.NagiosUtil;

/**
 * <p>对等数据库管理器</p>
 * <p>可以是读对等：如多个读库，每个库的数据完全相同。对等读取</p>
 * <p>可以是写对等：如日志库，每个库数据不同，一条数据写入哪个库都可以。对等写入</p>
 *
 * <p>支持动态推送权重，动态加减库</p>
 *
 * @author sihai
 *
 */
public class EquityDbManager extends AbstractDBSelector {

	private static final Log logger = LogFactory.getLog(EquityDbManager.class);
	
	private Map<String /* dsKey */, DataSourceHolder> dataSourceMap;
	private WeightRandom weightRandom;
	private final Random random;
	
	public EquityDbManager(Map<String, GroupDataSourceWrapper> dataSourceWrapperMap, Map<String, Integer> weightMap) {
		this.dataSourceMap = new HashMap<String, DataSourceHolder>(dataSourceWrapperMap.size());
		for (Map.Entry<String, GroupDataSourceWrapper> e : dataSourceWrapperMap.entrySet()) {
			this.dataSourceMap.put(e.getKey(), new DataSourceHolder(e.getValue()));
		}
		this.weightRandom = new WeightRandom(weightMap);
		random = new Random();
	}
	
	/**
	 * 分流：随机返回权重串里包含值为dataSourceIndex的i的数据源
	 * 如果权重串没有定义i/I，则dataSourceIndex等于几，就路由到group中的第几个的数据源
	 *
     * 一个db可以同时配置多个i；不同的db可以配置相同的i，例如权重串= db0:rwi0i2, db1:ri1, db2:ri1, db3:ri2 则
     *     用户指定dataSourceIndex=0，路由到db0；（只有db0有i0）
     *     用户指定dataSourceIndex=1，随机路由到db1和db2；（db1和db2都有i1）
     *     用户指定dataSourceIndex=2，随机路由到db0和db3；（db0和db3都有i2）
     * 如果没有配置i，例如db0:rw, db1:r; 指定dataSourceIndex=1则路由到db1
	 */
	@Override
	protected DataSourceHolder findDataSourceWrapperByIndex(int dataSourceIndex) {
		List<DataSourceHolder> holders = new ArrayList<DataSourceHolder>();
		for (DataSourceHolder dsh : dataSourceMap.values()) {
			if (dsh.gdsw.isMatchDataSourceIndex(dataSourceIndex))
				holders.add(dsh);
		}

		if (!holders.isEmpty()) {
			return holders.get(random.nextInt(holders.size()));
		} else {
			return null;
		}
	}
	
	/**
	 * 在所管理的数据库上重试执行一个回调操作。失败了根据权重选下一个库重试
	 * 以根据权重选择到的DataSource，和用户传入的自用参数args，重试调用DataSourceTryer的tryOnDataSource方法
	 * @param failedDataSources 已知的失败DS及其异常
	 * @param args 透传到DataSourceTryer的tryOnDataSource方法中
	 * @return null表示执行成功。否则表示重试次内执行失败，返回SQLException列表
	 */
	@Override
	protected <T> T tryExecuteInternal(
			Map<DataSource, SQLException> failedDataSources,
			DataSourceTryer<T> tryer, int times, Object... args)
			throws SQLException {
		
		// 如果不支持重试，把times设为1就可以了
		if (!this.isSupportRetry) {
			times = 1;
		}
		WeightRandom wr = this.weightRandom;
		List<SQLException> exceptions = new ArrayList<SQLException>(0);
		List<String> excludeKeys = new ArrayList<String>(0);
		if (failedDataSources != null) {
			exceptions.addAll(failedDataSources.values());
			times = times - failedDataSources.size(); //扣除已经失败掉的重试次数
			for (SQLException e : failedDataSources.values()) {
				if (!exceptionSorter.isExceptionFatal(e)) {
					// 有一个异常（其实是最后加入的异常，因map无法知道顺序，只能遍历）不是数据库不可用异常，则抛出
					// 是不是应该在发现非数据库fatal之后就立刻抛出，而不是放到failedDataSources这个map里?
					return tryer.onSQLException(exceptions, exceptionSorter, args);
				}
			}
		}
		for (int i = 0; i < times; i++) {
			String name = selectAliveKey(wr, excludeKeys);
			if (name == null) {
				// 为了扩展
				exceptions.add(new NoMoreDataSourceException("tryTime:" + i + ", excludeKeys:" + excludeKeys
						+ ", weightConfig:" + wr.getWeightConfig()));
				break;
			}

			DataSourceHolder dsHolder = dataSourceMap.get(name);
			if (dsHolder == null) {
				//不应该出现的。初始化逻辑应该保证空的数据源(null)不会被加入dataSourceMap
				throw new IllegalStateException("Can't find DataSource for name:" + name);
			}
			if (failedDataSources != null && failedDataSources.containsKey(dsHolder.gdsw)) {
				excludeKeys.add(name);
				i--; //这次不算重试次数
				continue;
			}

			try {
				if (dsHolder.isNotAvailable) {
					boolean toTry = System.currentTimeMillis() - dsHolder.lastRetryTime > retryBadDbInterval;
					if (toTry && dsHolder.lock.tryLock()) {
						try {
							T t = tryer.tryOnDataSource(dsHolder.gdsw, args); 	//同一个时间只会有一个线程继续使用这个数据源。
							dsHolder.isNotAvailable = false; 					//用一个线程重试，执行成功则标记为可用，自动恢复
							return t;
						} finally {
							dsHolder.lastRetryTime = System.currentTimeMillis();
							dsHolder.lock.unlock();
						}
					} else {
						excludeKeys.add(name); //其他线程跳过已经标记为notAvailable的数据源
						i--; //这次不算重试次数
						continue;
					}
				} else {
					return tryer.tryOnDataSource(dsHolder.gdsw, args); //有一次成功直接返回
				}
			} catch (SQLException e) {
				exceptions.add(e);
				boolean isFatal = exceptionSorter.isExceptionFatal(e);
				if (isFatal) {
					NagiosUtil.warn(NagiosUtil.KEY_DB_NOT_AVAILABLE + "|" + name, e.getMessage());
					dsHolder.isNotAvailable = true;
				}
				if (!isFatal || failedDataSources == null) {
					//throw e; //如果不是数据库不可用异常，或者不要求重试，直接抛出
					break;
				}
				logger.warn(new StringBuilder().append(i + 1).append("th try locate on [").append(name).append(
						"] failed:").append(e.getMessage()).toString()); //这里不打异常栈了,全部重试失败才由调用者打
				excludeKeys.add(name);
			}
		}
		return tryer.onSQLException(exceptions, exceptionSorter, args);
	}

	
	/**
	 * 返回指定dsKey对应的数据源。若对应数据源的当前权重为0，则返回null
	 */
	@Override
	public GroupDataSourceWrapper get(String dsKey) {
		DataSourceHolder holder = dataSourceMap.get(dsKey);
		Integer weigthValue = this.weightRandom.getWeightConfig().get(dsKey);
		if (weigthValue == null || weigthValue.equals(0))
			return null;
		return holder == null ? null : holder.gdsw;
	}

	@Override
	public Map<String, DataSource> getDataSources() {
		Map<String, DataSource> dsMap = new HashMap<String, DataSource>(dataSourceMap.size());
		for (Map.Entry<String, DataSourceHolder> e : dataSourceMap.entrySet()) {
			dsMap.put(e.getKey(), e.getValue().gdsw);
		}
		return dsMap;
	}

	@Override
	public DataSource select() {
		String key = selectAliveKey(weightRandom, null);
		if (null != key) {
			return this.get(key);
		} else {
			return null;
		}
	}
	
	/**
	 * 
	 * @param weightRandom
	 * @param excludeKeys
	 * @return
	 */
	private static String selectAliveKey(WeightRandom weightRandom, List<String> excludeKeys) {
		if (null == excludeKeys) {
			excludeKeys = new ArrayList<String>();
		}
		return weightRandom.select(excludeKeys);
	}
}
