package com.systex.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.systex.demo.model.IProduct;
import com.systex.demo.model.Product;

@SpringBootApplication
//public class DemoApplication implements CommandLineRunner{
public class DemoApplication implements ApplicationRunner{

	public static void main(String[] args) {
		System.out.println("Start Spring Boot Application...");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("End Sping Boot Application");
	}
	
	@Autowired
	private IProduct p;
	
//	@Bean
//	@Scope("protetype")
//	public Product abc() {
//		Product p = new Product();
//		p.setId(10001);
//		p.setDesecript("Coming soon...");
//		p.setName("ipplephone");
//		return p;
//	}
	
//	@Override
//	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		ApplicationContext container = new AnnotationConfigApplicationContext(DemoApplication.class);
//		Product p1 = container.getBean(Product.class);
//		Product p2 = container.getBean(Product.class);
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p1 == p2);
//	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getDescript());
	}

}
