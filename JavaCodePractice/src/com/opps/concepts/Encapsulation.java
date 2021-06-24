package com.opps.concepts;

public class Encapsulation {
	
	private String name;
	private int age;
	private int id;
	
	
	public void setName(String userName)
	{
		name = userName;
	}
	
	public void setAge(int userAge)
	{
		age = userAge;
	}

	public void setId(int userId)
	{
		id = userId;
	}
	
	
	public String getName( )
	{
		return name;
		
	}
	
	public int  getAge()
	{
		return age;
		
	}
	public int getId()
	{
		return id ;
	}

	
	public static void main(String[] args) {
		
		
		Encapsulation e = new Encapsulation();
		
		e.setName("prabhu krishnan");
		e.setId(100);
		e.setAge(30);
		
		System.out.println("Name: "  + e.getName());
		System.out.println("User ID: "  + e.getId());
		System.out.println("User Age: " + e.getAge());
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
