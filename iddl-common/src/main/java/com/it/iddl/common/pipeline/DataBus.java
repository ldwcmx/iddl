/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.pipeline;

/**
 * 数据总线
 * @author sihai
 *
 */
public interface DataBus {

	/**
    * 向总线注册一个Context.默认名字为Context的类名（会进行重复检查）
    * 
    * @param name
    * @param context
    */
   public void registerPluginContext(String name,Object context);
   
   /**
    * 从总线中移除指定名字的Context
    * 
    * @param name
    */
   public void removePluginContext(String name);
   
   /**
    * 从总线中得到一个已注册的Context
    * 
    * @param name
    * @return
    */
   public Object getPluginContext(String name);
}
