/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.web.action;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.iacrqq.util.StringUtil;
import com.it.iddl.console.biz.ConfigManager;
import com.it.iddl.console.web.controller.AbstractLoginedController;

public class ConsoleAction extends AbstractLoginedController {

	private static final Log logger = LogFactory.getLog(ConsoleAction.class);
	
	private static final String CREAET = "_create_";
	private static final String UPDATE = "_update_";
	private static final String REMOVE = "_remove_";
	
	@Autowired
	private ConfigManager configManager;
	
	@Override
	protected ModelAndView handleLogined(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String operation = request.getParameter(OPERATION);
		if(StringUtil.equals(operation, CREAET)) {
			return doCreate(request, response);
		} else if(StringUtil.equals(operation, UPDATE)) {
			return doUpdate(request, response);
		} else if(StringUtil.equals(operation, REMOVE)) {
			return doRemove(request, response);
		} else {
			throw new IllegalArgumentException(String.format("Unknown opeation:%s", operation));
		}
	}

	private ModelAndView doCreate(HttpServletRequest request, HttpServletResponse response) {
		
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		
		try {
			configManager.store(key, value);
		} catch(Exception e) {
			logger.error(String.format("Store config, configId:%s, value:%s failed", key, value), e);
		}
		
		return new ModelAndView("redirect:/console.jhtml");
	}
	
	private ModelAndView doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			configManager.store(key, value);
			resultMap.put("isSucceed", true);
		} catch(Exception e) {
			resultMap.put("isSucceed", false);
			resultMap.put("errorMsg", e.getMessage());
		}
		
		Writer writer = null;
		try {
			writer = response.getWriter();
			writer.write(JSONObject.fromObject(resultMap).toString());
			writer.flush();
		} finally {
			if(null != writer) {
				writer.close();
			}
		}
		return null;
	}
	
	private ModelAndView doRemove(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String key = request.getParameter("key");
		try {
			configManager.remove(key);
		} catch(Exception e) {
			logger.error(String.format("Remove config, configId:%s failed", key), e);
		}
		
		return new ModelAndView("redirect:/console.jhtml");
	}
	
	public void setConfigManager(ConfigManager configManager) {
		this.configManager = configManager;
	}
}
