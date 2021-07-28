package com.java.stringRevisit;

public class StringManipulations {
	
	public static void main(String[] args) {
		
		
		String givenString ="keep learning,keep rocking";
		
		/*
		  lenght()
		  charAt(int index)
		  substring(int index)
		  substring(int beginIdex,int EndIndex)
		  
		 */
		
        //string Length
		int stringLenght = givenString.length();
		System.out.println("String Length: " + stringLenght);
		
		//get the character from the given string 
		char charValue = givenString.charAt(6);
		System.out.println("get char by using the index: " + charValue);
		
		//get the substring for given string , substring(int beginIndex)
		String subString1 = givenString.substring(1);
		System.out.println("Substring for the given string: " + subString1);
		
		//get the substring with begin and end index
		String subStrig_BeginEndIndex = givenString.substring(6, 26);
		System.out.println("Substring for the given string: " + subStrig_BeginEndIndex );
		
		
		//trim method 
		String space="     Prabhu Krishnan    ";
		String spaceData = space.trim();
		System.out.println("String Data: " + spaceData);
		System.out.println(spaceData.toLowerCase());
		System.out.println(spaceData.toUpperCase());
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
