package com.store;

public class Order {
	private int orderId;  
	private String customerName; 
	private float orderAmount;
	private String paymentOption;
	
	public Order(int _orderId, String _customerName, 
			float _orderAmount, String _paymentOption)throws InvalidOrderException {
		if(_orderAmount < 100)
			throw new InvalidOrderException("Invalid Order Amount");
		
		if(!(_paymentOption.equals("CoD") || _paymentOption.equals("Gift Card") 
				|| _paymentOption.equals("Internet Banking")))
			throw new InvalidOrderException("Invalid Payment Details");
		
		orderId = _orderId;
		customerName = _customerName;
		orderAmount = _orderAmount;
		paymentOption = _paymentOption;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public String getPaymentOption() {
		return paymentOption;
	}
}
