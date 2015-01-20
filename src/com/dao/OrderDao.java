package com.dao;

import java.util.List;

import com.domain.Order;

public interface OrderDao {
	Order get(Integer OId);

	void save(Order order);

	void update(Order order);

	void delete(Integer OId);

	List<Order> findAll();

	List findListByUId(Integer uid);

}
