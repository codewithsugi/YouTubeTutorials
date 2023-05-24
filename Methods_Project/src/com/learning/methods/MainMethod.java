package com.learning.methods;

public class MainMethod {

	public static void main(String[] args) {  // execution begins
		
		display();
		
		System.out.println("Args value - 1 ::" +args[0]);
		
		System.out.println("Args Value - 2 ::"+args[1]);

	} // execution ends
	
	public static void display()
	{
		System.out.println("Hello World");
	}
	
	public void displaynew()
	{
		System.out.println("Hello World");
		
		MainMethod.display();  
	}
	
	

}
