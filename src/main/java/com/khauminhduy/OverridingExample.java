package com.khauminhduy;

import java.io.IOException;

public class OverridingExample {

	public static void main(String[] args) {
		IT it = new Developer();
		
		try {
			it.work();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
