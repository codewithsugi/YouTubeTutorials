package com.codewithsugi.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		/**
		 * 
		 * Keyword - throws - throwing something - exception 
		 * 
		 * throws - method
		 * 
		 */
		// in mill sec - 1000 - 1 sec - 2 sec 
		/*
		 * try { Thread.sleep(2000); System.out.println("Thread wait is over"); } catch
		 * (InterruptedException e) { System.out.println("Its interrupted ");
		 * System.out.println(e.getMessage()); e.printStackTrace();
		 * 
		 * // redirect }
		 */  
		
		/*
		 * System.out.println("Before wait");
		 * 
		 * Thread.sleep(10000);
		 * 
		 * System.out.println("After wait "); System.out.println("End of pgm ");
		 */
		
		
		try {
			Scanner scan = new Scanner(new File("text1.txt"));
			System.out.println("File Found");
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}
		
		System.out.println("End of try catch ");
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");

		Scanner scan1 = new Scanner(new File("text1.txt"));
		
		System.out.println("End of Prgm");
		
		
	}

}
