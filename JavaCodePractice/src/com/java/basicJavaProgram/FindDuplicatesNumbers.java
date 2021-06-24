package com.java.basicJavaProgram;


public class FindDuplicatesNumbers {

	public static void main(String[] args) {
		
		int[] number = {1,1,2,3,3,4,3,5,6,7,2,2};
		for(int i=0; i<number.length;i++)
		{
			for(int j=i+1; j<number.length-1;j++)
			{
				if(number[i]==number[j]){
					System.out.print(number[i]);
				}
			}
		}

	}

}
