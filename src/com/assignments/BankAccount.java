package com.assignments;

import java.util.Scanner;
import com.custom_exception.InsufficientFundsException;

class Account {
	String accountHolderName;
	double accountBalance;

	public Account(double accountBalance, String accountHolderName) {
		super();
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
	}

	synchronized public void withdraw(double amt) throws Exception {
		if (amt > accountBalance) {
//			throw new InsufficientFundsException("Insufficient Funds");
			System.out.println("Insufficient Funds");
			wait();
		} else {
			accountBalance -= amt;
			System.out.println("Your Remaminig Balance : " + accountBalance);
			notify();
		}
	}

	synchronized public void deposit(double amt) {
		accountBalance += amt;
		notify();
	}
}

public class BankAccount {

	public static void main(String[] args) {
		System.out.println("Enter your Account holder Name and Account Balance");
		Scanner sc = new Scanner(System.in);
		String accountHolderName = sc.nextLine();
		double accountBalance = sc.nextInt();
		Account ac = new Account(accountBalance, accountHolderName);

		Boolean flag = true;
		while (flag) {
			System.out.println("\nChoose :  \n 1:Check Balance\n 2:Deposit\n 3:Withdraw\n 4:Exit");
			int inp = sc.nextInt();
			switch (inp) {
			case (1): {
				System.out.println("Your Balance : " + ac.accountBalance);
				break;
			}
			case (2): {

				System.out.println("Amount to deposit :");
				double depositAmt = sc.nextDouble();
				Runnable d = new Runnable() {
					public void run() {
						ac.deposit(depositAmt);

					}
				};
				Thread t2 = new Thread(d);
				t2.start();
				break;

			}
			case (3): {
				System.out.println("Amount to withdraw :");
				double withdrawAmt = sc.nextDouble();
				Runnable wd = new Runnable() {
					public void run() {
						try {
							ac.withdraw(withdrawAmt);

						} catch (Exception e) {
							System.out.println(e);
						}

					}
				};

				Thread t1 = new Thread(wd);
				t1.start();
				break;
			}
			case (4): {
				System.out.println("Your Remaining Balance : " + ac.accountBalance);
				System.out.println("Bye");
				flag = false;
				break;
			}
			default: {
				System.out.println("Your Remaining Balance : " + ac.accountBalance);
				System.out.println("Enter Valid Input\n");
			}
			}
		}
	}

}