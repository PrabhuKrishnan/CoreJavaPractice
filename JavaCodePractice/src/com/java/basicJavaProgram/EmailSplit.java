package com.java.basicJavaProgram;

public class EmailSplit {

	public static void main(String[] args) {

		String mail = "kprabhucs@gmail.com";
		int index = mail.indexOf('@'); // position of @

	     String first = mail.substring(0,mail.indexOf("@"));
	     String second = mail.substring(mail.indexOf("s")+1);
	     
	     System.out.println("First: " + first);
	     System.out.println("Second: " + second);
	     

		
		System.out.println();
		// split function
	     System.out.println("From Split Function");
		String[] parts = mail.split("[@.]");
		for (int i = 0; i <= parts.length - 1; i++) {
			System.out.println(parts[i]);
			
			
			
		}

	}

}
