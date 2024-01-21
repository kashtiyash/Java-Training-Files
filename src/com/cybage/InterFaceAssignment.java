package com.cybage;


interface MathOperation{	
	void multiBy2(int num);
	void square(int num);
	default void  multiplyBy5(int num) {
		System.out.println("Multipy by 5 : "+ (num*5));
	}
}

interface ArthematicOperation{
	void add(int num1,int num2);
	void sub(int num1,int num2);
	static void addBy20(int num) {
		System.out.println("Addtion by 20 : "+ (num+20));
	}
}

class Operations implements MathOperation,ArthematicOperation{

	public void multiBy2(int num) {
		System.out.println("Multiply By 2: " + (num * 2));
		
	}

	public void square(int num) {
		System.out.println("Square : " + (num * num));
		
	}
	public void add(int num1,int num2) {
		System.out.println("Addition " + (num1 + num2));
		
	}

	public void sub(int num1,int num2) {
		System.out.println("Subtraction " + (num1-num2));
		 
	}
	
}
public class InterFaceAssignment {

	public static void main(String[] args) {
		Operations q1 = new Operations();
		q1.add(2, 4);
		q1.sub(2, 4);
		q1.multiBy2(4);
		q1.multiplyBy5(3);
		q1.square(4);
		
		
		ArthematicOperation.addBy20(23); 
		
	}

}
