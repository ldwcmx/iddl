/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.type;

/**
 * 
 * @author sihai
 *
 */
public class TypeHandlerUtils {

	public static final int DEFAULT_BIT=-1;
	
	public static String placeHolder(int bit, int table) {
		if (bit == DEFAULT_BIT) {
			return String.valueOf(table);
		}else{
			int max = (int) Math.pow(10,(bit));
			int placedNumber = max + table;
			String xxxfixWithPlaceHoder = String.valueOf(placedNumber)
					.substring(1);
			return xxxfixWithPlaceHoder;
		}
		
	}
}
