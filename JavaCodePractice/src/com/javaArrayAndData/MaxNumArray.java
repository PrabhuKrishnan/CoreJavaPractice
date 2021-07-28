package com.javaArrayAndData;

public class MaxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Program to find the Minimum number in row and then find the maximum number in column
		
		/*
		  2 4 5 
		  3 0 7 
		  1 2 9
		  
		  -> Find the Minimum Number in row which is 0 and then find the maximum number in that column which is 4
		  
		  Algorithm;
		  
		  1. Find the Minimum Number 
		  2. Identify the column of that Minimum Number 
		  3. Find the Maximum number in that Identified Column 
		 
		 */
		
		int abc[][] ={{2,4,5},
				      {3,0,7},
				      {1,12,9}
				     };
		
		int minNum = abc[0][0];
		int minColumn =0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<minNum)
				{
					minNum=abc[i][j];  //  1. Find the Minimum Number 
					minColumn=j;       //  2. Identify the column of that Minimum Number 
					System.out.println("Minimum Number Column: "+ minColumn); //abc[0][1] = 0, so the column value is 1
				}
			}
		}
		
		int max =abc[0][minColumn];   //Max value is abc[0][minColumn]= abc[0][1]=4; 1st row, 1st column
		
		System.out.println(max);   
		
		int k=0;
		
		while(k<3)   //0<3
		{
			if(abc[k][minColumn] > max)    // At k=0 abc[0][1]=4,  4>4 => False
				                           // At  k=1 abc[1][1]=0, 0>4 => False
				                           // At  k=2 abc[2][1]=2, 2>4 => False
			{
				max = abc[k][minColumn];
			}
			k++;
		}
		System.out.println("Maximum value: " + max); 
		
		
		
	}

}
