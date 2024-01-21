package com.inhertiance;

import java.util.Scanner;

class Emp{
//	Instance Variables
	int empId;
	String empName;
	String empDesignation;
	double empSalary;
	
public Emp(int empId, String empName, String empDesignation) {
		
	System.out.println("---------------------------------------");
		System.out.println("In Paramterized Constructor of Emp Class");
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
//		System.out.println("Id : " +empId);
//		System.out.println("Name : " +empName);
//		System.out.println("Designation : " +empDesignation);
//		System.out.println("Salary : " +empSalary);

	}


	void employeeDetails() {
		System.out.println("-------------------Employee Details--------------------");
		System.out.println("Id : " +empId);
		System.out.println("Name : " +empName);
		System.out.println("Designation : " +empDesignation);
		System.out.println("Salary : " +empSalary);
	}	
}

class PartTimeEmployee extends Emp{

	int noOfHours;
	double hourlySalary;
	public PartTimeEmployee(int empId, String empName, String empDesignation,int noOfHours,double hourlySalary) {
//		super(); //call to parent default constructor
		super(empId, empName, empDesignation); //call to parent parameterized constructor
		this.noOfHours = noOfHours;
		this.hourlySalary = hourlySalary;		
	}
	void calSalary() {

		System.out.println("-------------------Cal Salary Function--------------------");
		super.empSalary = noOfHours * hourlySalary;
		System.out.println("Part Time Employee Salary :" + super.empSalary);
	}
	
	
}
class FullTimeEmployee extends Emp{

	int noOfHours;
	double hourlySalary;
	double fixedSalary;
	public FullTimeEmployee(int empId, String empName, String empDesignation,int noOfHours,double hourlySalary,double fixedSalary ) {
//		super(); //call to parent default constructor
		super(empId, empName, empDesignation); //call to parent parameterized constructor
		this.noOfHours = noOfHours;
		this.hourlySalary = hourlySalary;		
		this.fixedSalary = fixedSalary;		
	}
	void calSalary() {

		System.out.println("-------------------Cal Salary Function--------------------");
		super.empSalary = fixedSalary + (noOfHours * hourlySalary );
		System.out.println("Full Time Employee Salary :" + super.empSalary);
	}
	
	
}


public class Inheritance {
public static void main(String[] args) {
	
	int input=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number 1 for part and 2 for full time");
	input = sc.nextInt();
	
	switch(input) {
	
	
	case 1:
	
	{
		PartTimeEmployee pEmp = new PartTimeEmployee(1,"Atom","T-SE",20,23.4);
		pEmp.calSalary();
		pEmp.employeeDetails();
		break;
	}
	case 2:
		{		
		FullTimeEmployee fEmp = new FullTimeEmployee(2,"Qwuerty","JE",45,33.4,66000);
		fEmp.calSalary();
		fEmp.employeeDetails();
		break;
	}
	default:{
		System.out.println("Invalid input");
		break;
	}
	}
}
}
