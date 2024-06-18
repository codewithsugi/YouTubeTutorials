package com.codewithsugi.exceptions;

public class NestedTry2 {

	public static void main(String[] args) {

		int k = 0;

		int[] arr = { 10, 20, 30 }; // 3 - 0,1,2

		String name = "testing";

		try {  // outer
			k = 10 / 0;
			System.out.println("Value of K :: " + k);

			try {  // inner 
				System.out.println("Value from array :: " + arr[k]);
				try { // second inner
					name = null;
					int i = name.length();
					System.out.println("length of name :: " + i);
				} catch (IllegalArgumentException e) {
					System.out.println("I am from try - try - try - catch");
					e.printStackTrace();
				}
			} catch (Exception e) {
				System.out.println("I am from inner try - catch");
				e.printStackTrace();
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I am outer try - exception");
			System.out.println("I am from exception class");
			e.printStackTrace();
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		System.out.println("End of Prgm");
		

	}

}
