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
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.common.jdbc.sorter.ExceptionSorter;
import com.it.iddl.group.exception.NoMoreDataSourceException;
import com.it.iddl.group.jdbc.GroupDataSourceWrapper;

/**
 * 按优先级选择的selector
 * 
 * 每次选择只从优先级最高的一组DB中选择，若都不可用，才继续在下一个优先级的DB组中选择
 * 
 * 优先级相同的DB还用随机选择
 * 
 * 原始需求：TC要求在每个dbgroup中优先读备库，当备库不可用时，自动读主库 
 * 扩展需求：一主多备，优先随机读备库。当备库都不可用时，才读主库
 * 
 * 为了方便处理和接口一致，有如下要求： 
 * 1. 目前只支持读分优先级组 
 * 2. 一个权重推送的信息中，。。。 
 * 3. 一个数据源只能在一个优先级组中？
 * 
 * @author sihai
 * 
 */
public class PriorityDbGroupSelector extends AbstractDBSelector {

	private static final Log logger = LogFactory.getLog(PriorityDbGroupSelector.class);
	
	/**
	 * 按优先级顺序存放数据库组。元素0优先级最高。每个EquityDbManager元素代表具有相同优先级的一组数据库
	 */
	private EquityDbManager[] priorityGroups;
	
	public PriorityDbGroupSelector(EquityDbManager[] priorityGroups) {
		if (priorityGroups == null || priorityGroups.length == 0) {
			throw new IllegalArgumentException("Parameter priorityGroups must not be null or empty.");
		}
		this.priorityGroups = priorityGroups;
	}
	
	@Override
	protected DataSourceHolder findDataSourceWrapperByIndex(int dataSourceIndex) {
		for (int i = 0; i < priorityGroups.length; i++) {
			DataSourceHolder holder = priorityGroups[i].findDataSourceWrapperByIndex(dataSourceIndex);
			if (holder != null)
				return holder;

		}
		return null;
	}

	@Override
	protected <T> T tryExecuteInternal(
			Map<DataSource, SQLException> failedDataSources,
			DataSourceTryer<T> tryer, int times, Object... args)
			throws SQLException {
		final List<SQLException> historyExceptions = new ArrayList<SQLException>(0);
		DataSourceTryer<T> wrapperTryer = new DataSourceTryerWrapper<T>(tryer, historyExceptions); //移花接木

		for (int i = 0; i < priorityGroups.length; i++) {
			try {
				return priorityGroups[i].tryExecute(failedDataSources, wrapperTryer, times, args);
			} catch (NoMoreDataSourceException e) {
				logger.warn("NoMoreDataSource for retry for priority group " + i);
			}
		}
		//所有的优先级组都不可用，则抛出异常
		return tryer.onSQLException(historyExceptions, exceptionSorter, args);
	}

	@Override
	public GroupDataSourceWrapper get(String dsKey) {
		for (int i = 0; i < priorityGroups.length; i++) {
			GroupDataSourceWrapper ds = priorityGroups[i].get(dsKey);
			if (ds != null) {
				return ds;
			}
		}
		return null;
	}

	@Override
	public Map<String, DataSource> getDataSources() {
		throw new UnsupportedOperationException("Not supported");
	}

	@Override
	public DataSource select() {
		for (int i = 0; i < priorityGroups.length; i++) {
			DataSource ds = priorityGroups[i].select();
			if (null != ds) {
				return ds;
			}
		}
		return null;
	}

	@Override
	public void setReadable(boolean readable) {
		super.setReadable(readable);
		for (int i = 0; i < priorityGroups.length; i++) {
			priorityGroups[i].setReadable(readable);
		}
	}

	@Override
	public void setSupportRetry(boolean isSupportRetry) {
		super.setSupportRetry(isSupportRetry);
		for (int i = 0; i < priorityGroups.length; i++) {
			priorityGroups[i].setSupportRetry(isSupportRetry);
		}
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 * @param <T>
	 */
	private static class DataSourceTryerWrapper<T> implements DataSourceTryer<T> {
		private final List<SQLException> historyExceptions;
		private final DataSourceTryer<T> tryer;

		public DataSourceTryerWrapper(DataSourceTryer<T> tryer, List<SQLException> historyExceptions) {
			this.tryer = tryer;
			this.historyExceptions = historyExceptions;
		}

		public T onSQLException(List<SQLException> exceptions, ExceptionSorter exceptionSorter, Object... args)
				throws SQLException {
			if (null != exceptions && !exceptions.isEmpty()) {
				Exception last = exceptions.get(exceptions.size() - 1);
				if (last instanceof NoMoreDataSourceException) {
					exceptions.remove(exceptions.size() - 1);
				}
				historyExceptions.addAll(exceptions);
				throw (NoMoreDataSourceException) last;
			} else {
				return tryer.onSQLException(exceptions, exceptionSorter, args);
			}
		}

		public T tryOnDataSource(GroupDataSourceWrapper dsw, Object... args) throws SQLException {
			return tryer.tryOnDataSource(dsw, args);
		}
	};
}
