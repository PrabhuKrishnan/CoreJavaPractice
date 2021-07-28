package com.CorejavaConceptsExamples;

public class ReferenceEqualOperator {

	public static void main(String[] args) {
		
		String a = "java";
		String b="java";
		
		String c = new String("java"); 
		
		if(a==c)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		 
		if(a==b) 
		{
			System.out.println("equal");
		}
	}
}
