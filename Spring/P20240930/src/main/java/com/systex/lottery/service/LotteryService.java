package com.systex.lottery.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.systex.lottery.exception.InputParameterException;

@Service
public class LotteryService {
	
	/**
	 * 存放用於限制 {@link #writeBingo()} 輸出的數字 
	*/
	private Set<Integer> excludeNum = new HashSet<>();
	
	/**
	 * 在新增 {@code excludeNum} 時，因超出範圍而被忽略的數字將存放在此
	 */
	private ArrayList<Integer> outRangeNums = new ArrayList<>();

	/**
	 * Constructs 可輸入 int[]，也可輸入 String，也可以不輸入任何東西
	 * @param excludeNum 
	 * @throws InputParameterException 自訂義錯誤拋出
	 */
	public LotteryService() {
		super();
	}	

	/**
	 * Constructs 可輸入 int[]，也可輸入 String，也可以不輸入任何東西
	 * @param excludeNum 
	 * @throws InputParameterException 自訂義錯誤拋出
	 */
	public LotteryService(int[] excludeNum) throws InputParameterException {
		setExcludeNum(excludeNum);
	}

	/**
	 * Constructs 可輸入 int[]，也可輸入 String，也可以不輸入任何東西
	 * @param excludeNum 
	 * @throws InputParameterException 自訂義錯誤拋出
	 */	
	public LotteryService(String excludeNum) throws InputParameterException {
		setExcludeNum(excludeNum);
	}
	
	/**
	 * 排除掉 {@code excludeNum} 內包含的數字，並根據參數 {@code times} 生成相同
	 * 組數的號碼，每組包含7個數字，並且不驗證是否有完全相同的組數
	 * @param times 生成組數(範圍為1~1000組)
	 * @return allNum 
	 * @throws InputParameterException 自訂義錯誤拋出
	 */
	public ArrayList<int[]> writeBingo(int times) throws InputParameterException {
		return generateBingo(times);
	}
	
	/**
	 * 排除掉 {@code excludeNum} 內包含的數字，並根據參數 {@code times} 生成相同
	 * 組數的號碼，每組包含7個數字，並且不驗證是否有完全相同的組數
	 * @param times 生成組數(範圍為1~1000組)
	 * @return allNum 
	 * @throws InputParameterException 自訂義錯誤拋出
	 */
	public ArrayList<int[]> writeBingo(String times) throws InputParameterException {
		
		if(times == "") {
			throw new InputParameterException("輸入參數為空?");
		}
		
		int time;
		try {
			time = Integer.parseInt(times);
		} catch(NumberFormatException e) {
			throw new InputParameterException("輸入參數不是整數", e);
		}
		return generateBingo(time);
	}
	
	/**
	 * 排除掉 {@code excludeNum} 內包含的數字，並根據參數 {@code times} 生成相同
	 * 組數的號碼，每組包含7個數字，並且不驗證是否有完全相同的組數
	 * @param times 生成組數(範圍為1~1000組)
	 * @return allNum 
	 * @throws InputParameterException 自訂義錯誤拋出
	 */
	private ArrayList<int[]> generateBingo(int times) throws InputParameterException {
		if((times <= 1) || (times >= 1000)) {
			throw new InputParameterException("輸入的生成組數超出範圍");
		}
		
		ArrayList<int[]> allNum = new ArrayList<int[]>();
		
		for(int time = 1; time <= times; time++) {
			int[] nums = getRandomNumber();
			allNum.add(nums);
		}
		return allNum;
	}
	
	/**
	 * 取得已被排除的數字清單
	 * @return strExcludeNum
	 */
	public Set<Integer> getExcludeNum() {
		return excludeNum;
	}
	
	/**
	 * 取得已被排除的數字清單(回傳String)
	 * @return strExcludeNum
	 */
	public String getStrExcludeNum() {
		String strExcludeNum = this.excludeNum
		.stream()
		.map(String::valueOf)
		.collect(Collectors.joining(", "));
		
		return strExcludeNum; 
	}

	/**
	 * 重置排除的清單
	 */
	public void resetExcludeNum() {
		this.excludeNum.clear();
	}
	
	/**
	 * 新增用於限制 {@link #writeBingo()} 輸出的數字，先驗證參數後再呼叫實際用於新增 {@link #addExcludeNum(int)} 的方法
	 * @param numbers 數字範圍 1~49 
	 * @throws InputParameterException 
	 */
	public void setExcludeNum(int[] numbers) throws InputParameterException {
			
		if(numbers == null) {
			throw new InputParameterException("輸入參數為空?");
		}
		
		for(int number : numbers) {	
			addExcludeNum(number);
		}	
	}
	
	/**
	 * 新增用於限制 {@link #writeBingo()} 輸出的數字，先驗證參數後再呼叫實際用於新增 {@link #addExcludeNum(int)} 的方法
	 * @param string 用,分隔數字的字串
	 * @throws InputParameterException
	 */
	public void setExcludeNum(String string) throws InputParameterException {
		if(string == null || string.equals("")) {
			throw new InputParameterException("輸入參數為空?");
		}
		
		int[] args = strArgToInts(string);
		for(int arg : args) {	
			addExcludeNum(arg);
		}
	}

	/**
	 * 新增用於限制 {@link #writeBingo()} 輸出的數字(輸入 int)，
	 * @param arg 數字範圍 1~49 
	 * @throws InputParameterException 自訂義錯誤拋出
	 */
	private void addExcludeNum(int arg) throws InputParameterException {
		boolean isInRange = (arg >= 1) && (arg <= 49);
		boolean isArriveLimite = excludeNum.size() > 42;
		
		if(isArriveLimite) {
			throw new InputParameterException("超出最大可限制數量(42)");
		}
		
		if(isInRange) {	
			excludeNum.add(arg);
		} else {
			outRangeNums.add(arg);
		}
	}
		
	/** 
	 * 將輸入的字串以","為分割點轉為int[]
	 * @param string
	 * @return int[] or null
	 * @throws InputParameterException 自訂義錯誤拋出
	 */
	private int[] strArgToInts(String string) throws InputParameterException {
		int[] args;

		try {
			args = Arrays
					.stream(string.split(","))
					.mapToInt(Integer::parseInt)
					.toArray();
		} catch (NumberFormatException | NullPointerException e) {
			throw new InputParameterException("轉換輸入參數失敗");
		}		

		return args;
	}
	
	/**
	 * 回傳一組不在限制清單內的數字(7個)
	 * @param excludeTempNums
	 * @return int[7]
	 */
	private int[] getRandomNumber() {
		Set<Integer> excludeTempNums = new HashSet<>(excludeNum);
		int nums[] = new int[7];
		boolean isContain;
		int cnt;
		
		for(cnt = 0; cnt <= 6; cnt++) {
			do {
				nums[cnt] = (int)((Math.random() * 49d) + 1);
				isContain = excludeTempNums.contains(nums[cnt]);	
			} while (isContain);
			excludeTempNums.add(nums[cnt]);
		}		
		return nums;
	}

	@Override
	public String toString() {
		return "排除數字: " + excludeNum;
	}
}
