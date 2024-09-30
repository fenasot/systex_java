package com.systex.hw3.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LotteryService {
	
	private Set<Integer> excludeNum = new HashSet<>();
	
	public LotteryService() {
		super();
	}	
	public LotteryService(int[] excludeNum) {
		setExcludeNum(excludeNum);
	}
	
	public ArrayList<int[]> writeBingo(int times) {
		
		ArrayList<int[]> allNum = new ArrayList<int[]>();
		
		for(int time = 1; time <= times; time++) {
			System.out.print("time " + time + " : ");
			Set<Integer> excludeTempNums = new HashSet<>(excludeNum);
			boolean isContain;
			int num[] = new int[7];
			
			do {
				num[0] = (int)((Math.random() * 49) + 1);
				isContain = excludeTempNums.contains(num[0]);	
			} while (isContain);
			
			excludeTempNums.add(num[0]);
			
			int cnt;
			for(cnt = 1; cnt <= 6; cnt++) {
				do {
					num[cnt] = (int)((Math.random() * 49) + 1);
					isContain = excludeTempNums.contains(num[cnt]);	
				} while (isContain);
				
				excludeTempNums.add(num[cnt]);
			}		
			allNum.add(num);
		}
		return allNum;
	}

	public Set<Integer> getExcludeNum() {
		return excludeNum;
	}
	
	public String getStrExcludeNum() {
		String strExcludeNum = this.excludeNum
		.stream()
		.map(String::valueOf)
		.collect(Collectors.joining(", "));
		
		return strExcludeNum; 
		
	}

	public void setExcludeNum(int[] excludeNum) {
		for(int i : excludeNum) {
			if (i >= 1 && i <= 49) {
				this.excludeNum.add(i);
			}
		}	
	}

	@Override
	public String toString() {
		return "排除數字: " + excludeNum;
	}
}
