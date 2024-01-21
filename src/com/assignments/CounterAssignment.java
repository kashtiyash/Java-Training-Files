package com.assignments;

class Counter {
	private int counterValue = 10;

	synchronized public void increment() {
		counterValue++;
		System.out.println("Incrementing : " + counterValue);
		try {
			Thread.sleep(1000); // Non-Runnable

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	synchronized public void decrement() {
		counterValue--;

		System.out.println("Decrementing : " + counterValue);
		try {
			Thread.sleep(1000); // Non-Runnable

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	synchronized public int getValue() {
		return counterValue;
	}

}

class Incrementer extends Thread {
	Counter c;

	public Incrementer(Counter c) {
		super();
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {

			c.increment();
		}
	}

}

class Decrementer extends Thread {
	Counter c;

	public Decrementer(Counter c) {
		super();
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {

			c.decrement();
		}
	}

}

public class CounterAssignment {

	public static void main(String[] args) {
		Counter c1 = new Counter();

//		Incrementer ic = new Incrementer(c1);
//		Decrementer dc = new Decrementer(c1);
//		ic.start();
//		dc.start();

//		Thread -reference
		Incrementer[] ic = new Incrementer[2];
		Decrementer[] dc = new Decrementer[2];

//		Object creation  -- Thread
		for (int i = 0; i < ic.length; i++) {
			ic[i] = new Incrementer(c1);
			dc[i] = new Decrementer(c1);

		}
		for (int i = 0; i < ic.length; i++) {
			ic[i].start();
			dc[i].start();
		}

		for (int j = 0; j < ic.length; j++) {
			try {
				ic[j].join(); // join forces the main thread to wait for completion of all other
								// threads(child)
				dc[j].join();
			} catch (InterruptedException e) {
//				e.printStackTrace();
				System.out.println(e);
			}
		}
		System.out.println("Value of Counter : " + c1.getValue());
	}

}