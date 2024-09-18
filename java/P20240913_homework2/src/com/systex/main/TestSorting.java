package com.systex.main;

//import java.util.Collections;
import java.util.LinkedList;
//import java.util.Map;

import com.systex.model.MyDate;

public class TestSorting {

	public static void main(String[] args) {

		String sortType = "ymd";
		boolean isRaising = false;
		
		if(args.length > 0 && (args[0] != null)) {
			sortType = args[0];
		}
		
		if((args.length > 1) && (args[1] != null)) {
			isRaising = args[1].equals("true") ? true : false;
		}
		 
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(12,5,2024));
		dates.add(new MyDate(30,4,2022));
		dates.add(new MyDate(20,9,2024));
		dates.add(new MyDate(12,7,2030));
		dates.add(new MyDate(12,7,2025));
		dates.add(new MyDate(17,3,2002));
		dates.add(new MyDate(25,2,2019));
		
		MyDate.sortDates(dates, sortType, isRaising);
		
//		
//		System.out.println("===========NOT YET SORTED==============");
//		
//		dates.forEach(date -> System.out.println(date));
//		
//		System.out.println("===========SORTED BY YEAR==============");
//
//		Collections.sort(dates);
//		dates.forEach(date -> System.out.println(date));
//		
//		System.out.println("===========SORTED BY MONTH==============");
//
//		Collections.sort(dates, MyDate.MONTH_COMP);
//		dates.forEach(date -> System.out.println(date));
//		
//		System.out.println("===========SORTED BY DAY==============");
//		
//		Collections.sort(dates, MyDate.DAY_COMP);
//		dates.forEach(date -> System.out.println(date));
//		
//		System.out.println("===========SORTED BY DAY(reverse)==============");
//		
//		Collections.reverse(dates);;
//		dates.forEach(date -> System.out.println(date));
	}
	
}
