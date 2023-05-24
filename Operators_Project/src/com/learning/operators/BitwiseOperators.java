package com.learning.operators;

public class BitwiseOperators {
	
	/*
	 * Bitwise operators - & , | ,^ , ~ , << ,>>
	 */
	

	public static void main(String[] args) {
		
		int num1 = 32;
		
		int num2 = 3;
		
		byte num3 = 7; // (0000 0111) --> 1111 1000
		
		System.out.println("Result for AND Operation --> "+(num1 & num2));
		
		System.out.println("Result for OR Operation --> "+(num1 | num2));
		
		System.out.println("Result for ExOR Operation --> "+(num1 ^ num2));
		
		System.out.println("Result for Complement Operation --> "+(~num3));
		
		
		//<< left shift -- 7 * 2 = 14
		
		System.out.println("left shift operator with 1 position :: "+ (num1 << 3));  //--32 *2 = 64 --> 64*2 - 128 --> 128 * 2 = 256
		
		// >> right shift operator --> 7 >> 1  32 / 2 = 16
		
		System.out.println("Right shift operator with 1 position :: "+ (num1 >> 2));

	}

}
