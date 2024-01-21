package com.DataStructures;

import java.util.Arrays;

class Employee {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee Id = " + empId + ", Employee Name = " + empName;
	}

}

class StackImplementation {

	public final int initialCapacity = 10;
	int size;
	Employee Stack[];

	public StackImplementation() {
		super();
		this.size = 0;
		Stack = new Employee[initialCapacity];
	}

	public void increaseCapacity() {
		int newCapacity = initialCapacity * 2;
		Stack = Arrays.copyOf(Stack, newCapacity);

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(Employee emp) {
		if (size == Stack.length) {
			increaseCapacity();
		}
		Stack[size++] = emp;
	}

	public Employee pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is Empty");
		}
		Employee popEmp = Stack[--size];
		Stack[size] = null;
		return popEmp;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(Stack[i]);
		}
	}

	public void peek() {

		if (isEmpty()) {
			throw new IllegalStateException("Stack is Empty");
		}
		System.out.println(Stack[size - 1]);

	}

	public void search(int empId) {
		for (int i = 0; i < size; i++) {
			if (Stack[i].empId == empId) {
				System.out.println(Stack[i]);
			}
		}
		if (isEmpty()) {
			throw new IllegalStateException("Stack is Empty");
		}

	}
}

public class StackExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Employee 1");
		Employee e2 = new Employee(2, "Employee 2");
		Employee e3 = new Employee(3, "Employee 3");
		Employee e4 = new Employee(4, "Employee 4");
		Employee e5 = new Employee(5, "Employee 5");

		StackImplementation st = new StackImplementation();
		st.push(e1);
		st.push(e2);
		st.push(e3);
		st.push(e4);
		st.push(e5);
		System.out.println("\n\n-----------------Display all Stack----------------\n\n");
		st.display();

		st.pop();
		System.out.println("\n\n--------------------After popping--------------\n\n");

		st.display();
		System.out.println("\n\n--------------------Search--------------\n\n");

		st.search(2);
		System.out.println("\n\n--------------------Peek--------------\n\n");

		st.peek();
	}

}
