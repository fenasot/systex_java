package com.systex.main;

public class TestDoWhileLoop {

	public static void main(String args[]) {
		
		int i = 0;
		do {
			System.out.println("Loop " + i);
			i++;
		}
		while(i < 0);
		
		System.out.println("i = " + i);
	}
}
