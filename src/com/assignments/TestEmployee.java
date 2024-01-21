package com.assignments;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Employee[] e = new Employee[4];

		Scanner s = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter Basic Info:");
		System.out.println("Enter Name : ");
		String name = s.next();
		System.out.println("Enter DOB : ");
		String dob = s.next();
		System.out.println("Enter Id : ");
		int id = s.nextInt();
		int hrs;
		int rate;
		int sal;
		int inc;
		while (flag) {
			System.out.println(
					"\n\nChoose who you are \n1:Employee Details\n2:Wage Employee\n3:Sales Person\n4:Manager\n5:Exit\n");
			int inp = s.nextInt();
			switch (inp) {

			case (1): {
				e[0] = new Employee(name, id, dob);
				System.out.println(e[0]);
				break;
			}
			case (2): {
				System.out.println("Enter hours worked : ");
				hrs = s.nextInt();
				System.out.println("Enter rate per hours : ");
				rate = s.nextInt();
				e[1] = new WageEmployee(name, id, dob, hrs, rate);
				System.out.println(e[1]);
				break;
			}
			case (3): {
				System.out.println("Enter hours worked : ");
				hrs = s.nextInt();
				System.out.println("Enter rate per hours : ");
				rate = s.nextInt();
				System.out.println("Enter Sales Done : ");
				int sales = s.nextInt();
				System.out.println("Enter commision : ");
				int commision = s.nextInt();
				e[2] = new SalesPerson(name, id, dob, hrs, rate, sales, commision);
				System.out.println(e[2]);
				break;
			}
			case (4): {
				System.out.println("Enter fixed salary: ");
				sal = s.nextInt();
				System.out.println("Enter incentives : ");
				inc = s.nextInt();
				e[3] = new Manager(name, id, dob, sal, inc);
				System.out.println(e[3]);
				break;
			}
			case (5): {
				System.out.println("Bye");
				flag = false;
				break;

			}
			default: {
				System.out.println("Enter valid Input");
			}
			}

		}
	}

}
