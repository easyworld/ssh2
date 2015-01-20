package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.UserDao;
import com.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User get(String username) {
		List list = getHibernateTemplate().find(
				"from User where username = ? ", username);
		if (null == list || list.isEmpty())
			return null;
		User u = (User) list.get(0);
		return u;
	}

	@Override
	public User get(Integer UId) {
		return getHibernateTemplate().get(User.class, UId);
	}

	@Override
	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		getHibernateTemplate().saveOrUpdate(user);
	}

	@Override
	public void delete(Integer UId) {
		getHibernateTemplate().delete(get(UId));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return getHibernateTemplate().find("from User order by UId");
	}
}
