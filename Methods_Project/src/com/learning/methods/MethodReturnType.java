package com.learning.methods;

public class MethodReturnType {
	
	/*
	 * add 2 number then multiply it with 5 if the sum is > 100
	 */

	public static void main(String[] args) {
		
		System.out.println(MethodReturnType.sum(20, 100));
		
		int sum = MethodReturnType.sum(100, 40);
		
		if(sum > 100)
		{
			sum = sum *5;
			System.out.println("The Sum is :: "+sum);
		}
		
		
		

	}
	
	/*
	 * public static void sum(int a, int b) { int sum = 0;
	 * 
	 * sum = a+b;
	 * 
	 * if(sum > 100) { sum = sum*5;
	 * System.out.println("Sum multiplied with 5, value is :: "+sum); } }
	 */
	
	public static int sum(int a, int b)
	{
		return a+b;
	}

}
