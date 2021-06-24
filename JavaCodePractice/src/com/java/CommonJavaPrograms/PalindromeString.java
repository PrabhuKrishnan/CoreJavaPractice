package com.java.CommonJavaPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		 
		//Give String  is Palindrome or not 
		
		String data="madam";
		
		String org_string=data;
		String rev="";
		
		char  d[] = data.toCharArray();
		
		for(int i=data.length()-1;i>=0;i--)
		{
			
			rev=rev+d[i];
		}
		
		//System.out.print(rev);
		
		if(org_string.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is Palindrome");
		}
		else
		{
			System.out.println("Given string is not Palindrome");
		}
  
	}

}
