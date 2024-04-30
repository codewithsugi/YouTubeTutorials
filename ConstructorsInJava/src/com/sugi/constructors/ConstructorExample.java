package com.sugi.constructors;

public class ConstructorExample extends Object {

	
	/*
	 * special method in java
	 *    - access-mod className(){}
	 * 
	 * 
	 * initialize the objects 
	 * 
	 */
	// zero arg constructor 
	
	/*
	 * public ConstructorExample() {
	 * System.out.println("I am zero arg constructor");
	 * 
	 * }
	 */
	 
	
	public void display()
	{
		System.out.println(" I am display");
	}
	
	
	
	public static void main(String[] args) {
		
		// object creation / initialization
		ConstructorExample obj = new ConstructorExample();
		System.out.println(obj);
	}

}
