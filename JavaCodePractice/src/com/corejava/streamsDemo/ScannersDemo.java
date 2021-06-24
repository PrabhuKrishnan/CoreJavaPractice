package com.corejava.streamsDemo;

import java.util.Scanner;

public class ScannersDemo {

	public static void main(String[] args) {

		int count = 0, sum = 0;

		
		  Scanner sc = new Scanner(System.in);
		  
			
			  String name = sc.nextLine(); 
			  char c = sc.next().charAt(0); 
			  //int roll_No =sc.nextInt();
			  
			 // System.out.println(" Name: " + name); 
			  System.out.println(" Character: " + c);
			 // System.out.println(" roll no : " + roll_No);
			 
		  
			/*
			 * while (sc.hasNextInt()) {
			 * 
			 * int num = sc.nextInt(); // getting value from the user
			 * System.out.println("Entered number the Number: " + num);
			 * System.out.println(); sum += num; count++;
			 * 
			 * }
			 * 
			 * int mean = sum / count; System.out.println("Mean: " + mean);
			 */
			  
			  
			  String s = "welcomr";
			  StringBuffer sb =  new StringBuffer(s);
			  System.out.println(sb.reverse());
			 

	}

}
