/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.iacrqq.util.StringUtil;
import com.it.iddl.console.biz.ConfigManager;
import com.it.iddl.console.web.common.LoginContext;
import com.it.iddl.console.web.controller.AbstractController;

public class MemberAction extends AbstractController {

	private static final String LOGIN = "_login_";
	private static final String LOGOUT = "_logout_";
	
	@Autowired
	private ConfigManager configManager;
	
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String operation = request.getParameter(OPERATION);
		if(StringUtil.equals(operation, LOGIN)) {
			return doLogin(request, response);
		} else {
			throw new IllegalArgumentException(String.format("Unknown opeation:%s", operation));
		}
	}

	private ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response) {
		
		if(isLogined(request.getSession())) {
			return new ModelAndView("redirect:/console.jhtml");
		}
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(StringUtil.equals(name, configManager.getAdministrator()) && StringUtil.equals(password, configManager.getPassword())) {
			LoginContext loginContext = new LoginContext(true, 0L, name, "");
			HttpSession session = request.getSession(true);
			session.setAttribute(LOGIN_CONTEXT, loginContext);
			return new ModelAndView("redirect:/console.jhtml");
		} else {
			ModelAndView mv = new ModelAndView("login");
			mv.getModel().put("errorMsg", "帐号或密码错误！！！");
			return mv;
		}
	}
	
	public void setConfigManager(ConfigManager configManager) {
		this.configManager = configManager;
	}
}
