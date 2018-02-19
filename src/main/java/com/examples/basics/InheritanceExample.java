package com.examples.basics;
/*
class Employee {
	 float salary = 40000;
}

class InheritanceExample extends Employee {
	int bonus = 10000;

	public static void main(String args[]) {
		InheritanceExample p = new InheritanceExample();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}
*/

/*single heritance*/
class Animal {
	void eat() {
		System.out.println("eating.vg..");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class InheritanceExample {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}