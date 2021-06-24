package com.corejava.enumdemo;

public class DefineEnumOutsideClass {
	

	//defining enum inside the class
	enum Color
	{
		BLACK,RED,GREEN;
	}
	
	public static void main(String[] args) {
		
		Color c1 = Color.RED;
		System.out.println("The color is: " + c1);
		
		
	}
	

}
