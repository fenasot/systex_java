package com.systex.demo.model;

import java.io.Serializable;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public interface IProduct extends Serializable {
	
	/**
	 * 
	 */
	static final long serialVersionUID = 1L;
//	private int id;
//	private String name;
//	private String descript;
	public int getId();
	public void setId(int id);
	public String getName();
	public void setName(String name);
	public String getDescript();
	public void setDescript(String descript);
	
	
	
}
