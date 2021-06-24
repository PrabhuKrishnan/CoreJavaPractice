package com.corejava.LoopsInJava;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		
		String data[] = {"RED","BLACK","GREEN"};
		
		for(int i=0; i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		
		//EnhancedForLoop
		
		for(String values : data )
		{
			System.out.println(values);
		}
		
		
		
		
		
		
		
	}
}
