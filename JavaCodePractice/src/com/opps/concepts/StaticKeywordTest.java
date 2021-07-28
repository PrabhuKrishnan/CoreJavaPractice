package com.opps.concepts;

class StaticKeywordDemo
{
	 int a=1;
	 static int b=1;
			
	 

}

public class StaticKeywordTest {

	public static void main(String[] args) {
		
		StaticKeywordDemo s = new StaticKeywordDemo();
		System.out.println(s.a);
		System.out.println(StaticKeywordDemo.b);
		
		s.a++;
		StaticKeywordDemo.b++;
		
		System.out.println("After: object value: " +s.a);
		System.out.println("After: static value: " +StaticKeywordDemo.b);
		
		StaticKeywordDemo s1 = new StaticKeywordDemo();
		System.out.println("Object 2: "+ s1.a);
		
		s1.a++;
		StaticKeywordDemo.b++;
		
		System.out.println("After: object2 value: " +s1.a);
		System.out.println("After: static value: " +StaticKeywordDemo.b);
		
	}
	
	
	
}
