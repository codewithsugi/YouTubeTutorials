package com.learning.operators;

public class EqualityRelationalOperators {
	
	/*
	 * Equality Relational Operators --> == , != , <, >, <=,>=
	 * 
	 * Conditional Operators --> && , || , ?:(ternary operator)
	 * 
	 * BitWise Operators --> & , | , ^, ~ , << , >>
	 * 
	 */
	
	public static void main(String[] args) {
		
		
			int num1 = 7;
			
			int num2 = 4;
			
			System.out.println("Equality check ::"+ (num1==num2));
			
			System.out.println("Is num1 not equal to num2? :: "+ (num1 != num2));
			
			System.out.println("Is num1 greater than num2? :: "+(num1 > num2));
			
			System.out.println("Is num1 less than num2? :: "+(num1 < num2));
			
			System.out.println("Is num1 greater than or equal to num2? :: "+(num1 >= num2));
			
			System.out.println("Is num1 less than or equal to num2? :: "+(num1 <= num2));
			
			
			// conditional operators  && , || , ?:
			
			// condition num1 >=5 and num2 <=3
			
			System.out.println("Conditional Operator && -->" +(num1 >=5 && num2 <=3));
			
			//condition num1 >=5 or num2 <=3
			
			System.out.println("Conditional Operator || -->" +(num1>=5 || num2 <=3) );
			
			// ternary operator ?: --> if num1 == 7 true else false
			
			System.out.println("Ternary operator ?: -->"+(num1 == 8 ? true : false));
			
			
			
		
	}

}
