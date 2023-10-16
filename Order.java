package com.accenture.lkm.beans;

public class Order {
	
	private int orderId;
	private Customer customer;
	private int quantity;
	private double totalOrderCost;
	private String orderDate;
	
	
	public Order(int orderId, Customer customer, int quantity, double totalOrderCost, String orderDate) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.quantity = quantity;
		this.totalOrderCost = totalOrderCost;
		this.orderDate = orderDate;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getTotalOrderCost() {
		return totalOrderCost;
	}


	public void setTotalOrderCost(double totalOrderCost) {
		this.totalOrderCost = totalOrderCost;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public void displayOrderDetails() {
		System.out.println("ORDER DETAILS:");
		System.out.println("********************");
		System.out.println("Order ID:" + this.orderId);
		System.out.println("Order Quantity:" + this.quantity);
		System.out.println("Total Order Cost:" + this.totalOrderCost);
		System.out.println("Order Date:" + this.orderDate);
		
		System.out.println("CUSTOMER DETAILS:");
		System.out.println("********************");
		System.out.println("Customer ID:" + this.customer.getId());
		System.out.println("Customer Name:" + this.customer.getName());
		System.out.println("Customer Phone No:" + this.customer.getPhoneNo());
	}
	
	
	
	
}
