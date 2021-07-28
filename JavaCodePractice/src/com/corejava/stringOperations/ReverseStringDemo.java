package com.corejava.stringOperations;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		//String Reverse Using the Byte Array
		/*
		 * String input = "Break Out"; // getBytes() method to convert string // into
		 * bytes[]. byte[] strAsByteArray = input.getBytes();
		 * 
		 * byte[] result = new byte[strAsByteArray.length];
		 * 
		 * // Store result in reverse order into the // result byte[] 
		 * 
		 * for (int i = 0; i< strAsByteArray.length; i++) 
		 * result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		 * 
		 * System.out.println(new String(result));
		 * 
		 * 
		 *
		 */
		 
		 
			//String Reverse Using the StringBuffer Reverse Method
		  StringBuffer sb = new StringBuffer(); 
		  sb.reverse();
		  System.out.println("String Reverse using the String Buffer Reverse: " + sb );
		 
        
    
          String converchar = "BreakOut";
       
        
        char stringcharArray[] = converchar.toCharArray();
        
        for(int i=stringcharArray.length-1; i>=0;i--)
        {
        	System.out.println(stringcharArray[i]);
        }
        
        
	}

}
