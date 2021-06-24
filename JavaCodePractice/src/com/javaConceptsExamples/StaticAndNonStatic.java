package com.javaConceptsExamples;

public class StaticAndNonStatic {

	
	public static void main(String[] args) {
    
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.add();
	
		
	}

	
	public void add(){
		System.out.println("Add method");
		
	}
	
	public static void sub(){
		System.out.println("SUb Method");
	}
	
}

