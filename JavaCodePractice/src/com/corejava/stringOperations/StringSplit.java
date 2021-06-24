package com.corejava.stringOperations;

public class StringSplit {

	public static void main(String[] args) {

		String str = "Selenium Automation Testing";
		String[] s1 = str.split("\\s");// "\\s" white space

		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}

		System.out.println();	

		String str2 = "QTP Automation Testing";
		String[] s2 = str2.split("\\s", 2);
		for (String s : s2) {
			System.out.println(s);
		}

	}
}
