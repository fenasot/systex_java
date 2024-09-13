package com.systex.model;

import java.util.Comparator;
import java.util.Objects;

public class MyDate implements Comparable<MyDate> {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
//	public MyDate(int year, int month, int day) {
		super();
		if(day > 31 || month > 12) {
//			throw new IllegalArgumentException("Day or month error");
		}
		day = day > 31 ? 31 : day;
		month = month > 12 ? 12 : month;
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public static final Comparator<MyDate> MONTH_COMP = new Comparator<MyDate>() {
		@Override
		public int compare(MyDate o1, MyDate o2) {
			if(o1.getMonth() > o2.getMonth()) {
				return 1;
			}
			else if(o1.getMonth() < o2.getMonth()) {
				return -1;
			}
			else {
				return 0;
			}
		}
	};
	public static final Comparator<MyDate> DAY_COMP = new Comparator<MyDate>() {
		@Override
		public int compare(MyDate o1, MyDate o2) {
			if(o1.getDay() > o2.getDay()) {
				return 1;
			}
			else if(o1.getDay() < o2.getDay()) {
				return -1;
			}
			else {
				return 0;
			}
		}

	};
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return year + "\t" + month + "\t" + day + "\t";
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	@Override
	public int compareTo(MyDate o) {
		if(this.year > o.year) {
			return 1;
		}
		else if (this.year < o.year){
			return -1;
		}
		else {
			return 0;
		}
	}
//	
//	
//	
//	
}