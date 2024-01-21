package com.cybage;
class Circle{
// float - 4 byte , double - 8 byte
	float pi =3.14f; //Instance variable
	
//	method - function
	float circleArea(float radius) {
		float area = pi*(radius * radius) ;
		return area;
	}
}


public class ClassAndObjectExample {
	public static void main(String[] args) {
//	ClassName objectName = new ClassName()
		Circle obj = new Circle();
		float areaOfCircle =  obj.circleArea(2f);
		System.out.println("Area of Circle is : " + areaOfCircle);
/* System class - java.lang
	out(variable) --object (OutputStream --class--java.io)
		created with in System class
		declared as static variable so assessed on class name
		print ln() :-- method --OutputStram Class
*/		
		
	}	
}

