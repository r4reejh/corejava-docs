package com.Book;
/*
 * Case Study 1
----------------
Design a class Book containing following members:

	bookID		text
	title		text
	author		text
	category 	text 
	price		float
	
Define Parameterized constructor to initialize Book object. Perform the below validations

•	Category must be “Science”, “Fiction”, “Technology” or “Others” 
•	Price cannot be negative
•	bookID must start with ‘B’ and must be of length 4 characters

If any of the validations fail, throw an user defined exception InvalidBookException.

Design a class called BookStore which contains an appropriate collection object to store Book instances.

Implement the below operations.

1.	addBook(Book b)
To add a new Book object into the collection. 

2.	searchByTitle(String title)
Search a book based on title and if found, display the details

3.	searchByAuthor(String author)
Search a book based on author and if found, display the details

4.	displayAll()
Print the details of all the books

Store both classes in a package com.book. 
 */

import java.util.*;

public class Book {
	String BookId;
	String title;
	String author;
	String category;
	
	public String getBookId() {
		return BookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public float getPrice() {
		return price;
	}

	float price;
	
	public Book(String _BookId, String _title, String _author, String  _category, float _price)throws Exception {
		if(!(Validators.categoryFilter(_category) && Validators.priceFilter(_price) && Validators.bookIdFilter(_BookId)))
			throw new InvalidBookException(" Name Error ");
		
		BookId = _BookId;
		title = _title;
		author = _author;
		category = _category;
		price = _price;
	}	
}
