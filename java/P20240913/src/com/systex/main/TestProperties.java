package com.systex.main;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		Enumeration propNames = props.propertyNames();
		while(propNames.hasMoreElements()) {
			String propName = (String)propNames.nextElement();
			String propValue = props.getProperty(propName);
			System.out.println(propName + " = " + propValue);
		}
		System.out.println("=================");
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("path.separator"));
	}
}
