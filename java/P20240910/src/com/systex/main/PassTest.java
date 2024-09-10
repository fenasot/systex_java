package com.systex.main;

import com.systex.model.MyDate;
import com.systex.service.Pass;

public class PassTest {

	public static void main(String[] args) {
		int a = 100;
		Pass p = new Pass();
		
		p.changeIntValue(a);
		System.out.println("a = "+a);
		
		MyDate d = new MyDate(24, 8, 2016);
		p.changeobjectReference(d);
		System.out.println("d = "+d);
		
		p.changeObjectValue(d);
		System.out.println("d = "+d);	
	}
}
