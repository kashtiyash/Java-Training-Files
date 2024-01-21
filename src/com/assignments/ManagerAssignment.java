
package com.assignments;

class Manager extends Employee {
	int fixedSalary;
	int incentives;
	int salaray;

	public Manager(String empName, int empId, String dob, int fixedSalary, int incentives) {
		super(empName, empId, dob);
		this.fixedSalary = fixedSalary;
		this.incentives = incentives;
	}

	public int computeSalary() {
		salaray = fixedSalary + incentives;
		return salaray;
	}

	@Override
	public String toString() {
		computeSalary();
		return "------------Manager------------- \nEmployee Name =" + empName + ", \nEmployee Id=" + empId
				+ ", \nSalary = " + salaray + ", \nDob=" + dob + "\n-------------------------------";

	}

}

public class ManagerAssignment {

	public static void main(String[] args) {

		Employee m = new Manager("Atom", 102, "1-2-2001", 30000, 2000);
		System.out.println(m);

	}

}
