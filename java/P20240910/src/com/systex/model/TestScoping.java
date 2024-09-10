package com.systex.model;

public class TestScoping {
	
	public static void main(String[] args) {
		System.out.print(Scoping.a);
		Scoping s1 = new Scoping();
		System.out.println(s1.b);
		Scoping s2 = new Scoping();
		System.out.println(s2.b);
		
				
	}
	
}