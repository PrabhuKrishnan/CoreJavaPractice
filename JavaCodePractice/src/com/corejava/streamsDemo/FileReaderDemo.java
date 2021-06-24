package com.corejava.streamsDemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	 
	public static void main(String[] args) throws IOException {
		
	FileReader reader = null;
	
	try{
		
		reader =  new FileReader("C:\\Users\\tagit\\Desktop\\Data\\FileReaderData.txt");
		
		int temp;
		
		while ((temp = reader.read()) != -1)
		{
			System.out.println(temp);
            System.out.println((char)temp);
		}
		  
		 
	}
		finally
		{
			while (reader != null )
			{
				reader.close();
			}
		}
 
 
	
 

}
}
