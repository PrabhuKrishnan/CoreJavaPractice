package com.opps.concepts;

class thisKeyworddDemo
{ 
	int a,b;
	
	thisKeyworddDemo(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	void display()
	{
		System.out.println("the value of a and b: " + a +" " + b);
	}

}

public class UsingThisKeyword_ReferCurrentInstance_Variable {

    public static void main(String[] args) {
		
    	thisKeyworddDemo  t = new thisKeyworddDemo(10, 20);
    	t.display();
    
    	
    	
	}	
}
