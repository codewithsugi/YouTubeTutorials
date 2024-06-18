package com.codewithsugi.exceptions;

public class NestedTry {

	public static void main(String[] args) {

		/**
		 * Nested try-catch-finally block
		 * 
		 * 1. combinations
		 * 
		 */

		int[] arr = { 10, 20, 30 }; // 3 - 0,1,2

		int k = 0;

		try {
			k = 10 / 0;
			System.out.println("K value :: " + k);
			try {
				System.out.println("value from arry :: " + arr[k]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("I am in inner try - catch");
				e.printStackTrace();
			}
		} catch (ArithmeticException e) {
			k = 3;
			
			try {
				System.out.println("value from array ::" + arr[k]);
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("I am in catch--->  try - catch");
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				k=4;
				System.out.println("finally -- array value :: "+arr[k]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("I am finally try - catch");
				e.printStackTrace();
			}
			
			System.out.println("I am finally");
		}

	}

}
