package com.assignments;

class Employee {
	String empName;
	int empId;
	String dob;

	public Employee(String empName, int empId, String dob) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "\n---------------Employee---------- \nEmployee Name= " + empName + ", \nEmployee Id=" + empId
				+ ", \nEmployee Dob=" + dob + "\n----------------------------";
	}

}

public class EmployeeInheritanceAssignment {

	public static void main(String[] args) {
		Employee emp = new Employee("Atom", 101, "20-2010");
		System.out.println(emp);

	}

}
