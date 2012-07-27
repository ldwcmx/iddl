/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.pipeline;

/**
 * 管线工厂
 * @author sihai
 *
 */
public interface PipelineFactory {
	
	/**
	 * 
	 * @return
	 */
	Pipeline newPipeline();
}
