package com.systex.main;

public class TestControlMain {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("請輸入 sort 或 bingo ");
			System.exit(0);
		}
		
		
		if(args[0].equals("sort")) {

		    String[] a;
		    
		    a = switch(args.length) {
		    case 3 -> new String[] {args[1], args[2]};
		    case 2 -> new String[] {args[1]};
		    default -> new String[] {};
		    };
		    
		    TestSorting.main(a);
		}
		else if(args[0].equals("bingo")) {
			String[] b;
			
			if(args.length != 3) {
				System.out.println("請輸入正確參數");
				System.exit(0);
			}
			
			b = new String[] {args[1], args[2]};
			TestBingo.main(b);
		}
		
	}
}
