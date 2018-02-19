package com.examples.basics;

import java.util.*;

class ArrayListCollection {
	public static void main(String args[]) {
		//Arraylist
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		
		list.add("Tush");// Adding object in arraylist
		list.add("RT");
		list.add("Diksh");
		list.add("Swaru");
		// Traversing list through Iterator
		//Two ways for iteration
		 /* Iterator itr = list.iterator();
		 
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		for(String obj:list)  
		    System.out.println(obj);  
		
		 System.out.println("\n"); 
		 
		//Hash Set
		 HashSet<String> set=new HashSet<String>(); 
		 set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
	}
}}