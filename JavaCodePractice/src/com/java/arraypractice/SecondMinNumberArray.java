package com.java.arraypractice;

public class SecondMinNumberArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int firstMin = a[0];
		int secondMin=a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < firstMin) {

				firstMin = a[i];
			}

		}

		System.out.println("First minimum: " + firstMin);
		
		
		  
		 

	}

}
