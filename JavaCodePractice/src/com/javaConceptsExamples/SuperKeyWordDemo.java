package com.javaConceptsExamples;

// Can be used in variable, method, Constructor

class Parent
{
	String name ="Parent class Variable";
	
	public Parent()
	{
		System.out.println("Parent Class Constructor");
	}
	
	public void getPrintData()
	{
		System.out.println("Parent Class Method");
	}
	
}


class Child extends Parent
{
	String name = "Child  class Variable";
	
	public Child()
	{
		
		System.out.println("Child Class Constructor");
	}
	
	public void getPrintData()
	{
		super.getPrintData(); // super should be in first step if  your are calling the parent class method
		System.out.println("Child Class Method");
	}
	
	public void getVarData()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	
	
}


public class SuperKeyWordDemo {

 public static void main(String[] args) {
	
	 Child childVar = new Child();
	/* childVar.getVarData();
	 childVar.getPrintData();*/
	 
	 /*System.out.println("=======================================================================");
	 
	 Parent p1 = new Child();
	 p1.getPrintData();*/
	 
}

}
