package com.corejava.enumdemo;

/*
 Enum and Inheritance :
 
 All enums implicitly extend java.lang.Enum class
 As a class can only extend one parent in Java, so an enum cannot extend anything else
 toString() method is overridden in java.lang.Enum class,which returns enum constant name.
 enum can implement many interfaces
 
 values(), ordinal() and valueOf() methods in ENUM
 
 These methods are present inside java.lang.Enum
 values() method can be used to return all values present inside enum
 Order is important in enums.By using ordinal() method, each enum constant index can be found, just like array index
 valueOf() method returns the enum constant of the specified string value, if exists
 
 
 *
 */

enum Color1 {
	BLACK, RED, GREEN;
}

public class EnumaAndInheritance {

	public static void main(String[] args) {

		// values() -- to access all the values in the ENUM
		Color1[] col = Color1.values();

		for (Color1 c : col) {
			// ordinal - To acces the enum index like array index
			System.out.println(c + " ENUM Index : " + c.ordinal());

		}

		System.out.println(Color1.valueOf("BLACK"));
		System.out.println(Color1.valueOf("GREY")); // java.lang.IllegalArgumentException - because no enum is declared
	}

}
