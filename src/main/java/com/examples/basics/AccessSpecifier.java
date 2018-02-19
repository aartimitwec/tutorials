package com.examples.basics;

/*static variable example */
class AccessSpecifier {
	int rollno;
	String name;
	static String college = "ITS";

	AccessSpecifier(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		AccessSpecifier s1 = new AccessSpecifier(111, "Karan");
		AccessSpecifier s2 = new AccessSpecifier(222, "Aryan");

		s1.display();
		s2.display();
	}
}

class Counter2 {
	static int count = 0;// will get memory only once and retain its value

	Counter2() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {

		Counter2 c1 = new Counter2();
		Counter2 c2 = new Counter2();
		Counter2 c3 = new Counter2();

	}
}