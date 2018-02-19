package com.examples.basics;
/*super keyword
 *  super keyword to access the data member or field of parent class.
 *  It is used if parent class and child class have same fields.
 * */
class Bird {
	String color = "sometime white";
}

class Parrot extends Bird {
	String color = "Normally Green";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}

class SuperKeywordExample {
	public static void main(String args[]) {
		Parrot d = new Parrot();
		d.printColor();
	}
}