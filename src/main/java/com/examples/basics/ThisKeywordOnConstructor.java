package com.examples.basics;
/*warning supress*/
//@SuppressWarnings("unused")


/*Calling default constructor from parameterized constructor:*/
/*
class ThisKeywordOnConstructor {

	ThisKeywordOnConstructor() {
		System.out.println("hello a");
	}

	ThisKeywordOnConstructor(int x) {
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		ThisKeywordOnConstructor a = new ThisKeywordOnConstructor(10);
	}
}
*/
/*It is used to reuse the constructor. In other words, it is used for constructor
 */



/*Calling parameterized constructor from default constructor:*/

class ThisKeywordOnConstructor{  
	ThisKeywordOnConstructor(){  
this(5);  
System.out.println("hello a");  
}  
	ThisKeywordOnConstructor(int x){  
System.out.println(x);  
}  
	public static void main(String args[]){  
		ThisKeywordOnConstructor a=new ThisKeywordOnConstructor();  
		}
}  
 