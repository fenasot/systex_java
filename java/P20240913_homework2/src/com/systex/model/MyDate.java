package com.systex.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class MyDate implements Comparable<MyDate> {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		super();
//		if (day > 31 || month > 12) {
//			throw new IllegalArgumentException("Day or month error");
//		}
		day = day > 31 ? 31 : day;
		month = month > 12 ? 12 : month;

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public static void sortDates(List<MyDate> dates, String sortType, boolean isRaising) {
		int[] sortInts = new int[3];

		if (sortType.length() <= 3) {
			char[] sortTypeChars = sortType.toLowerCase().toCharArray();
			int cnt = 0;

			for (char v : sortTypeChars) {
				Map<Character, Integer> sortMap = Map.of('y', 1, 'm', 2, 'd', 3);
				sortInts[cnt] = sortMap.getOrDefault(v, 0);
				cnt++;
			}
		}

		List<Function<MyDate, Integer>> comps = new ArrayList<>();

		for (int i : sortInts) {
			comps.add(getExtractor(i));
		}
		
//		TODO: 讓thenComparing可以自由增加
		Comparator<MyDate> dateComparator = Comparator
				.comparing(comps.get(0))
				.thenComparing(comps.get(1))
				.thenComparing(comps.get(2));
		
		Collections.sort(dates, dateComparator);

		System.out.println("======== Sort By "+ sortType + " ========");
		dates.forEach(date -> System.out.println(date));
	}

	public static Function<MyDate, Integer> getExtractor(int type) {
		return switch (type) {
		case 1 -> MyDate::getYear;
		case 2 -> MyDate::getMonth;
		case 3 -> MyDate::getDay;
		default -> MyDate::getNothing;
		};
	}

//	Not used
	public static final Comparator<MyDate> YEAR_MONTH_DAY_COMP = new Comparator<MyDate>() {
		@Override
		public int compare(MyDate o1, MyDate o2) {
			int yearAns = Integer.compare(o1.getYear(), o2.getYear());
			int monthAns = Integer.compare(o1.getMonth(), o2.getMonth());
			int dayAns = Integer.compare(o1.getDay(), o2.getDay());
			return yearAns == 0 
					? (monthAns == 0 ? dayAns : monthAns) 
					: yearAns;
		}
	};
//	Not used
	public static final Comparator<MyDate> YEAR_MONTH_COMP = new Comparator<MyDate>() {
		@Override
		public int compare(MyDate o1, MyDate o2) {
			int yearAns = Integer.compare(o1.getYear(), o2.getYear());
			return yearAns == 0 ? Integer.compare(o1.getMonth(), o2.getMonth()) : yearAns;
		}
	};
//	Not used
	public static final Comparator<MyDate> YEAR_COMP = new Comparator<MyDate>() {
		@Override
		public int compare(MyDate o1, MyDate o2) {
			return Integer.compare(o1.getYear(), o2.getYear());
		}
	};
//	Not used
	public static final Comparator<MyDate> MONTH_COMP = new Comparator<MyDate>() {
		@Override
		public int compare(MyDate o1, MyDate o2) {
			return Integer.compare(o1.getMonth(), o2.getMonth());
		}
	};
//	Not used
	public static final Comparator<MyDate> DAY_COMP = new Comparator<MyDate>() {
		@Override
		public int compare(MyDate o1, MyDate o2) {
			return Integer.compare(o1.getMonth(), o2.getMonth());
		}

	};
	
	public int getNothing() {
		return 0;
	}

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
		if (this.year > o.year) {
			return 1;
		} else if (this.year < o.year) {
			return -1;
		} else {
			return 0;
		}
	}
}