package com.systex.hr.model;

public class Director extends Manager{

	private String allowance;

	public Director() {
		super();
	}

	public Director(String name, String telephone, String address, String allowance) {
		super(name, telephone, address, allowance);
		this.allowance = allowance;
	}	
	
	public Director(String name, String telephone, String address, String gender, String allowance) {
		super(name, telephone, address, gender);
		this.allowance = allowance;
	}
	
	public String getAllowance() {
		return allowance;
	}

	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)(super.getSalary()*1.5);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+"\t"+allowance;
	}
}
