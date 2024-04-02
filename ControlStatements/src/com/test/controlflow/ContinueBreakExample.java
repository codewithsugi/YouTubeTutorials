package com.test.controlflow;

public class ContinueBreakExample {

	public static void main(String[] args) {
		
		
		// Continue and Break 
		
		// continue - skip the run 
		// break - will terminate loop
		
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("i value is :: "+i);
			if(i==5)
				break;
		
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		int j;
		for(j=0;j<5;j++)
		{
			
			if(j == 3)
			{
				continue;
			}
				
			System.out.println("j value is :: "+j);
			
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		for(int a=0;a<5;a++)
		{
			System.out.print(a);
			for(int b=0;b<5;b++)
			{
				System.out.print(b+" ");
				break;
			}
			System.out.println();
		}
		

	}

}
