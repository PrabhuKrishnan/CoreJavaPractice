package com.opps.concepts;

class Hello
{

	private static int aStaticVariable = 1; 
	private int aNonStaticVariable = 2; 
	
	static void aStaticMethod() 
	{ 
	
	int c=10;
	Hello object = new Hello(); 
	System.out.println(object.aNonStaticVariable); 
	object.aNonStaticMethod(); 
	
	} 
	
	
	void aNonStaticMethod() 
	{ 
		System.out.println(aStaticVariable); 
		
     }
 
    }


public class Demo {
  
	public static void main(String[] args) {
		
		 
		Hello.aStaticMethod();
		  
		  
		  
	}
}
