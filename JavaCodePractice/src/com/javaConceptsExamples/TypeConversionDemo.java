package com.javaConceptsExamples;

public class TypeConversionDemo {

	public static void main(String[] args) {
		
	/*
	  Type conversion in Java
	  
	  1.Widening or Automatic Type Conversion
	  
	  Widening conversion takes place when two data types are automatically converted. This happens when:

	  -The two data types are compatible.
	  -When we assign value of a smaller data type to a bigger data type.
	  
	  Widening or Automatic Conversion
	   Byte -> Short -> Int -> Long -> Float -> Double
  
	 */
		
	//Example for Automatic type Conversion 
	
	int i=100;	
	long l = i;
	float f = l;
	
	System.out.println("Int value: " + i);
	System.out.println("Long value: " + l);
	System.out.println("float value: " + f);
	
	
	
	
		
		

	}
	
}
