/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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
}
