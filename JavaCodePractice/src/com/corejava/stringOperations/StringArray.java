package com.corejava.stringOperations;

public class StringArray {

	public static void main(String[] args) {

		//Declaring an array
		/*String[] arr1 = new String[2];
		arr1[0] = "A";
		arr1[1] = "B";
		arr1[2] = "C";

		// or

		String s[];
		s = new String[] { "a", "b", "b" };

		//Declaring and Iterating an array
		String[] arr = { "one", "two", "three", "four", "five" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		//to find the minimum number from array
		int[] num = {33,65,30,40,23,3};
		
		int min = num[0]; // min 33
		
		long startTime = System.currentTimeMillis();
		
		
		for(int i=1; i<num.length; i++){ // i=33; 33<3; i++, i=2; 30<3; i++, i=3; 40<3; i++
			
			if(min > num[i]) //33>65=f, 33>30=t, 30>40=f
			{
				min = num[i];  //min= 30(num[i])
				
				
			}
		}
		
		System.out.println(min);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime); 
	}

	 
	 
}
