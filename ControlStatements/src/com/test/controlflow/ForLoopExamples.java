package com.test.controlflow;

public class ForLoopExamples {

	public static void main(String[] args) {
		
		int i;
		
		// for loop
		for(i=0 ; i <10 ; i++)
		{
			System.out.println("i value is  :: "+i);
		}
		
		int j=0;
		for(;j<10;j++) // try to do some practice with this
		{
			System.out.println("j value is :: "+j);
		}
		
		// infinite loop
		for(int k=1; k<=10;k++)
		{
			System.out.println("k value is ::"+k);
		}
		
		// nested for loop
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		for(int a=0; a<5 ;a++)  // row 
		{
			for(int b=0;b<5;b++)  // column
			{
				System.out.print(b+" ");
			}
			System.out.println("");
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&");
		
		for(int a=0; a<5 ;a++)  // row 
		{
			for(int b=0;b<a;b++)  // column
			{
				System.out.print(b+" ");
			}
			System.out.println("");
		}
		
	}

}
