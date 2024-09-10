package com.systex.model;

public class Product {
//	public int id;
//	public String name;
//	public double unitPrice;
//	public boolean free;
//	public int stock;
	
	private int id;
	private String name;
	private double unitPrice;
	private boolean free;
	private int stock;
	
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