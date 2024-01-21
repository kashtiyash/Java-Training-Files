package com.assignments;

import java.util.Scanner;

class Number {
	int firstNumber;
	int secondNumber;
	double result;

	public Number(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public void add() {
		result = firstNumber + secondNumber;
	}

	public void sub() {
		result = firstNumber - secondNumber;
	}

	public void mul() {
		result = firstNumber * secondNumber;
	}

	public void div() {
		if (secondNumber < 0) {
			throw new ArithmeticException();
		} else {
			result = (double) firstNumber / secondNumber;
		}
	}

	public String toString() {
		return "Result is " + result;
	}
}

public class NumberAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Number num = new Number(num1, num2);

		System.out.println("Enter Operation to Perofrm  \n1:Add\n2:Sub\n3:Mul\n4:Div");
		try {
			int inp = sc.nextInt();

			switch (inp) {
				case (1): {
					num.add();
					break;
				}
				case (2): {
					num.sub();
					break;
				}
				case (3): {
					num.mul();
					break;
				}
				case (4): {
					num.div();
					break;
				}
				default: {
					System.out.println("Enter Valid Input");
					break;
				}

			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Result of operation : " + num.result);
	}
}
