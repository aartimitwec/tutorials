package com.examples.basics;


class AnimalParent {
	void eat() {
		System.out.println("Eat.");
	}
}

class DogTalk extends AnimalParent {
	void bark() {
		System.out.println("Bark.");
	}
}

class BabyDog extends DogTalk {
	void weep() {
		System.out.println("Weep.");
	}
}

class TestMultilevelInheritance {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}