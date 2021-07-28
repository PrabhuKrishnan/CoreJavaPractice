package com.opps.concepts;

class Data
{
	  int i=10;
	   int j=20;
	public static void onChangeData(Data d) {
		 
		 d.i=100;
		 d.j=2000;
		
	}

	 

}

public class Datademo {
	
	public static void main(String[] args) {
		
		 
		   
		   Data d = new Data();
		   Data.onChangeData(d);
		   
		    System.out.println(d.i);
		    System.out.println(d.j);
	      
	      
	       
		 
				 
	}

}
