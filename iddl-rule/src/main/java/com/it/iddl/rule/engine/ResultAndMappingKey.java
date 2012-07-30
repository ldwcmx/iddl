/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine;

/**
 * 因为计算以后会拿到结果，对于映射规则则可以多拿到一个mappingKey
 * 
 * @author sihai
 *
 */
public class ResultAndMappingKey {

	public final String result;
	Object mappingKey;
	String mappingTargetColumn;
	
	public ResultAndMappingKey(String result) {
		this.result = result;
	}
}
