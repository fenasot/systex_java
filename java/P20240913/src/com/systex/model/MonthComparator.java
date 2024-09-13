package com.systex.model;

import java.util.Comparator;

public class MonthComparator implements Comparator<MyDate> {

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
}
