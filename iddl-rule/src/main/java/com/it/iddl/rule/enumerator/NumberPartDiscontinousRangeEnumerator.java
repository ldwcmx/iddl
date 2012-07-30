/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.enumerator;

import java.util.HashSet;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.Comparative;

/**
 * 
 * @author sihai
 *
 */
public abstract class NumberPartDiscontinousRangeEnumerator extends PartDiscontinousRangeEnumerator {

	private static final int LIMIT_UNIT_OF_LONG = 1;
	private static final int DEFAULT_LONG_ATOMIC_VALUE = 1;
	private static final boolean isAllowNegative;
	
	static {
		/**
		 * 大多数整形的ID/分库分表字段默认都是大于零的。如果有小于0的系统，那么将这个参数设为true，
		 * 同时自己要保证要么不出现id<3这样的条件，要么算出负的dbIndex也没有问题
		 */
		isAllowNegative = "true".equals(System.getProperty("com.it.iddl.rule.isAllowNegativeShardValue", "false"));
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Comparative changeGreater2GreaterOrEq(Comparative from) {
		if (from.getComparison() == Comparative.GREATER_THAN) {

			Number fromComparable = cast2Number(from.getValue());

			return new Comparative(Comparative.GREATER_THAN_OR_EQUAL,
					(Comparable) plus(fromComparable, LIMIT_UNIT_OF_LONG));
		} else {
			return from;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Comparative changeLess2LessOrEq(Comparative to) {
		if (to.getComparison() == Comparative.LESS_THAN) {

			Number toComparable = cast2Number(to.getValue());

			return new Comparative(Comparative.LESS_THAN_OR_EQUAL, (Comparable) plus(toComparable, -LIMIT_UNIT_OF_LONG));
		} else {

			return to;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Comparable getOneStep(Comparable source, Comparable atomIncVal) {
		if (atomIncVal == null) {
			atomIncVal = DEFAULT_LONG_ATOMIC_VALUE;
		}
		Number sourceLong = cast2Number(source);

		int atomIncValInt = (Integer) atomIncVal;

		return (Comparable) plus(sourceLong, atomIncValInt);
	}

	@SuppressWarnings("rawtypes")
	protected boolean inputCloseRangeGreaterThanMaxFieldOfDifination(Comparable from, Comparable to,
			Integer cumulativeTimes, Comparable<?> atomIncrValue) {
		if (cumulativeTimes == null) {
			return false;
		}
		if (atomIncrValue == null) {
			atomIncrValue = DEFAULT_LONG_ATOMIC_VALUE;
		}
		long fromLong = ((Number) from).longValue();
		long toLong = ((Number) to).longValue();
		int atomIncValLong = ((Number) atomIncrValue).intValue();
		int size = cumulativeTimes;

		if ((toLong - fromLong) > (atomIncValLong * size)) {
			return true;
		} else {
			return false;
		}
	}

	public void processAllPassableFields(Comparative source, Set<Object> retValue, Integer cumulativeTimes,
			Comparable<?> atomIncrValue) {
		retValue.addAll(getAllPassableFields(source, cumulativeTimes, atomIncrValue));

	}

	@Override
	protected Set<Object> getAllPassableFields(Comparative begin, Integer cumulativeTimes,
			Comparable<?> atomicIncreationValue) {
		if (cumulativeTimes == null) {
			throw new IllegalStateException("在没有提供叠加次数的前提下，不能够根据当前范围条件选出对应的定义域的枚举值，sql中不要出现> < >= <=");
		}

		if (atomicIncreationValue == null) {
			atomicIncreationValue = DEFAULT_LONG_ATOMIC_VALUE;
		}
		// 把> < 替换为>= <=
		begin = changeGreater2GreaterOrEq(begin);
		begin = changeLess2LessOrEq(begin);

		Set<Object> returnSet = new HashSet<Object>(cumulativeTimes);
		//long beginInt = (Long) toPrimaryValue(begin.getValue());
		Number beginInt = getNumber(begin.getValue());
		int atomicIncreateValueInt = ((Number) atomicIncreationValue).intValue();
		int comparasion = begin.getComparison();

		if (comparasion == Comparative.GREATER_THAN_OR_EQUAL) {
			for (int i = 0; i < cumulativeTimes; i++) {
				returnSet.add(plus(beginInt, atomicIncreateValueInt * i));
			}
		} else if (comparasion == Comparative.LESS_THAN_OR_EQUAL) {
			for (int i = 0; i < cumulativeTimes; i++) {
				//这里可能出现不期望的负数
				Number value = (Number) plus(beginInt, -atomicIncreateValueInt * i);
				if (!isAllowNegative && value.longValue() < 0) {
					break;
				}
				returnSet.add(value);
			}
		}
		return returnSet;
	}

	@SuppressWarnings("rawtypes")
	protected abstract Number cast2Number(Comparable begin);

	@SuppressWarnings("rawtypes")
	protected abstract Number getNumber(Comparable begin);

	protected abstract Number plus(Number begin, int plus);
}
