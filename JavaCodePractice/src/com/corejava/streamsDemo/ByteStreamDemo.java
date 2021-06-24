package com.corejava.streamsDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
	
	 
	public static void main(String[] args) throws IOException {
		
		System.out.println("ByteStreamDemo");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("C:\\Users\\tagit\\Desktop\\Data\\FileInputStream.txt");
			fos = new FileOutputStream("C:\\Users\\tagit\\Desktop\\Data\\FileOutputStream.txt");
			
			
		 int temp;
		 while((temp = fis.read()) != -1)
			 fos.write((byte)temp); 
		 
		}
		
		finally
		{
			if(fis != null)
				fis.close();

			if(fos != null)
				fos.close();
			
		}
		
	}

}
