package com.codewithsugi.exceptions;

public class TryCatchCombinationsTest {

	public static void main(String[] args) {

		// valid and invalid try -catch - finally combinations
		
		/**
		 * 1. try - should have catch or finally block
		 * 
		 * 2. try should have multiple catch blocks but multiple try is not allowed
		 * 
		 * 3. try with multi catch - if we are catching the Exception class in the first catch then the 
		 * subclasses of Exception is not allowed to catch after the Exception Catch
		 * 
		 * 4. try - catch or try - finally is valid combination
		 * 
		 * 5. try with multi catch with the same Exception class is not allowed
		 * 
		 * 6. after try we should have catch or finally block - other than this nothing is allowed 
		 *
		 */
		

		// 1. valid combination - try - catch - finally

		try {
			System.out.println("I am try block ");
		} catch (Exception e) {
			System.out.println("I am in catch block");
		} finally {
			System.out.println("I am in finally");
		}

		// 2. try - catch - catch - valid syntax

		try {
			System.out.println("I am try block ");
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block");
		} catch (Exception e) {
			System.out.println("I am second catch block");
		}

		/* 3. try - catch - catch - invalid
		try with multi catch - if we are catching the Exception class in the first catch then the 
		 * subclasses of Exception is not allowed to catch after the Exception Catch*/
		try {
			System.out.println("I am try block ");
		} catch (Exception e) {
			System.out.println("I am in catch block");
		} catch (ArithmeticException e) {
			System.out.println("I am second catch block");
		}

		// 4. try - catch - catch - invalid

		try {
			System.out.println("I am try block ");
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block");
		} catch (ArithmeticException e) {
			System.out.println("I am second catch block");
		}

		// 5. try - catch - catch - valid

		try {
			System.out.println("I am try block ");
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block");
		} catch (NullPointerException e) {
			System.out.println("I am second catch block");
		}

		// 6. try - multi catch -  valid 
		try {
			System.out.println("I am try block ");
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block");
		} catch (NullPointerException e) {
			System.out.println("I am second catch block");
		} catch (Exception e) {
			System.out.println("I am second catch block");
		}
		
		// 7. try - catch - finally - with sysouts  - invalid
		
		try {
			System.out.println("I am try block ");
		} 
		System.out.println("Hi im after try ");
		catch (ArithmeticException e) {
			System.out.println("I am in catch block");
		} catch (NullPointerException e) {
			System.out.println("I am second catch block");
		} catch (Exception e) {
			System.out.println("I am second catch block");
		}
		
		// 8. try - multi catch - sysouts  - invalid 
		
		try {
			System.out.println("I am try block ");
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block");
		}
		System.out.println("im after first catch");
		catch (NullPointerException e) {
			System.out.println("I am second catch block");
		} catch (Exception e) {
			System.out.println("I am second catch block");
		}
		
  		//9. try - finally - valid 
		
		try {
			System.out.println("I am try block ");
		} finally {
			System.out.println(" I am finally");
		}
		
	
	}

}
