package com.java.basicJavaProgram;


public class StringReverseOperation {

	public static void main(String[] args) {
		String reverse ="";
		String input = "welcome";
		for (int j = input.length() - 1; j >= 0; j--) {
			
			 reverse = reverse + input.charAt(j);
			
		}
		System.out.println("String Revese: " + reverse);
	}

	}


