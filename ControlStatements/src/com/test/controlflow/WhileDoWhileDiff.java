package com.test.controlflow;

public class WhileDoWhileDiff {

	public static void main(String[] args) {

		// while will get executed based on the condition -
		// do-while - first it will execute the do part then it will check for condition

		int i = 11;

		int j = 11;

		while (i < 10) {
			System.out.println("i value :: " + i);
			i++; // post increment - i=i+1;
		}
		System.out.println("###################################");
		do {
			System.out.println("j value is :: " + j);
			j++;
		} while (j < 10);
	}

}
