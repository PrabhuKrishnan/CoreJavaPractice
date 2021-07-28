package com.corejava.javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {

		
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("mobile");
		list2.add("web");
		list2.add("atm");
		list2.add("paymentgateay");
		
		String[] s = {"selenium","automation","UI","API"};
		
		//converting the Arrays to ArrayList using the Arrays.asList(arrayReference) method
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s));
		list.add("QTP");
		list.add(5, "appium");
		list.addAll(list2);
		
		
		System.out.println("Contains method: " + list.contains("web"));
		System.out.println("Contains All Method: " + list.containsAll(list2));
	    System.out.println("Get Index Method: " + list.get(0));
	    System.out.println("LastIndexOf Method: " +  list.lastIndexOf("QTP"));
		System.out.println("lsEmpty Method: " + list.isEmpty());
		System.out.println("Size of Array List: " + list.size());
		System.out.println("Remove element using Index: " + list.remove(0));
		System.out.println("Remove element using value : " + list.remove("automation"));
		//System.out.println("Remove all Method: " + list.removeAll(list));
		
		
		Collections.sort(list);
		Collections.shuffle(list);
		//list.clear();
		
		
		
		if(list.isEmpty())  //we can also write as if(list != -1)
		{
			System.out.println("List is empty...");
			
		}
		else
		{
			list.add("some");
		}
		
		System.out.println();
		
		
		//for list
		System.out.println("Using For Each Loop");
		for(String values : list)
		{
			System.out.println(values);
			
		}
		
		System.out.println();
		
		//for list2
		System.out.println("From ArrayList 2");
		System.out.println();
		
		for(String values : list2)
		{
			System.out.println(values);
			
		}
		
		System.out.println();
		System.out.println("Using Iterator to retrive the elements");
		System.out.println();
		
		Iterator<String> iList =  list.iterator();
		
		while(iList.hasNext())
		{
			System.out.println(iList.next());
		}
		
		
		
		
		
		
	}

}
