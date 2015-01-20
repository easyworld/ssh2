package com.action;

import java.util.List;

import com.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
import com.validator.MyValidator;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8542035684950417689L;
	private User user;
	private Integer userId;
	private UserService userService;
	private List<User> userList;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String findAllData() {
		this.userList = userService.getList();
		return SUCCESS;
	}

	public String addUser() {
		if (!MyValidator.isFullUser(user))
			return ERROR;
		userService.save(user);
		this.userList = this.userService.getList();
		return SUCCESS;
	}

	public String addUserPage() {
		return SUCCESS;
	}

	public String editUser() {
		if (!MyValidator.isFullUser(user))
			return ERROR;
		userService.update(user);
		this.userList = this.userService.getList();
		return SUCCESS;
	}

	public String editUserPage() {
		this.user = this.userService.get(userId);
		return SUCCESS;
	}

	public String deleteUser() {
		userService.delete(userId);
		this.userList = this.userService.getList();
		return SUCCESS;
	}
}
