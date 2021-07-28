package com.java.stringRevisit;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {

		char a ='k';
		Character c = a;  // coverted char to Character wrapper class objects - Auto boxing
		
	    System.out.println(c);
	    
	    int a1=10;
	    Integer i =a1;   // coverted char to Integer wrapper class objects - Auto boxing
	    
	    ArrayList<Integer> list = new ArrayList<Integer>(); //Collections will story only the object, hence Interger wrapper calss is used
	    list.add(10);

	    
	    Integer b = 10;
	    int d =b;
	    System.out.println(d);
	}

}
