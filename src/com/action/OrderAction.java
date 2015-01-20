package com.action;

import java.util.List;

import com.domain.Order;
import com.domain.Train;
import com.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;
import com.service.TrainService;
import com.service.UserService;
import com.validator.MyValidator;

public class OrderAction extends ActionSupport {
	/**
	 * 
	 */
	private List orderList;
	private List<User> userList;
	private List<Train> trainList;
	private Integer orderId;

	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	public void setOrderList(List list) {
		this.orderList = list;
	}

	public List getOrderList() {
		return orderList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public List<Train> getTrainList() {
		return trainList;
	}

	private static final long serialVersionUID = -6109458659396985150L;
	private OrderService orderService;
	private UserService userService;

	private TrainService trainService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setTrainService(TrainService trainService) {
		this.trainService = trainService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getAllData() {
		this.orderList = orderService.getList();
		return SUCCESS;
	}

	public String addOrderPage() {
		this.userList = this.userService.getList();
		this.trainList = this.trainService.getList();
		return SUCCESS;
	}

	public String addOrder() {
		if (!MyValidator.isFullOrder(order))
			return ERROR;
		this.orderService.save(order);
		this.orderList = this.orderService.getList();
		return SUCCESS;
	}

	public String editOrderPage() {
		order = this.orderService.get(orderId);
		this.userList = this.userService.getList();
		this.trainList = this.trainService.getList();
		return SUCCESS;
	}

	public String editOrder() {
		if (!MyValidator.isFullOrder(order))
			return ERROR;
		this.orderService.update(order);
		this.orderList = this.orderService.getList();
		return SUCCESS;
	}

	public String deleteOrder() {
		this.orderService.delete(orderId);
		this.orderList = this.orderService.getList();
		return SUCCESS;
	}
}
