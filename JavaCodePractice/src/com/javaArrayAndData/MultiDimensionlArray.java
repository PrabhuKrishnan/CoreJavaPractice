package com.javaArrayAndData;

public class MultiDimensionlArray {
  public static void main(String[] args) {
	
	  //a[rows][columns]
	  int a[][] = new int [2][3];
	  a[0][0]=2;
	  a[0][1]=4;
	  a[0][2]=5;
	  
	  a[1][0]=3;
	  a[1][1]=4;
	  a[1][2]=7;
			 
	  //Another way of Declaring the array 
	  int b[][] = {{2,4,5},{3,4,7},{5,2,1}};
	  
	  for(int i=0; i<2;i++) //row
	  {
		 for(int j=0 ;j<3; j++) //column
		 {
			 //System.out.println(a[i][j]);
		 }
	  }
	  
	 
	  //Program to Print  the Minimum Number from the given matrix 
	  
	  /*
	   
	   2 4 5             
	   3 4 7
	   1 2 9
	   
	   row =3 col =3 (3*3)
	   
	   1. start with a row which is 2  and traverse  all the columns which is (2,4,5)
	   
	  */
	  int abc[][] = {{2,4,5},{3,4,7},{1,2,9}};
	  int min = abc[0][0];
	  
	  for(int i=0;i<3;i++) //rows
	  {
		  for(int j=0;j<3;j++) //column
		  {
			  if(abc[i][j]< min)
			  {
				  System.out.println(min=abc[i][j]);
			  }
		  }
	  }
	  
	  System.out.println("Minimum value of 2D Array is: " +min);
	  
}
}
