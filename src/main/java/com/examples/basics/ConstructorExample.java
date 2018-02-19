package com.examples.basics;

public class ConstructorExample {
 int rollno;
String name;

ConstructorExample() {
	rollno = 2;
	name = "Tushar";
}


ConstructorExample(int r) {
	rollno =r;
	name = "Dikshil";
}

ConstructorExample(int r,String n){
	rollno=r;
	name=n;
}
	
	void display() {
		System.out.println(rollno +" " +name);
	}
	
public static void main(String arg[]){
	//System.out.println(rollno +" " +name);
	ConstructorExample c1=new ConstructorExample(1,"Aarti");
	ConstructorExample c2=new ConstructorExample();
	ConstructorExample c3=new ConstructorExample(3);
	//c1.name = "Sai"; // allowed
	c1.display();
	c2.display();
	c3.display();
}

}
