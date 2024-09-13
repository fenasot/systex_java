package com.systex.model;

public class Fibonacci {

	public void printOut(int maxNumber) {
		int i = 1;
		int j = 0;
		int total = 0;
		while (i <= maxNumber) {
			System.out.println(i);
			total++;
			
			int tmp = i;
			i = i + j;
			j = tmp;
		} 
		
		System.out.println("Total: " + total);
	}
}
