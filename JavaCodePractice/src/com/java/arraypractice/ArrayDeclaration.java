package com.java.arraypractice;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		
		int[] a = {10,20,30,40,50};
		int length = a.length;
		
		System.out.println("The array elements are:");
		
		//printing an elements of an array 
		for(int i=0;i<length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
	}
	
	
}
