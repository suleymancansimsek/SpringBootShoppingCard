package com.dbmsproject.model;

import java.util.Date;
import java.util.List;

import com.dbmsproject.entities.Order;

public class OrderInfo {
	private String id;
    private Date orderDate;
    private int orderNum;
    private double amount;
 
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
 
    private List<OrderDetailInfo> details;

	public OrderInfo() {
	}

	public OrderInfo(Order order) {
		this.id = order.getId();
		this.orderDate = order.getOrderDate();
		this.orderNum = order.getOrderNum();
		this.amount = order.getAmount();
		this.customerName = order.getName();
		this.customerAddress = order.getAddr();
		this.customerEmail = order.getEmail();
		this.customerPhone = order.getPhone();
	}
	
	public OrderInfo(String id, Date orderDate, int orderNum, double amount, String customerName,
			String customerAddress, String customerEmail, String customerPhone) {
		this.id = id;
		this.orderDate = orderDate;
		this.orderNum = orderNum;
		this.amount = amount;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public List<OrderDetailInfo> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetailInfo> details) {
		this.details = details;
	}
    
}
