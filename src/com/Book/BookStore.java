package com.Book;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	private List<Book> Books;
	
	public BookStore(){
		Books = new ArrayList<Book>();
	}
	public void addBook(Book b) {
		Books.add(b);
	}
	
	public Book searchByTitle(String title) {
		if(Books.isEmpty())
			return null;
		
		for(Book b: Books) {
			if(b.title.equalsIgnoreCase(title))
				return b;
		}
		
		return null;
	}
	
	public Book searchByAuthor(String author) {
		if(Books.isEmpty())
			return null;
		
		for(Book b: Books) {
			if(b.author.equalsIgnoreCase(author))
				return b;
		}
		
		return null;
	}
	
	public void displayAll() {
		for(Book b: Books) {
			System.out.println("Book Id: "+b.BookId);
			System.out.println("Title: "+b.title);
			System.out.println("Author: "+b.author);
			System.out.println("Category: "+b.category);
			System.out.println("Price: "+b.price);
			System.out.println();
		}
	}
}
