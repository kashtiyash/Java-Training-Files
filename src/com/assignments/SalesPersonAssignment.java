package com.assignments;

class SalesPerson extends WageEmployee {

	int sales;
	int commission;

	public SalesPerson(String empName, int empId, String dob, int hrs, int rate, int sales, int commision) {
		super(empName, empId, dob, hrs, rate);
		this.commission = commision;
		this.sales = sales;

	}

	public void computeSalary() {
		salary = (sales * commission);

	}

	@Override
	public String toString() {
		computeSalary();
		return "-------------SalesPerson---------- \nEmployee Name = " + empName + ", \nEmployee ID = " + empId
				+ ", \nSalary = " + salary + ", \nDob = " + dob + "\n-----------------------------";
	}

}

public class SalesPersonAssignment {

	public static void main(String[] args) {
		Employee sp = new SalesPerson("Atom", 102, "1-1-2001", 20, 550, 70, 4);
		System.out.println(sp);

	}

}
