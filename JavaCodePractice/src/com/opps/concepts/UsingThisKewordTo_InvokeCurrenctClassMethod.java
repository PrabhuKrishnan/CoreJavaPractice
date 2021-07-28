package com.opps.concepts;

class thisKeword_InvokeCurrenctClassMethod
{

	 int a,b;
	 thisKeword_InvokeCurrenctClassMethod()
	 {
		 a=10;
		 b=20;
	 }
	 
	 void invokeMethodUsingThisKeyword()
	 {
		 this.display();
	 }
	
	 void display()
	 {
		 System.out.println("Invoked the method using the this keyword");
	 }
	
}


public class UsingThisKewordTo_InvokeCurrenctClassMethod {

	//Using ‘this’ keyword to invoke current class method
	
	public static void main(String[] args) {
		thisKeword_InvokeCurrenctClassMethod i = new thisKeword_InvokeCurrenctClassMethod();
		i.invokeMethodUsingThisKeyword();
				
	}

}
