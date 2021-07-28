package com.arrays;

import java.util.Arrays;

public class ArrayConversion {

	public static void main(String[] args) {

		int[] a= {10,20,30};
		
		//covert int Array to String 
		 String[] s=Arrays.toString(a).split(",");
		 System.out.println(Arrays.toString(s));
		 
		 for(String c: s)
		 {
			 System.out.println(c);
		 }
		  
		 
		 
		//convert string array to int
		 System.out.println();
		System.out.println("Converting integer arry to string..."); 
		String[] values = {"10","20","30"};
		int size = values.length;
		
		int[]  d = new int[size];
		
		for(int i=0;i<size;i++)
		{
			d[i] = Integer.parseInt(values[i]);
			System.out.println(d[i]);
		}
		 
		 
		 
	}

}
