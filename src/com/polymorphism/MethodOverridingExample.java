package com.polymorphism;
/* Method Overriding - it is always performed in two classes related to each 
 * other with IS_A relationship(Inheritance)
 * 
 * It is ability to have same functionality/method  with same method signature/prototype in both classes
 *  related to each other by IS_A Relationship(Inheritance)
 * 
 */


class A{
	void show() {
		System.out.println("Class A");
	}
}
class B extends A{
	void show() {
		System.out.println("Class B");
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		B obj =new B();
		obj.show();
	}

}
