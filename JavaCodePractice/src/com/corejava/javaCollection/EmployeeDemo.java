package com.corejava.javaCollection;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer, HashMapEmployee> emp = new HashMap<Integer, HashMapEmployee>();
		
		 HashMapEmployee emp1 = new HashMapEmployee("Prabhu", "CSE", 25);
		 HashMapEmployee emp2 = new HashMapEmployee("venkat", "IT", 26);
		 HashMapEmployee emp3 = new HashMapEmployee("krishnan", "QA", 28);
		 
		 //Duplicate Value, HashMap Accepts Null value
		 HashMapEmployee emp4 = new HashMapEmployee("Prabhu", "CSE", 25);
		 
		 //Accept Null for key and value, one value or two not all parameters would accept null value
		 HashMapEmployee emp5 = new HashMapEmployee(null, null, 25);
		 
		 
		 emp.put(1, emp1);
		 emp.put(2, emp2);
		 emp.put(3, emp3);
		 emp.put(4, emp4);
		 emp.put(5, emp5); 
		 
		 System.out.println();
		 emp.remove(2);
		 
		 
		 for(Entry<Integer,HashMapEmployee> itr : emp.entrySet())
		 {
			   int empKey = itr.getKey();
			   HashMapEmployee empValue = itr.getValue();
			   
			   System.out.println("Emp Key: " + empKey);
			   System.out.println(empValue.getEmpName()+ " " + empValue.getEmpDept() + "  " +empValue.getAge());
			   
			        
		 }
		 
		 
		 
		
 		
		
		
	}
	
}
