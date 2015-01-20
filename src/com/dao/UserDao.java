package com.dao;

import java.util.List;

import com.domain.User;

public interface UserDao {
	User get(String username);

	User get(Integer UId);

	void save(User user);

	void update(User user);

	void delete(Integer id);

	List<User> findAll();
}
