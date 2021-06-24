package com.corejava.stringOperations;

public class StringOperations {

	public static void main(String[] args) {
		
		//char starts with zero
		String str = "selenimAutomationTesting";
		char c = str.charAt(0);
		System.out.println(c);
		
		//String Joins
		String joinString1=String.join("-","Selenium","Automation","Testing");  
		System.out.println(joinString1);  
		
		//Equals Methods in String, Boolean Method
		String s1 = "Automation";
		String s2 = "Automation";
		if(s1.equals(s2)){
			System.out.println("Equals");
		}else{
			System.out.println("Not Equals");
		}
				
		
		

	}
	
	
}
