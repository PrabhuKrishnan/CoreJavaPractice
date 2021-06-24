package com.java.basicJavaProgram;


public class StringReveseByCharArray {

	public static void main(String[] args) {
		
		String input ="Automaton Selenium Testing";
		System.out.println("Length: "+input.length());
		
		char[] words = input.toCharArray();
		for(int i = words.length-1; i>=0;i--)
		{
			System.out.print(words[i]);
		}

		
		System.out.println();
		
		
	}

}
