package com.systex.main;

public class MultiTable {

	public static void main(String args[]) {
	
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				
				String spaceStr = (i*j < 10) ? " " : "";
				System.out.print(i + "*" + j + "=" + spaceStr + i*j + " ");			
			}
			System.out.println("");
		}
	}
}
