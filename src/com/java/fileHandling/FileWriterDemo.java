package com.java.fileHandling;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\Praneeth\\Desktop\\fileFirst.txt");
			try {
				fileWriter.write("File Writer Demo...");
			} finally {
				fileWriter.close();
			}
			System.out.println("Successfully data wrote in the file...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
