package com.assignments;

class WageEmployee extends Employee {
	int hrs;
	int rate;
	int salary;

	public WageEmployee(String empName, int empId, String dob, int hrs, int rate) {
		super(empName, empId, dob);
		this.hrs = hrs;
		this.rate = rate;
	}

	public void computeSalary() {
		salary = hrs * rate;
	}

	@Override
	public String toString() {
		computeSalary();
		return "\n-------------WageEmployee------------\nEmployee Name = " + empName + ", \nEmployee Id = " + empId
				+ ", \nEmployee Dob = " + dob + ", \nSalary = " + salary + "\n---------------------------";
	}

}

public class WageEmployeeAssignment {

	public static void main(String[] args) {
		Employee e = new WageEmployee("Atom", 101, "1-1-2001", 10, 300);
		System.out.println(e);

	}

}
