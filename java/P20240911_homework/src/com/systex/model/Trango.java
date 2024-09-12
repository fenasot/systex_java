package com.systex.model;

public class Trango {
	private int i, j;

	public void loop1(int height) {
		
		for(i = 1 ; i <= height ; i++) {
			for(j = 1 ; j <= height ; j++) {
				
				System.out.print("*");
				
				if(j == i) {
					break;
				}
			}
			System.out.println();
		}
	}
	
	public void loop2(int height) {
		
		for(i = 1 ; i <= height ; i++) {
			for(j = 1 ; j <= height ; j++) {
				
				System.out.print("*");
				
				if(j > (height - i)) {
					break;
				}
			}
			System.out.println();
		}
	}
		
	public void loop3(int height) {
		
		for(i = 1 ; i <= height ; i++) {
			for(j = 1 ; j <= height ; j++) {
				
				if(j <= (height - i)) {
					System.out.print(" ");
					continue;
				}
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void loop4(int height) {
		
		for(i = 1 ; i <= height ; i++) {
			for(j = 1 ; j <= (height * 2 - 1) ; j++) {
				
				if(j <= (height - i)) {
					System.out.print(" ");
					continue;
				}
				
				if(j <= (height + i - 1)) {
					System.out.print("*");
					continue;
				}
			}
			System.out.println();
		}
	}
	
	public void loop5(int height) {
		
		for(i = 1 ; i <= height ; i++) {
			for(j = 1 ; j <= height ; j++) {
				
				if(j <= (i - 1)) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void loop6(int height) {
		
		for(i = 1 ; i <= height ; i++) {
			for(j = 1 ; j <= (height * 2 - 1) ; j++) {
				
				if(j <= (i - 1)) {
					System.out.print(" ");
					continue;
				}
				
				if(j <= (height * 2 - i)) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void loop7(int height) {

//		前半段
		for(i = height; i > 1; i--) {
			for(j = 1 ; j <= (height * 2 - 1) ; j++) {
				
				if(j <= (i - 1)) {
					System.out.print(" ");
					continue;
				}
				
				if(j <= (height * 2 - i)) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
//		後半段
		for(i = 1 ; i <= height ; i++) {
			for(j = 1 ; j <= (height * 2 - 1) ; j++) {
				
				if(j <= (i - 1)) {
					System.out.print(" ");
					continue;
				}
				
				if(j <= (height * 2 - i)) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		

		
	}
}
























