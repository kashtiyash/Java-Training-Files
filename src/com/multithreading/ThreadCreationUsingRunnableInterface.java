package com.multithreading;

class MyThread_2 implements Runnable {
	public void run() {
		System.out.println("Inside Run ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("2 x " + i + " = " + i * 2 + "\t" + Thread.currentThread().getName() + " Priority "
					+ Thread.currentThread().getPriority());
			try {
				Thread.sleep(2000); // Non-Runnable

			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}

public class ThreadCreationUsingRunnableInterface {

	public static void main(String[] args) {

//	your class object will not act as Thread
		MyThread_2 td1 = new MyThread_2();
		MyThread_2 td2 = new MyThread_2();

//	And convert them into Thread
//	passing your object as argument to the Thread Class     
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);

//	Ready 
		t1.start();
		t2.start();
	}

}
