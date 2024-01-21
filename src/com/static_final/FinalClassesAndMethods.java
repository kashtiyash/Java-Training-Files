package com.static_final;

//	final class & method can't be overridden
class Abc{
	 void show() {
		System.out.println("Show in ABC");
	}
}
class Pqr extends Abc{
	void show() {
		System.out.println("Show in PQR");
	}
}

public class FinalClassesAndMethods {

	public static void main(String[] args) {
		
	}

}
