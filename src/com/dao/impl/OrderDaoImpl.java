package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.OrderDao;
import com.domain.Order;

public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao {

	@Override
	public Order get(Integer OId) {
		return getHibernateTemplate().get(Order.class, OId);
	}

	@Override
	public void save(Order order) {
		getHibernateTemplate().save(order);
	}

	@Override
	public void update(Order order) {
		getHibernateTemplate().saveOrUpdate(order);
	}

	@Override
	public void delete(Integer Oid) {
		getHibernateTemplate().delete(get(Oid));
	}

	@Override
	public List findAll() {
		List l = getHibernateTemplate().find("FROM Order o order by o.OId");
		return l;
	}

	@Override
	public List findListByUId(Integer uid) {
		return getHibernateTemplate().find(
				"FROM Order o where o.user.UId = ? order by o.OId", uid);
	}

}
