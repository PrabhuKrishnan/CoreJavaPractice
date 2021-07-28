package com.arrays;

class  ArrayMethod
{
	
	public static int getArrayData(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		return sum;
		
	}

}


public class PassingArrayToFunction {

	public static void main(String[] args) {
		 
     int[] a = {10,20,30,40,50};
     
     //passing array as a method's arguments
     System.out.println(ArrayMethod.getArrayData(a));
     
      
		
		
		
	}

}
