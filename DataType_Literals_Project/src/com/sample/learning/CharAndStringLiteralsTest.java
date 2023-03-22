package com.sample.learning;

public class CharAndStringLiteralsTest {
	
	
	// Literals is all about the values - Decimal, Octal, Hexa Decimal, Binary
	
	
	int decimalLiteral = 10;
	
	int octalLiteral = 017; // (0 to 7)
	
	int hexaDecimal = 0x1F2; // ( 0 to 15 --> 0 to 9 and A to F) A-10, B-11, C-12,D-13,E-14,F-15
	
	int hexaDecimalUpper = 0XAAF;
	
	int binaryLiteral = 0b101;
	
	int binaryLiteralUpper = 0B101;
	
	float floatLiteral = 10.235f;
	
	float floatLiteralExp = 1.0235e1f;
	
	// char Literals
	
	char charLiterals = 'A';
	
	char charLiterals_tab = '\t';
	
	char charLiterals_double = '\"';
	
	// String Literals
	
	String stringLiterals = "good";
	
	

	public static void main(String[] args) {
		
		CharAndStringLiteralsTest test = new CharAndStringLiteralsTest();
		
		// test - object == instance 
		
		System.out.println(test.decimalLiteral);
		System.out.println(test.octalLiteral);
		System.out.println(test.hexaDecimal);
		System.out.println(test.hexaDecimalUpper);
		System.out.println(test.binaryLiteral);
		System.out.println(test.binaryLiteralUpper);
		System.out.println(test.floatLiteral);
		System.out.println(test.floatLiteralExp);
		System.out.println("****************************");
		
		System.out.println(test.charLiterals);
		System.out.println(test.charLiterals_tab);
		System.out.println(test.charLiterals_double);
		System.out.println("****************************");
		
		System.out.println(test.stringLiterals);
		// verification
		
		test.stringLiterals.charAt(0);
		

		
		
	}

}
