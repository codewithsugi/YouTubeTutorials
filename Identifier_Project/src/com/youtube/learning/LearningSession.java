package com.youtube.learning;

public class LearningSession {
	
	
	/*
	 * learn about identifiers
	 * 
	 * 1. should be created with a-z / A-Z / 0-9 / $ / _
	 * 
	 * 2. Case Sensitive
	 * 
	 * 3. should not begin the identifier with digit 
	 * 
	 * 4. with camel case (lowerCase_FirstLetter Of Next Word (UpperCase)_lowercase
	 * 
	 * 5. should not use reserved keyword.
	 * 
	 */

	public static void main(String[] args) {
		
		
		
		/**
		 * Valid Identifiers
		 */
		
		
		int age = 10;
		
		int Age = 10;
		
		int agE = 10;
		
		int $age = 10;
		
		int _age = 10;
		
		int agehuhuhuhuahdagdagduadhuahdaudhuadhaudhuadhaudhaudhuadhuahdkakadkadadjkajdadhkadhakhjadah = 10;
		
		// not advisable
		int String =10;
		
		int Int = 10;
		
		int __ = 10;
		
		int __age=10;
		
		int Float = 10;
		
		/**
		 * Invalid Identifiers
		 */
		
		
		// point -3 should not begin the identifier with digit
		int 0age=10;
		
		// should not use reserved keywords for identifier
		int int =10;
		
		// other than _ and $ are not valid identifiers
		int test age = 10;
		
		int #age=10;
		
		// from java 9. you cannot use the _ as identifier
		int _ = 10;
		
		
		
		/**
		 * Best Practice -  Identifiers
		 */
		
		String firstName = "Hello";
		
		String userName = "best";
		
		// String uName = "best";
		
		

	}

}
