package com.learning.datatype;

public class DataTypeExamples {
	
	
	
	// byte -128 to 127 
	
	private byte num1 = 13;
	
	// short - 32768 to 32767
	
	private short num2 = 134;
	
	// int -2147483648 to 2147483647
	
	private int num3 = 214748364;
	
	// long 
	private long num4 = 2147483649l;
	
	private long num4_1 = 2147483649L;
	
	// float - 32bits
	
	private float num5 = 7.625f;
	
	private float num5_1 = 7.625F;
	
	// 7 digits precision
	private float num5_2 = 7.645454545454f;
	
	// double
	
	private double num6 = 3545454.67676;
	
	private double num6_1 = 3545454.1235465787650876574;
	
	// char
	
	private char singleChar = 'a';
	
	// boolean
	
	private boolean isEnabled = false;

	// String 
	
	private String name = "Hello World!!";	
	
	public static void main(String[] args) {
		
		DataTypeExamples object = new DataTypeExamples();
		
		System.out.println("Byte Variable value ::" + object.num1);
		
		System.out.println("Short Variable value ::" + object.num2);
		
		System.out.println("int Variable value ::" + object.num3);
		
		System.out.println("long Variable value ::" + object.num4);
		
		System.out.println("long Variable value ::" + object.num4_1);
		
		System.out.println("float Variable value ::" + object.num5);
		
		System.out.println("float Variable value ::" + object.num5_1);
		
		System.out.println("float Variable value ::" + object.num5_2);
		
		System.out.println("double Variable value ::" + object.num6);
		
		System.out.println("double Variable value ::" + object.num6_1);
		
		System.out.println("Char value :: "+object.singleChar);
		
		System.out.println("Boolean value :: "+object.isEnabled);
		
		System.out.println("String Value :: "+object.name);
		
	
	}

}
