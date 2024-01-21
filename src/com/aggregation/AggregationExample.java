package com.aggregation;
/*
 * Aggregation - injecting Object of One class into another class
 */
class Employee{
	int empId;
	String empName,designation;
	double salary;
	Date dob; //Reference
	
	public Employee(int empId,String empName, String designation, double salary, Date dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
		this.dob = dob; //Object after initialization
	}
	public String toString() {
		return "\n Employee Id : "+empId + "\n Employee Name : " +empName +"\n Employee Designation : " 
	+ designation + "\n Employee Salary : " + salary + "\n Employee DOB : " + dob; 
				
	}
	
}
public class AggregationExample {

	public static void main(String[] args) {
		Date d = new Date(25,01,2001);
		Employee e = new Employee(1,"Atom","SE",234324,d); 
		Employee e1 = new Employee(2,"Proton","J-SE",54566,d); 
		//d- object is injected into another class this is  constructor injection
		System.out.println(e);
		System.out.println(e1);
	}

}
