package com.examples.basics;

/**
 * 
 * @author tushar_borole private accesifier variable example
 */

public class Student {

	private String name;

	void display() {
		System.out.println("Name=" + name);
	}

	public static void main(String args[]) {
		Student s = new Student();
		StudentTest s1 = new StudentTest(1);
		s.name = "Sai"; // allowed
		s.display();
		// s1.id = 1;
		s1.displayTest();
	}
}

class StudentTest {
	int id;

	StudentTest(int i) {
		id = i;
	}

	void displayTest() {
		System.out.println("id=" + id);
	}

}
