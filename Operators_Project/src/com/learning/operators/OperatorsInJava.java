package com.learning.operators;

public class OperatorsInJava {
	

	/*
	 * Assignment Operator --> =  
	 * 
	 * Arithmetic Operators  --> + , -, * , / ,%
	 * 
	 * Unary Operators --> +, -, ++ , -- ( pre / post) - Pre - new value / post --> original value
	 * 
	 * Equality & Relational Operators --> == , !=, < ,> ,<=, >=
	 * 
	 * Conditional Operators --> && , || , ?:
	 * 
	 * Bit Wise Operators --> & , | , ^ , ~ , << ,>>
	 */
	

	public static void main(String[] args) {
		
		
		   int num1 = 7;
		   
		   int num2 = 3;
		   
		   int num3 = 0;
		   
		   float num4 = 7, num5 = 3;
		   
		   float num6;
		   
		   
		   
		   // Arithmetic Operators: 
		
		   num3 = num1 + num2 ;
		   
		   System.out.println("After Addition :: "+num3);

		   num3 = num1 - num2;
		   
		   System.out.println("After Sub :: "+num3);
		   
		   num3 = num1 * num2;
		   
		   System.out.println("After Mul  ::"+num3);
		   
		   
		   num3 = num1 / num2 ;
		   
		   System.out.println("After Div ::"+num3);
		
		   // Div - Float 
		   
		   num6 = num4 / num5;
		   
		   System.out.println("After Division :: "+num6);
		   
		   // Mod Operator - it will return the remainder
		   
		   num3 = num1 % num2;  // 7 % 3 -> 2 1/3
		   
		   System.out.println("After Mod ::"+num3);
		   
		   
		   // unary Operators
		   
		   int result = 1;
		   
		   result = result + 1;
		   
		   System.out.println("Unary plus ::"+result);
		   
		   result = result - 1;
		   
		   System.out.println("Unary Minus ::"+result);
		   
		   
		  
		   
		   
		   
		   
		
	}

}
