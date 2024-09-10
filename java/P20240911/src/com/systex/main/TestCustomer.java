package com.systex.main;

import java.util.GregorianCalendar;

import com.systex.model.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(
				"A123456789", "王把銘", "q98", 
				new GregorianCalendar(2008, 9, 11).getTime(),
				'M', false, "q98");
				
		Customer c2 = new Customer(
				"A123454329", "王劉把銘", "q98", 
				new GregorianCalendar(2999, 9, 11).getTime(),
				'M', false, null);
				
//		Customer c3 = new Customer(
//				"A123456789", "王把銘", "q98", 
//				"2999-8-2",
//				'M', false, "q98");
		
		c2.setBirthDate("2005-6-30");
//		
		System.out.println(c1);
		System.out.println(c2);
//		System.out.println(c3);
		
	}
}
