package com.assignments;

import com.aggregation.Date;

class WageEmployee extends Employee {
	int hrs;
	int rate;
	int salaray;

	public WageEmployee(String empName, int empId, String dob, int hrs, int rate) {
		super(empName, empId, dob);
		this.hrs = hrs;
		this.rate = rate;
	}

	public int computeSalary() {
		salaray = hrs * rate;
		return salaray;
	}

	@Override
	public String toString() {
		computeSalary();
		return "\n-------------WageEmployee------------\nEmployee Name = " + empName + ", \nEmployee Id = " + empId
				+ ", \nEmployee Dob = " + dob + ", \nSalaray = " + salaray + "\n---------------------------";
	}

}

public class WageEmployeeAssignment {

	public static void main(String[] args) {
		Employee e = new WageEmployee("Atom", 101, "1-1-2001", 10, 300);
		System.out.println(e);

	}

}
