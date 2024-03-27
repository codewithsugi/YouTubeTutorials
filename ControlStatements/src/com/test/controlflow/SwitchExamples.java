package com.test.controlflow;

public class SwitchExamples {

	public static void main(String[] args) {
		
		
		// switch case - if .. else
		
		int weekDay = 2;
		
		String weekDayStr = "forty";
		
		if(weekDay == 1)
		{
			System.out.println("Monday");
		}
		else if(weekDay == 2)
		{
			System.out.println("Tuesday");
		}
		else if(weekDay == 3)
		{
			System.out.println("Wednesday");
		}
		else
		{
			System.out.println("Invalid Data");
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		switch(weekDay)  // int, char, String
		{
		case 1:
		{
			System.out.println("Monday");
			break;
		}
		case 2:
		{
			System.out.println("Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		default :
		{
			System.out.println("Invalid Data");
			break;
		}
	
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		switch(weekDayStr)
		{
		
		case "one":
		{
			System.out.println("Monday");
			break;
		}
		case "two":
		{
			System.out.println("Tuesday");
			break;
		}
		case "three":
		{
			System.out.println("Wednesday");
			break;
		}
		default :
		{
			System.out.println("Invalid Data");
			break;
		}
		
		}
	}

}
