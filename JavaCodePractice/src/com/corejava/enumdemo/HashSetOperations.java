package com.corejava.enumdemo;

import java.util.HashSet;

public class HashSetOperations {

	public static void main(String[] args) {

		//union, Intersection,difference

		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5); 

		System.out.println("Set1: " + set1);


		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		System.out.println("Set1: "+ set2);


		//union --> it have only the unique elements, the duplicate elements are removed
		//set1.addAll(set2);
		//System.out.println("Union: " + set1);

		//Intersection
		//set1.retainAll(set2);
		//System.out.println("Intersection: " + set1);

		//difference
		/*
		 * set1.removeAll(set2); 
		 * System.out.println(set1);
		 */


        


	}

}
