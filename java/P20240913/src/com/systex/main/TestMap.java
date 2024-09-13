package com.systex.main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
//		Map<Integer, String> fruits = new HashMap<>();
//		Map<String, String> fruits = new HashMap<>();
		Map<String, String> fruits = new TreeMap<>();
//		Map<String, String> fruits = new LinkedHashMap<>();
//		
//		fruits.put(2, "banana");
//		fruits.put(3, "apple");
//		fruits.put(5, "cherry");
//		fruits.put(7, "bingo");
//		fruits.put(1, "hahaha");
//		fruits.put(9, "heiheihei");
//		fruits.put(10, "strawbarry");
//		fruits.put(1, "guavava");
//		

		fruits.put("2", "banana");
		fruits.put("3", "apple");
		fruits.put("5", "cherry");
		fruits.put("7dw", "bingo");
		fruits.put("1wqee", "hahaha");
		fruits.put("9", "heiheihei");
		fruits.put("10", "strawbarry");
		fruits.put("1", "guavava");
		
		
		System.out.println(fruits);
		
		Set<String> keys = fruits.keySet();
		
		for(String key : keys) {
			String value = fruits.get(key);
			System.out.println("Key: " + key + " value: " + value + " length: " + value.length());
		}
		
		System.out.println("========================");
		
		for(Map.Entry<String, String> entry : fruits.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + " value: " + value + " length: " + value.length());
		}
		
		System.out.println("========================");
		
		fruits.forEach((key,value) -> System.out.println("Key: " + key + " value: " + value + " length: " + value.length()));
		
	}
}




















