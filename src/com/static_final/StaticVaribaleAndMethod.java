package com.static_final;

/*
 * if method signature/prototype starts with static keyword then it is static method
 * static method can access only static variable from outside
 * 
 */
class Circle{
	static final float pi = 3.14f;
	static float ans ;
	
	static void area(float r) {
		 ans = pi * r *r;
		System.out.println("Area of Circle: "+ans);
	}
	static  void circleCirum(float r) {
		ans = 2 * pi * r;
		System.out.println("Circle Cirum: "+ans);
	}
}
public class StaticVaribaleAndMethod {
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
//		Circle c = new Circle();
		Circle.area(2.5f);
		Circle.circleCirum(2.5f);
	}
}
