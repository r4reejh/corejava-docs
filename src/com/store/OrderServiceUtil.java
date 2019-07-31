package com.store;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class OrderServiceUtil {
	public SortedMap<String, Order> Orders = new TreeMap<>();
	public void addOrder(Order o) {
		Orders.put(Integer.toString(o.getOrderId()), o);
	}
	
	public Order searchOrder(String orderId ) {
		if(!Orders.containsKey(orderId))
			return null;
		return Orders.get(orderId);
	}
	public float findTotal() {
		float total = 0.0f;
		for(Map.Entry<String,Order> entry : Orders.entrySet()) {
		  Order o = entry.getValue();
		  total += o.getOrderAmount();
		}
		return total;
	}
}
