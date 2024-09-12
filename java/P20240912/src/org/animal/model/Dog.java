package org.animal.model;

public class Dog implements Animal, Pet, Worker{

	public void speak() {
		
	}
	
	public void move() {
		
	}
	
	@Override
	public void baz() {
		System.out.println("wan wan wan");
	}
	
	@Override
	public void bar() {
		System.out.println("make another function");
	}
}
