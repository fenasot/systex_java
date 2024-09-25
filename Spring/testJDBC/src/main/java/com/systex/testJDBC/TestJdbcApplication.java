package com.systex.testJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.systex.testJDBC.lab3.Product;
import com.systex.testJDBC.lab3.ProductDao;
import com.systex.testJDBC.lab3.TxProductService;

@SpringBootApplication
public class TestJdbcApplication implements CommandLineRunner{

	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private TxProductService txProductService;
	
	public static void main(String[] args) {
		SpringApplication.run(TestJdbcApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductId(3);
		product.setName("Elephantsssssss");
		product.setDescription("This is an elephant");
//		System.out.println(this.productDao.inset(product));
		this.productDao.update(product);
		
		
		this.productDao.getProducts().forEach(p->System.out.println(p));

		System.out.println("==========================================");
		System.out.println(productDao.getProduct(1));
		System.out.println(productDao.getProduct(2));
//		System.out.println(productDao.getProduct(3));
		txProductService.testTx();
	}

}
