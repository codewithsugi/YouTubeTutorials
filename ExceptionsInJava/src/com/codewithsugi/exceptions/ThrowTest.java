package com.codewithsugi.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) throws FileNotFoundException, TestCustomException {

		/**
		 * 
		 * throw - explicitly -> checked and unchecked Exception
		 * 
		 * throw - custom exceptions
		 * 
		 */

		// unchecked - Runtime Exception

		String name = null;

		if (name == null) {
			// throw new NullPointerException();
		}
		/*
		 * else { System.out.println("Length of name :: "+name.length()); }
		 */

		// checked Exception

		File file = new File("test.txt");

		if (!file.exists()) {
			// throw new FileNotFoundException();
		}

		// custom Exception - user defined exception

		int i = 100;

		if (i < 20) {
				throw new TestCustomException();
		}
		
		
		// small example 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter age :: ");
		
		int age = scan.nextInt();
		
		if(age < 18)
		{
			throw new TestCustomException("you are not eligible to play !!");
		}
		else
		{
			System.out.println(" you are eligible to play !!!");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
