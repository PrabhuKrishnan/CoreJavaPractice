package com.java.arraypractice;

public class SecondMaximumNumberArray {
	
	public static void main(String[] args) {
		
		int[] a = {3,4,7,2,6,5};
		int firstMax = 0;
		int secondMax=0;
		
		
		 for(int i=0;i<a.length;i++)
		 {
			 
			 if(a[i]>firstMax)
			 {
				  
				 firstMax = a[i];
			 }
			 
		 }
		 
		 System.out.println("First maxmimum: " +firstMax);
		 
		 for(int j=0;j<a.length;j++)
		 {
			 if(firstMax != a[j]  && a[j]>secondMax)
			 {
				 secondMax =a[j];
			 }
		 }
		 
		 System.out.println("Second maxmimum: " +secondMax);
		
		 
	}

}
