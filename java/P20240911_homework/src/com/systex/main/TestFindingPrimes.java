package com.systex.main;

import com.systex.model.FindingPrimes;

public class TestFindingPrimes {

	public static void main(String[] args) {
		FindingPrimes a = new FindingPrimes();
		
//		a.printOut1(1000);
//		a.printOut2(1000);
		
		a.printOut2(Integer.parseInt(args[0]));
	}
}
