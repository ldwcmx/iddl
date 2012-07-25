/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-util
 */
package com.it.iddl.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iacrqq.util.StringUtil;

/**
 * 
 * @author sihai
 *
 */
public class PropertyUtil {
	
	private static final Log logger = LogFactory.getLog(PropertyUtil.class);
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	public static Properties parse(Object data) {
		Properties p;
		if (data == null) {
			logger.warn("Parameter data is null");
			return null;
		} else if (data instanceof Properties) {
			p = (Properties) data;
		} else if (data instanceof String) {
			p = new Properties();
			try {
				p.load(new ByteArrayInputStream(((String) data).getBytes()));
			} catch (IOException e) {
				logger.error(String.format("Parse data:%s failed", data), e);
				return null;
			}
		} else {
			logger.warn("Wrong type for parameter data");
			return null;
		}
		return p;
	}
	
	public static Map<String, String> parse2Map(String data) {
		Map<String, String> resultMap = new HashMap<String, String>();
		if(StringUtil.isNotBlank(data)) {
			String[] kvs = data.split("&");
			String[] kv = null;
			for(String e : kvs) {
				kv = e.split("=");
				resultMap.put(kv[0], kv[1]);
			}
		}
		return resultMap;
	}
	
	public static String asString(Map<String, String> data) {
		StringBuilder result = new StringBuilder("");
		int i = 0;
		int size = data.entrySet().size();
		for(Map.Entry<String, String> e : data.entrySet()) {
			result.append(e.getKey());
			result.append(e.getValue());
			if(++i < size - 1) {
				result.append("&");
			}
		}
		return result.toString();
	}
}
