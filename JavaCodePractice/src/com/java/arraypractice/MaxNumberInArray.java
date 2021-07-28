package com.java.arraypractice;

public class MaxNumberInArray {

	
	public static void main(String[] args) {
		
		
		int[] a = {5,10,20,30,40};
		
		int max =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max =a[i];
			}
		}
		
		System.out.println("The max number is: " + max);
		
	}
}
