package com.java.exceptionhandling;

class ExceptionA
{
	
	int a=0;
	
  void display() throws ArithmeticException
  {
	  displayException();
	 
  }
  
  void displayException() throws ArithmeticException
  {
	  
	    a = a/0;
  }

}
public class Demo {

	
	public static void main(String[] args) throws ArithmeticException {
		
		
		ExceptionA a = new ExceptionA();
		a.display();
		 System.out.println("End");
		
		
	}
}
