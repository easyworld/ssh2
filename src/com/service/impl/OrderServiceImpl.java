package com.service.impl;

import java.util.List;

import com.dao.OrderDao;
import com.domain.Order;
import com.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao;

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public List<Order> getList() {
		return orderDao.findAll();
	}

	@Override
	public List getList4User(Integer UId) {
		return orderDao.findListByUId(UId);
	}

	@Override
	public Order get(Integer OId) {
		return orderDao.get(OId);
	}

	@Override
	public void save(Order order) {
		this.orderDao.save(order);
	}

	@Override
	public void update(Order order) {
		this.orderDao.update(order);
	}

	@Override
	public void delete(Integer OId) {
		this.orderDao.delete(OId);
	}
}
