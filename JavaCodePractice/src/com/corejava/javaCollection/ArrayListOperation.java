package com.corejava.javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperation {

	public static void main(String[] args) {

		//List =  ArrayList and LinkedList
		
		// ArrayList Class
		// Maintains insertion Order
		// Accepts Duplicates values
		// easily access to random values because array works at the index basis
		// Manipulation is slow, because lot of shifting needed when elements
		// are removed
		List<String> input = new ArrayList<String>();
		input.add("one");
		input.add("two");
		input.add("three");
		input.add("four");
		input.add("five");
		input.add("one");
		input.add("one");
		for (String values : input) {
			System.out.println(values);
		}
		System.out.println();
		System.out.println("Access ArrayList using Index: " + input.get(0));
		System.out.println();
		
		System.out.println("Sorting An ArrayList: ");
		
		Collections.sort(input);
		System.out.println("After Sorting");
		
		for (String values : input) {
			System.out.println(values);
		}
		
		
		
		
		
		
		
		
		

	}

}
