package com.systex.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Customer {
	
	private String id;
	private String name;
	private String address;
	private Date birthDate;
	private char gender;
	private boolean married;
	private String email;
	
	public Customer() {
		super();
	}
	public Customer(String id, String name) {
		this(id, 
			name, 
			"erwer@gmail.com");
	}
	private Customer(String id, String name, String address) {
		this(id, 
			name, 
			address, 
			new GregorianCalendar(2022, 5, 1).getTime(), 
			'M', 
			false, 
			"aaa@gmail.com");
	}
	public Customer(String id, String name, String address, Date birthDate, char gender, boolean married,
			String email) {
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
		this.setBirthDate(birthDate);
		this.setGender(gender);
		this.setEmail(email);
	}

	public boolean checkId(String id) {
		return this.id == id;
	}
	public boolean checkBirthDate(Date birthDate) {
		return this.birthDate == birthDate;
	}
	public String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public final void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public final void setBirthDate(Date birthDate) {
		if(birthDate.before(new GregorianCalendar().getTime())) {
			this.birthDate = birthDate;
		}
		else {
			this.birthDate = new GregorianCalendar(2010, 0, 1).getTime();
		}
		
	}
	public final void setBirthDate(String sDate) {
		try {
			Date birth = SimpleDateFormat.getDateInstance().parse(sDate);
			this.setBirthDate(birth);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public char getGender() {
		return gender;
	}
	public final void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isMarried() {
		return married;
	}
	public final void setMarried(boolean married) {
		this.married = married;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", married=" + married + ", email=" + email + "]";
	}
	
	
	
}
