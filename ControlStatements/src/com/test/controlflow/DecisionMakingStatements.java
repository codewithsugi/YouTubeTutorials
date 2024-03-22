package com.test.controlflow;

import java.util.Scanner;

public class DecisionMakingStatements {
	
	/*
	 * Decision Making Statements
	 * 
	 * if 
	 * 
	 * if - else
	 * 
	 * if -elseif -- else  // if else ladder
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		
		// Decision making -- condition
		
		int mark = 0;  // if >=45 Passed  <45 --Failed -- 100
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for mark :: ");
		mark = scan.nextInt();
		scan.close();
		
		System.out.println(mark >= 45);
		if(mark >= 45 && mark <= 100)
		{
			System.out.println("Congratulations.. You are Passed!!!");
		}
		else if(mark <45 && mark > 0)
		{
			System.out.println("Sorry.. You are Failed!! But Don't lose the hope!!!");
		}
		else
		{
			System.out.println("You may entered a mark greater than 100 or lessthan zero. Please check your input");
		}
		
		
		
		// nested if -- if inside if will be called as nested if
		
		int age = 43;
		
		if(age > 20)
		{
			if( age > 20 && age <= 50)
			{
				if(age > 40 )
				{
					System.out.println("Eligible for Bucket 1a Benefits");
				}
				else
				{
					System.out.println("Eligible for Bucket 1 Benefits");
				}
				
			}
			
		
		}
		else
		{
			System.out.println("Sorry.. you are not eligible!!!");
		}
		
		
		
		/*
		 * System.out.println("lessthan -- " + (mark < 45)); if(mark < 45) {
		 * System.out.println("Sorry.. You are Failed!! But Don't lose the hope!!!"); }
		 */
		
		
	}

}
