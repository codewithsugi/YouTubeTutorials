package com.codewithsugi.exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		
		/**
		 *   syntax : 
		 *   try
		 *   { 
		 *      // num / 0 
		 *   }catch(Exception e)
		 *    // warning message and etc
		 *   {
		 *   
		 *   
		 *   }
		 * 
		 */
		
		
		// Arithmetic Exception - Unchecked Exception - Runtime Exception 
		
		
		int c=0;
		try {
			c = 12 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Value in c :: "+c);
		
	}

}
