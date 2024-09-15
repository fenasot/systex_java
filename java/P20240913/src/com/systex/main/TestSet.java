package com.systex.main;

//import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.List;
//import java.util.Set;
import java.util.Stack;
//import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
//		Set<String> fruits = new HashSet<>();
//		Set<String> fruits = new LinkedHashSet<>();
//		Set<String> fruits = new TreeSet<>();
//		List<String> fruits = new ArrayList<>();
		List<String> fruits = new Stack<>();
		fruits.add("Lemon");
		fruits.add("Watermelon");
		fruits.add("Strawbarry");
		fruits.add("Lemon");
		fruits.add("Lemon");
		fruits.add("Lemon");
		fruits.add("Lemon");
		fruits.add("Lemon");
		fruits.add("Lemon");
		
		System.out.println(fruits);
//		System.out.println(fruits.decendingSet());
		Collections.sort(fruits);
		System.out.println(fruits);
	}
}
