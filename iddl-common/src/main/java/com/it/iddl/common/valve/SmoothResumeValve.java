/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.common.valve;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.util.PropertyUtil;

/**
 * <p>
 * 平滑阀门。用于可用性状态切换。
 * 解决不可用到可用时，瞬间的流量、连接等的暴增冲击问题
 * </p>
 * <p>
 * 第一批只允许执行1次，第二批允许执行2次，。。。最后一批之后不再限制(batchLimits)
 * 每一批的名额用尽，要间隔timeDelay毫秒后，才开始下一批名额的发放。
 * 在这个间隔时间期间的请求直接拒绝。
 * </p>
 * <p>
 * 允许负数的limit，含义为1/n的概率去执行。具体见构造函数
 * </p>
 * @author sihai
 *
 */
public class SmoothResumeValve {
	
	private static final Log logger = LogFactory.getLog(SmoothResumeValve.class);

	private volatile boolean available = true;
	private volatile boolean isInSmooth = false; 			// 是否处于平滑过渡期
	private final AtomicInteger count = new AtomicInteger();
	private final AtomicInteger batchNo = new AtomicInteger();
	private final int[] batchLimits;
	private final AtomicInteger rejectCount = new AtomicInteger();
	private final long timeDelay; 							//ms
	private volatile long timeBegin;

	public SmoothResumeValve(long timeDelay) {
		this.timeDelay = timeDelay;
		this.batchLimits = new int[] { 1, 2, 4, 8, 16, 32, 64 };
	}

	/**
	 * @param timeDelay
	 * @param batchLimits 允许负数的limit，为了解决cliet数量相当多时，每个client放一个请求进来都会冲垮服务器的场景：
	 *    -1和0作用相同，表示放弃当前尝试，只是多延迟了一些时间。所以一般不设
	 *    -2表示这批尝试中，只随机放入所有client的1/2(让当前操作1/2的概率通过)
	 *    -3表示这批尝试中，只随机放入所有client的1/3(让当前操作1/3的概率通过)
	 *    ...
	 * 例如：batchLimits = new int[] { -4,-3,-2, 1, 2, 4, 8, 16, 32 };
	 */
	public SmoothResumeValve(long timeDelay, int[] batchLimits) {
		this.timeDelay = timeDelay;
		this.batchLimits = batchLimits;
	}

	private volatile boolean hasRejectInLastBatch = false;

	/**
	 * @return 返回平滑控制后的可用不可用信息
	 * true: 可用； false：不可用，或者可用但没通过限流
	 */
	public boolean smoothThroughOnInitial() {
		
		// 相当于完全关闭这个功能
		if (timeDelay == 0) {
			return true;
		}
		
		// 已可用，且在平滑期
		while (isInSmooth && available) {
			int batch = batchNo.get();
			if (batch >= batchLimits.length) {
				if (hasRejectInLastBatch) {
					// 如果这时发觉上次还有reject，则继续最后一个batchLimit
					batchNo.set(batchLimits.length - 1);
					hasRejectInLastBatch = false;
					continue;
				}
				isInSmooth = false;
				count.set(0);
				batchNo.set(0);
				rejectCount.set(0);
				return available; // 返回可用
			}
			hasRejectInLastBatch = false;
			int limit = batchLimits[batch];
			
			// 0和-1不管，后面会直接放弃
			if (limit < -1) {
				int randomInt = new Random().nextInt(-limit);
				if (randomInt == 0) {
					// 返回可用
					return available;
				} else {
					logReject(rejectCount, limit);
					// 返回不可用
					return false;
				}
			}
			int current = count.get();
			while (current < limit) {
				if (count.compareAndSet(current, current + 1)) {
					timeBegin = System.currentTimeMillis();
					// 返回可用
					return available;
				}
				current = count.get();
			}

			//current >= limit
			if (System.currentTimeMillis() - timeBegin > timeDelay) {
				// timeDelay * (batch + 1) 这样做可能会人为造成聚集暴增
				// 超过时间，才设置下一个批次
				batchNo.compareAndSet(batch, batch + 1);
				// 继续循环
			} else {
				logReject(rejectCount, limit);
				// 返回不可用
				return false;
			}
		}
		return available;
	}

	private void logReject(AtomicInteger rejectCount, int limit) {
		hasRejectInLastBatch = true;
		int rc = rejectCount.incrementAndGet();
		logger.warn("A request reject in available switch. limit=" + limit + ",rejectCount=" + rc);
	}

	/**
	 * @return 返回实际可用不可用的信息
	 */
	public boolean isAvailable() {
		return available;
	}

	public boolean isNotAvailable() {
		return !available;
	}

	/**
	 * 设置为可用
	 */
	public void available() {
		if (available) {
			return;
		}
		count.set(0);
		batchNo.set(0);
		this.isInSmooth = true;
		this.available = true;
	}

	/**
	 * 设置为不可用
	 */
	public void unAvailable() {
		if (available) {
			rejectCount.set(0);
			this.available = false;
		}
	}

	private static enum CreateProperties {
		timeDelay, batchLimits;
	}

	public static SmoothResumeValve parse(String str) {
		Properties p = PropertyUtil.parse(str);
		if (p == null) {
			logger.warn("Empty iddl config");
			return null;
		}
		try {
			long td = 0;
			String[] limits = null;
			for (Map.Entry<Object, Object> entry : p.entrySet()) {
				String key = ((String) entry.getKey()).trim();
				String value = ((String) entry.getValue()).trim();
				switch (CreateProperties.valueOf(key)) {
				case timeDelay:
					td = Integer.parseInt(value);
					break;
				case batchLimits:
					limits = value.split("\\|");
					break;
				default:
					break;
				}
			}
			if (td == 0) {
				logger.error("SmoothValve Properties incomplete");
				return null;
			}
			if (limits != null) {
				int[] limitArray = new int[limits.length];
				for (int i = 0; i < limits.length; i++) {
					limitArray[i] = Integer.parseInt(limits[i].trim());
				}
				return new SmoothResumeValve(td, limitArray);
			} else {
				return new SmoothResumeValve(td);
			}

		} catch (Exception e) {
			logger.error("parse SmoothValve Properties failed", e);
			return null;
		}
	}

	@Override
	public String toString() {
		return new StringBuilder("timeDelay=").append(timeDelay).append(",batchLimits=").append(
				Arrays.toString(batchLimits)).toString();
	}
}
