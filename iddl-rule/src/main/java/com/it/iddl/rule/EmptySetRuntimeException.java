/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule;

/**
 * 专门用于标识需要在结果值计算为空的情况下，让TStatement里面getExecutionContext直接忽略
 * 未找到库表，返回空结果集的一个标志性异常。
 * 
 * 作用于InterruptedException有点相似。
 * 
 * @author sihai
 *
 */
public class EmptySetRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4371036133500527857L;

	public EmptySetRuntimeException() {
		super();
	}
}
