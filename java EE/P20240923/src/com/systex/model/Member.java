package com.systex.model;

public class Member {
	
	private int id;
	private String firstNmae;
	private String lastName;
	private String street;
	private String city;
	

	public Member() {
		super();
	}
	
	public Member(String firstNmae, String lastName, String street, String city) {
		super();
		this.firstNmae = firstNmae;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
	}

	public Member(int id, String firstNmae, String lastName, String street, String city) {
		super();
		this.id = id;
		this.firstNmae = firstNmae;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstNmae() {
		return firstNmae;
	}
	public void setFirstNmae(String firstNmae) {
		this.firstNmae = firstNmae;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Menber [id=" + id + ", firstNmae=" + firstNmae + ", lastName=" + lastName + ", street=" + street
				+ ", city=" + city + "]";
	}	
}
