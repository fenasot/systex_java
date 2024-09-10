package com.systex.main;

import java.awt.SystemColor;

public class TestLocalVal {
	public static void main(String[] args) {
		int i, j=0;
		if(j == 0) {
			i = 1;
		}
		else if (j != 0){
			i = 2;
		}
		System.out.println(i);
	}	
}
