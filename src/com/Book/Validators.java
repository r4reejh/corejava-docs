package com.Book;

/*
 * •	Category must be “Science”, “Fiction”, “Technology” or “Others” 
	•	Price cannot be negative
	•	bookID must start with ‘B’ and must be of length 4 characters
 */

public class Validators {
	public static boolean categoryFilter(String category) {
		if(category.equalsIgnoreCase("Science") ||category.equalsIgnoreCase("Fiction") 
				|| category.equalsIgnoreCase("Technology") || category.equalsIgnoreCase("Others") )
			return true;
		return false;
	}
	
	public static boolean priceFilter(float price) {
		if(price<0) 
			return false;
		return true;
	}
	
	public static boolean bookIdFilter(String bookId) {
		if(bookId.charAt(0) == 'B' && bookId.length() == 4) 
			return true;
		return false;
	}
}
