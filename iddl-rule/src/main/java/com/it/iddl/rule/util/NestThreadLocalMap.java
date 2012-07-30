/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author sihai
 *
 */
public class NestThreadLocalMap {

	private static final Log logger = LogFactory.getLog(NestThreadLocalMap.class);
	protected final static ThreadLocal<Map<Object,Object>> threadContext = new MapThreadLocal();
	
	private NestThreadLocalMap(){};
	
	public static void put(Object key,Object value){
		getContextMap().put(key,value);
	}
	
	public static Object remove(Object key){
		return getContextMap().remove(key);
	}
	
	public static Object get(Object key){
		return getContextMap().get(key);
	}
	
	public static boolean containsKey(Object key){
		return getContextMap().containsKey(key);
	}
	
	/**
     * 取得thread context Map的实例。
     *
     * @return thread context Map的实例
     */
    protected static Map<Object,Object> getContextMap() {
        return (Map<Object,Object>) threadContext.get();
    }
	
    
    /**
     * 清理线程所有被hold住的对象。以便重用！
     */
    
    public static void reset(){
    	getContextMap().clear();
    }
    
    /**
     * 
     * @author sihai
     *
     */
    private static class MapThreadLocal extends ThreadLocal<Map<Object,Object>> {
        protected Map<Object, Object> initialValue() {
        	return new HashMap<Object,Object>() {
				
        		private static final long serialVersionUID = 3637958959138295593L;
				
				public Object put(Object key, Object value) {
                    if (logger.isDebugEnabled()) {
                        if (containsKey(key)) {
                        	logger.debug("Overwritten attribute to thread context: " + key
                                + " = " + value);
                        } else {
                        	logger.debug("Added attribute to thread context: " + key + " = "
                                + value);
                        }
                    }

                    return super.put(key, value);
                }
            };
        }
    }
}
