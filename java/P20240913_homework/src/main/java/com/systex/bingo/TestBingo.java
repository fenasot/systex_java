package main.java.com.systex.bingo;

import java.util.Arrays;

import test.java.com.systex.bingo.Bingo;

public class TestBingo {

	public static void main(String[] args) {
		
        int[] aNums = Arrays
        		.stream(args[0].split(" "))
        		.mapToInt(Integer::parseInt)
        		.toArray(); 
        int[] bNums = Arrays
        		.stream(args[1].split(" "))
        		.mapToInt(Integer::parseInt)
        		.toArray(); 
        
 		Bingo a = new Bingo(aNums, bNums);
		System.out.println(a);
		a.writeBingo(2);

	}
}
