package com.learning.java;

public class Sample {
	
	
	
	// comments 
	
		// single line comment
	
	/*
	 * This 
	 * is 
	 * sample
	 * program
	 */
	
	// multi line comment using short cut  - ctrl + shift + /   // ctrl + shift + \
	
	// variable
	
	private int num1 = 10;    
	
	private int num2 = 20;
	
	private float num3 = 2157483649.767675f;
	
	private void sum()
	{
		// print the values
		System.out.println("Hello World --> " + (num1 + num2)  );
	}
	

	public static void main(String[] args) {
		
			Sample object = new Sample(); // Sample() - constructor 
			
			object.sum();
			
			System.out.println(object.num3);
			
			System.out.println(Float.MAX_VALUE);
		
	}

}
