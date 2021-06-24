package com.java.CommonJavaPrograms;

public class SwappingTwoNumbers {

	public static void main(String[] args) {

		int a = 10, b = 20;

		
		 System.out.println("Logic 1"); 
		  //Swap Logic 1
		  
		
		  System.out.println("Before swapping: " + a +" "+b); 
		  
		   int temp; 
		   temp = a; //temp = 10; 
		   a=b; //a=20; 
		   b=temp;//b=10
		  
		  System.out.println("After swapping: " + a +" "+b);
		 
		  System.out.println("========================================"); 

		// Swap Logic 2

		  System.out.println("Logic 2"); 
		  System.out.println("Before swapping: " + a +" "+b);
		  
		  a=a+b; //10+20=20,a=30 
		  b=a-b; //30-10=20, b=20 
		  a=a-b; //30-20=10
		  
		  
		  System.out.println("After swapping: " + a +" "+b);
		 
		  System.out.println("========================================"); 

		// Swap Logic 3 -

		  System.out.println("Logic 3"); 
		
		  if ((a != 0) && (b != 0)) {
		  
		  System.out.println("Before swapping: " + a + " " + b);
		  
		  a = a * b; 
		  b = a / b; 
		  a = a / b; 
		  
		  System.out.println("After swapping: " + a +" " + b);
		  System.out.println("========================================"); 
		  
		  } 
		  else 
		  { 
			  
			System.out.println("The input number should not be zero"); 
			System.out.println("========================================"); 
		  
		  
		  }
		 

		
		  // Swap Logic 4 -
		  
		  System.out.println("Logic 4"); 
		  
		  
		  System.out.println("Before swapping: " + a +" "+b);
		  
		  a=a^b; 
		  b=a^b; 
		  a=a^b;
		  
		  
		  System.out.println("After swapping: " + a +" "+b);
		  System.out.println("========================================"); 
		 
		 
		// Swap Logic 5 
		  
		  System.out.println("Logic 5"); 
		  
			  System.out.println("Before swapping: " + a +" "+b); 
			  b= a+b - (a=b);
			  System.out.println("After swapping: " + a +" "+b);
			 

		  
		  
		  

	}

}
