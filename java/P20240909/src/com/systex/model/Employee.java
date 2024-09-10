package com.systex.model;

public class Employee {
	public String name;
	public String title;
	public String department;
	public int salary;
	
	@Override
	public String toString() {
		return name + "\n" + title + "\n" + department + "\n" + salary;
	}
}
