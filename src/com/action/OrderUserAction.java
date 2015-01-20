package com.action;

import java.util.List;

import com.domain.Order;
import com.domain.Train;
import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;
import com.service.TrainService;
import com.validator.MyValidator;

public class OrderUserAction extends ActionSupport {

	private static final long serialVersionUID = 4384192233933712562L;
	private List orderList;
	private List<Train> trainList;
	private Integer orderId;
	private Order order;
	private OrderService orderService;
	private TrainService trainService;

	public List<Train> getTrainList() {
		return trainList;
	}

	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	public TrainService getTrainService() {
		return trainService;
	}

	public void setTrainService(TrainService trainService) {
		this.trainService = trainService;
	}

	public List getOrderList() {
		return orderList;
	}

	public void setOrderList(List orderList) {
		this.orderList = orderList;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String userOrderAddPage() {
		User u = (User) ActionContext.getContext().getSession()
				.get("usercontext");
		if (u == null || u.getUId() == null)
			return ERROR;
		trainList = trainService.getList();
		return SUCCESS;
	}

	public String userOrderAdd() {
		Order o = order;
		if (!MyValidator.isFullOrder(o))
			return ERROR;
		orderService.save(order);
		return SUCCESS;
	}

	public String userOrderPage() {
		User u = (User) ActionContext.getContext().getSession()
				.get("usercontext");
		if (u == null || u.getUId() == null)
			return ERROR;
		orderList = orderService.getList4User(u.getUId());
		return SUCCESS;
	}

	public String userOrderDelete() {
		orderService.delete(orderId);
		User u = (User) ActionContext.getContext().getSession()
				.get("usercontext");
		if (u == null || u.getUId() == null)
			return ERROR;
		orderList = orderService.getList4User(u.getUId());
		return SUCCESS;
	}
}
