package com.examples.basics;

class Shape {
	void draw() {
		System.out.println("drawing shapes...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

class RuntimePolymorphism {
	public static void main(String args[]) {
		// Shape s=new Shape();
		// s.draw();
		Shape s;
		s = new Rectangle();
		// Rectangle r = new Rectangle();
		// r.draw();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}