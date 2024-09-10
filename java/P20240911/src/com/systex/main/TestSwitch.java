package com.systex.main;

public class TestSwitch {

	public static void main(String[] args) {
		int carModel = Integer.parseInt(args[0]);
		switch(carModel) {
		case 1:
			System.out.println("開天窗");
			break;
		case 2:
			System.out.println("加空調");
			break;
		case 3:
			System.out.println("加音響");
			break;
		default:
			System.out.println("加輪子");
			System.out.println("加引擎");
			break;
		}
	}
}
