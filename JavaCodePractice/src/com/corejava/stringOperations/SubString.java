package com.corejava.stringOperations;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Automation Testing";
		String subStr = str.substring(11);
		System.out.println("SubString : " + subStr);
		

		String subStr2 = str.substring(0, 11);
		System.out.println("Method 2: " + subStr2);

		
		// value of - convert primitive datatype to string
		int num = 123;
		// converting int to string
		String n = String.valueOf(num);
		System.out.println("valueOfMethod():" + n);

		String t = " Selenium webdriver ";
		System.out.println("Trim:" + t.trim() );
		
		
		
		
		
		String cde = "cde";
	     System.out.println("abc" + cde);
	     
	     String c = "abc".substring(2,3);
	     System.out.println("c:  " +c);
	     
	     String d = cde.substring(1, 2);
	     System.out.println("d: " + d);
		
		
	}

}
