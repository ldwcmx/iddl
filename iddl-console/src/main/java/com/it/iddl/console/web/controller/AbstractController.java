/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.it.iddl.console.web.common.LoginContext;

/**
 * Controller抽象基类，请继承本类
 * 
 * @author sihai
 * 
 */
public abstract class AbstractController implements Controller {
	
	protected static final String LOGIN_CONTEXT = "_login_context_";
	protected static final String PARAMETER_REDIRECT_TO = "_rt_";
	protected static final String OPERATION = "_operation_";
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = handle(request, response);

		if (mv != null && !mv.getViewName().startsWith("redirect:")) {
			Map<String, Object> context = mv.getModel();
			context.put("isLogined", isLogined(request.getSession()));
		}
		// 后置处理
		return mv;
	}

	//
	protected abstract ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception;

	protected boolean isLogined(HttpSession session) {
		LoginContext loginContext = (LoginContext) session.getAttribute(LOGIN_CONTEXT);
		if (loginContext == null) {
			return false;
		}

		return loginContext.getIsLogin();
	}

	protected Long getUserId(HttpSession session) {
		LoginContext loginContext = (LoginContext) session.getAttribute(LOGIN_CONTEXT);
		return loginContext.getVistorId();
	}

	protected String getUserNick(HttpSession session) {
		LoginContext loginContext = (LoginContext) session.getAttribute(LOGIN_CONTEXT);
		return loginContext.getVistorNick();
	}
}
