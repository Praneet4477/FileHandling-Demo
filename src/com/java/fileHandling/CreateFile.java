package com.java.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Praneeth\\Desktop\\fileFirst.txt");

		try {
			if (file.createNewFile()) {
				System.out.println("File created on desktop...");
			} else {
				System.out.println("File already exists on desktop...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
