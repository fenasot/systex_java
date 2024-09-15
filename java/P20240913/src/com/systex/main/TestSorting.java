package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.MyDate;

public class TestSorting {

	public static void main(String[] args) {
		LinkedList<MyDate> dates = new LinkedList<>();
		
		dates.add(new MyDate(5,5,2024));
		dates.add(new MyDate(30,4,2022));
		dates.add(new MyDate(20,9,2024));
		dates.add(new MyDate(12,7,2030));
		dates.add(new MyDate(9,3,2002));
		dates.add(new MyDate(2019,2,8));
		
		System.out.println("===========NOT YET SORTED==============");
		
		dates.forEach(date -> System.out.println(date));
		
		System.out.println("===========SORTED BY YEAR==============");

		Collections.sort(dates);
		dates.forEach(date -> System.out.println(date));
		
		System.out.println("===========SORTED BY MONTH==============");

//		Collections.sort(dates, new MonthComparator());
		Collections.sort(dates, MyDate.MONTH_COMP);
		dates.forEach(date -> System.out.println(date));
		
		System.out.println("===========SORTED BY DAY==============");
		
//		Collections.sort(dates, new DayComparator());
		Collections.sort(dates, MyDate.DAY_COMP);
		dates.forEach(date -> System.out.println(date));
		
		System.out.println("===========SORTED BY DAY(reverse)==============");
		
		Collections.reverse(dates);;
		dates.forEach(date -> System.out.println(date));
	}
	
}
