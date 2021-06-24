package com.corejava.stringOperations;

public class StringContainsMethod {

	public static void main(String[] args) {
		// contains boolean method, returns true or false
		// Throws Null Pointer Expection 
		
        String str =  "Automation Testing Selenium";
        Boolean s = str.contains("t");
        
        System.out.println("ContainsMethos: "+ s);
        
        if(str.contains("Testing")){
        	switch(0){
        	case 0:
        		 System.out.println("From Switch");
        	     break;
        	}
        }
	}

}
