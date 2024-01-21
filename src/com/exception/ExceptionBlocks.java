package com.exception;
import java.util.Scanner;

/*
 * Scanner - class from java.util package
 * Object 
 * Stream - in/out/err
 * Scanner works on tokens
 * Atom Proton 
 * t1     t2
 * 
 * Methods of Scanner--
 * next() --string
 *  nextInt() -
 *  nextByte() -
 *  nextFloat() -
 *  nextDouble() -
 */

class Book{
	String bookName;
	String authorName;
	double price;
	int quantity;
	Boolean available;
	
	public Book(String bookName, String authorName, double price, int quantity,Boolean available) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.quantity = quantity;
		this.available = available;
	}
	public String toString() {
		return "Book Name : "+ bookName + "\tAuthor Name : " + authorName +
				"\tPrice : " + price + "\tQuantity : " + quantity+ "\tAvailability : " + available;
	}

 }

public class ExceptionBlocks {

	public static void main(String[] args) {

		System.out.println("Enter Book Name,Author Name, price ,quantity ,  available");
		Scanner sc  = new Scanner(System.in);
		String bookName = sc.nextLine();
		String authName = sc.nextLine();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		Boolean y = sc.nextBoolean();
		Book b1 = new Book(bookName,authName,price, quantity,y);
		System.out.println(b1);
	} 

}

