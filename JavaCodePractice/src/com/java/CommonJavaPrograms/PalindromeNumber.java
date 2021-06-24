package com.java.CommonJavaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Give Number is Palindrome Number or not 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int number = sc.nextInt();
		int org_number = number;
		int rev=0;
		
		while(number!=0)
		{
			
			rev = rev*10 + number%10;
			number = number/10;
		}
	  System.out.println(rev);
		
	  if(org_number==rev)
	  {
		  System.out.println("Palindrome");
	  }else
	  {
		  System.out.println("Not Palindrome");
	  }
		
		
		
		
		

	}

}
