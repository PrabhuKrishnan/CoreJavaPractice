package com.arrays;

public class ArraysInJava {
	
	public static void main(String[] args) {
		
		/*
		 
		 -methods availabe when using the array 
		 -how to use the arrays with different types of data type
		 -how to get,sum and print the data
		 -how to retrive the data in the array 
		 -how to conver the array's data from one type to another 
		 -how to reverse the data
		 
		 */
		
		
		int[] a = {10,20,30,40,50};
		
		//lenght to ge the size of the array
		int arraySize = a.length;
		System.out.println("Array Size: " + arraySize);
		
		System.out.println("The array elements are: ");
		for(int i=0;i<arraySize;i++)
		{
			System.out.println(a[i]);
		}
		
		//for-each loop 
		System.out.println("Retrieve the array elements using for each loop: ");
		for(int j : a)
		{
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
