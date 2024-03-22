package com.test.controlflow;

public class LoopingStatement_While {

	public static void main(String[] args) {
		
		// while and do while loop -- iteration purpose
		
		
		// syntax - while 
		
		// I need to print values from 1 to 10
		
		int i=0; // initialization 
		
		while(i < 10)  // condition check
		{
			System.out.println("i value is :: "+i);
			
			i++; // 1 - increment - decrement
		}
		
		System.out.println("Final i Value ::"+i);
		
		while( i > 0)
		{
			System.out.println("Decrement i value :: "+i);
			i--;
		}
		
		// do - while -- first do the specified operation - check the while condition
		
		
		int j=0;
		
		do
		{
			if(j == 0)
			{
				System.out.println("j value is :: "+j);
			}
			j++;
			System.out.println("j new value :: "+j);
			
		}while(j < 10);
		
		// sample program to display only even numbers.
		
		int number = 0;
		
		
		do
		{
			if(number % 2 == 0)
			{
				System.out.println("Even Numeber is :: "+number);
			}
			
			number++;
		}while( number < 50);

	}

}
