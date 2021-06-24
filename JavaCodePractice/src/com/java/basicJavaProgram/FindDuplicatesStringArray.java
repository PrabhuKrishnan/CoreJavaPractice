package com.java.basicJavaProgram;


public class FindDuplicatesStringArray {

	public static void main(String[] args) {

		  String[] strArray = {"A","B","C","B","B"};
		  
	        for (int i = 0; i < strArray.length; i++)
	        {
	            for (int j = i+1; j < strArray.length; j++)
	            {
	                if( (strArray[i].equals(strArray[j])) && (i != j) )
	                {
	                    System.out.println("Duplicate Element is : "+strArray[j]);
	                }
	            }
	        }
	    }    
	}

