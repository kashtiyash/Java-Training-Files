package com.inhertiance;
class Abc{
	int val = 400;
	void show() {
		System.out.println("Show of parent");
	}
}
class Pqr extends Abc{
	int val = 700;
	void show() {		
		System.out.println("Value is:"+this.val);
		System.out.println("Parent Value is:"+super.val);
//		show();  this method acts like --> this.show() and will go in infinite loop
		super.show(); //this will call the parent class method 
	}
}
public class SuperKeywordExample {
	public static void main(String[] args) {
		Pqr p = new Pqr();
		p.show();
	}
}
