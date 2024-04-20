package com.sugi.arraysexample;

public class ThisExample {
	
	
	/*
	 * this - used to identify a specific person or thing close at hand
	 * 
	 * this - current object 
	 * 
	 */
	
	
	private int age; // class level variable - global variables
	
	
	public void setValue(int age)  // setter - set value
	{
		this.age = age;
		System.out.println("value of age in setValue method :: "+this.age);
	}
	
	public int getValue() // getter - get the value 
	{
		return this.age;
	}
	
	
	public void display()
	{
		System.out.println("object value using keyword this :: "+this);
	}
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
		this.multiply(a, b);
	}
	
	public void multiply(int a, int b)
	{
		System.out.println(a*b);
	}
	
	
	

	public static void main(String[] args) {
		
		ThisExample object = new ThisExample();
		
		System.out.println("Object value from main Method :: "+object);
		
		object.display();
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		System.out.println("accessing class level variable :: "+object.age);
		
		object.setValue(100);
		
		System.out.println("Value from the get Value method :: "+object.getValue());
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		object.add(10, 10);
		
	}

}
