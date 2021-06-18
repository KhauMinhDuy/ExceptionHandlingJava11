package com.khauminhduy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(FileInputStream in = new FileInputStream("src/main/resources/data.txt");
				FileOutputStream out = new FileOutputStream("src/main/resources/out.txt")) {
			out.write(in.readAllBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
