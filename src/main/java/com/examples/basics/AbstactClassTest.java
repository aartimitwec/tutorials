package com.examples.basics;

public class AbstactClassTest {
	public static void main(String args[]) {
		Bike obj = new Unicon();
		obj.run();
		obj.gearing();
		
		obj = new Suzuki();
		obj.run();
		obj.gearing();
	}
}

abstract class Bike {
	abstract void run();
	abstract void gearing();
}

abstract class Honda extends Bike {
	void run() {
		System.out.println("Honda Running safely..");
	}
	void gearing() {
		System.out.println("Common Honda Gearing");
	}
}

class Unicon extends Honda {
	void gearing() {
		System.out.println("Unicon Gearing");
	}
}
class Suzuki extends Bike {
	void run() {
		System.out.println("Suzuki Running safely..");
	}
	void gearing() {
		System.out.println("Common Suziki Gearing");
	}
}
