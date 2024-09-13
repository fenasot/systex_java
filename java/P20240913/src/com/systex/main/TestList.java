package com.systex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Lemon");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Strawbarry");
		fruits.add("Cherry");
		
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		System.out.println("======================");
		for(int i = 0; i < fruits.size(); i++) {
			String fruit = (String)fruits.get(i);
			System.out.println("name: " + fruit + ", length: " + fruit.length());
		}
		
		System.out.println("======================");
		
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			String fruit = (String)it.next();
			System.out.println("name: " + fruit + "length: " + fruit.length());
		}
		
		System.out.println("=======for-each===============");
		for(String fruit : fruits) {
			System.out.println("name: " + fruit + "length: " + fruit.length());
		}
		
		System.out.println("=======Lambda===============");
		
		fruits.forEach(fruit->System.out.println("name: " + fruit + "length: " + fruit.length()));
	}
}
