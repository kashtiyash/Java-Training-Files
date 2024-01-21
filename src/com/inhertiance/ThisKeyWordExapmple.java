package com.inhertiance;
/*
 *  this :- keyword
 *  1. used to resolve naming conflict between local and instance variable
 *  2. this() -used for calling one constructor from another constructor
 	constructor chaining
 	Note constructor call must be first line in constructor
 */


class Employee {
//	Instance Variables
	int empId;
	String empName;
	String empDesignation;
	double empSalary;
	
public Employee(int empId, String empName, String empDesignation) {
		
	System.out.println("---------------------------------------");
		System.out.println("In Paramterized Constructor of Employee Class");
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		System.out.println("Id : " +empId);
		System.out.println("Name : " +empName);
		System.out.println("Designation : " +empDesignation);
		System.out.println("Salary : " +empSalary);

	}

public Employee(int empId, String empName, String empDesignation, double empSalary) {
	this(empId,empName,empDesignation);
	System.out.println("---------------------------------------");
	System.out.println("In Paramterized Constructor of Employee Class Single ");
	
	this.empSalary = empSalary;
	System.out.println("Id : " +empId);
	System.out.println("Name : " +empName);
	System.out.println("Designation : " +empDesignation);
	System.out.println("Salary : " +empSalary);
}

//	Constructor --default
	Employee(){
		System.out.println("---------------------------------------");
		System.out.println("In Default Constructor of Employee Class");
	}

	void employeeDetails() {
		System.out.println("-------------------Employee Details--------------------");
		System.out.println("Id : " +empId);
		System.out.println("Name : " +empName);
		System.out.println("Designation : " +empDesignation);
		System.out.println("Salary : " +empSalary);
	}	
}
public class ThisKeyWordExapmple {
	public static void main(String[] args) {
		
//Default Constructor
		Employee emp = new Employee();
		emp.employeeDetails();
		
//Parameterized Constructor
		Employee emp1 = new Employee(1,"B","SE",234.5);
		emp1.employeeDetails();

	}
}
