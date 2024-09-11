package com.systex.main;

import com.systex.model.MyDate;

public class TestEquals {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(11, 9, 2024);
		MyDate d2 = new MyDate(11, 9, 2024);
		
//		d1.equals(d2);
		
		System.out.println("d1 = " +d1);
		System.out.println("d2 = " +d2);
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		
		Integer wAmount = 10000; // Auto-Boxing
		int balance = 5000;
		balance = balance + wAmount;
		System.out.println(balance);
	}
}
