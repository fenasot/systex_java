package com.systex.model;

public class Point2D {
	private int x = 5;
	private int y = 5;
	
	public void changePosition(int x) {
		int y= 10;
		this.x = x + y;
		justChange(y);
	}
	
	public void justChange(int y) {
		int x = 20;
		this.y = x + y;
	}
	
	public String toString() {
		return "Point2D[x=" + x + ",y=" + y + "]";
	}
}
