package com.systex.main;

import java.util.Arrays;

import com.systex.util.MyMath;

public class TestArray {

	public static void main(String[] args) {
		String[] friends = {"Gary", "Patty", "Mary", "Kevin", "Louis"};
		int[] grades;
		grades = new int[] {98, 88, 75, 66, 100};
		
		System.out.println(friends);
		System.out.println(grades);
		System.out.println(Arrays.toString(friends));
		System.out.println(Arrays.toString(grades));
		
		for(int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		
		for(int i : grades) {
			System.out.println(i);
		}
		
		int[][] numbers = {
				{99, 88, 77, 66},
				{3, 5, 7},
				{5, 25, 40},
				{99, 87, 85, 75, 66, 53},
				{100, 50}
		};
		
		
		for(int i = 0; i < numbers.length; i++) {
			int total = 0;
			for(int j = 0; j < numbers[i].length; j++) {
				total += numbers[i][j];
			}
			System.out.println("number[" + i + "][] average: " + ((double)total)/numbers[i].length);
		}
		
		int index = 0;
		for(int[] i : numbers) {
			int total = 0;
			for(int j : i) {
				total += j;
			}
			System.out.println("number[" + index + "][] average: " + ((double)total)/i.length);
			index++;
		}
		
		String[] names = {"Gary", "Patty", "Mary", "Kevin", "Louis"};
		String[] newNames = {"a", "b", "v", "d", "r", "h", "i"};
		
		System.arraycopy(names, 0, newNames, 0, names.length);
		System.out.println(Arrays.toString(names));
		
		
		System.out.println(MyMath.average(1,2,3,4,5,6,7,8,9,99,9,999,999));
		System.out.println(MyMath.average(456,312,22223,54,2,1,0.2,-889));
		
		
		System.out.println(0.0/0);
		System.out.println(0.0/0.0);
		System.out.println(0/0.0);
		System.out.println(3/0.0);
		
		System.out.println(Arrays.deepToString(numbers));
	}
}






















