package com.opps.concepts;


class ReturnCurrenctClassInstance
{

	int a;
	int b;
	
	ReturnCurrenctClassInstance()
	{
		a=10;
		b=20;
	}
	
	public ReturnCurrenctClassInstance getData()
	{
		return this;
		
	}
	
	void displayData()
	{
		System.out.println(a+" " +b);
	}
	
}



public class UsingThisKeyword_ReturnCurrenctClassInstance {

	public static void main(String[] args) {

		ReturnCurrenctClassInstance r = new ReturnCurrenctClassInstance();
		r.displayData();
		 
		 
	}

	 

}
