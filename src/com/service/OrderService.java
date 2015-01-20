package com.service;

import java.util.List;

import com.domain.Order;

public interface OrderService {

	List<Order> getList();

	List getList4User(Integer UId);

	void save(Order order);

	void update(Order order);

	void delete(Integer OId);

	Order get(Integer OId);
}
