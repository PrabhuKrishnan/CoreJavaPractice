package com.java.stringRevisit;

public class SearchingCharInString {

	public static void main(String[] args) {
		 
 /*
	  indexOf(char c)     --> Accepts character as argument, Returns index of 
                               the first occurrence of specified character
                                  
                                  
      indexOf(char c, indexFrom) -->Returns an index of specified character that
                                    appeared at or after the specified index in forward direction                        
                                  
                              
      lastIndexOf(char c)  --> Accepts character as argument, Returns index of 
                                  the last occurrence of specified character
                                  
                                  
      lastIndexOf(char c, int fromIndex) --> It starts searching backward from the specified index in the string
                                            And returns the corresponding index when the specified character is encountered 
                                            otherwise returns -1.
		  
		  
		  
		 */
		
		String str = "welcome to chennai";
		
		int stringLength = str.length();
		System.out.println("The string length: " + stringLength);
		
		int getIndexfromString =str.indexOf('c');
		System.out.println("Index of the given string : " + getIndexfromString);
		
		int getIndexBasedOnGivenChar =  str.indexOf('c', 5);
		System.out.println("Returns the Index based on the given char and Index: " + getIndexBasedOnGivenChar );
		
		
		
		int getLastfromString = str.lastIndexOf('n');
		System.out.println("LastIndex of the given string: " + getLastfromString);
		
		int getLastIndexForGivenChar = str.lastIndexOf('n', 18);
		System.out.println("Returns the Last Index based on the given char and Index : " + getLastIndexForGivenChar );
		
		
		char getChar = str.charAt(6);
		System.out.println("Get the char based on the given Index: " + getChar);
		
		int getCharASCIIvalue = str.charAt(5);
		System.out.println("Get the char ASCII value for the give char: " + getCharASCIIvalue );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
