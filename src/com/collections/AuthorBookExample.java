package com.collections;

import java.util.Scanner;
import java.util.Vector;

class Book {
	String bookName;
	String publisher;
	int price;

	public Book(String bookName, String publisher, int price) {
		super();
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book Name = " + bookName + ", Publisher = " + publisher + ", Price = " + price;
	}

}

class Author {
	String authorName;
	int age;
	Vector<Book> book;

	public Author(String authorName, int age, Vector<Book> book) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.book = book;
	}

}

public class AuthorBookExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter Author Name , Author Age");
		String authorName = scanner.next();
		int authorAge = scanner.nextInt();
		System.out.println("Enter count of books author has :");
		int count = scanner.nextInt();
		Vector<Book> books = new Vector<Book>();

//Input of books from user
		for (int index = 0; index < count; index++) {
			System.out.println("Enter Book Name:");
			String bookName = scanner.next();
			System.out.println("Enter Publisher Name : ");
			String publisherName = scanner.next();
			System.out.println("Enter Price : ");
			int price = scanner.nextInt();
			Book book1 = new Book(bookName, publisherName, price);
			books.add(book1);
		}

		Author author1 = new Author(authorName, authorAge, books);
//	Printing author Details  
		System.out.println("\nAuthor Name : " + author1.authorName);
		System.out.println("Author Age : " + author1.age);
		for (Book book : books) {
			System.out.println(book);
		}

	}
}
