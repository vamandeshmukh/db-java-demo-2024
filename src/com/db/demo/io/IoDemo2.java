package com.db.demo.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo2 {

	public static void main(String[] args) throws IOException {

		String file = "sample.txt";

		String text = "another text to be written to the file";

		FileOutputStream fos = new FileOutputStream(file);
		byte[] bytes = text.getBytes();
		fos.write(bytes);
		fos.close();

	}
}
