package com.opps.concepts;

class CollegeDemo
{

	void collegeWelcome()
	{
		System.out.println("welcome....from parent class");
	}

	void collegeRules()
	{
		System.out.println("collegeRules from parent class...");
	}
	
}

class Student extends  CollegeDemo
{
	void collegeWelcome()
	{
		
		System.out.println("collegeWelcome method from child class..");
		
	}
	
	void studentWelcome()
	{
		System.out.println("welcome....from child class method...");
	}

}



public class OverRidingTest 

{
public static void main(String[] args) {
	
 
	CollegeDemo c = new Student();
	c.collegeWelcome(); 
	c.collegeRules();
	
	
	
	 
	 
	
	
	
}
}
