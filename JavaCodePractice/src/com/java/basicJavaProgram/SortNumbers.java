package com.java.basicJavaProgram;


public class SortNumbers {

	public static void main(String[] args) {
		
		int[] numbers = {5,4,3,2,1};
		
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers.length;j++)
			{
				if(numbers[i]<numbers[j])
				{
					int temp;
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
	}

}
