package com.systex.main;

public class DayInMonth {

	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		boolean isSpecYear = 
				((year % 4) == 0) 
				&& (
						((year % 400) == 0) 
						|| (
								(year % 100) != 0));
		
		int febDays = isSpecYear ? 28 : 29;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year + "年的" + month + "月有31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year + "年的" + month + "月有30天");
			break;
		case 2:
			System.out.println(year + "年的" + month + "月有" + febDays + "天");
			break;
		default:
			System.out.println("月份錯誤");
			break;
		}
		
	}
}
