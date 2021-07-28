package com.arrays;

public class ReturnDuplicateValueInArray {

	public static void main(String[] args) {
       
		
		int[] a = {10,20,30,40,50,50,50};
		int count=0;
		int i,j;
		
		System.out.println("Duplicate elements in given array: ");  
		for( i=0;i<a.length;i++)
		{
			
		 for( j=i+1;j<a.length;j++)
		 {
			 
			 if ((i != j) && a[i] == a[j]) 
			 {
				 count++;
				 //System.out.println(a[j] +" "+ count);
				 break;
				 
			 } 
			 
			 
		 }
		 
		} 
		System.out.println(count);
		
		
	}

}
