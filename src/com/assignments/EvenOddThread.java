package com.assignments;

class PrintNumber {
	int num;
	boolean flag = false;

	synchronized public void EvenNumber(int num) throws Exception {
		if (flag) {
			wait();
		}
		System.out.println("Even Number : " + num);
		flag = true;
		notify();
	}

	synchronized public void OddNumber(int num) throws Exception {
		if (!flag) {
			wait();
		}
		System.out.println("Odd  Number : " + num);
		flag = false;
		notify();
	}
}

class Even extends Thread {
	PrintNumber p;

	public Even(PrintNumber p) {
		this.p = p;
	}

	public void run() {
		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				try {
					this.p.EvenNumber(i);
					Thread.sleep(200);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class Odd extends Thread {
	PrintNumber p;

	public Odd(PrintNumber p) {
		this.p = p;
	}

	public void run() {
		for (int i = 0; i < 30; i++) {
			if (i % 2 != 0) {
				try {
					this.p.OddNumber(i);
					Thread.sleep(200);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

public class EvenOddThread {

	public static void main(String[] args) {
		PrintNumber p1 = new PrintNumber();

		Even t1 = new Even(p1);
		Odd t2 = new Odd(p1);

		t1.start();
		t2.start();

	}

}
