package com.java.CommonJavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		 
		
		//Reversing number  Logic 1  
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int number = input.nextInt();
		
		System.out.println("The entered Number are:" + number);
		
		
		  int reverse=0; 
		  
		  while(number!=0) 
		  { 
			
		 reverse = reverse*10 + number%10; //take the last number 
		  number = number/10; 
		  
		  } System.out.println("The Reversed Number are:" + reverse);
		 


		//Reversing number  Logic 2
		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(number));
		StringBuffer rev = sb.reverse();
		System.out.println("The Reversed Number using StringBuffer " + rev ) ;
		*/
		
		 
		
		
		
		
		
		
		

	}

}
