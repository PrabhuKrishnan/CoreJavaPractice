package com.corejava.stringOperations;

import java.util.StringTokenizer;

public class StringTokenizerOperation {

	public static void main(String[] args) {
		
		//StringTokenizer deprecated in java, use split() method instead of java
		StringTokenizer st =  new StringTokenizer("Selenium Automaton ,Testing",",");
		while(st.hasMoreElements()){
			
			System.out.println(st.nextElement());
		}

	}

}
