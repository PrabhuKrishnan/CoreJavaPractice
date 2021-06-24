package com.java.basicJavaProgram;


public class StringReverseInbuilt {

	public static void main(String[] args) {
		
		String input = "Automation Testing";
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb = sb.reverse();
		for(int i=0; i<sb.length();i++){
			System.out.print(sb.charAt(i));
		}
		
	}

}
