package com.java.basicJavaProgram;


public class JavaArrayMaxNumber {

	public static void main(String[] args) {

		int[] num = {33,65,30,40,7555,2,0 };

		int min = num[0];
		int max = num[0];

		for (int i = 1; i < num.length; i++) {
			
			if (max < num[i]) 
			{
				max = num[i];
				
			}
			else if(min > num[i])
			{
				min = num[i];
			}
		}
		System.out.println("Greatest Number: "+max);
		System.out.println("Smallest Number: "+min); 
	}

}
