package com.multithreading;

class MyThread extends Thread{
	public void run() //Runnable 
	{ 
		
		System.out.println("Starting of Run Method");
		
//		public static Thread(Object) java.lang.Thread.currentThread(); :- 
//		return currently executing thread object
//		
//		public String java.lang.Thread.getName(); :-
//		return name assigned to this(current) thread
		
		for(int i=1;i<=10;i++) {
			System.out.println("5 x "+ i + " = " +  i*5 + "\t" + Thread.currentThread().getName() +
					"Priority " + Thread.currentThread().getPriority());
			try {
				Thread.sleep(2000); //Non-Runnable
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		System.out.println("End of Run Method");
	} //Terminate
	
}

public class ThreadCreationUsingThreadClass {

	public static void main(String[] args) {
//		New 
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		/*
		 * Public void java.lang.Thread.setName(String name_of_the_thread);
		 * Assigned given name to this (current) thread
		 */
		t1.setName("T1 Thread");
		t2.setName("T2 Thread");
		t3.setName("T3 Thread");
		
		
//		Priority MAX-Priority  -10,  MIN-Priority  -1 , Normal-Priority  -5  
		t1.setPriority(7);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
//		Ready-phase -- Ready Queue --t1|t2|t3
		t1.start();
		t2.start();
		t3.start();
	}

}
