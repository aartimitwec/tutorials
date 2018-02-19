package com.examples.basics;

public class AbstacrtTest {
	public static void main(String args[]) {
		Bike2 obj = new Honda2();
		obj.run();
		obj.changeGear();
	}
}

// example of abstract class that have method body
abstract class Bike2{
	Bike2() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda2 extends Bike2 {
	void run() {
		System.out.println("running safely..");
	}
}

