package com.java.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Praneeth\\Desktop\\Project\\mainFile.txt");

		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Praneeth\\Desktop\\Project\\copyFile.txt");

		int i;
		while ((i = fileInputStream.read()) != -1) {
			fileOutputStream.write((char) i);
		}
		System.out.println("Data Copied...");

	}

}
