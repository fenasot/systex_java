package com.systex.hr.main;

public class TestString {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Heelo";
		System.out.println(a == b);
		String aa = new String("Hello");
		String bb = new String("Hello");
		System.out.println(aa == bb);
		System.out.println(aa.equals(bb));
		System.out.println(bb.equals(aa));
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" World!");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" How are you");
		System.out.println(sb.capacity());
		sb.reverse();
		System.out.println(sb);
		
		
	}
	
}
