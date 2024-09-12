package com.systex.model;

import java.util.ArrayList;
import java.util.List;

public class FindingPrimes {

	public void printOut1(int maxNumber) {

		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println("Total cost time: " + (start-end));
		int i, j;
		boolean is_prime;
		for(i = 1 ; i <= maxNumber ; i++) {
			is_prime = true;
			for(j = 2 ; j < i; j++) {
				if(i % j == 0) {
					is_prime = false;
					break;
				}
			}
			if(is_prime) {
				System.out.println(i);
			}
		}
	}
	
	public void printOut2(int maxNumber) {

		if(maxNumber >= 1) {
			System.out.println(1);
		}
		
		List<Integer> iArr= new ArrayList<>();
		iArr.add(2);		
		
		int nowNum = 2;
		boolean is_prime;
		
		while(nowNum <= maxNumber) {
			is_prime = true;
			
			for(Integer i : iArr) {
				if(nowNum != i.intValue() && nowNum % i.intValue() == 0 ) {
					is_prime = false;
					break;
				}
			}
			
			if(is_prime) {
				System.out.println(nowNum);
				iArr.add(nowNum);
			}
			
			nowNum++;
		}
	}
}
