package com.Book;

public class InvalidBookException extends Exception {
	private String msg;
	InvalidBookException(String _msg){
		msg = _msg;
	}
	
	public String toString() {
		return ("Invalid Book Exception: "+msg);
	}
}
