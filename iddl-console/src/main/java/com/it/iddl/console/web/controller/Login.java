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

import com.it.iddl.console.biz.store.ConfigStore;

/**
 * 
 * @author sihai
 *
 */
public class Login extends AbstractController {

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if(isLogined(request.getSession())) {
			return new ModelAndView("redirect:/console.jhtml");
		}
		return new ModelAndView("login");
	}
}
