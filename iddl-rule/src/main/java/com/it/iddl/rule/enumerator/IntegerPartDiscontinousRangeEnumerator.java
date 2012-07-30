/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.enumerator;

/**
 * 
 * @author sihai
 *
 */
public class IntegerPartDiscontinousRangeEnumerator extends NumberPartDiscontinousRangeEnumerator {

	@SuppressWarnings("rawtypes")
	@Override
	protected Number cast2Number(Comparable begin) {
		return (Integer) begin;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Number getNumber(Comparable begin) {
		return (Integer) begin;
	}

	@Override
	protected Number plus(Number begin, int plus) {
		return (Integer) begin + plus;
	}
}
