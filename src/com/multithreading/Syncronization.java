package com.multithreading;

class PrintTable {
	synchronized public void table(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + i * n + "\t" + Thread.currentThread().getName() + "\tPriority "
					+ Thread.currentThread().getPriority());
			try {
				Thread.sleep(2000); // Non-Runnable

			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}

class FirstTableImp extends Thread {
	PrintTable t; // reference

	public FirstTableImp(PrintTable t) {
		this.t = t;
	}

	public void run() {
		t.table(4);
	}

}

class SecondTableImp extends Thread {
	PrintTable t; // reference

	public SecondTableImp(PrintTable t) {
		this.t = t;
	}

	public void run() {
		t.table(6);
	}

}

public class Syncronization {

	public static void main(String[] args) {
		PrintTable t = new PrintTable();

//		Thread Creation
		FirstTableImp ft = new FirstTableImp(t);
		SecondTableImp st = new SecondTableImp(t);
		ft.start();
		st.start();

	}

}
