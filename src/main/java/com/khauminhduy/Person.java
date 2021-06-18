package com.khauminhduy;

import java.io.IOException;

public class Person {

	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge1(int age) throws IllegalArgumentException {
		if(age <= 0) {
			throw new IllegalArgumentException("Age <= 0");
		}
		this.age = age;
	}
	
	public void setAge2(int age) throws IOException {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
