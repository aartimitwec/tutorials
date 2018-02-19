package com.examples.basics;

class InstanceOf {
	public static void main(String args[]) {
		InstanceOf s = new InstanceOf();
		System.out.println(s instanceof InstanceOf);// true
		Dog1 d = new Dog1();
		System.out.println(d instanceof AnimalTest1);// true
		Dog1 b=null;  
		System.out.println(b instanceof Dog1);//false  
	}
}

class AnimalTest1 {
}

class Dog1 extends AnimalTest1 {// Dog inherits Animal

	// public static void main(String args[]) {

	// }
}