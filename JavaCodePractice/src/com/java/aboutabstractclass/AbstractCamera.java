package com.java.aboutabstractclass;

abstract class DigitalCamera
{


	abstract void autFocusing();
	abstract void silentAutoFocusing();

	void welcomeMessage()
	{
		System.out.println("welcome");
	}

}


abstract class Canon extends  DigitalCamera
{

	@Override

	void autFocusing() 
	{ 
		System.out.println("Canon Autofocusing....");

	}

}

class Sony extends Canon
{

	@Override
	void silentAutoFocusing() {
		// TODO Auto-generated method stub
		
	}
	


}

public class AbstractCamera {
	public static void main(String[] args) {


		 




	}
}
