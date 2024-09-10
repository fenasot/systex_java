package com.systex.main;

import com.systex.model.Product;
import com.systex.service.ProductService;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		
		p1.setId(1);
		p1.setName("qew");
		p1.setUnitPrice(564.54);
		p1.setFree(false);
		p1.incstock(500);

		p2.setId(1);
		p2.setName("qew");
		p2.setUnitPrice(564.54);
		p2.setFree(false);
		p2.incstock(500);
		
		p3.setId(1);
		p3.setName("qew");
		p3.setUnitPrice(564.54);
		p3.setFree(false);
		p3.incstock(500);
		
		p4.setId(1);
		p4.setName("qew");
		p4.setUnitPrice(564.54);
		p4.setFree(false);
		p4.incstock(500);
		
		p5.setId(1);
		p5.setName("qew");
		p5.setUnitPrice(564.54);
		p5.setFree(false);
		p5.incstock(500);
		
		ProductService ps = new ProductService();
		
		System.out.println("產品庫存報表");
		System.out.println("==============================");
		System.out.println("序號\t品名\t單價\t免費(?)\t庫存量\t庫存價值");
		System.out.println("==============================");
		System.out.println(p1+"\t"+ps.calculateProductInverntory(p1));
		System.out.println(p2+"\t"+ps.calculateProductInverntory(p2));
		System.out.println(p3+"\t"+ps.calculateProductInverntory(p3));
		System.out.println(p4+"\t"+ps.calculateProductInverntory(p4));
		System.out.println(p5+"\t"+ps.calculateProductInverntory(p5));
		System.out.println("==============================");		
	}	
}