package com.codewithsugi.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {

		/**
		 * finally - finally block
		 * 
		 * finally - end of try-catch block
		 * 
		 * finally - always - if exception raised or not - finally will executed always
		 * 
		 * finally { loc }
		 */

		try {
			int k = 10 / 0;
			System.out.println("k value is :: " + k);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("I am finally - though AE raised");
		}

		System.out.println("############################################");
		try {
			int k = 10 / 2;
			System.out.println("k value is :: " + k);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("I am finally - exception not raised");
		}

		// Scanner example
		System.out.println("############################################");
		Scanner scan = null;
		try {
			scan = new Scanner(new File("test.txt"));
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(scan != null)
			{
				scan.close();
				System.out.println("Scan is closed successfully - finally");
			}else
			{
				System.out.println("scan is null already - no need to close - finally");
			}
		}

	}

}
