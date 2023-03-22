package com.sample.learning;

public class DataType_Default {
	
	// we going to create different type variables to see the default values.
	
	// instance or class level variables
	
	private byte byteVariable;
	
	private short shortVariable;
	
	private int intVariable;
	
	private long longVariable;
	
	private float floatVariable;
	
	private double doubleVariable;
	
	private char charVariable; //'\u0000' - 0
	
	private boolean booleanVariable;
	
	private String stringVariable;
	
	private Byte byteObject;
	

	public static void main(String[] args) {
		
		DataType_Default object = new DataType_Default();
		
		System.out.println("byte default Value -->" +object.byteVariable);
		
		System.out.println("short default Value -->" +object.shortVariable);
		
		System.out.println("int default Value -->" +object.intVariable);
		
		System.out.println("long default Value -->" +object.longVariable);
		
		System.out.println("float default Value -->" +object.floatVariable);
		
		System.out.println("double default Value -->" +object.doubleVariable);
		
		System.out.println("char default Value*** -->" +object.charVariable);
		
		System.out.println("boolean default Value -->" +object.booleanVariable);
		
		System.out.println("String default Value -->" +object.stringVariable);
		
		System.out.println("Any Other Object -->"+object.byteObject);
		
		char test ='\u0000'; //0
		
		System.out.println("char default value is 0 or not?  " +(object.charVariable == test));
	
	}

}
