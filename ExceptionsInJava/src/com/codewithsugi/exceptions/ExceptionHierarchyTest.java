package com.codewithsugi.exceptions;

public class ExceptionHierarchyTest {

	public static void main(String[] args) {
		
		
		int a=10,b=0,c=0;
		
		try {
			c=a/b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
