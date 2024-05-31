package com.codewithsugi.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		
		/**
		 * Checked Exception - Compile Time Exception?
		 * 
		 * FileNotFoundException
		 * 
		 * ClassNotFoundException
		 * 
		 */
	
		Scanner scan;
		
		try {
			scan = new Scanner(new File("text.txt"));
			System.out.println("File Found");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}

		//scan = new Scanner(new File("text1.txt"));
		
		int c = 10/0;
		
		
	}

}
