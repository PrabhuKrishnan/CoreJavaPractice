package com.java.arraypractice;

public class SumOfArrayTest {

	
	public static void main(String[] args) {
		
		
		int[] data = {10,20,30,40,50};
		int sum=0;
		
		for(int i=0; i<data.length;i++)
		{
			sum = sum+data[i];
		}
		
	   System.out.println("The sum of array: " + sum);
		
	}
}
