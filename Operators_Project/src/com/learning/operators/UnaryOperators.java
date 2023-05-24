package com.learning.operators;

public class UnaryOperators {
	
	/*
	 * Unary Operators --> +, -, ++ , -- , !( pre / post) - Pre - new value / post --> original value
	 * 
	 * Unary Plus - + --> specify the positive value
	 * 
	 * Unary minus --> specify the negative value opeartor(+/-) operand
	 * 
	 * Pre Increment - ++variable  --> new value // it will increment the value by 1
	 * 
	 * Post Increment - variable++  --> original
	 * 
	 * Pre Decrement - --variable 
	 * 
	 * Post Decrement - variable--
	 *
	 * 
	 */

	public static void main(String[] args) {
		
		
		
		// Unary Plus
		
		int num = +1;
		
		int num1 = -1;
		
		System.out.println("Unary Plus :: "+num);
		
		System.out.println("Unary Minus :: "+num1);
		
		
		// Logical Complement - !
		
		boolean flag = false;
		
		System.out.println("Boolean Value W/o Logical Complement :: "+flag);
		
		System.out.println("Boolean value w logical Complement :: "+ !flag);
		
		System.out.println("***************************************************");

		// ++ (increment) , -- (decrement)
		
		int result = 1;
		
		++result;  // result = result+1;
		
		System.out.println("Pre Increment Value :: "+result);
		
		int result1 = 1;
		
		result1++;
		
		System.out.println("Post Increment Value :: "+result1);
		
		System.out.println("*************** Details******************************");
		
		int result2 = 1;
		
		System.out.println("Pre Increment Value :: "+ ++result2); // new value
		
		System.out.println("After Pre Increment :: "+result2); // new value
		
		int result3 = 1;
		
		System.out.println("Post Increment Value :: "+ result3++); // original
		
		System.out.println("After Post Increment :: "+result3); // new value
		
		System.out.println("*************** Decrement Details***************************");
		
		int result4 = 2;
		
		System.out.println("Pre Decrement Value :: "+ --result4); // new value - 1
		
		System.out.println("After Pre Decrement :: "+result4); // new value - 1
		
		int result5 = 2;
		
		System.out.println("Post Decrement Value :: "+ result5--); // original - 2
		
		System.out.println("After Post Decrement :: "+result5); // new value - 1
		
		
		

	}

}
