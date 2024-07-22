package com.db.demo.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo3 {

	public static void main(String[] args) throws IOException {

		String file = "sample.txt";
		FileOutputStream fos = new FileOutputStream(file);

		String text = "new text to be written to the file";

		byte[] bytes = text.getBytes();
		fos.write(bytes);
		
		System.out.println("Done");

		fos.close();
	}

}
