package com.systex.hr.model;

public class Engineer extends Employee{

	private String project;

	
	
	public Engineer(String name, String telephone, String address, String gender, String project) {
		super(name, telephone, address, gender);
		this.project = project;
	}

	public Engineer(String name, String telephone, String address, String project) {
		super(name, telephone, address);
		setProject(project);
		// TODO Auto-generated constructor stub
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}	

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)(super.getSalary()*1.5);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+ "\t" + project;
	}
	
	

	
}
