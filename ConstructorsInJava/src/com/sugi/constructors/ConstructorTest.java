package com.sugi.constructors;

public class ConstructorTest {
	
	
	int num1;
	
	int num2;
	
	float floatnum1;
	
	float floatnum2;
	
	double doublenum1;
	
	double doublenum2;
	
	public ConstructorTest(int num1, int num2)
	{
		// constructor chaining 
		this(num1+0.5 , num2+0.5);
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public ConstructorTest(float num1, float num2)
	{
		floatnum1 = num1;
		floatnum2 = num2;
	}
	
	public ConstructorTest(double num1, double num2)
	{
		doublenum1 = num1;
		doublenum2 = num2;
	}
	
	
	public int addition()
	{
		return num1+num2;
	}
	
	public float floatAddition()
	{
		return floatnum1 + floatnum2;
	}
	
	public double doubleAddition()
	{
		return doublenum1 + doublenum2;
	}
	
	public static void main(String[] args) {
		
		ConstructorTest test = new ConstructorTest(30,40);
		System.out.println("Sum of 2 int numbers are :: "+test.addition());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		ConstructorTest test1 = new ConstructorTest(30.000007f,40.007f);
		System.out.println("Sum of 2 float numbers are :: "+test1.floatAddition());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		ConstructorTest test2 = new ConstructorTest(300,400);
		System.out.println("Sum of 2 int numbers are :: "+test2.addition());
		System.out.println("Sum of 2 double numbers are :: "+test2.doubleAddition());

	}

}
