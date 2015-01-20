package com.service;

import java.util.List;

import com.domain.User;

public interface UserService {
	List<User> getList();

	void save(User user);

	void update(User user);

	void delete(Integer UId);

	User get(String username);

	User get(Integer UId);
}
