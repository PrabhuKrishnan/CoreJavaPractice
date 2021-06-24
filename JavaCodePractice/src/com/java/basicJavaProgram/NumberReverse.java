package com.java.basicJavaProgram;


public class NumberReverse {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		
		for(int i = numbers.length-1 ; i>=0; i--)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("************************************");
		
		// reverse num
		int num =12345;
		int rev=0;
		while(num!=0)
		{
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		System.out.println(rev);
		
		
	}

}


