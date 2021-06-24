package com.corejava.enumdemo;

interface week {
	public int someday();

}

enum DayCons implements week {

	MON, TUE, WED, THU, FRI, SAT, SUN;

	public int someday() {

		return ordinal() + 1;
	}

}

public class EnumWithInterface {

	public static void main(String[] args) {

		System.out.println("It is day number: " + DayCons.FRI.someday() + " of a week.");
		;

	}

}
