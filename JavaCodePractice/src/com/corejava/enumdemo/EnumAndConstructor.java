package com.corejava.enumdemo;


enum Color2
{
    RED, GREEN, BLUE;
  
    // enum constructor called separately for each constant
	
	/*
	 
	  enum can contain constructor and it is executed separately for each enum constant at the time of enum class loading.
	  We need the enum constructor to be private because enums define a finite set of values (SMALL, MEDIUM, LARGE)
	  If the constructor was public, people could potentially create more value. (for example, invalid/undeclared values such as ANYSIZE, YOURSIZE, etc.)
	  
	 */
	
    private Color2()
    {
        System.out.println("Constructor called for : " +
        this.toString());
    }
  
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}
  

public class EnumAndConstructor {

	public static void main(String[] args) {
		
		 Color2 c = Color2.RED;
	     System.out.println(c);
	     c.colorInfo();
		
	}
	
}
