package com.systex.main;

import com.systex.model.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		Point2D p = new Point2D();
		p.changePosition(Integer.parseInt(args[0]));
		System.out.println(p);
	}
}

