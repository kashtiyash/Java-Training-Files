package com.polymorphism;

/*
 * Polymorphism :- Single task/functionality performed/implement in different ways
 * 
 * Two types of polymorphism - 
 * 1.compile Time - Method overloading
 * 2.Runtime - method overriding
 * 
 * 
 *  Method overloading -- its compile time polymorphism 
		 *  Ability to have multiple function with same name but different number of arguments 
		 *  and different data types of arguments
 		 *  Required Single Class
 		 *  
 		 *  On the basis of number of arguments and data type of the argument passed during function call 
 		 compiler binds function call with function definition so it is called compile time polymorphism 
 */
class Shape{
	double ans;
	
	void area(double r) {
		ans = 3.14 *r*r;
		System.out.println("Area of Circle : "+ans);
	}
	void area(int s) {
		ans = s*s;
		System.out.println("Area of Square : "+ans);
	}
	void area(double h,double b) {
		ans = 0.5*h*b;
		System.out.println("Area of Traingle : "+ans);
	}
}
public class OverloadingExample {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.area(3); // Square 
		s.area(3.9); // Circle
		s.area(2,4); //Triangle

	}

}
