/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.web.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.iacrqq.util.StringUtil;

/**
 * 
 * @author sihai
 *
 */
public abstract class AbstractLoginedController extends AbstractController {
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(!isLogined(request.getSession(true))) {
			String queryString = request.getQueryString();
			queryString = StringUtil.isBlank(queryString) ? "" : "?" + queryString;
			return new ModelAndView(new StringBuilder("redirect:/login.jhtml?").append(PARAMETER_REDIRECT_TO).append("=").append(URLEncoder.encode(request.getRequestURL().toString(), "utf-8")).append(URLEncoder.encode(queryString, "utf-8")).toString()); 
		}
		
		ModelAndView mv = handleLogined(request, response);
		
		return mv;
	}
	
	
	protected abstract ModelAndView handleLogined(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
