package com.systex.hr.model;

public class Account {

	private static double interestRate;
	private int balance;
	
	private final int MYCONST;
	private static final int MYCONST2;
	
	static {
		System.out.println("Hello world");
//      從資料庫取得資料中		
//		
//		
//		
		interestRate = 0.02;
		MYCONST2 = 2;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		if(interestRate <= 0) {
			interestRate = 0.1;
		}
		Account.interestRate = interestRate;
	}

	public Account(int balance, int MYCONST) {
		this.balance = balance;
		this.MYCONST = MYCONST;
//		this.MYCONST2 = MYCONST;
	}
	
//	public int getBalance() {
//		final int LOCAL_CONST;
//		LOCAL_CONST = 500;
//		System.out.println(LOCAL_CONST);
//		
//		return this.balance;
//	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit(int amt) {
		this.balance += amt;
	}
	
	public void wihtdrw(int amt) {
		this.balance -= amt;
	}
}

