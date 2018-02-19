package com.examples.basics;

//Interface declaration: by first user  
interface Drawable {
	void draw();
}

// Implementation: by second user
class RectangleInterface implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class CircleInterface implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}

// Using interface: by third user
class InterfaceTest {
	public static void main(String args[]) {
		Drawable d = new CircleInterface();// In real scenario, object is provided by method e.g. getDrawable()
		d.draw();
		d = new RectangleInterface();
		d.draw();
	}
}