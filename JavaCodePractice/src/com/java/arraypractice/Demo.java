package com.java.arraypractice;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		

		//int[] a = {3,4,7,2,6,5};
		int[] a = {50,40,30,20,10,100,250,66};
		int firstMax = 0;
		int secondMax=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>firstMax)  //3>0
			{
				secondMax = firstMax; 
				firstMax = a[i]; //3
			}
			else if(a[i]>secondMax)
			{
				secondMax =  a[i];
			}
		}
		
		System.out.println("The first Max Number: " + firstMax);
		System.out.println("The Second Max Number: " + secondMax);
	   
}
		

}
