package com.store.test;
import com.store.*;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		OrderServiceUtil oo = new OrderServiceUtil();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Orderid <Integer>: ");
		int orderId = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Customer Name <String>: ");
		String customerName = sc.nextLine();
		System.out.print("Enter the Order Amount <Float>: ");
		float orderAmount = Float.parseFloat(sc.nextLine());
		System.out.print("Enter the Payment Option <String>: ");
		String paymentOption = sc.nextLine();
		
		try {
			Order o = new Order(orderId, customerName, orderAmount, paymentOption);
			oo.addOrder(o);
			printOrder(oo.searchOrder(Integer.toString(orderId)));
			oo.findTotal();
		} catch(InvalidOrderException io) {
			System.out.println(io.toString());
		} finally {
			sc.close();
		}
	}
	
	public static void printOrder(Order o) {
		if(o == null) {
			System.out.println("Order Not Found");
			return;
		}
		
		System.out.println("Order Id: "+o.getOrderId());
		System.out.println("Customer Name: "+o.getCustomerName());
		System.out.println("Order Amount: "+o.getOrderAmount());
		System.out.println("Payment Option: "+o.getPaymentOption());
		System.out.println();
	}
}
