package com.corejava.javaCollection;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		
		//different ways to create the HashSet
		
		/*
		 * HashSet h1 = new HashSet(); 
		 * HashSet h2 = new HashSet(100);
		 * HashSet h2 = new HashSet(100,(float) 0.75);
		 
		   -addAll()
		   -add()
		   -remove()
		   -removeAll()
		   -Contains()
		   -isEmpty()
		 
		 */
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("prabhu");
		hs.add("ram");
		hs.add("raja");
		hs.add("ragu");
		hs.add(null);
		
		System.out.println(hs.contains("ram"));
		
	    
		System.out.println(hs);
		System.out.println();		
		
		
		
		System.out.println("HashSet Values....");
		for(String value : hs)
		{
			System.out.println(value);
		}
		
		
	}

}
