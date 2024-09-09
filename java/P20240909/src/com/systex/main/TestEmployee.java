package com.systex.main;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import com.systex.model.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "張友福";
		emp1.title = "經理";
		emp1.department = "IT";
		emp1.salary = 85000;
		System.out.println(emp1);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		System.out.println(SimpleDateFormat.getInstance().format(gc.getTime()));
	}

}
