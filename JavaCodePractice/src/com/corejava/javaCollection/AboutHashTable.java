package com.corejava.javaCollection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class AboutHashTable {

	/*
	 
	 -It's similar to HashMap but  hashTable is synchronized 
	 -Store value on the basics of Key-value pair
	 -key-->Object-- HashCode --> value
	 -Store only unique values
	 -Doesn't accepts null key or null as a value
	 -sequential  one thread access, one thread at a time  
	 */
	
   @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	
	   Hashtable h1 = new Hashtable();
	   
	   h1.put(1, "Nature");
	   h1.put(2, "forest");
	   h1.put(3, "wild");
	   h1.put(4, "animals");
	   h1.put(5, "birds");
	   
	   //Create a clone copy/shallow copy
	   Hashtable h2 = new Hashtable();
	   
	   h2 = (Hashtable)h1.clone(); //cloned the h1 and saved in h2
	   
	   System.out.println("HaashTables values of h1 :" + h1);
	   System.out.println("HaashTables values of h2:" + h2);
	   System.out.println();

	  // h1.clear();// this clear the values in hashTable,so it doesn't have any values 
	   
	   //System.out.println("HaashTables values of h1 :" + h1); 
	   
	  
	   //contains Method in HashTable
	   
	   if(h1.containsValue("forest"))
	   {
		   
		 System.out.println("Data is found");
		   
	   }
	   
	   System.out.println();
	   
	   //Print all the values in hashTable using Enumeration
	   Enumeration e = h1.elements();
	   
	   System.out.println("Values from h1 using Enumeartion");
	   
	   while(e.hasMoreElements())
	   {
		   System.out.println(e.nextElement());
	   }
	   
	   System.out.println();
	   //Get all the values in hashTable using entry set
	   
	   Set hashTableSet = h1.entrySet();
	   System.out.println("HashTable Values uising entry set: " + hashTableSet);
	   
      Hashtable h3 = new Hashtable();
	   
      h3.put(1, "Nature");
      h3.put(2, "forest");
      h3.put(3, "wild");
      h3.put(4, "animals");
      h3.put(5, "birds");
      h3.put(5, "birds");
	   
      System.out.println();
      
     if(h1.equals(h1))
     {
    	 System.out.println("Hashtable h1 and H3 is equal");
     }
	   
	 //get the value using key from hashTable
     System.out.println();
     System.out.println("get value using the key: " + h3.get(1));

     //get the hashCode of HashTable
     int hashCode = h1.hashCode(); //32 bit int hashCode
     System.out.println(hashCode);
     
     
     //hashTable wont accept duplicate values 
     System.out.println(h3);// hashTable just ignored the duplicate value  h3.put(5, "birds");
     
     
     //hashTable wont accept the Null ad Key and value
    // it would throw Null Pointer Exception 
     h3.put(null, "tiger");
     h3.put(6, null);
     h3.put(null, null);
     
     
     
     
     
     
     
     
     
     
     
     
	   
	   
	   
	   
	   
	   
}
}
 