package com.systex.main;

import com.systex.model.MyDate;

public class TestPassByValue {

	public void main(String[] args) {
		int a = 100;
		int b = a;
		printAns(a, b);
		MyDate d1 = new MyDate(10, 9, 2024);
		MyDate d2 = d1;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("=================");
		d2.setDay(25);
		d1.setMonth(12);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("=================");
		d2 = new MyDate(2, 3, 2020);		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("=================");
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("=================");
	}

//	private void printAns(MyDate a, MyDate b) {
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
//		System.out.println("=================");	}
//	
	private void printAns(int a, int b) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("=================");		
	}
}
