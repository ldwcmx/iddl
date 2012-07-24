/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-config
 */
package com.it.iddl.config.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.config.exception.ConfigException;


/**
 * 
 * @author sihai
 *
 */
public class ConfigServerConnectionURLProvider {
	
	private static final Log logger = LogFactory.getLog(ConfigServerConnectionURLProvider.class);
	
	/**
	 * 获取ConfigServerConnectionURL
	 * @param gateway
	 * @return
	 * @throws ConfigException
	 */
	public static String getConnectionURL(String gateway) throws ConfigException {
		
		HttpURLConnection connection = null;
		BufferedReader reader = null;
		try {
			URL url = new URL(gateway);
			connection = (HttpURLConnection)url.openConnection();
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line = null;
			while(null != (line = reader.readLine())) {
				sb.append(line);
			}
			return sb.toString();
		} catch (IOException e) {
			String errorMsg = String.format("Get connectionURL from %s failed", gateway);
			logger.error(errorMsg, e);
			throw new ConfigException(errorMsg);
		} finally {
			if(null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					logger.error("Close reader failed", e);
				}
			}
			if(null != connection) {
				connection.disconnect();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(getConnectionURL("http://www.google.com"));
		} catch (ConfigException e) {
			e.printStackTrace();
		}
	}
}
