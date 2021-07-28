package com.corejava.stringOperations;

public class StringBuilderTest {

	public static void main(String[] args) {
		 
		
		StringBuffer sb = new StringBuffer();
		StringBuffer str = sb.append("welcome");
		System.out.println("From SB: " + str ); //SB will call the toString method implictly 
		
		str.reverse();
		
		System.out.println("From SB: " + str );
		
	}

}
