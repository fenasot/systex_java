package com.systex.model;

public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	private boolean free;
	private int stock;
	
	public Product() {
		super();
	}

	public Product(int id, String name) {
		this(id, name, 0, false, 0);
	}
	
	public Product(int id, String name, double unitPrice, boolean free, int stock) {
//		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.free = free;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		unitPrice = unitPrice < 0 ? 10 : unitPrice;
		this.unitPrice = unitPrice;
	}
	
	public void setFree(boolean free) {
		this.free = free;
	}
	
	public boolean isFree() {
		return free;
	}
	
	public void incstock(int amount) {
		this.stock = amount; 
	}
	
	public void decStock(int amount) {
		 this.stock = amount;
	}
	
	public int getStock() {
		return stock;
	}
	
	public String toString() {
		return id + "\t" + name + "\t" + unitPrice 
				+ "\t" + free + "\t" + stock;
	}
}