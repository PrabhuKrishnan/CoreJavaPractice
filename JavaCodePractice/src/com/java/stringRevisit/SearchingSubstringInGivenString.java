package com.java.stringRevisit;

public class SearchingSubstringInGivenString {

	public static void main(String[] args) {
      
	
		/*
		  
		  indexOf(String str)
		  indexOf(String str, int fromIndex)
		  lastIndexOf(String str)
		  lastIndexOf(String str, int fromIndex)
		  
		  
		 */
		
	     String str = "welcome to chennai";
	     
	     int stringLenght = str.length();
	     System.out.println("The given string length: " + stringLenght);
	     
	     
	     //indexOf method
	     
	     int getIndexOfGivenString = str.indexOf("to");
	     System.out.println("Return the index of the given string: " + getIndexOfGivenString );
	     
	     
	     int getIndexforGivenString = str.indexOf("chennai", 8);
		 System.out.println("Returns the index of the given string based on the string and index: " + getIndexforGivenString);
		
		 //lastIndexOf method
	     
		int getLastIndexOfForGivenString = str.lastIndexOf("nnai");
		System.out.println("Return last index of the give string: " + getLastIndexOfForGivenString);
		
		int getLastIndexOfGivenString = str.lastIndexOf("enna", 17);
		System.out.println("Return last index of the given string and index : " + getLastIndexOfGivenString);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
