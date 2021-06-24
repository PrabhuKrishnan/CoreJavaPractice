package com.opps.concepts;

public class MethodOverRiding {

	public static void main(String[] args) {
		
		//static Biding, we can know which method we are calling at compile time
		//Static polymorphism  - compile time polymorphism
		BMW obj = new BMW();
		obj.start(); //overridden method
		obj.theftSafety();
		obj.refuel();
		
		System.out.println(" ");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println(" ");
		
		
		// Top/up Casting 
		// Runtime polymorphism can't be achieved by data members
		Car c1 =  new BMW();//Child class object can be referred by parent class reference variable--dynamic polymorphism-->Run-time polymorphism
		c1.start();
        c1.stop();
        c1.refuel();
        
        //down casting	
        BMW c2 = (BMW) new Car();//Give ClasscastException 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
