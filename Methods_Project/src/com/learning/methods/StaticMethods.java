package com.learning.methods;

public class StaticMethods {
	
	private static int number = 10;
	
	private int nonStaticVariable = 20;
	
	// you can access static methods - with class Name

	public static void main(String[] args) {
		
		StaticMethods.staticMethodWithoutParams();
		
		staticMethodWithoutParams();
		
		new StaticMethods().instanceMethod();
		
		StaticMethods.staticMethodWithParams("Hello World");
		
		System.out.println("The returned value is :: "+StaticMethods.staticMethodWithoutParamsWithReturnType());
		
		System.out.println("The returned float value is :: "+StaticMethods.staticMethodWithParamsWithReturnType(54.2f));
		
		System.out.println("*********************************************************************");
		
		// static into a static method
		
		// static variable inside static method.
		System.out.println("Static Variable access inside static Method :: "+StaticMethods.number);
		
		// static method inside static method.
		System.out.println("The returned value is :: "+StaticMethods.staticMethodWithoutParamsWithReturnType());
		
		new StaticMethods().nonStaticMethod();
		
		System.out.println("*********************************************************************");
		
		System.out.println("Non Static Variable access inside static Method :: "+new StaticMethods().nonStaticVariable);
		
		
		
	}
	
	
	public void nonStaticMethod()
	{
		// access static variable inside non static
		System.out.println("Static Variable access inside non static Method :: "+StaticMethods.number);
		
		// static method inside non static method.
		System.out.println("The returned value is :: "+StaticMethods.staticMethodWithoutParamsWithReturnType());
	}
	
	
	/**
	 * syntax - [access-modifiers] [static] [return type] [method name]() {}
	 */
	
	public static void staticMethodWithoutParams()
	{
		System.out.println("This is staticMethodWithoutParams");
	}
	
	public static void staticMethodWithParams(String name)
	{
		System.out.println("This is staticMethodWithParams :: "+name);
	}
	
	// return types
	public static double staticMethodWithoutParamsWithReturnType()
	{
		return 34.0;
	}
	
	public static float staticMethodWithParamsWithReturnType(float a)
	{
		return a;
	}
	
	

	public void instanceMethod()
	{
		System.out.println("This is instance Method");
	}
}
