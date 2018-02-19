package com.examples.basics;

public class AbstacrtShapeExample {
	public static void main(String args[]) {
		Shape1 s = new Circle1();
		s.draw();
	}
}

abstract class Shape1 {
	abstract void draw();
}

// In real scenario, implementation is provided by others i.e. unknown by end
// user
class Rectangle1 extends Shape1 {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape1 {
	void draw() {
		System.out.println("drawing circle");
	}
}

