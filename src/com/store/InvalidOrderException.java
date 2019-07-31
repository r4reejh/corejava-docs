package com.store;

public class InvalidOrderException extends Exception {
	private static final long serialVersionUID = 1L;
	String msg;
	InvalidOrderException(String x){
		msg = x;
	}
	
	public String toString() {
		return ("InvalidOrderException: "+msg);
	}
}
