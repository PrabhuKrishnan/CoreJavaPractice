package com.corejava.javaCollection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		/*
		 
		 ArrayList, LinkedList, Vector  --> Implements List Interface 
		 
		 ArrayList  Accepts Duplicates values 
		
		- Array have fixed size where as ArrayList grow dynamically 
		- You can access and insert any value in any index 
		- ArrayList is not synchronized 
		- Matains the insertion order 
		
		
		
		
		*/
		ArrayList<String> al = new ArrayList<String>();
		al.add("jungle");
		al.add("wild");
		System.out.println(al);
		
		al.add(0, "Tiger");
		al.add("wild");
		
		
		System.out.println(al);
		
		
		/*ArrayList Mostly Used Methods*/
		System.out.println("Remove: "+ al.remove(0));
		System.out.println("Contains: "+ al.contains("Tiger"));
		System.out.println("IndexOf: "+ al.indexOf("wild"));
		System.out.println("IsEmpty: " + al.isEmpty());
		System.out.println("ArrayList size" + al.size());
		
		System.out.println(al);
		
	}
	
	
}

