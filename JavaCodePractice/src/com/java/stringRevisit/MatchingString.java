package com.java.stringRevisit;

public class MatchingString {

	public static void main(String[] args) {
	   
		
		/*
		  
		  startsWith(String str)
		  startsWith(String str,int fromIndex)
		  endsWith(String str)
		  
		  contains(string str)
		  equals(String)
		  
		 */

		String str = "Selenium Automation testing";
		
		String str1 ="Selenium";
		
		int stringLenght = str.length();
		System.out.println("Lenght of the given string: " + stringLenght);
		
		boolean stringStartsWith = str.startsWith("Sel");
		System.out.println("String starts with method: " + stringStartsWith);
		
		boolean stringStartsWithStringAndIndex = str.startsWith("Auto", 9);
		System.out.println("String starts with given string and Index: " + stringStartsWithStringAndIndex);
		
		boolean stringEndsWith = str.endsWith("ing");
		System.out.println("String ends with: " + stringEndsWith);
		
		
		boolean stringContains = str.contains("Automation");
		System.out.println("String contains methos: " + stringContains );
		
		boolean Stringequal = str1.equals("Selenium");
		System.out.println("String equal check: " + Stringequal);
		
		boolean stringEqualIgnoreCase = str1.equalsIgnoreCase("SELENIUM");
		System.out.println("String equal IgnoreCase check: " + stringEqualIgnoreCase);
		
		
	}

}
