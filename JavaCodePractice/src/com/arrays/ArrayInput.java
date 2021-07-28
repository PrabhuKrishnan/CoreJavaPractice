package com.arrays;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {

		
		int[] a  = new int[10];
		
		//get number of elements to be stored in array
		System.out.println("Enter the number of elements you want to store...");
		int numberOfElements=0;
		
		Scanner sc = new Scanner(System.in);
		numberOfElements = sc.nextInt();
		
		System.out.println("Enter the elements you want to store..");
		for(int i=0;i<numberOfElements;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		System.out.println("The array elements are...");
		for(int data : a)
		{
			System.out.println(data);
		}
		
	}

}
