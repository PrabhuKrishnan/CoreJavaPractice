package com.opps.concepts;

class thisKeyword_MethodParameter
{
	
	int a,b;
	
	thisKeyword_MethodParameter()
	{
		
		a=10;
		b=20;
	}
	
	 void  getDataUsingThisKeword()
	{
		 display(this);
	}
 
	void display(thisKeyword_MethodParameter a)
	{
		System.out.println(a.a +" " +a.b);
	}


}




public class UsingThisKeyword_MethodParameter {

	public static void main(String[] args) {
		
		thisKeyword_MethodParameter m = new thisKeyword_MethodParameter();
		m.getDataUsingThisKeword();
				

	}

}
