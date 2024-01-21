package com.aggregation;

/*
 * Java support implicit inheritance java.lang.Object class acts as default parent class 
 * of all the classes in java
 * 
 * java.lang.Object :--
 * public String toString(){------} Invoke once we try to print object of  the class
 */ 
public class Date {

//	Instance variables
	int dd,mm,yyyy;
	
public Date(int dd, int mm, int yyyy) {
		super(); //call to Object class default constructor
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
public String toString() {
	return dd+" / " + mm + " / " + yyyy;
	
	
}
	
	public static void main(String[] args) {
		Date dob = new Date(25, 1,2001);
		System.out.println("Date : " + dob); //by default dob.toString() is present 

	}

}
