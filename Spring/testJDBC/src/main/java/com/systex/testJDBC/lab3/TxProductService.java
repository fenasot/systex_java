package com.systex.testJDBC.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TxProductService {

	@Autowired
	private ProductDao productDao;
	
	@Transactional(
			readOnly = false, 
			propagation = Propagation.REQUIRED,
			isolation = Isolation.DEFAULT,
			rollbackFor = {ALitleSeriousException.class})
	public void testTx() throws ALitleSeriousException {
		Product p = productDao.getProduct(1);
		p.setName("mynameohhhhhhh");
		productDao.update(p);
//		raiseException();
		troubleMaker();
	}
	

	private static void raiseException() {
		throw new RuntimeException();
	}
	
	// 不會 roll back 也就是 SQL 資料表的資料依舊會被修改
	private static void troubleMaker() throws ALitleSeriousException {
		throw new ALitleSeriousException("Oops..., a little serious!");
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
