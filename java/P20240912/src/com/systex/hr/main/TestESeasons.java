package com.systex.hr.main;

import com.systex.hr.model.ESeasons;

public class TestESeasons {

	public static void main(String[] args) {
		System.out.println(ESeasons.SPRING);
		for(ESeasons es : ESeasons.values()) {
			System.out.println(es + ", ordinal = " + es.ordinal());
			System.out.println(es + ", ordinal = " + es.ordinal() + ", original name = " + es.name());
		}
	}
}
