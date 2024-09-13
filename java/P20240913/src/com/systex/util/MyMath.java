package com.systex.util;

public class MyMath {

	public static double average(double... numbers) {
		double sum = 0.0;
		for(double number : numbers) {
			sum += number;
		}
		
		
		return sum / numbers.length;
	}
}
