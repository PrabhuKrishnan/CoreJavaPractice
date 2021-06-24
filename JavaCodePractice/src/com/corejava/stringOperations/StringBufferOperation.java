package com.corejava.stringOperations;

public class StringBufferOperation {

	public static void main(String[] args) {

		// StringBuffer is synchronized i.e. thread safe.
		// It means two threads can't call the methods of StringBuffer
		// simultaneously
		
		 StringBuffer sb = new StringBuffer("Automaion");
		 sb.append("Testing");//Original  String is changed
		 sb.insert(0,"Selenium");
		 System.out.println(sb);
		 
		 
		 //Not thread safe
		 StringBuilder b =  new StringBuilder("Selenium");
		 b.append("Webdriver");
		 System.out.println(b);

	}

}
