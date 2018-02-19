package com.examples.basics;

/*super keyword on method , constrctor and date member
 */
class Human {
	String gendar="Man or Women";
	Human() {
	
		System.out.println("Human class is created");
	}

	void eat() {
		System.out.println("Human can eat");
	}
}

class Men extends Human {

	Men() {
		super();
		System.out.println("Men class is created");
		System.out.println("Human can be"+" "+super.gendar);
		
	}

	void eat() {
		System.out.println("Human can eat vegetables and fruits.");
	}

	void talk() {
		System.out.println("Human can talk...");
	}

	void work() {
		super.eat();
		talk();

	}
}

class TestSuperKeywordOnMethod {
	public static void main(String args[]) {
		Men d = new Men();
		d.work();
	}
}