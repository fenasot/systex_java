package test.java.com.systex.bingo;

import java.util.HashSet;
import java.util.Set;

public class Bingo {
	
	private Set<Integer> specNum = new HashSet<>();
	private Set<Integer> othersNum = new HashSet<>();
	
	public void writeBingo(int times) {
		Set<Integer> excludeNums = new HashSet<>();
		excludeNums.addAll(specNum);
		excludeNums.addAll(othersNum);
		
		for(int time = 1; time <= times; time++) {
			System.out.print("time " + time + " : ");
			Set<Integer> excludeTempNums = new HashSet<>(excludeNums);
			boolean isContain;
			int num;
			
			do {
				num = (int)((Math.random() * 49) + 1);
				isContain = excludeTempNums.contains(num);	
			} while (isContain);
			excludeTempNums.add(num);
			System.out.print("spec num: " + num + " , others num: ");
			
			int cntOthers;
			for(cntOthers = 1; cntOthers <= 6; cntOthers++) {
				do {
					num = (int)((Math.random() * 49) + 1);
					isContain = excludeTempNums.contains(num);	
				} while (isContain);
				excludeTempNums.add(num);
				System.out.print(cntOthers == 6 ? num : num + ", ");
			}
			System.out.println();
		}
	}
	
//	public Bingo(int[]... numsArr1) {
//		int cntOpen = 0;
//		
//		for(int[] nums : numsArr) {
//			int cntNums = 0;
//			
//			for(int i : nums) {
//				if(cntNums == 0) {
//					setSpecNum(i);
//				}
//			}
//			
//		}
//	}
	
	public Bingo(int specNum[], int othersNum[]) {
		for(int i : specNum) {
			setSpecNum(i);	
		}
		for(int i : othersNum) {
			setOthersNum(i);
		}
	}

	public Set<Integer> getSpecNum() {
		return specNum;
	}
	
//	public void printSpecNum() {
//		System.out.println();
//	}


	public void setSpecNum(int specNum) {
		this.specNum.add(specNum);	
	}

	public Set<Integer> getOthersNum() {
		return othersNum;
	}

	public void setOthersNum(int othersNum) {
		this.othersNum.add(othersNum);
	}

	@Override
	public String toString() {
		return "Bingo 往期中獎號碼 specNum=" + specNum + ", othersNum=" + othersNum;
	}
	
	
	
}
