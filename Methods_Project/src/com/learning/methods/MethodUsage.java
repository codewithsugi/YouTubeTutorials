package com.learning.methods;

public class MethodUsage {

	public static void main(String[] args) {
		
		new MethodUsage().addition(10, 20);

		System.out.println("Value returned :: "+ new MethodUsage().additionReturn(10,20) * 10);
	}
	
	
	public void addition(int a, int b)
	{
		int sum = 0;
		
		sum = a+b;
		
		System.out.println("Value of sum :: "+sum);
	}
	
	public int additionReturn(int a, int b)
	{
		int sum = 0;
		
		sum = a+b;
		
		return sum;
	}
	

}
