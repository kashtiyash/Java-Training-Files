package com.assignments;

import java.util.Scanner;

class Book {
	String bookName;
	String authName;
	double price = 199.99;

	public Book(String bookName, String authName) {
		super();
		this.bookName = bookName;
		this.authName = authName;

	}

	public String toString() {
		return "\nBook Name : " + bookName + " Author Name : " + authName + " Price : " + price;
	}

}

public class BookAssignment {

	public static void main(String[] args) {
		Book[] bk = new Book[2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < bk.length; i++) {
			System.out.println("\nEnter Book Name,Author Name, price : ");
			String bookName = sc.nextLine();
			String authName = sc.nextLine();
			bk[i] = new Book(bookName, authName);
		}
        for (Book book : bk) {
            System.out.println(book);
        }

	}

}
