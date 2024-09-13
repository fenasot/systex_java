package com.systex.main;

import com.systex.model.Trango;

public class TestTrango {

	public static void main(String[] args) {
		Trango a = new Trango();
		
		System.out.println("\n========1==========\n");		
		a.loop1(Integer.parseInt(args[0]));
		System.out.println("\n========2==========\n");
		a.loop2(Integer.parseInt(args[0]));
		System.out.println("\n========3=========\n");
		a.loop3(Integer.parseInt(args[0]));
		System.out.println("\n========4=========\n");
		a.loop4(Integer.parseInt(args[0]));
		System.out.println("\n========5=========\n");
		a.loop5(Integer.parseInt(args[0]));
		System.out.println("\n========6=========\n");
		a.loop6(Integer.parseInt(args[0]));
		System.out.println("\n========7=========\n");
		a.loop7(Integer.parseInt(args[0]));
//				
//		a.loop1(5);
//		System.out.println("\n==================\n");
//		a.loop2(5);
//		System.out.println("\n==================\n");
//		a.loop3(5);
//		System.out.println("\n==================\n");
//		a.loop4(5);
//		System.out.println("\n==================\n");
//		a.loop5(5);
//		System.out.println("\n==================\n");
//		a.loop6(5);
//		System.out.println("\n==================\n");
//		a.loop7(6);
	}
}
