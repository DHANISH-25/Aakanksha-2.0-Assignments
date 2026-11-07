package com.demo;
/*8\. Library Book Management System: Create a `Book` class with private data members (Book ID, Book Title, Author Name, Available Copies). Initialize details using a 
 * constructor and implement methods to issue a book and return a book. Prevent issuing when no copies are available and display updated book availability.*/

class Book {
	private int bookId;
	private String bookTitle;
	private String authorName;
	private int availableCopies;

	public Book(int bookId, String bookTitle, String authorName, int availableCopies) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.availableCopies = availableCopies;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public void bookIssue() {
		if (availableCopies > 0) {
			availableCopies--;
			System.out.println("Book Issued");
		} else {
			System.out.println("No Book Available");
		}
	}

	public void bookReturn() {
		availableCopies++;
		System.out.println("Book Returned.");
	}

	public void display() {

		System.out.println("Book ID          : " + bookId);
		System.out.println("Book Title       : " + bookTitle);
		System.out.println("Author Name      : " + authorName);
		System.out.println("Available Copies : " + availableCopies);
		System.out.println();

	}

}

public class Main7 {
	public static void main(String[] args) {
		Book b1 = new Book(101, "Java", "James", 4);
		//Book Details
		b1.display();
		
		//Book issued
		b1.bookIssue();
		b1.display();
		
		//Book returned
		b1.bookReturn();
		b1.display();
	}
}
