package com.CorejavaConceptsExamples;


interface car
{

	 void car();
}

interface superCar extends car
{

	void car();	
	void superCar();
	
}

  class CarDemo implements  car, superCar
{

	@Override
	public void car() {
		 System.out.println("from car method and cardemo class");
		
	}

	@Override
	public void superCar() {
		 
		 System.out.println("from supercar method and cardemo class");
	}
	
	  

}


public class InterfaceDemo {

	public static void main(String[] args) {
		 
		superCar  c = new CarDemo();
		c.car();
		c.superCar();
		 
		
	}

}
