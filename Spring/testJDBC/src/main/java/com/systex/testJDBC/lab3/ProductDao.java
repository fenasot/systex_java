package com.systex.testJDBC.lab3;

import java.util.List;

public interface ProductDao {
	
	public Product getProduct(int id);
	
	public List<Product> getProducts();

	public int inset(Product product);
	
	public void update(Product product);
}
