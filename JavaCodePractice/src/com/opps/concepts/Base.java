package com.opps.concepts;

class Base1 {
    
	private void foo() 
	{ 
		System.out.println("Base"); 
	}
}
 
class Derived extends Base {
 
    // compiler error
    public void foo() { System.out.println("Derived"); }
}
 
public class Base {
    public static void main(String args[])
    {
        Derived d = new Derived();
        d.foo();
    }
}