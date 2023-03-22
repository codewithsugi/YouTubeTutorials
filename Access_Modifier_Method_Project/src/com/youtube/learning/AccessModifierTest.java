package com.youtube.learning;

public class AccessModifierTest {
	
	
	private void privateDisplay()
	{
		System.out.println("Hi... I am private method");
	}
	
	void defaultDisplay()
	{
		System.out.println("Hi... I am default method");
	}
	
	public void publicDisplay()
	{
		System.out.println("Hi... I am public method");
	}
	
	protected void protectedDisplay()
	{
		System.out.println("Hi... I am protected method");
	}
	
	public static void main(String[] args) {
		AccessModifierTest object = new AccessModifierTest();
		object.protectedDisplay();
	}

}
