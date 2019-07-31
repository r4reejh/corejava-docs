package com.bookutil;
import com.Book.*;
import java.util.*;
/*
 * Create a class BookUtil in package com.bookutil which has the main method. 

•	Instantiate the BookStore class 
•	Read data from user for 3 Book objects. 
•	Call the addBook method to add the book objects into the collection
•	Search the books by title and author
•	Display all the book details
 */

public class BookUtil {
	public static void main(String args[])throws Exception {
		BookStore bb = new BookStore();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wikommen! Enter the Values");
		
		for(int i=0; i<1; i++) {
			String bookId = sc.nextLine();
			String title = sc.nextLine();
			String author = sc.nextLine();
			String category = sc.nextLine();
			String price = sc.nextLine();
			
			try {
				Book xx = new Book(bookId ,title, author, category,Float.parseFloat(price));
				System.out.println();
				System.out.println();
				if(!(xx == null)) {
					bb.addBook(xx);
					continue;
				}
			} catch(InvalidBookException ee) {
				System.out.println("Invalid BookName");
			}
		}
		
		System.out.print("Enter Author to Search by: ");
		String _searchAuthor = sc.nextLine();
		
		printBook(bb.searchByAuthor(_searchAuthor));
		
		System.out.print("Enter Title to Search by: ");
		String _searchTitle = sc.nextLine();
		
		printBook(bb.searchByTitle(_searchTitle));
		
		sc.close();
	}
	
	static void printBook(Book b) {
		if(b == null) {
			System.out.println("Book Not Found");
			return;
		}
		
		System.out.println("Book Id: "+b.getBookId());
		System.out.println("Title: "+b.getTitle());
		System.out.println("Author: "+b.getAuthor());
		System.out.println("Category: "+b.getCategory());
		System.out.println("Price: "+b.getPrice());
		System.out.println();
	}
}
