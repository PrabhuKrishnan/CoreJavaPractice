package com.corejava.javaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
	/*
	 
	  - HashMap accepts null values but HashTable Wont 
	  - HashMap is a class implements map interface
	  - it contains only unique values -->if the hashMap have some duplicate values it will ignore 
	  - Stores the values as key value pair
	  - It may have one null key and multiple null values 
	  - It Maintains no order
	  - HashMap is non-synchronized -- not thread safe
	  
	  
	  - HashTable we can't iterate the values using iterator, we have to use Vector  to retrive values 
	  
	  Methods
	  
	   - put --> To Push the values in the hashMap
	   - Get --> To get the values by using the key
	   - remove --> To remove an element based on the key
	 
	 */
		
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
	hm.put(1, "wild");
	hm.put(2, "forest");
	hm.put(3, "forest");
	hm.put(4, "tigers");
	hm.put(5, "nature");
	hm.put(null, null); //hash map accepts null for key and value
	
	System.out.println(" Null value from hm: " + hm.get(null));
	
	System.out.println("HASHMAP List: " + hm);
	/*
	  - user entrySet() to store the hashMap(key, value in index) to set to access the elements from the index 
	  - So, use map object to store it as an set interface
	 
	 */
	hm.remove(2);
	
	
	Set sm = hm.entrySet();
	
	Iterator it = sm.iterator();
	
	while(it.hasNext())
	{
		//To Print key and Value
		 Map.Entry me =(Map.Entry)it.next();
		 
		 System.out.println("KEY: " + me.getKey() +" VALUE: "+ me.getValue());
		 
	}
 	
	
	//or we can iterate the hasMap like below also
	
	for(Entry s : hm.entrySet())
	{
			System.out.println(s.getKey()  + " " + s.getValue()) ;
	}
	
		
		
		
	}
}
