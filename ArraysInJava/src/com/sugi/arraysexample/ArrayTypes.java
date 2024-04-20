package com.sugi.arraysexample;

public class ArrayTypes {

	public static void main(String[] args) {
		
		/*
		 * Array Types :
		 * 
		 *   1. one Dimensional Array
		 *   2. Multi-Dimensional Array
		 *   
		 */
		
		int arr[] = new int[5];  // one dimensional Array
		
		System.out.println("Array length :: "+arr.length);
		
		arr[0]=1;
		arr[1]=2;
		arr[3]=3;
		arr[2]=4;
		
		for(int a : arr)
		{
			System.out.println("Value :: "+a);
		}
			
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		// Multi-dimesnional Array :
		
		int multiDime[][] = new int[2][2];
		
		/*
			2X2 -- 
			
			0 (0,0)      1 (0,1) 
			
			2 (1,0)      3 (1,1)
			
		*/
		
		multiDime[0][0] = 0;
		multiDime[0][1] = 1;
		multiDime[1][0] = 2;
		multiDime[1][1] = 3;
		
		for(int i=0;i<multiDime.length;i++)  // row
		{
			for(int j=0; j<multiDime[i].length;j++)  // column
			{
				System.out.println("Value of Multi Dimensional Arry :: "+multiDime[i][j]);
			}
		}
		
		
		// 	2nd
		int[][] multiDime1 = new int[2][2];
		
		// 3rd 
		int multiDime2[][] = {
								{0,1,3,4},
								{2,3,4,6}
							 }; 
		
		for(int a[] : multiDime2)
		{
			for(int b : a)
			{
				System.out.println("Value of array from for each :: "+b);
			}
			
		}
	}

}
