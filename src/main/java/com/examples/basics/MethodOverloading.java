package com.examples.basics;
/*Method Overloading and Type Promotion*/
class MethodOverloading {
	void sum(short a, short b) {
		System.out.println("short arg method invoked");
	}

	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum(20, 20);// now int arg sum() method gets invoked
	}
}