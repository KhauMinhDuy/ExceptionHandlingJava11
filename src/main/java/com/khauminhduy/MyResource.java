package com.khauminhduy;

import java.io.Closeable;
import java.io.IOException;

public class MyResource implements Closeable {

	private String name;

	public MyResource(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void close() throws IOException {
		System.out.println("Resource close: " + this.name);
	}

}
