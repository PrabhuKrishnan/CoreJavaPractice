package com.java.exceptionhandling;

public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		
	 int a =10;
	 String b="aavv33222";
	 
	 try {
		 
		a = a/0;
		  
	 }
	 catch (Exception e) {
		e.printStackTrace();
	}
	 finally
	 {
		 System.out.println("inside the finally block");
	 }
	 
	
	 
		
		
		
		
	}
}
