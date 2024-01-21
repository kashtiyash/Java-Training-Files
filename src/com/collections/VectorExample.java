package com.collections;

import java.util.Scanner;
import java.util.Vector;

class Employee {
	int id;
	String empName;
	String designation;

	public Employee(int id, String empName, String designation) {
		super();
		this.id = id;
		this.empName = empName;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee Id = " + id + ", Employee Name = " + empName + ", Designation = " + designation;
	}

}

class ProjectTeam {
	String managerName;
	String projectName;
	String clientName;
	Vector<Employee> employees;

	public ProjectTeam(String managerName, String projectName, String clientName, Vector<Employee> employees) {
		super();
		this.managerName = managerName;
		this.projectName = projectName;
		this.clientName = clientName;
		this.employees = employees;
	}

//	@Override
//	public String toString() {
//		return "\n-------------ProjectTeam------------ \nManager Name = " + managerName + ", \nProject Name = "
//				+ projectName + ", \nClient Name = " + clientName + ", \nEmployees = " + employees;
//	}

}

public class VectorExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Project Name , Manager Name , Client Name ");
		String projectName = s.next();
		String managerName = s.next();
		String clientName = s.next();

		System.out.println("Enter count of proejct Employees : ");
		int count = s.nextInt();

		Vector<Employee> v = new Vector<>();

		for (int index = 0; index < count; index++) {
			System.out.println("Enter Id, Name ,Designation of Employee");
			int id = s.nextInt();
			String name = s.next();
			String design = s.next();
			Employee e = new Employee(id, name, design);
//			Both adds the same data
			v.add(e);
//			v.addElement(e); 
		}

		ProjectTeam p1 = new ProjectTeam(managerName, projectName, clientName, v);
//		System.out.println(p1);
		System.out.println("Project Name : " + p1.projectName);
		System.out.println("Manager Name : " + p1.managerName);
		System.out.println("Client Name : " + p1.clientName);
		Vector<Employee> emp = p1.employees;
		for (Employee e : emp) {
			System.out.println(e);
		}

	}

}
