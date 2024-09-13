package com.systex.main;

import java.util.LinkedList;

public class TestDeque {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		
		fruits.add("Lemon");
		fruits.addLast("Banana");
		fruits.addFirst("Strawbarry");
		fruits.push("Apple");
		fruits.add("Cherry");
		
		System.out.println(fruits);
		System.out.println(fruits.pollFirst());
		System.out.println(fruits);
		System.out.println(fruits.pollLast());
		System.out.println(fruits);
	}
}
