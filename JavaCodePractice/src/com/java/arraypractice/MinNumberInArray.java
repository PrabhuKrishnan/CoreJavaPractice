package com.java.arraypractice;

public class MinNumberInArray {

	
	public static void main(String[] args) {
		
		
		int[] a = {5,10,20,30,40};
		
		int min =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min =a[i];
			}
		}
		
		System.out.println("The minimum number is: " + min);
		
	}
}
