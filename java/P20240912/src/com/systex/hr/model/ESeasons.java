package com.systex.hr.model;

public enum ESeasons {
	SPRING("春"), SUMMER("夏"), FALL("秋"), WINTER("冬");
	
	private final String name;
	
	private ESeasons(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
