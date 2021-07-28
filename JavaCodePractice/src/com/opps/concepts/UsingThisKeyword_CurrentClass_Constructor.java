package com.opps.concepts;

class  ThisKeywordCurrentClassConstructor
{
	int a,b;
	
	ThisKeywordCurrentClassConstructor()
	{
		this(10,20);
		System.out.println("from no parameterized constructor...");
	}
  
	ThisKeywordCurrentClassConstructor(int a,int b)
	{
		
		System.out.println("from a parameterized constructor..." + a +" " +b);
	}
	
	
}


public class UsingThisKeyword_CurrentClass_Constructor {

	public static void main(String[] args) {

		ThisKeywordCurrentClassConstructor c = new ThisKeywordCurrentClassConstructor();
		
		
	}

}
