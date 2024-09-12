package org.animal.model;


public interface Pet {

	public static void foo() {
		System.out.println("static method in interface");
	}
	
	public default void bar() {
		common();
		System.out.println("default method in interface");
	}
	
	public default void baz() {
		common();
		System.out.println("default method in interface too..");
	}
	
	private void common() {
		System.out.println("hello default method");
	}
}
