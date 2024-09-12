package com.systex.hr.model;

public class Accountant extends Employee {

	private String accuntName;

	public Accountant() {
		super();
	}
	
	public Accountant(String name, String telephone, String address, String accuntName) {
		super(name, telephone, address);
		this.accuntName = accuntName;
	}
	
	public Accountant(String name, String telephone, String address, String gender, String accuntName) {
		super(name, telephone, address, gender);
		this.accuntName = accuntName;
	}

	public String getAccuntName() {
		return accuntName;
	}

	public void setAccuntName(String accuntName) {
		this.accuntName = accuntName;
	}

	public Accountant(String accuntName) {
		super();
		this.accuntName = accuntName;
	}

	@Override
	public int getSalary() {
		return (int)(super.getSalary()*1.2);
	}

	@Override
	public String getInfo() {
		return super.getInfo()+"\t"+accuntName;
	}
	
	
}
