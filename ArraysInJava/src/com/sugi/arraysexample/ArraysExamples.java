package com.sugi.arraysexample;

public class ArraysExamples {

	
	public static void main(String[] args) {
		
		// arrays - used to hold multiple values which belongs same type.
		
		// arrays - fixed in size (we have to predefine the size of an array when ever we creating the array)
		
		// arrays will have property called length 
		
		// arrays - all data types 
		
		// we can create arrays for the classes - String is a class in Java
		
		// object []

		// syntax  - array creation
		
		int arr1[]= new int[5];  

		byte bytearr[] = new byte[20];
		
		System.out.println("byte array length :: "+bytearr.length);
		
		short[] shortarry = new short[3];
		
		long[] longarr = new long[3];
		
		float[] floatarr = new float[5];
		
		double doublearr[] = new double[3];
		
		char chararr[] = new char[3];
		
		String strArr[] = new String[5];
		
		// 
		String arrayStr[] = {"one","two","tree","four","five","six"};
		
		System.out.println(arrayStr.length);
	
		// value assignment
		int arr[] = new int[10];
		System.out.println("int array length :: "+arr.length);
		
		// start - zero and end index = length -1 (10-1 = 9)
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
		
		System.out.println("Value of an int array ::"+arr);
		System.out.println("value in index 0 ::"+arr[0]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Int Array value in index "+i+" is "+arr[i]);
		}
	
	   // for each
		
		for(int a:arr)
		{
			System.out.println("Value of array :: "+a);
		}
		
		
		
		
		
		
	}
	
	
}
