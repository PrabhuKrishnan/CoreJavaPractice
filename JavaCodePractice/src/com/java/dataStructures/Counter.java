package com.java.dataStructures;

public class Counter {

	int count=0;
	String name;
	
	Counter(String name)
	{
		this.name = name;
	}
	
	public void increment()
	{
		count++;
	}
	
	public int getCurrentValue()
	{
		 
		return count;
	}
	
	public String toString()
	{
		 
		return name + " : " + count;
		 
		
	}
	public static void main(String[] args) {
		
		Counter count=null;
		count = new Counter("prabhu");
		count.increment();
		count.increment();
		count.increment();
		count.increment();
		 
		 System.out.println(count.toString());
		
 
	}

	
}











