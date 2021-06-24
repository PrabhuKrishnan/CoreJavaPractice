package com.corejava.javaCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		 
		
	/*
	   -Single Linked List
	   -
		
		
	*/	
		
	
		LinkedList<String> ll = new LinkedList<String>();
		
	//Add data into LinkedList
	    ll.add("Nature");
	    ll.add("forest");
	    ll.add("wild");
	    ll.add("birds");
	    ll.add("tiger");
	    ll.add("Nature");
	    
	    System.out.println("Content of the LinkedList: " + ll );
	    
	    ll.add(0, "rain");//adding element using the index with element
	    
	    System.out.println("Content of the LinkedList: " + ll );
	    
	    ll.addFirst("Jungle");
	    ll.addLast("Elephants");
	    System.out.println("Add First and Last: " + ll );
	    
	    System.out.println("******Using Remove Method: **********" +ll.remove(0));
	    
	    
		
        ll.get(3);
        System.out.println("Get Method: " +  ll.get(3));
        
        ll.set(2, "trees");
        System.out.println("Set Method: " + ll );
	    
        //how to print all the values of LinkedList:
        System.out.println("*******using for loop**********");
        for(int n=0; n<ll.size(); n++)
        {
        	System.out.println(ll.get(n));
        }
	    
        //Advance For loop
        System.out.println("*********Using Advance For each loop********");
        for(String l : ll)
        {
        	System.out.println(l);
        }
	    
        System.out.println("********Using Iterator*********");
         Iterator<String> itr = ll.iterator();
         
         while(itr.hasNext())
         {
        	 System.out.println(itr.next());
         }
	    
	    System.out.println("*********Using While Loop*********");
	    
	    int num=0;
	    while(ll.size() > num)
	    {
	    	System.out.println(ll.get(num));
	    	num++;
	    }
	    
	    
	    
	    
	}

}
