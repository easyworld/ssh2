package com.service.impl;

import java.util.List;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getList() {
		return userDao.findAll();
	}

	@Override
	public User get(Integer UId) {
		return userDao.get(UId);
	}

	@Override
	public User get(String username) {
		return userDao.get(username);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(Integer UId) {
		userDao.delete(UId);
	}

}
