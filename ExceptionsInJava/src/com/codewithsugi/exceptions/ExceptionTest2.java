package com.codewithsugi.exceptions;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		// null pointer exception - 
		String name = null;
		
		int arr[] = new int[2];
		
		arr[0] = 1;
		arr[1] = 2;
		
		try
		{
			name.length();
			
		}catch(NullPointerException e)
		{
			System.out.println("Unfortunately you are trying to get length on null Value. Please correct it");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("$$$$$$$");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("I am in end of first try ");
		
		try {
			System.out.println("value of an array - 2nd Index :: "+arr[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Unfortunately you are trying to access unavailable index. Please correct it");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("$$$$$$$");
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("I am in end of pgm");
		
	}

}
