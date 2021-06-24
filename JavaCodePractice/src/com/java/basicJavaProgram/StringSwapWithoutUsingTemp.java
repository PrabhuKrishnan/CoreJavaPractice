package com.java.basicJavaProgram;


public class StringSwapWithoutUsingTemp {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";

		System.out.println("Before Swap:" + a + " " + b);

		a = a + b;
		System.out.println("After Conc: " + a);
		
		System.out.println("Len of a "+a.length());
		System.out.println("Len of b "+b.length());
		
		System.out.println("value of a: " + a);
		System.out.println("Value of b: "+ b);
		
		b = a.substring(0,a.length() - b.length());
		
		//System.out.println("After conc: "+b);
		
		a = a.substring(b.length());
		
		System.out.println("After Swap: "+ a + b);
	}
}
