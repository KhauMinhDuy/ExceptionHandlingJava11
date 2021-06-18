package com.khauminhduy;

import java.io.IOException;

public class ThrowingExceptions {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(23);
		
		p.setAge1(23);
		
		try {
			p.setAge2(23);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
