package com.java.stringRevisit;

public class StringSplit {

	public static void main(String[] args) 
	{
		//Example 1
		String giveString ="welcome to the world";
		
		String[] splitedValue = giveString.split(" ");
		
		for(String value:splitedValue )
		{
			System.out.println(value);
		}
		
		System.out.println("===========================================================");
		//Example 2
		String data = "hi,prabhu,welcome!to the masi@ mara nattiona park,kenya";
		String[] split1 = data.split("[!]");
		
		for(String value1:split1 )
		{
			System.out.println(value1);
		}
		
		
		
	}
}
