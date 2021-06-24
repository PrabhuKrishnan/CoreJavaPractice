package com.javaConceptsExamples;

public class SingletonClassDemo {

/*
  Singleton
   -In OOP,a Singleton class is a class that can have only object at a time
  
   How to design  singleton class
   1.Make constructor as private
   2.write a public static method that has return type of object of this singleton class(Lazy Initialization)
 
    
 */
    private static SingletonClassDemo singletonClassDemo =null;
    private String str;
    
    private SingletonClassDemo()
    {
    	str = "I'm Using SingletonClassDemo Class ";
    }
    
	public static SingletonClassDemo getSingletonInstance()
	{
		if(singletonClassDemo == null)
	       singletonClassDemo = new SingletonClassDemo();
		   return singletonClassDemo;
	}
		  
	
	
	public static void main(String[] args) {
		
		
		SingletonClassDemo a = SingletonClassDemo.getSingletonInstance();
		SingletonClassDemo b = SingletonClassDemo.getSingletonInstance();
		SingletonClassDemo c = SingletonClassDemo.getSingletonInstance();
		
		a.str = (a.str).toLowerCase();
		
		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);
		
		c.str = (c.str).toLowerCase();
		
		System.out.println("*********************************");
		
		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);
		
		
		
	}
	
	
}
