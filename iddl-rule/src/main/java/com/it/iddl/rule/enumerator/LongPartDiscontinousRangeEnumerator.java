/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.enumerator;

import static com.it.iddl.rule.enumerator.EnumeratorUtil.*;


/**
 * 
 * @author sihai
 *
 */
public class LongPartDiscontinousRangeEnumerator extends NumberPartDiscontinousRangeEnumerator {

	@SuppressWarnings("rawtypes")
	@Override
	protected Number cast2Number(Comparable begin) {
		return (Long) begin;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Number getNumber(Comparable begin) {
		return (Long) toPrimaryValue(begin);
	}

	@Override
	protected Number plus(Number begin, int plus) {
		return (Long) begin + plus;
	}
}
