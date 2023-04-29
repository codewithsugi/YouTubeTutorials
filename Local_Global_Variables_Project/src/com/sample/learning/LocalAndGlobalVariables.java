package com.sample.learning;

public class LocalAndGlobalVariables {  // class scope begins here
	
	
	// global variables -- fixed memory - heap memory
	
	private int num;
	

	public static void main(String[] args) { // main method scope begins

		// reference less object creation 
		
		new LocalAndGlobalVariables().display();
		
		new LocalAndGlobalVariables().localDisplay(100);
		
		// reference object
		
		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		
		obj.display();
		
		obj.localDisplay(1000);
		

	} // main method scope ends
	
	
	
	public void display()
	{
		num = 20;
		System.out.println(num);
	}
	
	
	public void localDisplay(int a)  // stack memory
	{
		System.out.println("value of a :: "+a);
	}
	
	
	


} // class scope ends
