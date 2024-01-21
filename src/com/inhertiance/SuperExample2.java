package com.inhertiance;
class A{
	A(String name){
		System.out.println("Constructor of A :"+name);
	}
}
class B extends A{
	B(){
	super("Admin"); //by default compiler adds it to the child class
		System.out.println("Constructor of B");
	}
}
public class SuperExample2 {
 public static void main(String[] args) {
	B b = new B();
	
}
}
