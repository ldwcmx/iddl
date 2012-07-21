/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.it.iddl.console.biz.ConfigManager;

/**
 * 
 * @author sihai
 *
 */
public class Console extends AbstractLoginedController {

	@Autowired
	private ConfigManager configManager;
	
	@Override
	protected ModelAndView handleLogined(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("console");
		Map<String, Object> context = mv.getModel();
		context.put("resultMap", configManager.list());
		return mv;
	}
	
	public void setConfigManager(ConfigManager configManager) {
		this.configManager = configManager;
	}
}
