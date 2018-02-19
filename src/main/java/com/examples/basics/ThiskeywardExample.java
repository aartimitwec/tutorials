package com.examples.basics;

class ThiskeywardExample {
	int rollno;
	String name;
	float fee;

	/* this on instance variable */
	ThiskeywardExample(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {

		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String args[]) {

		ThiskeywardExample s1 = new ThiskeywardExample(111, "ankita", 5000f);
		ThiskeywardExample s2 = new ThiskeywardExample(112, "sumita", 6000f);
		s1.display();
		s2.display();

		A a = new A(); /* code for this on method */
		a.n();
	}
}

/* this on method */
class A {
	void m() {

		System.out.println("hello m");
	}

	void n() {
		System.out.println("Thiis is this keyward on method example below");
		System.out.println("hello n");
		// m();//same as this.m()
		this.m();
	}
}
