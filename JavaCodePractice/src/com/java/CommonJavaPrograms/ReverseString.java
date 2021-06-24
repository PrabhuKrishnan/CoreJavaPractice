package com.java.CommonJavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		 
		String str = "welcome";
		String rev="";
		
		//Using String concatenation Operator 
		
		/*
		  
		  for(int i= str.length()-1; i>=0; i--)
			
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println("String Reverse Using the concatenation Operator: "+ rev);
		
		*/
				
	 
		//Using String Reverse using the char Array
		
		/*
		char data[] =  str.toCharArray();
		
		for(int i=data.length-1;i>=0;i--)
		{
			//System.out.print(data[i]);
			rev=rev+data[i];
			 
	}
		
		System.out.println("String Reverse Using the char Array: "+ rev);
     */
		
		//Using String Reverse using the String Buffer
		
		String value ="welcome";
		
		StringBuffer sb = new StringBuffer(value);
		sb.reverse();
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
}
}
