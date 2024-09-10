package com.systex.main;

public class TriMultiTable {

	public static void main(String args[]) {
		Outer:
		for(int i = 1 ; i <= 9 ; i++) {
//			Inner:
			for(int j = 1 ; j <= 9 ; j++) {
				
				String spaceStr = (i*j < 10) ? " " : "";
				System.out.print(i + "*" + j + "=" + spaceStr + i*j + " ");
				if(i == j) {
					System.out.println();
					continue Outer;
				}
			}
			System.out.println();
		}
	}
}
