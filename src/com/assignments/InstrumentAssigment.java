package com.assignments;

abstract class Instrument{
	abstract public void play();
}
 class Piano extends Instrument{
	 public void play() {
		 System.out.println("Piano is playing tan tan tan");
	 }
 }
 class Flute extends Instrument{
	 public void play() {
		 System.out.println("Flute is playing toot toot toot");
	 }
 }
 class Guitar extends Instrument{
	 public void play() {
		 System.out.println("Guitar is playing tin tin tin");
	 }
 }
 public class InstrumentAssigment {

	
	public static void main(String[] args) {
		Instrument inst;
		inst = new Piano();
		inst.play();
		System.out.println("-------------------------------");
		inst = new Flute();
		inst.play();
		System.out.println("-------------------------------");
		inst = new Guitar();
		inst.play();
		System.out.println("-------------------------------");
	}

}
