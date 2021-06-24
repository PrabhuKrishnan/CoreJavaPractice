package com.corejava.enumdemo;

/*
  Every enum constant is always implicitly public static final
  Since it is static, we can access it by using enum Name
  Since it is final, we can’t create child enums.
  We can declare main() method inside enum
  
  
  Every enum internally implemented by using Class
  
  class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}
  
  
 */



enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class EnumWithSwitchStatement {

	Day day;

	public EnumWithSwitchStatement(Day day) {
		this.day = day;
	}

	public void dayIsLike() {

		switch (day) {

		case MONDAY:
			System.out.println("Monday blue...");
			break;
		case TUESDAY:
			System.out.println("Tuesday are broing...");
			break;
		case WEDNESDAY:
			System.out.println("Midweek are broing...");
			break;
		case FRIDAY:
			System.out.println("Fun Friday..Enjoy...");
			break;
		default:
			System.out.println("take  leave and enjoy...");
			break;

		}

	}

	public static void main(String[] args) {

		String dayValue = "FRIDAY";
		EnumWithSwitchStatement day = new EnumWithSwitchStatement(Day.valueOf(dayValue));
		day.dayIsLike();
		
	}
}
