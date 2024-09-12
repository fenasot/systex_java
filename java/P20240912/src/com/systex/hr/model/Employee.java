package com.systex.hr.model;

public class Employee {

	private String name;
	private String telephone;
	private String address;
	private String gender;
	
	private static final int BASE_SALARY = 35000;
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String telephone, String address) {
		setName(name);
		setTelephone(telephone);
		setAddress(address);
	}
	
	public Employee(String name, String telephone, String address, String gender) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.address = address;
		this.gender = gender;
	}

	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return BASE_SALARY;
	}
	public String getInfo() {
		return name + "\t" + telephone + "\t" + gender + "\t" + address ;
	}
	
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", telephone=" + telephone + ", address=" + address + "]";
//	}
	

}
