package com.systex.model;

import java.util.Comparator;

public class DayComparator implements Comparator<MyDate>{

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

}
