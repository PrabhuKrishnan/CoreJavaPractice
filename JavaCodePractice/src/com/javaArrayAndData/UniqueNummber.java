package com.javaArrayAndData;

import java.util.ArrayList;

public class UniqueNummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	  
	 - Program to find the duplicate elements in array and print the no.of times the number is printed
	 
	 Logic:
	  - Read the input array
	  - Analyze how we can find the duplicate elements 
	  - we have to take one element from input array and then check if the element is present in the arrayList 
	  - If not count it and pust into the arrayList 
	  - 
	 	
	 */
	 int data[] ={1,2,2,2,3};
	 
	 ArrayList<Integer> al =  new ArrayList<Integer>();
	 
	 for(int i=0; i<data.length;i++)
	 {
		 int count=0; //we have to refresh the count var every time because we are checking all the numbers
		 
		 //data[i] --> data[0] --> data[1] 
		 //The element 1 is not present in arrayList, so it add 1 to arrayList and increment the count 
		 if(!al.contains(data[i]))
		 {
			 al.add(data[i]);
			 count++;
		
	     //We have checked with first element then we have to scan the other elements in the array 
		 //1 with 2,2,2,3
		//2 with 2,2,3
		//2 with 2,3
		//2 with 3
			 
				for(int j=i+1; j<data.length;j++ ) 
					                               
				{
					 if(data[i]==data[j])         
					 {
						 count++;
					 }
				 }
		
		/*System.out.println("The Values is Array List: " + al);
		System.out.println("The Count Values: " + count);*/
		System.out.println();
		
		if(count == 1)
		{
			System.out.print("The Unique Value is: " + data[i]);
		}
		
		}
}// End of the Out for Loop

	}

}
