/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 */
package com.it.iddl.console.web.common;

/**
 * 用户登录上下文
 * @author sihai
 *
 */
public class LoginContext {
	
	private Boolean isLogin;
	private Long vistorId;
	private String vistorNick;
	private String logo;

	public LoginContext(Boolean isLogin, Long vistorId, String vistorNick,
			String logo) {
		this.isLogin = isLogin;
		this.vistorId = vistorId;
		this.vistorNick = vistorNick;
		this.logo = logo;
	}

	public Boolean getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(Boolean isLogin) {
		this.isLogin = isLogin;
	}

	public Long getVistorId() {
		return vistorId;
	}

	public void setVistorId(Long vistorId) {
		this.vistorId = vistorId;
	}

	public String getVistorNick() {
		return vistorNick;
	}

	public void setVistorNick(String vistorNick) {
		this.vistorNick = vistorNick;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
}
