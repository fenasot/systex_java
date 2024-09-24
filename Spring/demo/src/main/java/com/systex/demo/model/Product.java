package com.systex.demo.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.PostConstruct;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String descript;
	
	public Product() {
		super();
	}

	@PostConstruct
	public void init() {
		this.name = null;
		this.id = 10001;
		this.descript = "add desecript";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String desecript) {
		this.descript = desecript;
	}
	
	
}
