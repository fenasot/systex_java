package com.systex.hr.main;

import com.systex.hr.model.Account;
import static com.systex.hr.model.Account.*;
import static java.lang.Math.*;

public class TestAccount {

	public static void main(String[] args) {
		System.out.println(Account.getInterestRate());
		Account acct1 = new Account(100, 1);
		Account acct2 = new Account(100, 2);
		
		System.out.println(acct1);
		System.out.println(acct2);
		
//		Account.setInterestRate(0.03);
		setInterestRate(0.03);
		
		System.out.println(acct1.getInterestRate());
		System.out.println(acct2.getInterestRate());
		
		int r = 5;
		System.out.println(PI * pow(r, 2));
	}
}
