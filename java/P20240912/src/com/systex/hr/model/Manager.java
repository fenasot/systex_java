package com.systex.hr.model;

public class Manager extends Employee{

	private String departement;
	
	public Manager() {
		super();
	}
	
	public Manager(String name, String telephone, String address, String departement) {
		super(name, telephone, address);
		this.departement = departement;
	}

	public Manager(String name, String telephone, String address, String gender, String departement) {
		super(name, telephone, address, gender);
		this.departement = departement;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)(super.getSalary()*3) + 5000;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub

		return super.getInfo() + "\t" + departement;
	}
	
	
}
