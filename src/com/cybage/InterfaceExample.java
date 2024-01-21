package com.cybage;
/*
 * Interface like a class only created using interface keyword
 * 
 * Java 7 --- interface add the methods implicitly public and abstract
 * Can't create object of the interface, but we can create reference of it which can be initialize
 *  to the object of implemented class
 * 
 *  We can use interface with in class using implements keyword
 *  
 * Java 8 can hold implementation/definition of method decorated with default and static keyword

 *Variables are public, static and final
 */


interface Game{
//	public and abstract
	int count=20;
	 void start();
	 void stop();
	 void run();
//	 In Java 8 you can define the method
	 static void pause() {
		 System.out.println("Game Pasued");
		 System.out.println("Game Score : " + count);
	 }
	 default void resume() {
		System.out.println("Game Resume");
	 }
}
class G1_Game implements Game {
	public void start() {
		System.out.println("Game 1 Started");
	}

	public void stop() {
		System.out.println("Game 1 Stopped");
	}

	public void run() {
		System.out.println("Game 1 Running");	
	}
}
class G2_Game implements Game{


	public void start() {
		System.out.println("Game 2 Started");
	}

	public void stop() {
		System.out.println("Game 2 Stopped");
	}

	public void run() {
		System.out.println("Game 2 Running");	
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		Game g;
		g=new G1_Game();
		g.start();
		g.run();
		Game.pause();
		g.stop();
		System.out.println("------------------------------------");
		g=new G2_Game();
		g.start();
		g.run();
		g.stop();
		System.out.println("------------------------------------");
		G1_Game g1=new G1_Game();
		g1.start();
		g1.run();
		Game.pause();
		g1.resume();
		g1.stop();
		System.out.println("------------------------------------");
		System.out.println("Game Score :" + Game.count+10);
	}

}
