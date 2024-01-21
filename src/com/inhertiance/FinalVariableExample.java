package com.inhertiance;
class Book{
	String bookName,authName;
	double price; 
//	final String publisher="Dhuriya Publication"; // final variable can not be changed 
// if  we don't want to give value to final variable then declare it as static
//	whose value will remain constant and will allocate the memory to class area 
	static final String publisher; // blank final variable , String publisher
	public Book(String bookName, String authName, double price) {
		this.bookName = bookName;
		this.authName = authName;
		this.price = price;
	}
	static {
		publisher= "Ash" ;
		
	}
	void show() {
		System.out.println("---------------------------------------- ");
		System.out.println("Book Name : "+bookName);
		System.out.println("Author Name : "+authName);
		System.out.println("Book Price : "+price);
		System.out.println("Publisher : "+publisher);
	}
}
public class FinalVariableExample {

	public static void main(String[] args) {
		Book b1 = new Book("The Pool", "Ashwin",1000);
		Book b2 = new Book("8 Ball Pool", "Ashwin Duri",2000);
		b1.show();
		b2.show();
	}

}
