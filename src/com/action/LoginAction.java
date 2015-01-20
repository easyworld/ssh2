package com.action;

import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -6434128483294080524L;
	private User user;
	private UserService userService;
	private String message;
	private String jumpPage;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getJumpPage() {
		return jumpPage;
	}

	public void setJumpPage(String jumpPage) {
		this.jumpPage = jumpPage;
	}

	// start action

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String goAdmin() {
		return SUCCESS;
	}

	public String goUser() {
		return SUCCESS;
	}

	public String goLogin() {
		if (user.getPassword() == null) {
			message = "no password";
			return ERROR;
		}
		User userFromDb = userService.get(user.getUsername());
		if (userFromDb == null || userFromDb.getUsername() == null) {
			message = "no such user";
			return ERROR;
		}
		if (!userFromDb.getPassword().equals(user.getPassword())) {
			message = "wrong password";
			return ERROR;
		}
		ActionContext.getContext().getSession().put("usercontext", userFromDb);
		jumpPage = userFromDb.getIsadmin() ? "admin" : "user";
		return SUCCESS;
	}

	public String goLogout() {
		ActionContext.getContext().getSession().remove("usercontext");
		return SUCCESS;
	}
}
