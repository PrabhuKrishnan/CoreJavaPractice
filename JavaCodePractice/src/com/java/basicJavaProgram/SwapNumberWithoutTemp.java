package com.java.basicJavaProgram;


public class SwapNumberWithoutTemp {

	public static void main(String[] args) {
		
		int a = 100; 
		int b = 20;
		
		a = a + b; //a = 30
		b = a - b; //b=10;
		a = a - b; //30-10 = 20
		
		
		System.out.println("After Swapping Numbers: " + a + " " +b);
		
		

	}
}
