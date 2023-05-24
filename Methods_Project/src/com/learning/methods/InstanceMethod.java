package com.learning.methods;

public class InstanceMethod {

	public static void main(String[] args) {

		InstanceMethod object = new InstanceMethod();
		object.instanceMethodWithoutParams();
		
		object.instanceMethodWithParams("Hello World!!!");
		
		System.out.println(object.instanceMethodWithoutParamsWithReturnType());
		
		String str = object.instanceMethodWithoutParamsWithReturnType();
		
		System.out.println("I am printing via str "+str);
		
		System.out.println(object.instanceMethodWithParamsWithReturnType(10));
		

	}
	
	// syntax --> [access-modifiers] [return type] [methodname](parameters){ }
	
	public void instanceMethodWithoutParams()
	{
		System.out.println("This is instanceMethodWithoutParams");  // logics - business logics
	}
	
	public void instanceMethodWithParams(String name) // default values 
	{
		System.out.println("This is instanceMethodWithParams -- name :: "+name);
	}

	// return - 2 methods 
	// same method signature not allowed -- method signature [methodname](parameters)
	
	public String instanceMethodWithoutParamsWithReturnType() 
	{
		return "This is instanceMethodWithoutParamsWithReturnType" ;  // logics - business logics
	}
	
	public String instanceMethodWithParamsWithReturnType(int a) 
	{
		return "This is instanceMethodWithParamsWithReturnType - value is :: "+a ;  // logics - business logics
	}
	
}
