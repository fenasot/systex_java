package main.java.com.systex.controller.bingo;

import java.util.Arrays;

import main.java.com.systex.model.bingo.Bingo;

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
