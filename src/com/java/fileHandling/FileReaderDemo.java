package com.java.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		try {

			FileReader fileReader = new FileReader("C:\\Users\\Praneeth\\Desktop\\fileFirst.txt");
			try {

				int i;
				while ((i = fileReader.read()) != -1) {
					System.out.print((char) i);
				}

			} finally {
				fileReader.close();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
