package com.abstraction;
/*
 * Abstract class hold abstract as well as non abstract methods
 * 
 * if class holds abstract method then class must declare as abstract class vice versa is not mandatory
 * 
 * IF ANY CLASS inherit the abstract class then derived class is supposed to implement 
 * abstract method coming from parent class or make child class as abstract
 * 
 * we can't initialize Abstract class bit we can create reference of it which can be 
 * initialized to the child class objects
 */

abstract class Game{
//	Method definition -- non-abstract
	public void start() {
		System.out.println("Game started !!!");
	}
	public void stop() {
		System.out.println("Game Stopped !!!");
	}
	abstract public void run(); // method declaration -- abstract method
}
class G1_Game extends Game{
	public void run() {
		System.out.println("G1 Game running !!!");
		
	}
}
class G2_Game extends Game{
	public void run() {
		System.out.println("G2 Game running !!!");
		
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		Game g; // Abstract class and Initialized reference with implemented class(child class)
		g = new G1_Game();
		g.start();
		g.run();
		g.stop();
		System.out.println("-------------------");
		g = new G2_Game();
		g.start();
		g.run();
		g.stop();
	}


}
