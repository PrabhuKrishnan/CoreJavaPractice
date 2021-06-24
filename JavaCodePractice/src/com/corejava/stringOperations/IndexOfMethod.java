package com.corejava.stringOperations;

public class IndexOfMethod {

	public static void main(String[] args) {

		String str = "Selenium  Automation Testing";

		int len = str.length();
		System.out.println("String length: " + len);

		// returns the substring index
		int a = str.indexOf("Automation");
		System.out.println("Method 1: " + a);

		System.out.println();

		// returns the index of the char from specified index
		int b = str.indexOf('g', 0);//char and Starting index
		System.out.println("Methos 2: " + b);

		System.out.println();

		int c = str.indexOf('T');
		System.out.println("Method 3: " + c);

		System.out.println();

		int d = str.indexOf("Testing", 0);
		System.out.println("Method 4:" + d);

	}
}
