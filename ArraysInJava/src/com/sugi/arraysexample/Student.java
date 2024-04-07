package com.sugi.arraysexample;

public class Student {
	
	
	int rollNo;
	
	String name;
	
	public Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Roll No :: "+rollNo+" and Name :: "+name);
	}

}
