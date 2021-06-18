package com.khauminhduy;

import java.io.IOException;

public class TryWithResourceReverseClose {

	public static void main(String[] args) throws IOException {
		try(MyResource one = new MyResource("One");
				MyResource two = new MyResource("two");) {
			throw new RuntimeException();
		}
	}

}
