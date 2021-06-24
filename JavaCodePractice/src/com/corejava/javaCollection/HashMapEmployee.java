package com.corejava.javaCollection;

public class HashMapEmployee {

  String empName;
  String empDept;
  int age;
	
  public HashMapEmployee(String empName, String empDept, int age) {
	 
	this.empName =  empName;
	this.empDept =  empDept;
	this.age     =  age;
	  
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpDept() {
	return empDept;
}

public void setEmpDept(String empDept) {
	this.empDept = empDept;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
  
 
  
  
}
