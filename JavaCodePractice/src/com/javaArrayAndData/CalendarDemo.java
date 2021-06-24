package com.javaArrayAndData;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Calendar calc = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY hh;mm:ss");
    
    System.out.println(sdf.format(calc.getTime()));
    System.out.println(calc.get(Calendar.DAY_OF_MONTH));
    System.out.println(calc.get(Calendar.DAY_OF_WEEK));
    System.out.println(calc.get(Calendar.DAY_OF_YEAR));
    	
    
	}

}
