package com.CorejavaConceptsExamples;

public class ConstructorDemo {
	
	// - Dosent't have  the return type 
	// - If any of the constructor is defined then it wont look for the default const(implicit constructor)
	
	
	public  ConstructorDemo()
	{
		System.out.println("Default Constructor");
	}
	
	public ConstructorDemo(int a, int b)
	{
		System.out.println("Const with parameter..");
	}
	
   public static void main(String[] args) {
	   
	   ConstructorDemo c1 = new ConstructorDemo(); //If any of the constructor is defined, then it wont  use implicit constructor
	                                               //If any of the constructor is not defined, then complier would take the default one
	   ConstructorDemo c2 = new ConstructorDemo(1,2);

	
}	
}

