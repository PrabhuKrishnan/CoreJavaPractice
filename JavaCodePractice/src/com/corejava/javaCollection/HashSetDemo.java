package com.corejava.javaCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	
	/*
	 
     HashSet,TreeSet, LinkedHashSet --> Implements Set Interface
     
     - It will not accepts duplicate Element
     - Elements will not store in sequential  order  
     
	 */

	HashSet<String> hs = new HashSet<String>();	
	hs.add("jugle");
	hs.add("forest");
	hs.add("tigers");
	hs.add("birds");
	hs.add("birds");
	
	System.out.println("Remove: "+ hs.remove(0));
	System.out.println("Contains: "+ hs.contains("Tiger"));
	System.out.println("IsEmpty: " + hs.isEmpty());
	System.out.println("ArrayList size " + hs.size());
	System.out.println();
		
	
	Iterator<String> s = hs.iterator();
	while(s.hasNext())
	{
		System.out.println(s.next());
	}
		
		
		
		
		
		
	
	}
}
