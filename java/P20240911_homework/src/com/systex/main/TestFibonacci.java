package com.systex.main;

import com.systex.model.Fibonacci;

public class TestFibonacci {

	public static void main(String[] args) {
		Fibonacci a = new Fibonacci();
		
		a.printOut(Integer.parseInt(args[0]));
		
//		a.printOut(1000);
	}
}
