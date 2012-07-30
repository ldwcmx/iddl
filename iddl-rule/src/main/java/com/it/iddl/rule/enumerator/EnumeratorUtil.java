/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.enumerator;

import java.math.BigDecimal;

/**
 * 
 * @author sihai
 *
 */
public class EnumeratorUtil {

	/**
	 * 将BigDecimal转换为long或者double
	 * @param big
	 * @return
	 */
	public static Comparable<?> toPrimaryValue(Comparable<?> comp){
		
		if(comp instanceof BigDecimal){
			BigDecimal big = (BigDecimal) comp;
			int scale = big.scale();
			if(scale == 0){
				//long int
				try {
					return big.longValueExact();
				} catch (ArithmeticException e) {
					return big;
				}
			}else{
				//double float
				return big.doubleValue();
			}
		}else{
			return comp;
		}
	}
}
